public class CreditPaymentService {
    public int calculate(int timeCredit, int sumCredit) {

        if (timeCredit == 1) {
            timeCredit = 12;
        }
        if (timeCredit == 2) {
            timeCredit = 24;
        }
        if (timeCredit == 3) {
            timeCredit = 36;
        }
        double exponentiation = (1 + (9.99 / (12 * 100)));
        int percent = (int) ((sumCredit * (9.99 / (12 * 100))) / (1 - (Math.pow(exponentiation, -timeCredit))));

        return percent;
    }
}