public class Flight {
    String departure;
    String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDetails() {
        return "Flight from " + this.departure + " to " + this.arrival;
    }
}
