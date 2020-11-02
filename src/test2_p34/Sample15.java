package test2_p34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample15{
	public static void main(String[] args)throws IOException{
		
		System.out.println("請問要跳過第幾次的處理呢?(1~10)");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int res = Integer.parseInt(br1.readLine());
		for(int i=1;i<=10;i++){
			if(i == res){
				continue;
			}
			System.out.println("第"+i+"次的處理。");	
		}
	}
}