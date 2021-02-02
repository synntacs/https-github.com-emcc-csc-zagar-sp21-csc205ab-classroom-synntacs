public abstract class Player {
	private String name;
	private String mark;

	public Player(String name, String mark) {
		this.name = name;
		this.mark = mark;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMark() {
		return mark;
	}
	
	public String toString() {
		return getMark() + " " + getName();
	}
	
	public abstract void takeTurn(GameBoard gameBoard) throws InvalidMove;
}
