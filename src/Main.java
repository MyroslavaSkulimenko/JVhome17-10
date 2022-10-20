import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //создать несколько разных билетов, положить их в массив.
        Route r1 = new Route("1224f", "Oslo", "Varshava", 650);
        Route r2 = new Route("12888", "Oslo", "Keln", 800);
        Route r3 = new Route("1227n", "Oslo", "Peris", 700);
        Route r4 = new Route("13451", "Oslo", "Berlin", 1000);
        MyDateTime d1 = new MyDateTime(12, 10, 2022, 12, 34);
        MyDateTime d2 = new MyDateTime(12, 10, 2022, 12, 50);
        MyDateTime d3 = new MyDateTime(12, 10, 2022, 19, 19);
        MyDateTime d4 = new MyDateTime(12, 10, 2022, 5, 43);


        Ticket t1 = new Ticket(r1, d1, 312);
        Ticket t2 = new Ticket(r2, d2, 673);
        Ticket t3 = new Ticket(r3, d3, 450);
        Ticket t4 = new Ticket(r4, d4, 880);
        Ticket[] tickets = {t1, t2, t3, t4};
        //
        for (Ticket ticket : tickets) {
            ticket.printTicket();
        }
        System.out.println("_____________________");
        System.out.println("sumPrice = "+sumPrice(tickets));
        System.out.println("sumDistance = "+sumDistance(tickets));
        timeExt(d1);
        }
    public static double sumPrice(Ticket[]tick) {
        double summ = tick[0].getPrice();
        for (int i = 1; i < tick.length; i++) {
            summ += tick[i].getPrice();
        }
        return summ;
    }
    public static double sumDistance(Ticket[]tick) {
        double summ = tick[0].route.getDistance();
        for (int i = 1; i < tick.length; i++) {
            summ += tick[i].route.getDistance();
        }
        return summ;
    }
    public static void timeExt(MyDateTime time){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время отправления - час:");
        time.setHour(sc.nextInt()) ;
        System.out.println("Спасибо! Вы ввели  " + time.getHour() + "часов");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите время отправления - мин:");
        time.setMin(sc.nextInt()); ;
        System.out.println("Спасибо! Вы ввели  " + time.getMin() + "мин");
        System.out.println(time);
    }

}
