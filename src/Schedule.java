import java.util.ArrayList;
import java.util.Iterator;

public class Schedule
{
	private ArrayList<TimeSlot> time=new ArrayList<TimeSlot>();
	private int getSlotFrom(final TimeSlot.Day day)
	{
		switch(day)
		{
		case MON:	return getSlotFrom(0);
		case TUE:	return getSlotFrom(1);
		case WED:	return getSlotFrom(2);
		case THU:	return getSlotFrom(3);
		case FRI:	return getSlotFrom(4);
		case SAT:	return getSlotFrom(5);
		case SUN:	return getSlotFrom(6);
		default:	return -1;
		}
	}
	private int getSlotFrom(final int base)
	{
		return base*slotCount;
	}
	public static final int days=7;
	public static final int slotCount=24;
	public Schedule()
	{
		for(int i=0;i!=days*slotCount;++i)
		{
			TimeSlot.Day day=null;
			switch(i)
			{
			case 0:				day=TimeSlot.Day.MON;				break;
			case 1:				day=TimeSlot.Day.TUE;				break;
			case 2:				day=TimeSlot.Day.WED;				break;
			case 3:				day=TimeSlot.Day.THU;				break;
			case 4:				day=TimeSlot.Day.FRI;				break;
			case 5:				day=TimeSlot.Day.SAT;				break;
			case 6:				day=TimeSlot.Day.SUN;				break;
			}
			for(int j=0;j!=slotCount;++j)
				time.add(new TimeSlot(day,j));
		}
	}
	public Iterator<TimeSlot> get()
	{
		return time.iterator();
	}
	public Iterator<TimeSlot> getDay(final TimeSlot.Day day)
	{
		ArrayList<TimeSlot> temp=new ArrayList<TimeSlot>();
		for(int i=0;i!=time.size();++i)
			if(time.get(i).getDay()==day)
				temp.add(time.get(i));
		return temp.iterator();
	}
	public TimeSlot getHour(final TimeSlot.Day day,final int hour)
	{
		return time.get(getSlotFrom(day)+hour);
	}
	public Iterator<TimeSlot> getTimeSlotBy(final TimeSlot.Type type)
	{
		ArrayList<TimeSlot> temp=new ArrayList<TimeSlot>();
		for(int i=0;i!=time.size();++i)
			if(time.get(i).getType()==type)
				temp.add(time.get(i));
		return temp.iterator();
	}
}
