
package technicaltest1;

import java.util.*;

class Functionalities {
    
    ArrayList<Vehicle> vehicleList;
    Scanner sc;
    
    void initialize(){
        vehicleList = new ArrayList<Vehicle>();
        sc = new Scanner(System.in);
    
    }
    
    void showroomFunctionalities(String operation)
    {
        if(operation.toLowerCase().equals("a")){
            addVehicle();
        }
        
        else if(operation.toLowerCase().equals("r")){
            removeVehicle();
        }
        
        else if(operation.toLowerCase().equals("l")){
            showVehecleList();           
        }
        
        else if(operation.toLowerCase().equals("e"))
        {
            countExpectedVisitors();
        }
        
        else{
            System.out.println("Type a valid key");
        }
    }

    private void addVehicle() {
        
        System.out.print("Please enter vehicle's information\nVehicle ID: ");
        String vehicleID = sc.nextLine();
        
        System.out.print("Vehicle Type: ");
        String vehicleType = sc.nextLine();
        
        System.out.print("Model number: ");
        String modelNumber = sc.nextLine();
        
        System.out.print("Engine Power: ");
        int enginePower = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Tyre Size: ");
        String tyreSize = sc.nextLine();
        
        String turbo;
        double weight;
        Vehicle vehicle;
        
        if(vehicleType.toLowerCase().trim().equals("sports")){
           System.out.print("Turbo: ");
           turbo = sc.nextLine();
           vehicle = new Vehicle(vehicleID, modelNumber, enginePower, tyreSize, turbo);
        }
        
        else if(vehicleType.toLowerCase().trim().equals("heavy")){
            System.out.print("Weight: ");
            weight = sc.nextDouble();
            vehicle = new Vehicle(vehicleID, modelNumber, enginePower, tyreSize, weight);
        }
        
        else{
            vehicle = new Vehicle(vehicleID, modelNumber, enginePower, tyreSize);
        }
        
        vehicleList.add(vehicle);
        System.out.println("New vehicle added.\n"+vehicle+"\n");
    }

    private void removeVehicle() {
        System.out.print("Please enter a vehicle ID you want to remove: ");
        String vehicleID = sc.nextLine();
        for(Vehicle vehicle:vehicleList){
            if(vehicle.vehicleID.equals(vehicleID)){
                vehicleList.remove(vehicle);
                System.out.println("Vehicle with vehicle ID: "+ vehicleID+" removed.\n");
                return;
            }
        }
        
        System.out.println("Vehicle with vehicle ID: "+ vehicleID+" not found.\n");
    }

    private void showVehecleList() {
        if(vehicleList.isEmpty()){
            System.out.println("\nNo vehicle in the showroom\n");
            return;
        }
        System.out.println("\n................................Vehicle List................................");
        
        for(Vehicle vehicle: vehicleList){
            System.out.println(vehicle);
        }
        
        System.out.println("............................................................................\n");
    }

    private void countExpectedVisitors() {
        int expectedVisitors = 30;
        for(Vehicle vehicle:vehicleList)
        {
            if(vehicle.turbo!=null){
                expectedVisitors+=20;
            }
        }
        
        System.out.println("\nExpect Visitors: "+ expectedVisitors);
        
        showVehecleList();
    }
    
    
}
