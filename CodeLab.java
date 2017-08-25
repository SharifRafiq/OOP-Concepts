package peopleNTech;

public class CodeLab extends Mentoring implements SoftwareTesting{

	private int numOfProblems = 680;
	
	public int getNumOfProblems() {
		return numOfProblems;
	}
	public void setNumOfProblems(int numOfProblems) {
		this.numOfProblems = numOfProblems;
	}
	public void practiceCodeLab(){
		System.out.println("Plaese master at least 20 codelab problems a day which has " + numOfProblems + " problems");
	}
	public void attendSessions() {
		System.out.println("Please Attend every session on time");
	}
	public void learnSelenium() {
		System.out.println("You may have learn selenium in 60 Days");
	}
	public void getJob() {
		System.out.println("You may expect a job right after the Course");
	}
	public void startSDLC() {
		System.out.println("We already learn SDLC");
		
	}
}