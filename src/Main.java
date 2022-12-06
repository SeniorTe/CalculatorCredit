public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int sum = 1_000_000;
        int time12 = 12;
        int payment = service.calculate(time12, sum);
        System.out.println("Ежемесячный платеж при сроке кредитования 1 год - " + payment);

        int time24 = 24;
        int payment24 = service.calculate(time24, sum);
        System.out.println("Ежемесячный платеж при сроке кредитования 2 года - " + payment24);

        int time36 = 36;
        int payment36 = service.calculate(time36, sum);
        System.out.println("Ежемесячный платеж при сроке кредитования 3 года - " + payment36);
    }
}