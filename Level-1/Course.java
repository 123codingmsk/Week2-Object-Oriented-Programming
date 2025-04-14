class Course{

	String courseName;
	int duration;
	int fee;
	static String instituteName = "SRM";
	
	Course(String courseName, int duration, int fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	void displayCourseDetails(){
		System.out.println(courseName);
		System.out.println(duration);
		System.out.println(fee);
	}
	
	static void updateInstituteName(String newinstituteName){
		instituteName = newinstituteName;
		System.out.print(instituteName);
	}

	public static void main(String[] args){
		Course p1 = new Course("Java", 60, 25000);
		
		p1.displayCourseDetails();
		p1.updateInstituteName("IIT");
	}
}