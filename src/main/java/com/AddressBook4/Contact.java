package com.AddressBook4;

import java.util.Objects;

public class Contact  implements Comparable<Contact>
{
	String name;
	public Address address;
	public long phoneNumber;
	public String email;


	public Contact(String name, String city,
				   String state, long zip, long phoneNumber, String email) {
		super();
		this.name = name;
		this.address = new Address(city, state, zip);
		this.phoneNumber = phoneNumber;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Name: " + name + "\n address: " + address
				+ "\n Phone: " + phoneNumber + "\n Email: " + email;
	}

	//UC-7 to avoid duplicate contacts of person in an AddressBook
	@Override
	public boolean equals(Object o) {
		Contact ob = (Contact) o;
		if (this.name.equals(ob.name))
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public int compareTo(Contact o) {
		return this.name.compareTo(o.name);
	}
	
}
