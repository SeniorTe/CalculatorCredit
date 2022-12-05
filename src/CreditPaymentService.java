public class CreditPaymentService {
    public double calculate (int a, int b){

        double c = 0;
        if (a == 1) {
            c = 1.05494; a = 12;
        } if (a == 2){
            c = 1.10736; a = 24;
        } if (a == 3) {
            c = 1.16145; a = 36;
        }
        int percent = (int) ((b * c) / a);

        return percent;
    }
}
