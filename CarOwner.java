public class CarOwner {

    private String name;
    private String address;

    // Default 
    
    public CarOwner() {
        this.name = "Unknown";
        this.address = "Unknown";
    }

    // Creating Parameters for names/addresses

    public CarOwner(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Retrieving names
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Retrieving and setting addresses

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format(
            "%s\nAddress: %s\n",
            name, address
        );
    }
}
