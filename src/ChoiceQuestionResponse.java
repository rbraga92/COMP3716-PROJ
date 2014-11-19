import java.util.ArrayList;
import java.util.Iterator;

public class ChoiceQuestionResponse extends QuestionResponse 
{
	//This also can use for the question which is more than one answer. 
	private ArrayList<Integer> choiceResponse=new ArrayList<Integer>();
	private int setIntersection(ChoiceQuestionResponse answer)
	{
		int count=0;
		for(Integer i:choiceResponse)
			if(answer.choiceResponse.contains(i))
				++count;
		return count;
	}
	public ChoiceQuestionResponse(double fullmark)
	{
		super(fullmark);
	}
	public void addChoice(int choice)
	{
		if(!choiceResponse.contains(choice))
			choiceResponse.add(choice);
	}
	public void assess(QuestionResponse answer)
	{
		if(getClass()==answer.getClass())
			setMark(setIntersection((ChoiceQuestionResponse)answer)/((ChoiceQuestionResponse)answer).choiceCount()*getFullMark());
	}
	public Iterator<Integer> getResponse()
	{
		return choiceResponse.iterator();
	}
	public void removeChoice(int choice)
	{
		choiceResponse.remove(choice);
	}
	public int choiceCount()
	{
		return choiceResponse.size();
	}
}