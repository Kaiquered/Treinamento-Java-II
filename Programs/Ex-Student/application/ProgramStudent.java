package application;

import java.util.Scanner;
import entities.Student;

/* Programa calcula o resultado final de um aluno sem encapsulamento. 
 * É aprovado o aluno que obtém uma note maior ou igual a 60 pontos.
 * notes máximas: 1º prova (30 pontos), 2º e 3º prova (35 pontos).  
 */
public class ProgramStudent {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Student student = new Student();

		System.out.print("Student: ");
		student.name = input.nextLine();
		System.out.println("Notes: ");
		student.note1 = input.nextFloat();
		student.note2 = input.nextFloat();
		student.note3 = input.nextFloat();

		if (student.note1 <= 30 && student.note2 <= 35 && student.note3 <= 35) {

			System.out.printf("note final= %.2f points\n", student.noteFinal());

			if (student.noteFinal() >= 60)
				System.out.println("Success!");
			else {
				System.out.println("Failed!");
				System.out.printf("Missing= %.2f points ", student.result());
			}
		}
		
		else
			System.out.println("Values aren't valid!");

		input.close();

	}
}
