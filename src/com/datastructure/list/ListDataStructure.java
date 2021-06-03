package com.datastructure.list;

import com.datastructure.list.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deecarneiro
 */
public class ListDataStructure {

    public static void main(String[] args) {

        List<String> vector = new List<String>(2);

        try {
            vector.add("Deyse");
            vector.add("Lana");
            vector.add("Luciene");
            vector.add("Luciene");
            vector.remove(1);

        } catch (Exception ex) {
            Logger.getLogger(ListDataStructure.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Vector Size " + vector.size());
        System.out.println("Vector content " + vector.toString());
        System.out.println("Vector content " + vector.search("Katharine"));

        System.out.println("arraydatastructure.ArrayDataStructure.main()");
    }

}
