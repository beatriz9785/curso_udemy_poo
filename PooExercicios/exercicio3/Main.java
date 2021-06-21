package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle r1 = new Rectangle();
		System.out.println("Enter rectangle width and height.");
		r1.width = sc.nextDouble();
		r1.height = sc.nextDouble();
		
		System.out.printf("area = %.2f%n", r1.area());
		System.out.printf("perimeter = %.2f%n", r1.perimeter());
		System.out.printf("diagonal = %.2f%n", r1.diagonal());

	}

}
