import java.util.Scanner;
/**
 * 
 */

/**
 * @author Keshav
 *
 */
public class AvgMarks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double[] marks;
		
		
		double total = 0.0, avg= 0.0;
		int noStudents = 0;
		
		
		Scanner myKeyboard = new Scanner(System.in);
		
		System.out.print("How many students are there in your class? ");
		noStudents = myKeyboard.nextInt();
		
		marks = new double[noStudents];
		

		for(int i = 0; i<marks.length; i++) {
			
			System.out.print("Marks for student "+ (i+1) +": ");
			
			marks[i] = myKeyboard.nextDouble();
			
			
			total += marks[i];
			
		}
		
		
		avg = total/noStudents;
		
		
		
		int[] numbers = new int[12];
		
		
		
		for(int i = 0; i< numbers.length; i++) {
			numbers[i] = i*i;
		}
		
		numbers[4] = 500;
		
		for(int i = 0; i< numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int[][] table = new int [5][10];
		
		for (int row=0; row < table.length; row++) {
			for (int col=0; col < table[row].length; col++) {
				table[row][col] = row * 10 + col;
			}		
		}
		
		
		for (int row=0; row < table.length ; row++) {
			for (int col=0; col < table[row].length; col++) {
				System.out.print(table[row][col] + "\t");
			}
			System.out.println();
		}
		
	   
	
	}

}
