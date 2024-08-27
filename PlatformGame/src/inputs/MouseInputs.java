package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import gameStates.Gamestate;
import main.GamePanel;

public class MouseInputs implements MouseListener, MouseMotionListener {

	private GamePanel gamePanel;

	public MouseInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	
	public void mouseMoved(MouseEvent e) {

	}

	
	public void mouseClicked(MouseEvent e) {
		switch(Gamestate.state) {
		case MENU:
			 gamePanel.getGame().getMenu().mouseClicked(e);
			break;
		case PLAYING:
			gamePanel.getGame().getPlaying().mouseClicked(e);
			break;
		default:
			break;
		
		}
	}

	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	
	public void mouseExited(MouseEvent e) {

	}

}