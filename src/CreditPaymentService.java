public class CreditPaymentService {

    public double calculate(double credit, double term, double percent) {

<<<<<<< HEAD
        double p = percent / 12 / 100;  // месячный %
=======
        double p =  (procent / srok / 100);  // месячный %

        Math.pow(p , srok);
        int result = (int) (kredit * ((p * (1 + p) / ((1 + p) - 1))));
>>>>>>> 21b732c81eeadfed46d20dacb8e796b5c584c935



        double result = p * (Math.pow (1 + p, term)) / ((Math.pow (1 + p, term) - 1));

        double finish = credit * result;
        return (int) finish;
    }
}