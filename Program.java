import java.util.Scanner;

public class Program 
{
	static Scanner scanner;
	
	public static void main(String[] args) 
	{
		scanner = new Scanner (System.in);
		Program program = new Program ();
		program.start();	
	}
	
	void start ()
	{
		showMenu ();
		// 
	}

	void showMenu ()
	{
		System.out.println();
		System.out.println("--------== JAVA SCHOOL ==--------");
		System.out.println("1. Peržiureti kursų sąrašą.");
		System.out.println("2. Užregistruoti naują studentą.");
		System.out.println("3. Įvesti naują pažymį studentui už kursą.");
		System.out.println("4. Išvesti pažymių suvėstinė nurodytam kursui");
		System.out.println("0. Išeiti");
	}
	
	public Action getMenuAction ()
	{
		// kodas
		return Action.EXIT;
	}

	void showCourses ()
	{
		System.out.println("== Peržiureti kursų sąrašą ==");
		// kodas
	}
	
	void addStudent ()
	{
		System.out.println("== Užregistruoti naują studentą ==");
		// kodas
		// System.out.print("Įveskite studento vardą: ");
		// System.out.println("KLAIDA. Studentas su tokiu vardu jau yra.");
		// System.out.println("Studentas užregistruotas, id = " + student.id);
	}
	
	void addPoint ()
	{
		System.out.println("== Įvesti naują pažymį studentui už kursą ==");
		// kodas
		// System.out.print("Įveskite kurso pavadinimą: ");
		// System.out.println("KLAIDA. Kurso pavadinimas nerastas.");
		// System.out.print("Įveskite studento vardą: ");
	    // System.out.println("KLAIDA. Studento vardas nerastas.");
		// System.out.print("Įveskitė pažymį (nuo 1 iki 10): ");
		// System.out.println("KLAIDA. Neleistinta pažymio reikšmė.");
		// System.out.println("Pažymis užregistruotas, id = " + point.id);
	}

	void showPoints ()
	{
		System.out.println("== Išvesti pažymių suvėstinė nurodytai pamokai ==");
		// kodas
		// System.out.print("Įveskite kurso pavadinimą: ");
		// System.out.println("KLAIDA. Pamokos pavadinimas nerastas.");
		// System.out.println("Visu studentu pažymių vidurkis: " + avg);
	}	
	
}
