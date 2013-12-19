package loop.model;

import java.util.ArrayList;

public class Looper
{
	
	private ArrayList<String> graveNameList;
	
	public Looper()
	{
		graveNameList = new ArrayList<String>();
		
		fillTheNameList();
	}
	
	private void fillTheNameList()
	{
		graveNameList.add("Earl Wayne Cox");
		graveNameList.add("Floyd T. Ainsworth");
		graveNameList.add("Marybell Elswood Leavitt");
		graveNameList.add("Sabrina Turner");
		graveNameList.add("Richard D. Platts");
		graveNameList.add("Michael Gene Elswood");
		graveNameList.add("James Nelson");
		graveNameList.add("George Wells");
	}
	
	public ArrayList<String> getGraveNameList()
	{
		return graveNameList;
	}
	
	public String testLoopStupid()
	{
		String loopResult = "";
		int loopCount = 1;
		while (loopCount < 10)
		{
			loopResult = ("This is the " + loopCount + "'th time around the loop.");
			loopCount++;
		}

		return loopResult;
	}

	public String testLoop()
	{
		String loopResult = "";
		int timesLooped = 0;

		for (int loopCounter = 0; loopCounter < 10; loopCounter += 2)
		{
			loopResult += loopCounter + ", ";
			timesLooped++;
		}

		loopResult += "\nThe loop executed " + timesLooped + " times";
		return loopResult;

	}

	public String testLoopTwo()
	{
		String loopResult = "";
		int outerLoopTimes = 0;
		int timesLooped = 0;
		for (int weeks = 0; weeks < 52; weeks++)
		{
			for (int hours = 0; hours < 24; hours++)
			{
				for (int outerLoop = 0; outerLoop < 60; outerLoop++)
				{
					for (int loopCounter = 0; loopCounter < 60; loopCounter++)
					{
						// loopResult += loopCounter + ", ";
						timesLooped++;
					}
					outerLoopTimes++;
				}
			}
		}
		loopResult += "\nThe loop executed " + timesLooped + " times";
		return loopResult;
	}

	public String testLoopThree()
	{
		String loopResult = "";
		double outerLoopTimes = 0;
		double timesLooped = 0;

		for (double kilobytes = 0; kilobytes < 1024; kilobytes++)
		{
			for (double bytes = 0; bytes < 1024; bytes++)
			{
				for (double bits = 0; bits < 8; bits++)
				{
					timesLooped++;
				}
				outerLoopTimes++;
			}
		}

		loopResult += "\nThe loop executed " + timesLooped + " times";
		return loopResult;
	}
}
