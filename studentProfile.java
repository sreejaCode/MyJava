package Sreeja;

public class studentProfile {
	
	String studFirstName;
	String studLastName;
	int GPA;
	int graduationYear;
	String major;
	int studentCredit;
	
	public studentProfile(String studFirstName,String studLastName,String majorSub,int gpa) {
		this.studFirstName= studFirstName;
		this.studLastName= studLastName;
		this.major=majorSub;
		this.GPA=gpa;
		
		System.out.println("StudentFirstName: " + studFirstName);
		System.out.println("StudentLastName: " +studLastName);
		System.out.println("Student Major In: "+majorSub);
		
		System.out.println("GPA: "+ gpa);
	}
	
	public int gradYearCalc(int gYear,int credit) {
		if(credit<20) {
			graduationYear= gYear+1;
			
					}
		else {
			graduationYear=gYear;
			
		}
		return graduationYear;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
studentProfile studA= new studentProfile("John","Dave","Physics", 7);
System.out.println("The graduation year of " +studA.studFirstName +" is " + studA.gradYearCalc(2009,40));
studentProfile studB= new studentProfile("David","Samuel","Chemistry",9);
System.out.println("The graduation year of " +studB.studFirstName +" is " + studB.gradYearCalc(2019,10));

		
	}

}
