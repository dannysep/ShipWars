package components;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
/*
 * - should, in the future, implement way to render the shield on the screen
 */

public class Shield {
	
	private int health;
	private double rechargeRate;
	private int x;
	private int y;
	private Image sprite;
	
	public Shield(Image s, int x, int y, double recharge) {
		this.x = x;
		this.y = y;
		sprite = s;
		rechargeRate = recharge;
		
		health = 100;
	}
	
	public void render(Graphics g) {
		
		if(health > 0) {
			sprite.drawCentered(x, y);
		}
		
	}
	
	public void update() {
		
	}
	
	public void damage(int dmg) {
		health -= dmg;
		
		if(health < 0) {
			health = 0;
		}
	}
	
	public int getHealth() {
		return health;
	}

}