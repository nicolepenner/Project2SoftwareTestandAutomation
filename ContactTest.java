package test;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactInfo.Contact;

class ContactTest {
	
	@Test
	void testContact() {
		Contact contact = new Contact("00000", "First", "Last", "0123456789", "12345 Address Ave");
		assertTrue(contact.getContactId().equals("00000"));
		assertTrue(contact.getFirstName().equals("First"));
		assertTrue(contact.getLastName().equals("Last"));
		assertTrue(contact.getPhoneNum().equals("0123456789"));
		assertTrue(contact.getAddress().equals("12345 Address Ave"));
	}
	
	@Test
	void testContactIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01234567891", "First", "Last", "0123456789", "12345 Address Ave");
	}); }	
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000", "FirstNameTooLong", "Last", "0123456789", "12345 Address Ave");
		}); }	
		
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000", "First", "LastNameTooLong", "0123456789", "12345 Address Ave");
		}); }	
		
	@Test
	void testContactPhoneNumTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000", "First", "Last", "01234567891", "12345 Address Ave");
		}); }	
		
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000", "First", "Last", "0123456789", "12345 Address Ave Too Long Now!!");
		}); }	
		
	
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "First", "Last", "0123456789", "12345 Address Ave");
		}); }	
	
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000", null, "Last", "0123456789", "12345 Address Ave");
		}); }
	
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000", "First", null, "0123456789", "12345 Address Ave");
		}); }	
	
	@Test
	void testContactPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000", "First", "Last", null, "12345 Address Ave");
		}); }	
	
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000", "First", "Last", "0123456789", null);
		}); }	

}
