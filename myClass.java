package Sreeja;

//Create a MyClass class
public class myClass {
int x=5;  // Create a class attribute

/*// Create a class constructor for the MyClass class
public myClass() {
 x = 5;  // Set the initial value for the class attribute x
}*/

public static void main(String[] args) {
 myClass myObj = new myClass(); // Create an object of class MyClass (This will call the constructor)
 System.out.println(myObj.x); // Print the value of x
 
}
}