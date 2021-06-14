package com.datastructure.exec;

import com.datastructure.model.Document;
import com.datastructure.queue.Queue;

/**
 *
 * @author deecarneiro
 */
public class Printer {

    public static void main(String[] args) throws Exception {
        
        Queue<Document> printerQueue = new Queue<>();
        
        printerQueue.enqueue(new Document("A", 12));
        printerQueue.enqueue(new Document("B", 20));
        printerQueue.enqueue(new Document("C", 10));
        
        while(!printerQueue.isEmpty()){
            
        Document document =  printerQueue.dequeue();
        System.out.println("Printing a new document "+ document.getName());
        
        try{
            Thread.sleep(200 * document.getNumPages());
        }catch(InterruptedException e ){
            e.printStackTrace();
        }
        }
        
        System.out.println("All documents are printed");
    }

}
