import java.io.Console;
//import java.lang.Math;

class circle {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Enter diameter(cm): ");
        float diameter = Float.parseFloat(System.console().readLine());
        float pi = 3.1415926535f;
        float radius = diameter/2;
        float area = pi * (radius * radius);
        float perimeter = 2 * pi *radius;
        System.out.println("Diameter of " + diameter + " will have an Area of " + area + "cm2 and perimeter of " + perimeter + "cm.");
//        String.format("Diameter of %.2f have an Area of AREA cm2 and perimeter of PERI cm.", diameter);
    }
}