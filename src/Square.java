public class Square {

	private int row;
	private int column;
	private char value;
	private boolean taken;
	
	public Square(int row, int column) {
		this.row = row;
		this.column = column;
		this.value = ' ';
		this.taken = false;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public boolean isTaken() {
		return taken;
	}

	public void setTaken(boolean taken) {
		this.taken = taken;
	}
}