public class Square {
	private Player claimant;
	
	public Square() {
		claimant = null;
	}
	
	public Player getClaimant() {
		return claimant;
	}
	
	public void claim(Player player) throws InvalidMove {
		if (isClaimed()) {
			throw new InvalidMove("This square is already claimed");
		} else {
			claimant = player;
		}
	}
	
	public boolean isClaimed() {
		return claimant != null;
	}
	
	public void release(Player player) {
		claimant = null;
	}
}
