package test2_p32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample14{
	public static void main(String[] args)throws IOException{
		
		System.out.println("請問要在第幾次處理結束迴圈呢?(1~10)");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int res = Integer.parseInt(br1.readLine());
		for(int i=1;i<=10;i++){
			System.out.println("第"+i+"次的處理。");
			if(i == res){
				break;
			}
		}
	}
}
