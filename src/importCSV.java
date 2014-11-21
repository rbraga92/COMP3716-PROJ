/***************************************************************
* COMP 3716 - Group G - Project
* 
* A method by which to import a CSV file of students
* during initialization of the program.
****************************************************************/

public class importCSV{
	public void importFromFile(String fileName, ClassList listOfStudents, int numberOfStudents)	{
		//should pull from a CSV file maybe
	}
	
	public static void importStatic(ClassList listOfStudents, int numberOfStudents)
	{
		int[] studentNumbers = {201209968, 201465346, 201495916, 201439415,	201301517,
								201364235, 201413700, 201328918, 201381915, 201460782,
								201248337, 201469985, 201323187, 201469409, 201258712,
								201321289, 201355005, 201292299, 201440475, 201274326,
								201223001, 201414427, 201239598, 201333108, 201499314,
								201330317, 201402035, 201333529, 201295895, 201325098,
								201328164, 201495014, 201248732, 201263237,	201201910,
								201304619, 201465744, 201373705, 201349045, 201446180,
								201483936, 201466666, 201450155, 201345806, 201483961,
								201259638, 201419912, 201326448, 201330599, 201402086};
		
		String[] lastNames = {	"Paola","Abbey","Lakeesha","Siobhan","Barabara","Chan",
								"Huan","Roderick","Rosalva","Andres","Cindy","Annelle",
								"Morton","Vinita","Darlene","Louann","Layne","Dewitt",
								"Gail","Donnell","Margaret","Kieth","Maryann","Kareen",
								"Maura","Mohammad","Damien","Elease","Tad","Jadwiga",
								"Concha","Rae","Dorthy","Etha","Liliana","Cheri",
								"Nickole","Adrien","Cyndi","Madge","Elia","Flossie",
								"Celena","Benjamin","Angelika","Trevor","Dayna",
								"Krystin","Audra","Jasper"};
		
		String[] firstNames = {	"Ta","Stanton","Takaka","Jenine","Cortez","Charmaine",
								"Demetra","Geneva","Vera","Maisie","Ruthanne","Lucia",
								"Sam","Derek","Margery","Lucy","Katelyn","Morris",
								"Rolande","Zonia","Claudette","Yung","Deberea","Krystina",
								"Latarsha","Dagmar","Margret","Kena","Boyd","Bernice",
								"Stanford","Stephany","Enedina","Eusebia","Donette",
								"Winford","Kiley","Dorothy","Delinda","Magdalene","Neomi",
								"Latesha","Leopoldo","Vertie","Lavelle","Gilberto",
								"Ginette","Cindy","Melinda","Edna"};

		for(int i=0; i < numberOfStudents; i++){
			listOfStudents.addStudent(new Student(lastNames[i] + ", " + firstNames[i], studentNumbers[i]));
		}

	}
}