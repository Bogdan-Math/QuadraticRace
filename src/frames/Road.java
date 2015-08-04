package frames;

import logics.Difficulty;
import panels.PRoad;

public class Road extends Basic {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Road (Difficulty difficulty) {

		PRoad road = new PRoad(difficulty,this);
		
		int sizeX = road.getRoad().getWidth(null);
		int sizeY = road.getRoad().getHeight(null);
		setSize(sizeX, sizeY);
		
		add(road);
		//pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
