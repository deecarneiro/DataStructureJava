package com.datastructure.model;

import com.datastructure.queue.PriorityQueue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deecarneiro
 */
public class AttendanceNewPatients implements Runnable {

    private PriorityQueue queue;
    private int count = 7;
    private Random priority = new Random();

    public AttendanceNewPatients(PriorityQueue queue) {
        super();
        this.queue = queue;
    }

    @Override
    public void run() {

        for (int i = 0; i < 8; i++) {
            
            try {
                Thread.sleep(8000);
                Patient patient = new Patient("" + count, priority.nextInt(3));
                queue.enqueue(patient);
                count++;
                System.out.println(patient.getName()+ " was enqueueded");
            } catch (InterruptedException ex) {
                Logger.getLogger(AttendanceNewPatients.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(AttendanceNewPatients.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

}
