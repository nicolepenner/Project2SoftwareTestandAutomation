package contactInfo;

import java.util.ArrayList;

public class ContactService {
	private ArrayList<Contact> contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	//check if contact is present, if not add it
	public boolean add(Contact contact) {
		boolean present = false;
				for(Contact object1: contacts) {
					if(object1.equals(contact)) {
						present = true;
					}
				}
		if(!present) {
			contacts.add(contact);
			return true;	
		} else {
			System.out.println("Contact already present");
			return false;
		}
	}
	
	//remove contact using contact id
	public boolean remove(String contactId) {
		for (Contact object2: contacts) {
			if(object2.getContactId().equals(contactId)) {
				contacts.remove(object2);
				System.out.println("Contact was successfully removed");
				return true;
			}
		}
		System.out.println("Contact was not found");
		return false;
	}
	
	//search for contactId, and update firstName, lastName, address, phone number
	public boolean update(String contactId, String firstName, String lastName, String phoneNum, String address) {
		for (Contact object3 : contacts) {
			if (object3.getContactId().equals(contactId)) {
				if (!firstName.equals(""))
					object3.setFirstName(firstName);
				if(!lastName.equals(""))
					object3.setLastName(lastName);
				if(!phoneNum.equals(""))
					object3.setPhoneNum(phoneNum);
				if(!address.equals(""))
					object3.setAddress(address);
				System.out.println("Contact updated");
				return true;
			}
		}
		System.out.println("Contact not found");
		return false;
	}	
}
