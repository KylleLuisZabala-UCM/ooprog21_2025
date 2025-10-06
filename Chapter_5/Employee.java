public class Employee {

    private int employeeNumber;
    private double payRate;
    private static final int MAX_EMPLOYEE_NUMBER = 9999;
    private static final double MAX_PAY_RATE = 60.0;
    private static final double OVERTIME_MULTIPLIER = 1.5;


    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER)
            employeeNumber = MAX_EMPLOYEE_NUMBER;
        if (payRate > MAX_PAY_RATE)
            payRate = MAX_PAY_RATE;

        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double computeRegularPay(double hoursWorked) {
        if (hoursWorked <= 40)
            return hoursWorked * payRate;
        else
            return 40 * payRate;
    }

   
    public double computeOvertimePay(double hoursWorked) {
        if (hoursWorked > 40)
            return (hoursWorked - 40) * payRate * OVERTIME_MULTIPLIER;
        else
            return 0;
    }
}