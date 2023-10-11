package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class page28 {

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter an integer");
		
		BufferedReader br1= 
			new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		
		int num = Integer.parseInt(str1);
		
		System.out.println("You entered:" +num);
		
		System.out.println("Please enter a string");
		
		BufferedReader br2= 
			new BufferedReader(new InputStreamReader(System.in));
		String str2 = br2.readLine();
				
		System.out.println("You entered:" + str2);
		
		
		

	}

}
