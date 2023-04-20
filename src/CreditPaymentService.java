public class CreditPaymentService {

    public double calculate(double credit, double term, double percent) {

        double p = percent / 12 / 100;  // месячный %



        double result = p * (Math.pow (1 + p, term)) / ((Math.pow (1 + p, term) - 1));

        double finish = credit * result;
        return (int) finish;
    }
}