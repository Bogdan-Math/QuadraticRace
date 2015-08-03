package frames;

import panels.PFinish;

public class Finish extends Basic {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Finish () {
		add(new PFinish(this));
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
