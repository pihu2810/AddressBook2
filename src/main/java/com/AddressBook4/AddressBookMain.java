package com.AddressBook4;

import java.io.IOException;

//import java.util.Scanner;

public class AddressBookMain 
{
	public static void main(String[] args) throws IOException {
		
		 //  Scanner sc=new Scanner(System.in);
				AddressBookDictionary addressBookDictionary = new AddressBookDictionary();
				addressBookDictionary.addMultipleAddressBook();
			//	addressBookDictionary.printAddressBookDictionary();
//			System.out.println("enter the place to be search");
//				String place=sc.next();
//				addressBookDictionary.searchPersonInCityOrState(place);
//				System.out.println("enter the place to be view");
//				String place1=sc.next();
//				addressBookDictionary.viewPersonByCityOrState(place1);
//				System.out.println("enter the place to get the person count");
//				String place3=sc.next();
//				addressBookDictionary.getPersonsCountByCityOrState(place3);
//				addressBookDictionary.sortPersonByNames();
//			    addressBookDictionary.sortPersonByCity();
//				addressBookDictionary.sortPersonByState();
//				addressBookDictionary.sortPersonByZip();
//				addressBookDictionary.addContactsToFile();
//				addressBookDictionary.readPersonDataFromFile();
//				addressBookDictionary.writeDataIntoCSVFile();
//				addressBookDictionary.readCSVDataFromFile();
				addressBookDictionary.writeDataIntoJsonFile();
				addressBookDictionary.readDataFromJsonFile();

			}

}
