import java.awt.Color;

public abstract class Enemy {
	
	private Color color;
	private int points;
	private int damage;
	
	Enemy(Color color, int points, int damage){
		this.color = color;
		this.points = points;
		this.damage = damage;
	}
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
}
