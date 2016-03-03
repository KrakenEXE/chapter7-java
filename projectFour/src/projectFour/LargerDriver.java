package projectFour;

import java.util.ArrayList;
import java.util.Scanner;

public class LargerDriver {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		int n;
		final int iterations = 9;
		System.out.print("Enter a number for n >> ");
		n = scanner.nextInt();
		for(int i = 0; i <= iterations; i++){
			System.out.print("Enter array position "+i+" >> ");
			list.add(scanner.nextInt());
		}
		System.out.println("The numbers greater than n's value of "+n);
		System.out.println("-----------------------------------------");
		for(int i = 0; i <iterations;i++){
			if(list.get(i) > n){
				System.out.println("Index number: "+i+" with value >> "+list.get(i));
			}
		}
	}

}
