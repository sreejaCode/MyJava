package Sreeja;
class outerclass{
	int x=5;

class innerclass{
	int y=10;
}

}
public class innerOuterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerclass myOuter=new outerclass();
		outerclass.innerclass myInner=myOuter.new innerclass();
System.out.println("x= " + myOuter.x);
System.out.println("y= "+ myInner.y);
	}

}
