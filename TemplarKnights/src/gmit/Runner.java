package gmit;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import net.sourceforge.jFuzzyLogic.FIS;

public class Runner {
	
	public static class Main
	{
		private static Location location = new Location();
		
		
		public Location getInstance()
		{
			return location;
		}

		public static void main(String[] args) throws SAXException, IOException
		{
			// TODO Auto-generated method stub
			SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		    try 
		    {
		        SAXParser saxParser = saxParserFactory.newSAXParser();
		        Parser handler = new Parser();
		        saxParser.parse(new File("game.xml"), handler);
		       	            
		    } catch (ParserConfigurationException e)
		    {
		        e.printStackTrace();
		    }
		    
		    // Load from 'FCL' file
	        String fileName = "fcl/rules.fcl";
	        FIS fis = FIS.load(fileName,true);

	        // Error while loading?
	        if( fis == null ) 
	        { 
	            System.err.println("Can't load file: '" + fileName + "'");
	            return;
	        }	    
		    
		    //System Object	    
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome Adventurer!!! \n What is your name?");
			String name = input.nextLine();
			System.out.println("Welcome " + name);
			System.out.println("----------------------------------------------------------------------");
			System.out.println("The year is  1187 and the crusader army of the Kingdom of Jerusalem \n" 
								+ "has been all but destroyed by Saladin at the Horns of Hattin.\n"
								+ "As a Templar knight, having survived the battle, you have been entrusted with going to Jerusalem, \n"
							    + "taking the Holy Grail from the Temple Mount and brining it safely to Cyprus, via the port of Antioch.\n"
								+ "As a consequence of the defeat at Hattin, a large Saracen army is marching on Jerusalem and the Kingdom is now swarming\n"
							    + "with Saracen invaders. Danger lurks everywhere, among the common folk are thieves and brigands who wish to assail or rob you or worse...!");
			System.out.println("----------------------------------------------------------------------");
			
			JourneyRoute jm = new JourneyRoute();
			
			boolean play = true;
			while(play)
			{
				System.out.println("What would you like to do?");
				Scanner scan = new Scanner(System.in);
				String urInput = scan.nextLine();		
				System.out.println("> User's Input: " + urInput);
				switch(urInput)
				{
					case("look"):
					{
						location.getName();
						location.getDescription();
						break;
					}
					case("leave"):
					{
						
						location.getName();						
						System.out.println("\nEnter the direction you want to go?");
						urInput = scan.nextLine();	
						break;
					}
					case("attack"):
					{
						
					}
					case("commands"):
					{
						System.out.println("go");
						System.out.println("leave");
						System.out.println("attack");
						System.out.println("use");
						System.out.println("quit");
					}
					case("quit"):
					{
						System.out.println("Bye Adventure " + name);
						play = false;
					}
					default: System.out.println("Invalid Command");
				}
				
			}	
		}

	}
}
