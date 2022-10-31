import java.text.DecimalFormat;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        double average = 0;
        double sum = 0;
        int numCount = 0;
        if (num == -1){
            System.out.println("You didn't input any numbers");
        }
        else{
            while (num != -1) {
                sum = sum + num;
                System.out.print("Enter a new number: ");
                num = s.nextInt();
                numCount++;

                }
            average = sum/numCount;
            System.out.println("Average: " + df.format(average) + ", sum: " + sum);
            }

        }


    }

