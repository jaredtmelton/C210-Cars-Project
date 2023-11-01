public class SedanCar extends Car {

    private int numDoors;
    private int trunkSize;

    // Creating parameters for our Sedans. Make, model, year, VIN, Doors, Trunk size
    // in ft^2
    public SedanCar(String make, String model, int year, String vinNumber, int numDoors, int trunkSize) {
        super(make, model, year, vinNumber);
        this.numDoors = numDoors;
        this.trunkSize = trunkSize;
    }

    // Retrieving/displaying doors and trunk sizes for our Sedans.
    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(int trunkSize) {
        this.trunkSize = trunkSize;
    }

    public String toString() {
        String output = "Sedan details:\n";
        output += "Owner: " + getCarOwner();
        output += "\nMake: " + getMake();
        output += "\nModel: " + getModel();
        output += "\nYear: " + getYear();
        output += "\nNumber of Doors: " + numDoors;
        output += "\nTrunk size: " + trunkSize + " square feet.\n";

        return output;
    };
}
