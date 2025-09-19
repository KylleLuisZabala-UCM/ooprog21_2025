import java.util.Scanner; 

class DemoGrossPay {

    public static void main(String[] args) {
        double hour1 = 10.0;
        double hour2 = 25.0;
        double hour3 = 37.5;

        calculateGross(hour1);
        calculateGross(hour2);
        calculateGross(hour3);
    }

    public static void calculateGross(double hoursWorked) {
        double fixedPay = 22.75;
        double grossPay = hoursWorked * fixedPay;
        System.out.println("Gross pay for " + hoursWorked + " hours: $" + grossPay);
    }
}
