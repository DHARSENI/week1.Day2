package week1.day2;
import java.util.*;

public class String1 {

	public static void main(String[] args) {
		int count=0;
		String str= "welcome to chennai";
		char [] charArray=str.toCharArray();
		for(int i=0;i< charArray.length;i++)  
		{
			if(charArray[i] == 'e')
				count++;
			
		}
		System.out.println(count);
			

	}

}
