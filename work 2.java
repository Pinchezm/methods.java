import java.util.Scanner;
public class Marks{
public staticvoid main(String []args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter marks for java programming:");
int java programming = scanner.nextlnt();
System.out.println("Enter marks for Networking:");
int networking =scanner.nextlnt();
System.out.println("Enter marks for Maths:");
int maths = scanner.nextlnt();
double average = (javaprogramming + networking + maths)/3.0;
System.out.println("Marks for Java Programming is:" +javaprogramming);
System.out.println("Marks for Networking is:" +networking);
System.out.println("Marks for Maths is:"+maths);
System.out.println("The average is:" + average);
}
}
