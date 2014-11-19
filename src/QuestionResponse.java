public abstract class QuestionResponse
{
	private final double fullMark;
	private double mark;
	protected void setMark(double mark)
	{
		this.mark=mark;
	}
	public QuestionResponse(double fullMark)
	{
		this.fullMark=fullMark;
		this.mark=0;
	}
	public abstract void assess(QuestionResponse answer);
	public double getFullMark()
	{
		return fullMark;
	}
	public double getMark()
	{
		return mark;
	}
}