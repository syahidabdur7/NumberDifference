package program.NumberDifference;

/**
 *
 * @author nabil
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Screen {

	public void printHeader() {
		System.out.println("Number Difference");
	}
	
	public void printLabelInputNBilangan() {
		System.out.println("Input N Number : ");
	}
	
	public void printLabelInputDeret() {
		System.out.println("Input Number Series : ");
	}
	
	public int inputNumberSingleValue() {
		int data = 0;
		Scanner inputInt = new Scanner(System.in);
		
		data = inputInt.nextInt();
		return data;
	}
	
	public ArrayList<Integer> inputNumberListValue(int nBil) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		Scanner inputInt = new Scanner(System.in);
		int idx, bil;
		
		for(idx=0; idx < nBil; idx++) {
			bil = inputInt.nextInt();
			data.add(bil);
		}
		return data;
	}
}
