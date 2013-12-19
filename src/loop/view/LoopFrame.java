package loop.view;

import javax.swing.JFrame;

import loop.controller.LoopController;

/**
 * Sets up the GUI window.
 * @author nduc4538
 * @version 1.0 Created the setup frame.
 */

public class LoopFrame extends JFrame
{

	private LoopController baseController;
	private LoopPanel basePanel;
	
	public LoopFrame(LoopController baseController)
	{
		this.baseController = baseController;
		basePanel = new LoopPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
