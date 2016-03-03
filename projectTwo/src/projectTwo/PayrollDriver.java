package projectTwo;

import java.util.Scanner;

public class PayrollDriver {
	public static void main(String[] args) {
		double captureGrab;
		
		Scanner scanner = new Scanner(System.in);
		
		Payroll capture = new Payroll();
		for(int i = 0; i <capture.get_employeeId().length; ++i){
			System.out.println("Employee - "+(i+1)+" ID : "+capture.get_employeeId()[i]);
			System.out.println("--------------------");
			
			do{
				System.out.print("Hours >> ");
				captureGrab = scanner.nextInt();
			}while(captureGrab <= -1);
			capture.set_hours(captureGrab,i);
			
			do{
				System.out.print("Pay Rate >> ");
				captureGrab = scanner.nextDouble();
			}while(captureGrab <6);
			capture.set_payRate(captureGrab,i);
			System.out.println("--------------------");
			capture.set_wages(i);
			if(i == 6){				
				for(int memes = 0; memes <capture.get_employeeId().length;memes++){
					System.out.println(capture.toString(memes));
				}
			}
			
		}

	}

}
