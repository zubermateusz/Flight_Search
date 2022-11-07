import java.util.ArrayList;

public class FlightDatebase {
    ArrayList<Flight> flights = new ArrayList<Flight>();

    public FlightDatebase() {
        this.flights.add(new Flight("Berlin", "Tokyo"));
        this.flights.add(new Flight("Paris", "Berlin"));
        this.flights.add(new Flight("Warsaw", "Paris"));
        this.flights.add(new Flight("Madrid", "Berlin"));
        this.flights.add(new Flight("Berlin", "Warsaw"));
        this.flights.add(new Flight("Paris", "Madrid"));
        this.flights.add(new Flight("Porto", "Warsaw"));
        this.flights.add(new Flight("Madrid", "Porto"));
        this.flights.add(new Flight("Warsaw", "Madrid"));
    }

    public void checkIfFlightExists() {

    }
}
