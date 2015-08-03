package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import frames.Basic;
import panels.PStart;

public class FinishButtonsAdapter implements ActionListener{

	JFrame buttonsFrame;

	public FinishButtonsAdapter(JFrame buttonsFrame) {
		this.buttonsFrame = buttonsFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Basic frame = new Basic();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new PStart(frame));
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		buttonsFrame.dispose();
	}
}
