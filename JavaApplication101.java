
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication101;
import java.util.ArrayList;

/**
 *
 * @author anzoh
 */
public class JavaApplication101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declare and initialse my first ArrayList!
        
          System.out.println("--- Java Array lists ---");
        
          ArrayList<String> studentNames = new ArrayList<>();
    
          System.out.println("Intial studentNames ArrayList. Is it empty?: " + studentNames.isEmpty());
          
          //Add elements
          studentNames.add("Anas");
          studentNames.add("susu");
          studentNames.add("taikobo");
          studentNames.add(1, "oeki");
          System.out.println("Student names after adding: " + studentNames);
          
          //Get size
          System.out.println("Number of students: " + studentNames.size());
          
          //Access element
          System.out.println("Student at index 0: " + studentNames.get(0));
          System.out.println("Student at index 1: " + studentNames.get(1));
          
          //Set update an element
          studentNames.set(0, "yozen");
          System.out.println("Students names after update: " + studentNames);
          
          
          //remove an element
          studentNames.remove(0);
          System.out.println("Student names after remove an element: " + studentNames);
}
    
}
