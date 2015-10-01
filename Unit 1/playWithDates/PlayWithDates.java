package playWithDates;

import java.util.GregorianCalendar;

public class PlayWithDates 
{
	public PlayWithDates(int d,int m,int y)
	{
		day = d;
		month = m;
		year = y;
	}
	public void setDay(int d,int m,int y)
	{
		day = d;
		month = m;
		year = y;
	}
	public int getDay()
	{
		GregorianCalendar c = new GregorianCalendar();
		c.set(year,month-1,day);
		return c.get(GregorianCalendar.DAY_OF_WEEK);
	}
	
	private int day = 0;
	private int month = 0;
	private int year = 0;
}
