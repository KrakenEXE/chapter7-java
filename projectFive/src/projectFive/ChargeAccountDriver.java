package projectFive;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChargeAccountDriver {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a charge number >> ");
		int inputCharge = scanner.nextInt();
		System.out.print("The number of "+inputCharge+" is "+ChargeAccount.contains(inputCharge));
	}

}
