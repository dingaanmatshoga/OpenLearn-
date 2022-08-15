mport java.util.Scanner;


public class InputFromConsle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String full_Name = input.nextLine();
		System.out.println("Please enter your surname: ");
		String last_Name = input.nextLine();
		System.out.println("Full Name: " + full_Name + " " + last_Name);
	
	}

}
