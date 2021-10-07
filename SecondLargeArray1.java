package week1.day2;

import java.util.Arrays;

public class SecondLargeArray1 {

	public static void main(String[] args) {
		int num[]= {3,2,11,4,6,7};
		int length=num.length;
		Arrays.sort(num);
		System.out.println("The Second largest Array is :" +num[length-2]);

	}

}
