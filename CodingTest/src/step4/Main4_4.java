package step4;

import java.util.Scanner;

public class Main4_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[9];
		
		for(int i=0;i<9;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		int sq=1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				sq=i+1;
			}
			
			
		}
		System.out.println(max);
		System.out.println(sq);	
		
		
		
	}

}
