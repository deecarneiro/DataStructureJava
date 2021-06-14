
package com.datastructure.model;

import com.datastructure.queue.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deecarneiro
 */
public class AttendanceEmergency implements Runnable{
    
    private PriorityQueue queue;

    public AttendanceEmergency(PriorityQueue queue) {
        super();
        this.queue = queue;
    }
    

    @Override
    public void run() {
        
        while(!queue.isEmpty()){
            Patient namePatient = (Patient) queue.dequeue();
            System.out.println( namePatient.getName()+ " was attended");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(AttendanceEmergency.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        System.out.println("Attendance was finished");
    }
    
}
