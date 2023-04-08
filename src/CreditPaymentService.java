public class CreditPaymentService {

    public int calculate(int kredit, int srok, double procent) {

        Math.pow(srok, procent);
        int result = (int) (kredit * ((0.008325 * (1 + 0.008325) / ((1 + 0.008325) - 1))));

        return result;
    }
}