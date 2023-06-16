//import java.Util.*;

class lastdigit{
	public static void main(String[] args){
		System.out.println("Enter a number:");
		
		int i = 123;
		System.out.println("the number is :"+i);
		if (i>3){
			i%=10;
			int j = i-1;
			System.out.println("the last digit of the number is "+j);
		}
		else{
			System.out.println("the number not valid");	
		}
	}
}