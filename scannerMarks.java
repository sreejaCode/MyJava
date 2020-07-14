package Sreeja;
import java.util.Scanner;
public class scannerMarks {

		
		    public static void main(String[] args) {

		        // creating a Scanner object
		        Scanner input = new Scanner(System.in);

		        System.out.println("Enter mark1: ");

		        // read an int value
		        int data1 = input.nextInt();
		        System.out.println("Enter mark2: ");
		        int data2= input.nextInt();
		        System.out.println("Enter mark3: ");
		        int data3= input.nextInt();
		        System.out.println("Mark1: " + data1);
		        System.out.println("Mark2: " + data2);
		        System.out.println("Mark2: " + data3);
		        input.close();
		        int TotalMarks= data1+data2+data3;
		        System.out.println("TotalMarks: " + TotalMarks);
		    }
		}
	


