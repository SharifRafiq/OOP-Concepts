package peopleNTech;

public class ITJob {
	public static int noOfWeeks = 16;
	final static String whichDay = "SATURDAY";
	
	public static void main(String[] args) {
	
		SoftwareTesting qa = new CodeLab();
		qa.attendSessions();
		qa.learnSelenium();
		qa.getJob();
		Mentoring fahim = new CodeLab();
		fahim.doMentoring();
		fahim.joinMentoring();
		fahim.startSDLC();
		CodeLab turingscraft = new CodeLab();
		turingscraft.practiceCodeLab();
		System.out.println(noOfWeeks);
		System.out.println(whichDay);
	}

}
