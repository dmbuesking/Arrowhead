package com.dmb;
import java.io.File;
import java.io.FileNotFoundException;
//import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * This program allows the user to enter data about arrowheads and 
 * saves that data in JSON format in a flat file.  The flat file is 
 * read as input when the program launches so that the user can add 
 * more arrowheads.
 * 
 * A future updates:
 * 	Error handling 
 * 	Generate a list of Arrowheads and print to a file
 *  Date formatting
 * @author dmb
 *
 */

public class Arrowhead 
{
	public static void main(String[] args) throws Exception 
	{
		String artType;
		String dateFound;
		String locFound;
		String county;
		String state;
		String finderName;
		
		String filename = "Points";
		

		
		//Read the JSON point file into List artifactList using Jackson
		ObjectMapper objectMapper = new ObjectMapper();
		File file = new File("/home/dmb/git/repository/Arrowheads/Points");
		List<Artifact> artifactList = Arrays.asList(objectMapper.readValue(file, Artifact[].class));
		
		//Instantiate Artifact ArryList artifacts.  The artifactList 
		//array will be loaded into artifacts so that new artifacts can 
		//be added.
		ArrayList<Artifact> artifacts = new ArrayList<>();
		
		//Copy the Array artifactList into ArrayList artifacts so that new 
		//objects can be added.
		
		artifacts.addAll(artifactList);
		for(Artifact x:artifacts)
		{
			System.out.println(x);
			System.out.println();
		}
		
		//Loop to prompt for Artifact attributes, load input values into Artifact object
		//and load the Artifact into Artifacts ArrayList artifact.
		Artifact point = new Artifact();
		int morePoints = 0;
		morePoints = JOptionPane.showConfirmDialog(null,"Add points? Y/N");
		while (morePoints == 0)
			{
			//Prompt for inputs
			artType = JOptionPane.showInputDialog("Point Type - ");	
			dateFound = JOptionPane.showInputDialog("Date Found - ");	
			locFound = JOptionPane.showInputDialog("Site Name- ");	
			county = JOptionPane.showInputDialog("County - ");	
			state = JOptionPane.showInputDialog("State - ");	
			finderName = JOptionPane.showInputDialog("Finder Name - ");	
			morePoints = JOptionPane.showConfirmDialog(null,"Add another? Y/N");	
	
			//Set the values in Artifact object point
			point.setArtType(artType.trim());
			point.setDateFound(dateFound.trim());
			point.setLocFound(locFound.trim());
			point.setCounty(county.trim());
			point.setState(state.trim());
			point.setFinderName(finderName.trim());
			System.out.println(point.toString()); 
			
			//Add point to the artifacts ArrayList and create a new point Artifact
			artifacts.add(point);
			point = new Artifact();
			
			//When the user is done entering points, write the artifacts ArrayList
			//to a data file
			if (morePoints != 0)
				{
				PrintWriter outputFile = new PrintWriter(filename);
			    ObjectMapper mapper = new ObjectMapper();
			    mapper.writerWithDefaultPrettyPrinter().writeValue(outputFile, artifacts);

				//Close the output file
				outputFile.close();
				}
			}
		for(Artifact x:artifacts)
		{
			System.out.println(x);
		}
		//Write the number of points in the file and exit.
		System.out.println("Size of list " + artifacts.size());
		System.exit(0);
	}
}




