package com.datastructure.model;

/**
 *
 * @author deecarneiro
 */
public class Patient implements Comparable<Patient> {

    private String name;
    private int priority;

    public Patient() {
    }

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", priority=" + priority + '}';
    }

    @Override
    public int compareTo(Patient patient) {

        if (this.priority > patient.getPriority()) {
            return 1;
        } else if (this.priority < patient.getPriority()) {
            return -1;
        }
        return 0;
    }

}
