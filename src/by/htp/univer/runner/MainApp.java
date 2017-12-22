package by.htp.univer.runner;

import by.htp.univer.bean.Group;
import by.htp.univer.bean.Student;

public class MainApp { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int length = 10;
Group group = new Group( "TAT6", length);

   for (int i=0; i<length; i++) {
    group.getArrayofStudents()[i] = new Student ((int) (Math.random()* 20+20)); 
	}
   int avergaageofStudent = group.getAvrgAge();
   System.out.println("Average age of students= " + avergaageofStudent);
	}
}
