package Sreeja;
import java.util.Scanner;
public class studentMarkList {
	String studentName;
	int studentMarkSub1,studentMarkSub2,studentMarkSub3;
	int studentTotalMarks;
	char studentGrade;
	
	public studentMarkList() {
		
	}
public char gradeCalc(int sub1,int sub2,int sub3) {
	
	studentMarkSub1= sub1;
	studentMarkSub2= sub2;
	studentMarkSub3= sub3;

	studentTotalMarks= sub1+sub2+sub3;
	
	if (studentTotalMarks>80) {
		
		studentGrade= 'A';
	}
		else if (studentTotalMarks>50 && studentTotalMarks<80) {
			
			studentGrade='B';
			
		}
		else {
			
			studentGrade='C';
		}
	System.out.println("Total Marks  " + studentTotalMarks);
	System.out.println("Grade " + studentGrade);
	
	return studentGrade;
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
	      System.out.print("Enter the student name: ");
	      String studentName = input.nextLine();
	      input.close();
	      
	         
		studentMarkList grade = new studentMarkList();
		
		grade.gradeCalc(50,30,60);
		System.out.println(studentName);
		
	}

}
