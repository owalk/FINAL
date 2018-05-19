
public class Base {
	private int health = 300;
	private boolean gameOver = false;

	public boolean getGameOver() {
		if(health <= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setGameOver(boolean gameStatus) {
		gameOver = gameStatus;
	}

	public void takeDamage(int damageTaken) {
		health -= damageTaken;
	}
	
}