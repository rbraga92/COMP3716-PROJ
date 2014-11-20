public class Professor
{
	private String name;
	private final int staffID;
	private Schedule schedule;
	public Professor(String name,final int ID)
	{
		this.name=name;
		staffID=ID;
	}
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return staffID;
	}
	public Schedule getSchedule()
	{
		return schedule;
	}
	public void setSchedule(Schedule schedule)
	{
		this.schedule=schedule;
	}
}
