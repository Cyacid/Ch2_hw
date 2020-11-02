package test2_p21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample9{
	public static void main(String[] args)throws IOException{
		System.out.println("請問要選哪一條路線?");
		System.out.println("請輸入整數");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br1.readLine());
		
		char ans = (num == 1)? 'A' : 'B' ;
		
		System.out.println("選擇了" + ans + "路線");
	}
}
