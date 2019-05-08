import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int blocks, rows, cols, passengers;
		sc = new Scanner(System.in);
		System.out.println("Enter number of blocks in the Airplane");
		blocks = sc.nextInt();
		for (int i = 1; i <= blocks; i++) {
			System.out.println("Enter the Row & Column respectively of " + i + " block");
			rows = sc.nextInt();
			cols = sc.nextInt();
			Allocation.addSeats(rows, cols);
		}
		System.out.println("Enter total number of passengers.");
		passengers = sc.nextInt();
		Allocation.maxPass=passengers;	
		SeatingManagement aisle = new AisleSeating();
		aisle.seatingArrange();
		
		SeatingManagement window = new WindowSeating();
		window.seatingArrange();
		SeatingManagement middle = new MiddleSeating();
		middle.seatingArrange();
		Allocation.display();
		
}
		
}