package projectOne;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RainFall {

	private static double yearlyRain,
							averageRain,
							mostRain,
							leastRain,
							checkRain,
							bigMonth =-1,
							smallMonth =2099999999.99999999999999999999999999999999999999999999999999999;
							
	
	private static int iteration=1,			
						checkMonth,
						checkMonth2;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		ArrayList <Integer> list = new ArrayList<>();	// I wish I could use an arraylist ugh 
		
		double[] monthlyRain = new double [12];
		
		for(int i = 0; i <=11; i++){
			System.out.print("Enter rainfall for month "+(i+1)+" >> ");
			checkRain = scanner.nextDouble();
			while(checkRain <= -1){
				System.out.print("ERROR - Enter rainfall for month "+(i+1)+" >> ");
				checkRain = scanner.nextDouble();
			}
			monthlyRain[i] = checkRain;
			if(monthlyRain[i] >bigMonth){
				bigMonth = checkRain;
				setMostRain(bigMonth);
				checkMonth = iteration;
			}
			if(monthlyRain[i] <smallMonth){
				smallMonth = checkRain;
				setLeastRain(smallMonth);
				checkMonth2 = iteration;
			}
			setYearlyRain(checkRain);
			iteration++;
		}
		
	
       
		averageRain = yearlyRain / 12;
		//double min = (double) Collections.min(Arrays.asList(monthlyRain));
		System.out.println("Most rain was "+getMostRain()+" on month "+checkMonth);
		System.out.println("Least rain was "+getLeastRain()+" on month "+checkMonth2);
		System.out.println("The average rainfall is "+getAverageRain());
		System.out.println("The yearly rainfall is "+yearlyRain);
		
	}

	public static double getYearlyRain() {
		return yearlyRain;
	}

	public static void setYearlyRain(double yearlyRain) {
		RainFall.yearlyRain +=yearlyRain;
	}

	public static double getAverageRain() {
		averageRain = yearlyRain / 12;
		return averageRain;
	}

	public static void setAverageRain(double averageRain) {
		RainFall.averageRain = averageRain;
	}

	public static double getMostRain() {
		return mostRain;
	}

	public static void setMostRain(double mostRain) {
		RainFall.mostRain = mostRain;
	}

	public static double getLeastRain() {
		return leastRain;
	}

	public static void setLeastRain(double leastRain) {
		RainFall.leastRain = leastRain;
	}

	public static double getCheckRain() {
		return checkRain;
	}

	public static void setCheckRain(double checkRain) {
		RainFall.checkRain = checkRain;
	}

}
