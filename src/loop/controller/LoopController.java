package loop.controller;

import java.awt.Color;

import javax.swing.JPanel;

import loop.model.Looper;
import loop.view.LoopFrame;
import loop.view.LoopPanel;


/**
 * 
 * @author nduc4538
 * @version 1.0 added data members and start method.
 */
public class LoopController
{

	private LoopFrame appFrame;
	private Looper myLooper;
	private int clickCount;

	public LoopController()
	{
		this.myLooper = new Looper(); 
		clickCount = 0;
	}
	
	public void start()
	{
		this.appFrame = new LoopFrame(this);
	}
	
	public String getLoopResults()
	{
		String currentResults = loopOverBackList();
		clickCount++;
		
		return currentResults;
	}
	
	private String loopOverList()
	{
		String loopedData = "";
		
		for(int position = 0; position < myLooper.getGraveNameList().size(); position++)
		{
			loopedData += myLooper.getGraveNameList().get(position) + "\n";
		}
		
		return loopedData;
	}
	
	private String loopOverBackList()
	{
		String loopedData = "";
		
		for(int position = myLooper.getGraveNameList().size() -1; position >= 0; position--)
		{
			loopedData += myLooper.getGraveNameList().get(position) + "\n";
		}
		
		return loopedData;
	}
	
	private String getText(int position)
	{
		String results = "";
		if(position >-1 && position < myLooper.getGraveNameList().size())
		{
			
		}
		
		results = myLooper.getGraveNameList().get(position);
		
		return results;
	}

}
