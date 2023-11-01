import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UseCar {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<Car> carList = createCars();
        
        displayCars(carList);
        searchAndDisplayCarByVin(carList);
    }

	// List of cars, VINs, and HP/doors/ft^2 for trunks as applicable

    private static List<Car> createCars() {
        List<Car> carList = new ArrayList<>();

        carList.add(new SportsCar("Toyota", "Supra", 2020, "WBA5A7C57ED620151", 280));
        carList.add(new SportsCar("Chevrolet", "Corvette", 2021, "WBA5A7C50ED685522", 590));
        carList.add(new SedanCar("Toyota", "Corolla", 2022, "1C6RD6GPXCS170688", 4, 18));
        carList.add(new SportsCar("Mazda", "MX-5", 2020, "3MZBM1U71EM004320", 181));
        carList.add(new SportsCar("Nissan", "GT-R", 2021, "1N6BA0EC9EN134432", 580));
        carList.add(new SedanCar("Honda", "Civic", 2023, "19UDE2F78HA000785", 4, 16));
        carList.add(new SedanCar("Toyota", "Camry", 2023, "4T1BF1FK9HU685498", 4, 20));

		// Owners and addresses

        CarOwner Jimbob = new CarOwner("Jonathan", "742 Evergreen Terrace");
        CarOwner Anita = new CarOwner("Megan", "10 Main St");
        CarOwner Roberto = new CarOwner("Roberto", "99 Oak Avenue");
        CarOwner Samantha = new CarOwner("Samantha", "401 Cherry Lane");

		// Retrieve owners/setting owners

        carList.get(0).setCarOwner(Jimbob);
        carList.get(1).setCarOwner(Anita);
        carList.get(2).setCarOwner(Roberto);
        carList.get(3).setCarOwner(Samantha);

        CarOwner owner1 = createCarOwner();
        SportsCar sportsCar3 = createSportsCar();
        SedanCar sedan3 = createSedanCar();

        sportsCar3.setCarOwner(owner1);
        sedan3.setCarOwner(owner1);

        carList.add(sportsCar3);
        carList.add(sedan3);

        return carList;
    }



    private static void displayCars(List<Car2> carList) {
        carList.forEach(System.out::println);
    }

	// Prompts the user to search for a car by the VIN number. Displays car details upon doing so.

    private static void searchAndDisplayCarByVin(List<Car2> carList) {
        System.out.println("Enter the VIN of the vehicle you wish to locate: ");
        String vinNumber = input.nextLine();


        carList.stream()
            .filter(car -> car.getVinNumber().equals(vinNumber))
            .findFirst()
            .ifPresentOrElse(
                car -> System.out.println("The model, make, and year of the car with this VIN is " + car),
                () -> System.out.println("A car with the provided VIN cannot be found.")
            );
    }

	// Prompts the user for details about the car owner. Allows them to create a new car owner as necessary.

    private static CarOwner createCarOwner() {
        System.out.println("Enter the owner's name: ");
        String name = input.nextLine();
        System.out.println("Enter the owner's home address: ");
        String address = input.nextLine();
        return new CarOwner(name, address);
    }

	// Allows the creation of a sports car.

    private static SportsCar createSportsCar() {
        System.out.println("Enter the make of the sports car: ");
        String make = input.nextLine();
        System.out.println("Enter the model of the Sports Car: ");
        String model = input.nextLine();
        int year = getIntInput("Enter the year of the Sports Car: ");
        System.out.println("Enter the VIN of the Sports Car: ");
        String vinNumber = input.nextLine();
        int raceStats = getIntInput("Enter the race stats of the Sports Car: ");
        return new SportsCar(make, model, year, vinNumber, raceStats);
    }

	// Allows the creation of a sedan.

    private static SedanCar createSedanCar() {
        System.out.println("Enter the make of the Sedan: ");
        String make = input.nextLine();
        System.out.println("Enter the model of the Sedan: ");
        String model = input.nextLine();
        int year = getIntInput("Enter the year of the Sedan: ");
        System.out.println("Enter the VIN number of the Sedan: ");
        String vinNumber = input.nextLine();
        int numDoors = getIntInput("Enter the number of doors: ");
        int trunkSize = getIntInput("Enter the trunk size in ft^2: ");
        return new SedanCar(make, model, year, vinNumber, numDoors, trunkSize);
    }

	// Repeatedly prompts the user to enter a number until a valid one is provided.

    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine(); // clear invalid input
            }
        }
    }
}