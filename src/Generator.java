public class Generator{
    private ArrayList<Student> students; //List of students fed to generator at init for generating groups
    private ArrayList<Group> groups; //List of groups, to be outputted
    private int groupSize; //Groupsize - property of GroupProject that is taken by
    private boolean aimLow; //whether the professor prefers reducing groupsize to offset uneven groupsizes
    
    public Generator(ArrayList<Student> classList, boolean aimlow, int groupSize){
    	this.aimLow = aimlow;
    	this.groupSize = groupSize;
    	this.students = classlist;
    }
    
    public ArrayList<Student> generate(){
    	
    	if(students.size()%groupSize==0){//if groups will be even, just generate groups with groupSize people per group
    		groups = new ArrayList<Group>(students.size()/groupSize);
    		for (int i=0; i<students.size();i++){
    			(groups.get(i/groupSize)).add(students.get(i));
    		}
    		return groups;
    	}
    	//ifAimLow it requires the floor of students.size()/groupSize + 1 number of groups/
    	//Example : for groups of 4, 9 students:  size = 9, 9/4 =2; 2+1=3, 3 groups.
    	//else, it requires the floor of students/(groupSize) groups.
    	//example: for groups of 4, 9 students, size = 9;  9/4 = 2; 2 groups.
    	int noOfGroups=0;
    	if(aimLow){
        	groups = new ArrayList<Group>(students.size()/groupSize + 1);
    	} else {
        	groups = new ArrayList<Group>(students.size()/groupsize);
    	}
    	groups = new ArrayList<Group>(noOfGroups);
    	for (int i=0; i<students.size();i++){ 
    		//adds student i to the group that is numbered by
    		// i%groups.size().  This will generate 
			(groups.get(i%(groups.size())).add(students.get(i));
		}
		return groups;
    }
    
    public ArrayList<Student> getStudents(){
    	return students;
    }
    public boolean getAimLow(){
    	return aimLow;
    }
    public int getGroupSize(){
    	return groupSize;
    }
}