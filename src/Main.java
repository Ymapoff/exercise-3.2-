public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int kredit = 1_000_000;
        int srok = 12;
        double procent = 9.99;
        int mp = service.calculate(kredit, srok, procent);

        System.out.println(mp / srok);
    }
}