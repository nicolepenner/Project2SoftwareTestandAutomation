package contactInfo;

public class Contact {
	
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	/* The contact object will have a contact ID string that cannot be longer than 10 characters or null & not updateable
	The contact object firstName String field that cannot be null or longer than 10 characters
	The contact object lastName String field that cannot be null or longer than 10 characters
	The contact object phone String field that must be exactly 10 digits and not be null
	The contact object address field that must not be null or longer than 30 characters. */
	
	public Contact(String contactId, String firstName, String lastName, String phoneNum, String address) {
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		if(phoneNum == null || phoneNum.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
