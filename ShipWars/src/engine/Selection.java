package engine;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import components.Engines;
import components.Hull;
import components.Shield;
import components.Turret;

public class Selection extends BasicGameState{
	
	private static final int TURRET_X = 10;
	private static final int TURRET_Y = 10;
	private static final int SHIELD_X = 20;
	private static final int SHIELD_Y = 20;
	private static final int ENGINE_X = 30;
	private static final int ENGINE_Y = 30;
	private static final int HULL_X = 40;
	private static final int HULL_Y = 40;
	
	//list of types of turrets
	Turret[] turrets = { new Turret(Resources.getImage("example_turret1"), TURRET_X, TURRET_Y, 5, 2),
						new Turret(Resources.getImage("example_turret2"), TURRET_X, TURRET_Y, 1, .25)
	};
	
	Shield[] shields = {new Shield(Resources.getImage("example_shield1"), SHIELD_X, SHIELD_Y, 100, .2),
						new Shield(Resources.getImage("example_shield1"), SHIELD_X, SHIELD_Y, 20, 1)
			
	};
	
	Engines[] engines = { new Engines(Resources.getImage("example_engines1"), ENGINE_X, ENGINE_Y, .5)
			
	};
	
	Hull[] hulls = {	new Hull(Resources.getImage("example_engines1"), HULL_X, HULL_Y, 100)
			
	};
	
	private int turretCounter = 0;
	private int shieldCounter = 0;
	private int engineCounter = 0;
	private int hullCounter = 0;
	
	@Override
	public void init(GameContainer gc, StateBasedGame s) throws SlickException {
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame s, Graphics g) throws SlickException {
		
		turrets[turretCounter].render(g);
		shields[shieldCounter].render(g);
		engines[engineCounter].render(g);
		hulls[hullCounter].render(g);
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame s, int arg2) throws SlickException {
		
	}

	@Override
	public int getID() {
		return States.SELECTION;
	}

}