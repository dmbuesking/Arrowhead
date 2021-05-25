package com.dmb;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Arrowhead 
{

	public static void main(String[] args) 
	{
		String artType;
		String dateFound;
		String locFound;
		String county;
		String state;
		String finderName;
		
		//Instantiate Artifact object and Artifact ArryList
		Artifact point = new Artifact();
		ArrayList<Artifact> artifacts = new ArrayList<>();
		
		//Loop to prompt for Artifact attributes, load them into Artifact object
		//and load the Artifact into Artifacts ArrayList
		int morePoints = 0;
		while (morePoints == 0)
			{
			artType = JOptionPane.showInputDialog("Point Type - ");	
			dateFound = JOptionPane.showInputDialog("Date Found - ");	
			locFound = JOptionPane.showInputDialog("Site Name- ");	
			county = JOptionPane.showInputDialog("County - ");	
			state = JOptionPane.showInputDialog("State - ");	
			finderName = JOptionPane.showInputDialog("Finder Name - ");	
			morePoints = JOptionPane.showConfirmDialog(null,"Add another? Y/N");	
	
			point.setArtType(artType);
			point.setDateFound(dateFound);
			point.setLocFound(locFound);
			point.setCounty(county);
			point.setState(state);
			point.setFinderName(finderName);
					
			artifacts.add(point);
			System.out.println(point.toString()); 
			point=null;
			point = new Artifact();
			if (morePoints != 0)
				{
				for(Artifact x:artifacts)
					{
					System.out.println(x.toString()); 
					}

				}

			}
			System.out.println("Size of list " + artifacts.size());
		

	}
	
	

}


///				Iterator<Artifact> it = artifacts.iterator();
//while(it.hasNext()) 
//{
//   System.out.println(it.next());
//}

	//Display the number of Artifacts entered and display the list of Artifacts
//	System.out.println("Size of list " + artifacts.size());
//	System.out.println("List of Arrowheads");
//	for(Artifact x:artifacts)
//		{
//		System.out.println(x.toString()); 
//		}



