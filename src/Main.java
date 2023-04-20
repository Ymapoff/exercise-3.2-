public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();


<<<<<<< HEAD
        double mp = service.calculate(1_000_000, 12, 9.99);
        System.out.println(mp + "Платеж");


        double mp2 = service.calculate(1_000_000, 24, 9.99);
        System.out.println(mp2 + "Платеж");


        double mp3 = service.calculate(1_000_000, 36, 9.99);
        System.out.println(mp3 + "Платеж");
=======
        System.out.println(mp / srok);
>>>>>>> 21b732c81eeadfed46d20dacb8e796b5c584c935
    }
}