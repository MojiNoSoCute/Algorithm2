package aftermid;
import java.util.Scanner;

public class cicleArea {

public static void main (String[] arg){
    Scanner radiusScan = new Scanner(System.in);

    System.out.print("Enter radius : ");
    float radiusEnter = radiusScan.nextFloat();
    
    double pi = Math.PI;
    double radiusArea = pi*(radiusEnter*radiusEnter);

    System.out.println("Area of cicle that has radius = " + radiusEnter + " meter is " + radiusArea + " square meter.");

    radiusScan.close();
    }

}