
public class MiddleSeating extends Allocation implements SeatingManagement {

	@Override
	public void seatingArrange() {
		for (int a = 0; a < box.size(); a++) {
			for (int b = 0; b <= box.get(a).getRow(); b++) {
				for (int c = 0; c < box.size(); c++) {
					for (int d = 0; d <= box.get(c).getCol(); d++) {
						if (b <= box.get(c).getRow() && box.get(c).getCellValue(b, d) == 0) {
							if (d != 0 && d != box.get(c).getCol()) {
								box.get(c).setCellValue(b, d, seatPass++);
							}
						}
					}

				}
			}
		}
	}

}
