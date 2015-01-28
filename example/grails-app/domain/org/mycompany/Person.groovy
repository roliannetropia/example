package org.mycompany

class Person {
	String firstName;
    String lastName;
	List<Address> addresses; //We are going to store an array of addresses in the person collection.

    static hasMany = [addresses: Address]

    static constraints = {
        firstName(blank: false)
        lastName(blank: false)
    }
}
