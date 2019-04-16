package components;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

/*
 * - bullets should be fired from this class since it is the one that has it's x,y coords to be properly able to shoot as well as the dmg and
 * 		fireChance which the bullet needs
 */

public class Turret {
	
	private Image sprite;
	private int x;
	private int y;
	
	private double dmg;
	private double fireChance;
	
	public Turret(Image s, int x, int y, double d, double fc) {
		
		sprite = s;
		this.x = x;
		this.y = y;
		dmg = d;
		fireChance = fc;
		
	}
	
	public void render(Graphics g) {
		
		sprite.drawCentered(x, y);
		
	}
	
	public void update() {
				
	}

}