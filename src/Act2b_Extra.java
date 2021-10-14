import java.util.Calendar;
import java.io.Console;

class UserProfile_2 {
    public static void main(String[]args){
        Console console = System.console();
        System.out.println("Please enter your name: ");
        String userName = console.readLine();
        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(System.console().readLine());
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int YOB = currentYear - age;
        System.out.println("Hi, " + userName + ", age " + age + ". You are born in the year, " + YOB + "!");
        }
}›