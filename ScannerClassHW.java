package testHomeWork;

import java.util.Scanner;

public class ScannerClassHW {

	public static void main(String[] args) {
		
		   Scanner wk = new Scanner(System.in);
		
			
			System.out.println("Please enter number of student");
			int count = wk.nextInt();

			String[] name = new String[count];
			String[] email = new String[count];

			for (int i = 0; i < count; i++) {
			
			
			System.out.println("Please enter name");

			name[i] = wk.next();

			System.out.println("Please enter email");

			email[i] = wk.next();
			
		}
			
			System.out.println("Please enter which student details are you looking for");
			int b = wk.nextInt();

			System.out.println(name[b]);
			System.out.println(email[b]);

	}

}
