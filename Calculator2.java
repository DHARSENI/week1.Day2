package week1.day2;

public class Calculator2 {

	public static void main(String[] args) {
		Calculator1 myobj= new Calculator1();
		System.out.println("Addition of number :" + myobj.add(3,5,9));
		System.out.println("Sbtraction of number :" + myobj.sub(9, 5));
		System.out.println("Multiplication of number :" + myobj.mul(45.8,67));
		System.out.println("Division of number :" + myobj.div(59, 8));

	}

}
