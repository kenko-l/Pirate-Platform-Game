package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.GamePanel;

public class KeyboardInputs implements KeyListener {
	
	private GamePanel gamePanel;
	public KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
	
	
	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		
		switch(e.getKeyCode()) {
		
		case KeyEvent.VK_W:
			gamePanel.changeyDelta(-5);
			break;
		case KeyEvent.VK_A:			
			gamePanel.changexDelta(-5);
			break;
		case KeyEvent.VK_S:			
			gamePanel.changeyDelta(5);
			break;
		case KeyEvent.VK_D:			
			gamePanel.changexDelta(5);
			break;
		}
		
	}

}
