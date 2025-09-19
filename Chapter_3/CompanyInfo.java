import java.util.Scanner;

class CompanyInfo {

    public static void main(String[] args) {
        System.out.println("Smart ELectronics"); 
        System.out.println(displayHours());
    } 

    public static String displayHours() {
       String hours = "Monday - Friday 8am to 6pm\n" +
                       "Saturday        8am to noon\n" +
                       "Sunday          closed";
     return hours;
}
        


}
