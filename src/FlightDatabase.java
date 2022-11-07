import java.util.ArrayList;

public class FlightDatabase {
    ArrayList<Flight> flights = new ArrayList<Flight>();

    public FlightDatabase() {
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

    public void checkIfFlightExists(String start, String end) {
        boolean notExist = true;
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (start.equals(flight.departure) && end.equals(flight.arrival)) {
                System.out.println("Flight exists!!!");
                return;
            }
        }
    }

    public void getFlightsFromCity(String city) {
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (city.equals(flight.departure)) {
                System.out.println(flight.getDetails());
            }
        }
    }
}
