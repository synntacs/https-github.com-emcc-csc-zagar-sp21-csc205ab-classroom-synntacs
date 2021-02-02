public class ComputerPlayer extends Player {
	private static int active = 0;
	
	public ComputerPlayer(String name, String mark) {
		super(name, mark);
	}

	public ComputerPlayer(String mark) {
		this("Computer " + ++active, mark);
	}
	
	public void takeTurn(GameBoard gameBoard) throws InvalidMove {
		for (;;) {
			int col = randInt(gameBoard.getSize());
			int row = randInt(gameBoard.getSize());
			if (!gameBoard.isClaimed(col, row)) {
				gameBoard.claim(this, col, row);
				break;
			}
		}
	}
	
	private int randInt(int max) {
		return (int) (Math.random() * max);
	}
}
