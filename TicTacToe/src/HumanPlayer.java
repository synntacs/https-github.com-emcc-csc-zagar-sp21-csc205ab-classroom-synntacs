public class HumanPlayer extends Player {
	public HumanPlayer(String name, String mark) {
		super(name, mark);
	}
	
	public void takeTurn(GameBoard gameBoard) throws InvalidMove {
		throw new InvalidMove("HumanPlayer.takeTurn not implemented");
	}
}
