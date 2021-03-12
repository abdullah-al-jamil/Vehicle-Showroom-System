
package technicaltest1;

public class Vehicle {
    String vehicleID;
    String modelNumber;
    int enginePower;
    String tyreSize;
    double weight;
    String turbo;
    
    public Vehicle(String vehicleID, String modelNumber, int enginePower, String tyreSize) {
        this.vehicleID = vehicleID;
        this.modelNumber = modelNumber;
        this.enginePower = enginePower;
        this.tyreSize = tyreSize;
    }
    
    public Vehicle(String vehicleID, String modelNumber, int enginePower, String tyreSize, String turbo) {
        this.vehicleID = vehicleID;
        this.modelNumber = modelNumber;
        this.enginePower = enginePower;
        this.tyreSize = tyreSize;
        this.turbo = turbo;
    }
   
    public Vehicle(String vehicleID, String modelNumber, int enginePower, String tyreSize, double weight) {
        this.vehicleID = vehicleID;
        this.modelNumber = modelNumber;
        this.enginePower = enginePower;
        this.tyreSize = tyreSize;
        this.weight = weight;
    }

    public String getVehicleID() {
        return vehicleID;
    }
    
    public String getModelNumber() {
        return modelNumber;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public String getTyreSize() {
        return tyreSize;
    }
    
    public String getTurbo(){
        return turbo;
    }
    
    public double getWeight(){
        return weight;
    }
    
    @Override
    public String toString(){
        if(weight!=0){
            return "Vehicle ID: "+vehicleID+"; Model Number: "+modelNumber+"; Engine Power: "+enginePower+"; Tyre Size: "
                    +tyreSize+"; Weight: "+weight+"; Vehicle Type: Heavy; Engine Fuel: Diesel";
        }
        
        else if(turbo!=null){
            return "Vehicle ID: "+vehicleID+"; Model Number: "+modelNumber+"; Engine Power: "+enginePower+"; Tyre Size: "
                    +tyreSize+"; Turbo: "+turbo+"; Vehicle Type: Sports; Engine Fuel: Oil";
        }
        
        else{
            return "Vehicle ID: "+vehicleID+"; Model Number: "+modelNumber+"; Engine Power: "+enginePower+"; Tyre Size: "
                    +tyreSize+"; Vehicle Type: Normal; Engine Fuel: Diesel, Oil, Gas";
        }
    }
}
