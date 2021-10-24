package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import contactInfo.Contact;
import contactInfo.ContactService;

class ContactServiceTest {
	//add contact successful test
	@Test
	public void AddContact() {
		ContactService newContact = new ContactService();
		
		//new contacts
		Contact new1 = new Contact("C0001", "First1", "Last1", "1234567890", "12345 Address Ave");
		
		//add boolean true
		assertEquals(true, newContact.add(new1));
	}
	
	//add method fail test
	@Test
	public void AddContactFail() {
		ContactService newContact = new ContactService();
		
		//new contact
		Contact new1 = new Contact("C0001", "First1", "Last1", "1234567890", "12345 Address Ave");
	
		//fail contact add
		assertEquals(true, newContact.add(new1));
		assertEquals(false, newContact.add(new1));
	}
	
	//delete test
	@Test
	public void DeleteContact() {
		ContactService newContact = new ContactService();
		
		//new contact
		Contact new1 = new Contact("C0001", "First1", "Last1", "1234567890", "12345 Address Ave");
	
		//delete contact success
		assertEquals(true, newContact.add(new1));
		assertEquals(true, newContact.remove("C0001"));
	}
	
	//delete fail test
	@Test
	public void DeleteContactFail() {
		ContactService newContact = new ContactService();
		
		//new contact
		Contact new1 = new Contact("C0001", "First1", "Last1", "1234567890", "12345 Address Ave");
	
		//delete contact fail
		assertEquals(true, newContact.add(new1));
		assertEquals(true, newContact.remove("C0001"));
		assertEquals(false, newContact.remove("C0002"));
	}
	
	//update method test 
	@Test
	public void UpdateContact() {
		ContactService newContact = new ContactService();
		
		//new contact
		Contact new1 = new Contact("C0001", "First1", "Last1", "1234567890", "12345 Address Ave");
	
		//update contact success
		assertEquals(true, newContact.add(new1));
		assertEquals(true, newContact.update("C0001", "Nicole","Penner","1234512345", "8118 Address St"));
	}
	
	//update method fail test 
		@Test
		public void UpdateContactFail() {
			ContactService newContact = new ContactService();
			
			//new contact
			Contact new1 = new Contact("C0001", "First1", "Last1", "1234567890", "12345 Address Ave");
		
			//update contact success
			assertEquals(true, newContact.add(new1));
			
			assertEquals(false, newContact.update("C0002", "First2", "Last2","2345623456", "2222 Address"));
			assertEquals(true, newContact.update("C0001", "Nicole","Penner","1234512345", "8118 Address St"));
			
		}
	
	
	
	
	

}
