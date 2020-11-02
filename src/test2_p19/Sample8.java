package test2_p19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample8{
	public static void main(String[] args)throws IOException{
		System.out.println("請問你是男生嗎?");
		System.out.println("請輸入Y或N");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		char letter = str1.charAt(0);
		
		if(letter == 'y' || letter == 'Y'){
			System.out.println("你是男生啊!");
		}
		else if(letter == 'n' || letter == 'N'){
			System.out.println("你是女生啊!");
		}
		else{
			System.out.println("請輸入Y或N!");
		}
	}
}