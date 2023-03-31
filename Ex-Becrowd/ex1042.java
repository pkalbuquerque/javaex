import java.util.Scanner;

public class ex1042 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		if (A < B && A < C) {
			System.out.println(A);
			if (B > C) {
				System.out.println(C);
				System.out.println(B);
			} else {
				System.out.println(B);
				System.out.println(C);
			}
		}
		else if (A < B && A > C) {
			System.out.println(C);
			System.out.println(A);
			System.out.println(B);
		}
		else if (A > B && A > C) {
			if (B > C) {
				System.out.println(C);
				System.out.println(B);
				System.out.println(A);
			} else {
				System.out.println(B);
				System.out.println(C);
				System.out.println(A);
			}
		} else if (A > B && A < C) {
			System.out.println(B);
			System.out.println(A);
			System.out.println(C);
		}
		
		System.out.println();
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		input.close();

	}

}



