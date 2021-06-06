package com.datastructure.list;

import com.datastructure.list.List;
import com.datastructure.models.Contact;


/**
 *
 * @author deecarneiro
 */
public class ListDataStructure {

    public static void main(String[] args) throws Exception {

        List<Contact> contacts = new List<Contact>(20);

        for (int i = 0; i < 30; i++) {
            contacts.add(new Contact("Contact" + i, "contact" + i + "@email.com", "(81) 998314527" + i));

        }
        
        contacts.add(0, new Contact("Deyse", "deyse@salvus.me", "(81) 983145270"));
        
        contacts.remove(1);
        
        Contact c1 = new Contact("Contact29", "contact29@email.com", "(81) 99831452729");
        
        contacts.remove(c1);
        
        System.out.println("Contacts: "+ contacts);

    }

}
