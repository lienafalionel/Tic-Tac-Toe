public class BoardGame {

	private BoardGame instance;
	private Square[][] squares = new Square[3][3];
	private Player playerX = new Player();
	private Player playerO = new Player();

	public BoardGame() {
		init();
	}

	public void init() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				squares[i][j] = new Square(i, j);
			}
		}
	}

	public BoardGame getInstance() {
		if (instance == null) {
			instance = new BoardGame();
		}
		return instance;
	}

	public boolean isWinningX() {
		// Horizontal
		if (check(squares[0][0], squares[0][1], squares[0][2], 'X') || check(squares[1][0], squares[1][1], squares[1][2], 'X') || check(squares[2][0], squares[2][1], squares[2][2], 'X')) {
			return true;
		}

		// Vertical
		if (check(squares[0][0], squares[1][0], squares[2][0], 'X') || check(squares[0][1], squares[1][1], squares[2][1], 'X') || check(squares[0][2], squares[1][2], squares[2][2], 'X')) {
			return true;
		}
		
		// Diagonal
		if(check(squares[0][0], squares[1][1], squares[2][2], 'X') || check(squares[0][2], squares[1][1], squares[2][0], 'X')) {
			return true;
		}

		return false;
	}

	public boolean isWinningO() {
		// Horizontal
		if (check(squares[0][0], squares[0][1], squares[0][2], 'O') || check(squares[1][0], squares[1][1], squares[1][2], 'O') || check(squares[2][0], squares[2][1], squares[2][2], 'O')) {
			return true;
		}

		// Vertical
		if (check(squares[0][0], squares[1][0], squares[2][0], 'O') || check(squares[0][1], squares[1][1], squares[2][1], 'O') || check(squares[0][2], squares[1][2], squares[2][2], 'O')) {
			return true;
		}
		
		// Diagonal
		if(check(squares[0][0], squares[1][1], squares[2][2], 'O') || check(squares[0][2], squares[1][1], squares[2][0], 'O')) {
			return true;
		}

		return false;
	}

	public boolean check(Square square1, Square square2, Square square3, char value) {
		return (square1.getValue() == value && square2.getValue() == value && square3.getValue() == value);
	}
}
