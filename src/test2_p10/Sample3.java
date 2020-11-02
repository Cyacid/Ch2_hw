package test2_p10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3{
	public static void main(String[] args)throws IOException{
		System.out.println("請輸入整數");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br1.readLine());
		if(num==1){
			System.out.println("輸入的是1");
		}
		else{
			System.out.println("選擇的是1以外的數字");
		}			
	}
}