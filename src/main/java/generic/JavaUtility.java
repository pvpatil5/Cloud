package generic;

import java.util.Date;
import java.util.Random;

public class JavaUtility 
{

	/**
	 * @author Pavan
	 *  Generate a random number
	 * @return randomnumber till 10000
	 */
	public int createRandomNumber() 
	{
		Random r = new Random();
		int randomnumber= r.nextInt(1000);
		return randomnumber;
	}
	
	/**
	 * @author Pavan
	 *  Generate a random number
	 * @return randomnumber till 10000
	 */
	public int randomyear() 
	{
		Random r = new Random();
		int randomnumber=  r.nextInt(1000);
		return randomnumber;
	}

	/**
	 * @author Pavan
	 * Provide Current System Date
	 * @return currentSysDate
	 */

	public String getCurrentSystemDate() 
	{
		Date dateobj= new  Date();
		String currentSysDate=dateobj.toString();
		return currentSysDate;

	}
	/**
	 * @author AMAR-G
	 * Provide current month
	 * @return current month
	 */
	public int getCurrentMonth() 
	{
		Date dateobj= new  Date();
		return dateobj.getMonth();

	}
	
	/**
	 * @author AMAR-G
	 * Provide current month
	 * @return current month
	 */
	public int getCurrentyear() 
	{
		Date dateobj= new  Date();
		String currentSysDate=dateobj.toString();
		String arr[]=currentSysDate.split(" ");
		String year= arr[5];
		int i=Integer.parseInt(year);  
		return i;

	}

	/**
	 * @author AMAR-G
	 * Gives current date
	 * @return date
	 */
	public String getDate()
	{
		Date dateobj= new  Date();
		String currentSysDate=dateobj.toString();
		String arr[]=currentSysDate.split(" ");
		return arr[2];

	}
	
	
	public int getRandomyear() {
	    return (int) ((Math.random() * (2021 - 1950)) + 1950);
	}

}
