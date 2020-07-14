package Sreeja;

public class payCalc {

	public static void basePay(double x) {
		int minWage= 8;
	    double maxHrsWorked= x;
		double baseSalary= minWage*maxHrsWorked;
		
		if(x>40) {
			baseSalary=baseSalary + (baseSalary*1.5);
			System.out.println(baseSalary);
		}
		else {
			System.out.println(baseSalary);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basePay(30);
		basePay(50);

	}

}
