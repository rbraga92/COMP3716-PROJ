public abstract class Skill
{
	private int mark;
	private String name;
	public Skill(String name,int mark)
	{
		this.mark=mark;
		this.name=name;
	}
	public double getMark()
	{
		return mark;
	}
	public String getSkill()
	{
		return name;
	}
	public void setMark(int mark)
	{
		this.mark=mark;
	}
	public void setSkill(String name)
	{
		this.name=name;
	}
}