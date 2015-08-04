package frames;

import panels.PStart;


public class Start extends Basic {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Start () {
		add(new PStart(this));
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
