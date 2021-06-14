package com.datastructure.exec;

import com.datastructure.queue.Queue;

/**
 *
 * @author deecarneiro
 */
public class PriorityQueueExec {

    public static void main(String[] args) throws Exception {
        
      Queue<String> regular = new Queue<>();
      
      Queue<String> priority = new Queue<>();
      
      final int MAX_PRIORITY = 3;
      regular.enqueue("Person 1");
      regular.enqueue("Person 2");
      regular.enqueue("Person 3");
      regular.enqueue("Person 4");
      regular.enqueue("Person 5");
      regular.enqueue("Person 6");
      regular.enqueue("Person 7");
      regular.enqueue("Person 8");
      regular.enqueue("Person 9");

      priority.enqueue("Person 1");
      priority.enqueue("Person 2");
      priority.enqueue("Person 3");
      priority.enqueue("Person 4");
      priority.enqueue("Person 5");
      priority.enqueue("Person 6");
      priority.enqueue("Person 7");
      priority.enqueue("Person 8");
      priority.enqueue("Person 9");
      
      while(!priority.isEmpty() || !regular.isEmpty()){
      
          int count = 0;
          
          while(!priority.isEmpty() && count < MAX_PRIORITY){
             attendingPerson(priority, "Priority");
             count++;
          }
          
          if(!regular.isEmpty()){
             attendingPerson(regular, "Regular");
          }
          
          if(priority.isEmpty()){
             while(!regular.isEmpty()){
               attendingPerson(regular, "Regular");
             } 
          }
      }
      
      

    }
    

    public static void attendingPerson(Queue queue, String queueName){
        String person = (String) queue.dequeue();
        System.out.println(person+" was attended from "+queueName);
    }
}
