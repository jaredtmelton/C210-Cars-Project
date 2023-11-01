public class SportsCar extends Car2 {

    // Displaying statistics for our vehicles.
    
    private int raceStats;

    // Setting parameters for the make, model, year, VIN, and horsepower/stats.
    public SportsCar(String make, String model, int year, String vinNumber, int raceStats) {
        super(make, model, year, vinNumber);
        this.raceStats = raceStats;
    }

    // Retrieving and setting racing statistics.
    public void setRaceStats(int raceStats) {
        this.raceStats = raceStats;
    }

    // Getter method for raceStats
    public int getRaceStats() {
        return raceStats;
    }
    
    // Displaying output
    
    
   @Override
    public String toString() {
		String output = "Sports car details:\n";
		output += "Owner: " + getCarOwner();
		output += "\nMake: " + getMake();
		output += "\nModel: " + getModel();
		output += "\nYear: " + getYear();
		output += "\nRace stats: " + raceStats + " Horse Power\n";
		
		return output;
	};
}
