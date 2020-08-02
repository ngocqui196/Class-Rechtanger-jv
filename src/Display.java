import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Width: ");
        double w = sc.nextDouble();
        System.out.print("Height: ");
        double h = sc.nextDouble();
        Rectanger rectanger = new Rectanger(w,h);
        System.out.println(" Your Rectanger \n" + rectanger.display());
        System.out.print("Perimeter of the Rectanger: " + rectanger.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectanger.getArea());
    }
}
