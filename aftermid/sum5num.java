package aftermid;
import java.util.Scanner;

public class sum5num {
    public static void main (String[] arg){
        Scanner numScan = new Scanner(System.in);

        float sum = 0;

    for (int i = 1 ; i <=5 ; i++){
        System.out.print("Enter number " + i + " : ");
        float num = numScan.nextFloat();
 
        sum += num ;
    }
    
    float average = sum/5;

        System.out.println("Sum = " + sum + " average = " + average);

    numScan.close();
    }
}