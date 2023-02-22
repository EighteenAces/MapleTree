/**************************************************
 * Java Course 2, Ungraded Practice Activity 1
 * 
 * MapleTree driven class and MapleTreeDriver class 
 *  
 * @author Jellie Mae Ortiz
 * Date Created: May 16, 2022
 **************************************************/

import java.util.Scanner;

//MapleTree driven class
public class MapleTree{

    private String plantDate = "dd/mm/yyyy"; 
    private double height;
    private String heightDate = "dd/mm/yyyy";

    Scanner scan = new Scanner(System.in);

    public void plant(){

       System.out.printf("\nEnter plant date (dd/mm/yyyy): ");
       plantDate = scan.nextLine();
        
    }

    public void germinate(){
        
        System.out.printf("\nEnter germination date (dd/mm/yyyy):");
        heightDate = scan.nextLine();

        System.out.printf("\nEnter observe height in meters:");
        height = scan.nextDouble();
    }

    public void dumpData(){

        System.out.println("\nPlant date=" + plantDate);
        System.out.println("Germinate date=" + heightDate);
        System.out.println("Initial height=" + height + "meters");
    }
   
} // end of the class program
