package com.AddressBook4;

public interface IAddressBook 
{
	 void addContact();
     void editContact(String name);
     void deleteContact(String name);
	 AddressBook addMultipleContacts();
	  
}
