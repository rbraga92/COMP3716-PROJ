public class Skill
{
	private String name;
	private int rate;
	private int convert(final Rate rate)
	{
		switch(rate)
		{
		case BAD:			return 1;
		case NORMAL:		return 2;
		case GOOD:			return 3;
		default:			return 0;
		}
	}
	public static enum Rate{BAD,NORMAL,GOOD};
	public Skill(String name,final Rate rate)
	{
		this.name=name;
		this.rate=convert(rate);
	}
	public int getRate()
	{
		return rate;
	}
	public String getSkill()
	{
		return name;
	}
	public void setMark(final Rate rate)
	{
		this.rate=convert(rate);
	}
	public void setSkill(String name)
	{
		this.name=name;
	}
}
