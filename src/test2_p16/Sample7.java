package test2_p16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample7{
	public static void main(String[] args)throws IOException{
		System.out.println("請輸入a或b");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		char letter = str1.charAt(0);
		switch (letter)
		{			case 'a' :
			{
				System.out.println("輸入的是a");
				break;
			}
			case 'b' :
			{
				System.out.println("輸入的是b");
				break;
			}
			default:
			{
				System.out.println("請輸入a或b");	
				break;					
			}
		}
	}
}
