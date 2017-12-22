package by.htp.univer.bean;

public class Group {

	private String name;
	private Student[] arrayofStudents;
	
	public Group(String name, int length ) {
		this.name = name;
		arrayofStudents = new Student [length];
	}
public String getName() {
	return name;
}
public Student[] getArrayofStudents() {
	return arrayofStudents;
}
public int getAvrgAge() {
	int sum = 0;
	for (Student student : arrayofStudents) {
		sum += student.getAge();
			}
	return sum /= arrayofStudents.length;
		
}
	}


