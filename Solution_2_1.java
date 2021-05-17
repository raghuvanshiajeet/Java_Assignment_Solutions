package Assignment_Solutions;

class Person{
	private String name,address;
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String address) {
		this.address = address;
	}
	public String toString() {
		return name+ "(" +address + ")";
	}
}

class Student extends Person{
	private int numCourses;
	private String courses[];
	private int grades[];
	private static final int max_course_limit = 30;
	public Student(String name, String address) {
		super(name,address);
		numCourses = 0;
		courses = new String[max_course_limit];
		grades = new int[max_course_limit];
	}
	public String toString() {
		return "Student :" + super.toString();
	}
	
	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}
	
	public void printGrades() {
		System.out.println(this);
		for(int i = 0;i<numCourses;i++)
			System.out.print(" " +courses[i] + " : " +grades[i]);
		System.out.println();
	}
	public double getAverageGrade() {
		int sum = 0;
		for(int i = 0;i<numCourses;i++) {
			 sum += grades[i]; 
		}
		return (double)sum/numCourses;
	}
}

class Teacher extends Person{
	private int numCourses;
	private String[] courses;
	private static final int max_course_limit = 5;
	
	public Teacher(String name, String address) {
		super(name,address);
		numCourses = 0;
		courses = new String[max_course_limit];
	}
	
	public String toString() {
		return  "Teacher : " +super.toString();
	}
	
	public boolean addCourses(String course) {
		for(int i = 0;i<numCourses;i++) {
			if(courses[i].equals(course))
				return false;
		}
		courses[numCourses] = course;
		numCourses++;
		return true;
	}
	public boolean removeCourses(String course) {
		boolean found = false;
		int courseIndex = -1;
		for(int i = 0; i<numCourses;i++) {
			if(courses[i].equals(course)) {
				courseIndex = i;
				found = true;
				break;
			}
		}
		if(found) {
			for(int i = courseIndex;i<numCourses - 1;i++) {
				courses[i] = courses[i+1];
			}
			numCourses--;
			return true;
		}
		else
			return false;
	}
}
public class Solution_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Ajeet","Vidisha");
		s1.addCourseGrade("IM101",98);
		s1.addCourseGrade("IM102", 95);
		s1.printGrades();
		System.out.println("Average is "+s1.getAverageGrade());
		
		Teacher t1 = new Teacher("Pranchul" , "Sanchi");
		System.out.println(t1);
		String[] courses = {"IM101","IM102","IM101"};
		for(String course : courses) {
			if (t1.addCourses(course))
				System.out.println(course+ "Added !!!");
			else
				System.out.println(course+ "Cannot be Added !!!");
		}
		for(String course : courses) {
			if(t1.removeCourses(course))
				System.out.println(course+ "Removed !!!");
			else
				System.out.println(course+ "Cannot be Removed !!!");
		}
	}

}
