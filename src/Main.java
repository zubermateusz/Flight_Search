import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FlightDatabase database = new FlightDatabase();
        database.checkIfFlightExists("Paris", "Madrid");
        ArrayList<Flight> fromCity = database.getFlightsFromCity("Paris");
        ArrayList<Flight> toCity = database.getFlightsToCity("Warsaw");
        database.displayFlights(fromCity);
        database.displayFlights(toCity);

        ArrayList<String> cities = database.getCities();
        System.out.println(cities);

        Flight cheapestFlight = database.getCheapestFlight();
        System.out.println("Cheapest flight: " + cheapestFlight.getDetails());
        ArrayList<Journey> journeys = database.getFlight("Paris", "Porto");
        System.out.println(journeys);
    }
}



