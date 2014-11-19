public class TextQuestionResponse extends QuestionResponse
{
	private String response=null;
	public TextQuestionResponse(double fullMark)
	{
		super(fullMark);
	}
	public void assess(QuestionResponse answer)
	{
		if(getClass()==answer.getClass())
			if(response.trim().toLowerCase().equals(((TextQuestionResponse)answer).response.trim().toLowerCase()))
				setMark(getFullMark());
			else
				setMark(0);
	}
	public String getResponse()
	{
		return response;
	}
	public void setResponse(String response)
	{
		this.response=response;
	}
}