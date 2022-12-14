public class Ticket {
    Route route;
    MyDateTime time;
    private double price;

    public Ticket(Route route, MyDateTime time, double price) {
        this.route = route;
        this.time = time;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "route - " + route +
                ", time - " + time +
                ", price=" + price +
                '}';
    }

    public Route getRoute() {
        return route;
    }

    public MyDateTime getTime() {
        return time;
    }

    public double getPrice() {
        return price;
    }

    public void printTicket(){
        System.out.println(toString());
    }

    }

