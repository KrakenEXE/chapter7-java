package projectFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChargeAccount {
	

	  public static boolean contains(int b) throws FileNotFoundException{
		  
		  File file = new File("G:/ChargeNumbers.txt");
		  Scanner fileContainer = new Scanner(new File("G:/ChargeNumbers.txt"));
		  fileContainer.useDelimiter(",");
		  
		  int[] array = new int[18];
		  
		  for(int i = 0; i < array.length; i++){
			  if(fileContainer.hasNext()){
				  array[i] = fileContainer.nextInt();
			  }
		  }
		  
		  fileContainer.close();
		  
		    for(int i = 0; i < array.length; i++){
		    	if (array[i] == b){
			        return true;
			      }
		    }
		    return false; 
	  }
	



public boolean acceptChargeNumber(int input){
	boolean isValid = false;
	
	
	
	
	return isValid;
}
}
