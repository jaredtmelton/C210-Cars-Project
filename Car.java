import java.util.Optional;

public class Car {

    private String make;
    private String model;
    private int year;
    private String vinNumber;
    private Optional<CarOwner> carOwner = Optional.empty();

    // Creating parameters for the vehicles (model/make/year/VIN)

    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.vinNumber = "Unknown";
    }

    // Creating parameters for the vehicles (model/make/year/VIN) that can actually be used.

    public Car(String make, String model, int year, String vinNumber) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vinNumber = vinNumber;
    }

    // Get/set stuff

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public Optional<CarOwner> getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(CarOwner carOwner) {
        this.carOwner = Optional.ofNullable(carOwner);
    }

    //toString method to represent the object as a String
	@Override
	public String toString() {
		String output = "Car details:";
		output += "\nMake: " + make;
		output += "\nModel: " + model;
		output += "\nYear: " + year;
		output += "\nVin Number: " + vinNumber;
		output += "\nOwner " + carOwner;
		return output;

	};
    }