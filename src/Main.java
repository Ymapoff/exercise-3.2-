public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();


        double mp = service.calculate(1_000_000, 12, 9.99);
        System.out.println(mp + "Платеж");


        double mp2 = service.calculate(1_000_000, 24, 9.99);
        System.out.println(mp2 + "Платеж");


        double mp3 = service.calculate(1_000_000, 36, 9.99);
        System.out.println(mp3 + "Платеж");
    }
}