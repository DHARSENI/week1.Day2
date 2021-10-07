package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		int numArr[] = {100,49,398,43,1,267};
		int length= numArr.length;
		
		Arrays.sort (numArr);
		System.out.println(numArr);
		for(int i=0;i<numArr.length;i++ )
		{
			System.out.println(numArr[i]);
			System.out.println(numArr[4]);
			System.out.println(numArr[1]);
			
		}
		

	}

}
