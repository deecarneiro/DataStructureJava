
package com.datastructure.model;

/**
 *
 * @author deecarneiro
 */
public class Contact {
    
    private String name;
    private String email;
    private String telephone;

    public Contact(String name, String email, String telephone) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", email=" + email + ", telephone=" + telephone + '}';
    }
    
    
    
}
