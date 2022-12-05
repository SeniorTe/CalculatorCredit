public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int sum = 1_000_000;
        int time12 = 1;
        double payment = service.calculate(time12, sum);
        System.out.println("Ежемесячный платеж при сроке кредитования 1 год - " + Math.round(payment));

        int time24 = 2;
        double payment24 = service.calculate(time24, sum);
        System.out.println("Ежемесячный платеж при сроке кредитования 2 года - " + Math.round(payment24));

        int time36 = 3;
        double payment36 = service.calculate(time36, sum);
        System.out.println("Ежемесячный платеж при сроке кредитования 3 года - " + Math.round(payment36));
    }
}