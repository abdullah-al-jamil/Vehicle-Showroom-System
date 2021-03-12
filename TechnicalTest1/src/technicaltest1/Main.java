
package technicaltest1;

import java.util.*;

public class Main{
    Scanner sc = new Scanner(System.in);
    
    Main()
    {
        Functionalities functionalities = new Functionalities();
        functionalities.initialize();
        
        String cont = "y";
        while(cont.equals("y"))
        {
            System.out.println("-----------X Vehicle Showroom---------------");
            System.out.println("Press \'a\' for adding a new vehicle");  
            System.out.println("Press \'r\' to remove a vehicle from the list");
            System.out.println("Press \'l\' for the vehicle list");
            System.out.println("Press \'e\' for expected visitors count");
            System.out.print("Please enter a key: ");
            
            String operation = sc.nextLine();

            functionalities.showroomFunctionalities(operation);
            System.out.print("Do you want to continue this operation? press \'y\' if yes or \'n\' if no: ");
            cont = sc.nextLine();
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        new Main();
    }
    
}
