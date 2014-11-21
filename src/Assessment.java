import java.util.ArrayList;
//sdfs
public class Assessment
{
	private ArrayList<Question> question;
	private ArrayList<Skill> skill;
	private int grade;
	public void addQuestion(Question question)
	{
		this.question.add(question);
	}
	public void addSkill(Skill skill)
	{
		this.skill.add(skill);
	}
	public void assess()
	{
		for(Question q:question)
			q.assess();
	}
	public double getMark()
	{
		double mark=0;
		for(Question q:question)
			mark+=q.getMark();
		for(Skill s:skill)
			mark+=s.getRate();
		return mark+grade;
	}
	public int getGrade()
	{
		return grade;
	}
	public Question getQuestion(int index)
	{
		return question.get(index);
	}
	public Skill getSkill(int index)
	{
		return skill.get(index);
	}
	public void setGrade(int grade)
	{
		this.grade=grade;
	}
	public void setQuestion(int index,Question question)
	{
		this.question.set(index,question);
	}
	public int questionSize()
	{
		return question.size();
	}
	public int skillSize()
	{
		return skill.size();
	}
	public Question removeQuestion(int index)
	{
		return question.remove(index);
	}
	public Skill removeSkill(int index)
	{
		return skill.remove(index);
	}
}
