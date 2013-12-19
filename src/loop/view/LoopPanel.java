package loop.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import loop.controller.LoopController;

/**
 * Initializes objects in the the GUI.
 * @author nduc4538
 * @version 1.0 Created the GUI instances.
 */
public class LoopPanel extends JPanel
{
	
	private LoopController baseController;
	private JButton submitButton;
	private SpringLayout baseLayout;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	
	public LoopPanel(LoopController  baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		textArea = new JTextArea(10, 20);
		scrollPane = new JScrollPane(textArea);
		submitButton = new JButton("Just a test button");

		setupPanel();
		setupLayout();
		setupListeners();
	}

	/**
	 * Adds all components to the panel, sets color and settings.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(new Color(120, 50, 220));
		this.add(scrollPane);
		this.add(submitButton);
		
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);

	}
	
	/**
	 * Computer generated code should be placed here.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 80, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 205, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, scrollPane, 24, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -10, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				textArea.append(baseController.getLoopResults());
			}
		});
		
	}
}
