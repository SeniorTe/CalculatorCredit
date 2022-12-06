public class CreditPaymentService {
    public int calculate(int timeCredit, int sumCredit) {

        double exponentiation = (1 + (9.99 / (12 * 100)));
        int percent = (int) ((sumCredit * (9.99 / (12 * 100))) / (1 - (Math.pow(exponentiation, -(timeCredit * 12)))));

        return percent;
    }
}