public class TicTacToe {
	private GameBoard gameBoard;
	private Player player1;
	private Player player2;
	private Player winner;
	
	public TicTacToe(Player player1, Player player2) {
		gameBoard = new GameBoard();
		this.player1 = player1;
		this.player2 = player2;
		winner = null;
	}
	
	public Player getWinner() {
		return winner;
	}
	
	public void play() throws InvalidMove {
		Player nextPlayer = player1;
		
		while (winner == null && !gameBoard.isCatsGame()) {
			nextPlayer.takeTurn(gameBoard);
			System.out.println(gameBoard);
			if (gameBoard.isWinningPlayer(nextPlayer)) {
				winner = nextPlayer;
			} else {
				nextPlayer = nextPlayer.equals(player1) ? player2 : player1;
			}
		}
		
		if ( winner != null) {
			System.out.println("Winner: " + winner);
		} else {
			System.out.println("Cat's game");
		}
	}
}
