public class GameBoard {
  // You do not need to include this declaration of Direction in the Google Sheet
	private enum Direction {
		ACROSS, DOWN, SLOPEUP, SLOPEDOWN
	};

	private int size;
	// First index is column, second index is the row
	private Square[][] squares;
	private int unclaimedSquares;

	public GameBoard() {
		// Default to standard 3x3 game
		this(3);
	}

	public GameBoard(int size) {
		this.size = size;
		squares = new Square[size][size];
		unclaimedSquares = size * size;

		for (int col = 0; col < size; col++) {
			for (int row = 0; row < size; row++) {
				squares[col][row] = new Square();
			}
		}
	}

	public boolean isCatsGame() {
		return unclaimedSquares == 0;
	}

	public boolean isClaimed(int col, int row) {
		return squares[col][row].isClaimed();
	}

	public void claim(Player player, int col, int row) throws InvalidMove {
		squares[col][row].claim(player);
		unclaimedSquares--;
	}

	public void release(Player player, int col, int row) {
		Square square = squares[col][row];

		if (square.isClaimed()) {
			square.release(player);
			unclaimedSquares++;
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isWinningPlayer(Player player) {
		return isWinningPlayer(player, Direction.ACROSS) ||
				isWinningPlayer(player, Direction.DOWN) ||
				isWinningPlayer(player, Direction.SLOPEDOWN) ||
				isWinningPlayer(player, Direction.SLOPEUP);
	}

	public boolean isWinningPlayer(Player player, Direction direction) {
		boolean more = true;
		boolean won = false;
		int col = 0;
		int row = 0;
		int incCol = 1;
		int incRow = 1;

		switch (direction) {
		case ACROSS:
			incRow = 0;
			break;
		case DOWN:
			incCol = 0;
			break;
		case SLOPEDOWN:
			break;
		case SLOPEUP:
			col = size - 1;
			incCol = -1;
			break;
		}

		while (more && !won) {
			won = true;
			for (; won && col >= 0 && col < size && row >= 0 && row < size; col += incCol, row += incRow) {
				if (player != squares[col][row].getClaimant()) {
					won = false;
				}
			}

			if (!won) {
				switch (direction) {
				case ACROSS:
					col = 0;
					row++;
					more = row < size;
					break;
				case DOWN:
					col++;
					row = 0;
					more = col < size;
					break;
				default:
					more = false;
					break;
				}
			}
		}

		return won;
	}

	public String toString() {
		String result = "";
		int row;
		int col;
		
		for (row = 0; row < size; row++) {
			if (row > 0) {
				for (col = 0; col < size; col++) {
					if (col > 0) {
						result += "+";
					}
					result += "-----";
				}
				result += "\n";
			}
			for (col = 0; col < size; col++) {
				Square square = squares[col][row];
				if (col > 0) {
					result += "|";
				}
				result += " ";
				if (square.isClaimed()) {
					result += " " + square.getClaimant().getMark() + " ";
				} else {
					result += col + "," + row;
				}
				result += " ";
			}
			result += "\n";
		}

		return result;
	}
}
