public class CreditPaymentService {

    public int calculate(int kredit, int srok, double procent) {

        double p =  (procent / srok / 100);  // месячный %

        Math.pow(p , srok);
        int result = (int) (kredit * ((p * (1 + p) / ((1 + p) - 1))));

        return result;
    }
}