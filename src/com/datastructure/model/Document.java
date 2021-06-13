
package com.datastructure.model;

/**
 *
 * @author deecarneiro
 */
public class Document {
    
    private String name;
    private int numPages;
    

    public Document() {
    }
    

    public Document(String name, int numPages) {
        this.name = name;
        this.numPages = numPages;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Document{" + "name=" + name + ", numPages=" + numPages + '}';
    }
    
    
    
    
}
