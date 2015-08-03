package logics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

import frames.Finish;
import frames.Picture;
import frames.Road;
import panels.PRoad;

public class Result {

	private Image imgGood = new ImageIcon(getClass().getClassLoader().getResource("pictures/resultGood.png")).getImage();
	private Image imgBad = new ImageIcon(getClass().getClassLoader().getResource("pictures/resultBad.png")).getImage();
	private Image imgAngel = new ImageIcon(getClass().getClassLoader().getResource("pictures/resultAngel.png")).getImage();
	private Image imgDevil = new ImageIcon(getClass().getClassLoader().getResource("pictures/resultDevil.png")).getImage();
	private Image imgNeutral = new ImageIcon(getClass().getClassLoader().getResource("pictures/resultNeutral.png")).getImage();

	private Image img = imgNeutral;

	public Image getResult() {
		return this.img;
	}

	private Win testWin;
	private PRoad road;

	public Result(Win testWin, PRoad road) {
		this.testWin = testWin;
		this.road = road;
	}

	private void quality(int quality, int max, int min) {

		if (quality > 0) {
			if (quality == max) {
				img = imgAngel;
			} else {
				img = imgGood;
			}
		}

		if (quality == 0) {
			img = imgNeutral;
		}

		if (quality < 0) {
			if (quality == -min) {
				img = imgDevil;
			} else {
				img = imgBad;
			}
		}

	}

	@SuppressWarnings("deprecation")
	public void show(Graphics g, Road froad) {
		g = (Graphics2D) g;
		if (testWin.line()) {

			road.audioThread.stop();// deprecation
			road.enemiesFactory.stop();// deprecation

			quality(Win.getGlobalQuality(),
					road.getPlayer().getBadEnemiesMiss()+road.getPlayer().getGoodEnemiesPicked(),
					road.getPlayer().getGoodEnemiesMiss()+ road.getPlayer().getBadEnemiesPicked());

			//g.drawImage(img, 0, 0, null);
			new Picture(img);
			Win.setGlobalQuality(0);
			new Finish();
			froad.dispose();
		}
	}
}
