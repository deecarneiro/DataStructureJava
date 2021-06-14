package com.datastructure.exec;

import com.datastructure.model.AttendanceNewPatients;
import com.datastructure.model.AttendanceEmergency;
import com.datastructure.model.Patient;
import com.datastructure.queue.PriorityQueue;

/**
 *
 * @author deecarneiro
 */
public class EmergencyQueue {

    public static final int GREEN = 2;
    public static final int YELLOW = 1;
    public static final int RED = 0;

    public static void main(String[] args) throws Exception {
        
        PriorityQueue<Patient> patientQueue = new PriorityQueue<>();
        
        patientQueue.enqueue(new Patient("Gloria", GREEN));
        patientQueue.enqueue(new Patient("Carlos", RED));
        patientQueue.enqueue(new Patient("Beth", YELLOW));
        patientQueue.enqueue(new Patient("Joan", RED)); 
        patientQueue.enqueue(new Patient("Deborah", GREEN));
        patientQueue.enqueue(new Patient("James", RED)); 
        patientQueue.enqueue(new Patient("Henry", YELLOW));
        patientQueue.enqueue(new Patient("Lydia", GREEN)); 
        patientQueue.enqueue(new Patient("Ethan", RED));
        patientQueue.enqueue(new Patient("Julian", RED));
       
        
        AttendanceEmergency AE = new AttendanceEmergency(patientQueue);
        AttendanceNewPatients newPatients = new AttendanceNewPatients(patientQueue);
        
        Thread t1 = new Thread(AE);
        Thread t2 = new Thread(newPatients);
        
        t1.start();
        t2.start();

    }
}
