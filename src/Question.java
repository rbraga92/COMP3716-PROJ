public class Question
{
	private String text;
	private QuestionResponse response;
	private QuestionResponse answer;
	public Question(String text)
	{
		this.text=text;
	}
	public Question(String text,QuestionResponse answer)
	{
		this(text);
		this.answer=answer;
	}
	public QuestionResponse getAnswer()
	{
		return answer;
	}
	public void assess()
	{
		response.assess(answer);
	}
	public double getMark()
	{
		return answer.getMark();
	}
	public QuestionResponse getResponse()
	{
		return response;
	}
	public String getText()
	{
		return text;
	}
	public void setAnswer(QuestionResponse answer)
	{
		this.answer=answer;
	}
	public void setResponse(QuestionResponse questionResponse)
	{
		response=questionResponse;
	}
	public void setText(String text)
	{
		this.text=text;
	}
}