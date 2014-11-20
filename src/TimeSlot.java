public class TimeSlot
{
	private final Day day;
	private final int hour;
	private Type type;
	public static enum Day{SUN,MON,TUE,WED,THU,FRI,SAT};
	public static enum Type{YES,NO,CANNOT,CLASS,EVENT};
	public TimeSlot(final Day day,final int hour)
	{
		this.day=day;
		this.hour=hour;
	}
	public TimeSlot(final Day day,final int hour,final Type type)
	{
		this(day,hour);
		this.type=type;
	}
	public Day getDay()
	{
		return day;
	}
	public int getHour()
	{
		return hour;
	}
	public Type getType()
	{
		return type;
	}
	public void setType(final Type type)
	{
		this.type=type;
	}
	public String toString()
	{
		return day+" "+hour+" "+type;
	}
}
