import java.util.ArrayList;

public class Allocation {
	static ArrayList<Seat> box = new ArrayList<>();
	static int seatPass = 1;
	static int maxPass = 0;

	public static void addSeats(int row, int col) {
		box.add(new Seat(row, col));
	}

	public static int maxCapacity() {
		int maxiCapacity = 0;
		for (int i = 0; i <= (box.size() - 1); i++) {
			maxiCapacity += box.get(i).getMax();
		}
		return maxiCapacity;
	}
	public static  void display() {
		for (int k = 0; k < box.size(); k++) {
			for (int i = 0; i <= box.get(k).getRow(); i++) {
				for (int j = 0; j <= box.get(k).getCol(); j++) {
					if (box.get(k).getCellValue(i, j) <= maxPass) {
						System.out.print(" " + box.get(k).getCellValue(i, j));
					} else
						System.out.print(" x ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	}
