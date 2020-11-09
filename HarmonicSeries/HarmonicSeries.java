package HarmonicSeries;

import java.util.Scanner;

public class HarmonicSeries {

	/**
	 * 
	 */
	public HarmonicSeries() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */

	public static double harmonicCalc(int num) {
		if (num < 2) {
			return 1;
		}
        else {
			return (1/num) + (1/harmonicCalc(num - 1));
			
		}
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNum = 0;
		System.out.println("Enter the nth number");
		Scanner scanner = new Scanner(System.in);
		try	{
			inputNum = scanner.nextInt();
		}catch(Exception e) {
			System.out.println("It is not an Intenger.");
        }
		scanner.close();
		HarmonicSeries hs = new HarmonicSeries();
		System.out.println("Harmonic Number is: " + hs.harmonicCalc(inputNum));

	}
	
	
}
