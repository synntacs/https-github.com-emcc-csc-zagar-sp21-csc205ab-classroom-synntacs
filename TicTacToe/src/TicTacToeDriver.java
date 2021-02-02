
public class TicTacToeDriver {
	public static void main(String[] args) throws InvalidMove {
		Player player1 = new ComputerPlayer("X");
		Player player2 = new ComputerPlayer("O");
		TicTacToe ticTacToe = new TicTacToe(player1, player2);
		
		ticTacToe.play();
	}
}
