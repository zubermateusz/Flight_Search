public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Fight {
    String departure;
    String arrival;

    public Fight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDetails() {
        return "Flight from " + this.departure + " to " + this.arrival;
    }
}