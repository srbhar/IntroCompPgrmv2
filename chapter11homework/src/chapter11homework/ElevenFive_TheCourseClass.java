package chapter11homework;

import java.util.ArrayList;

public class ElevenFive_TheCourseClass {
	
 private String courseName;
 ArrayList<String> studentlist = new ArrayList<String>();
 private int numberOfStudents;

 public ElevenFive_TheCourseClass(String courseName) {
 this.courseName = courseName;
 }

 public void addStudent(String student) {
 studentlist.add(student);
 numberOfStudents++;
 }

 public ArrayList<String> getStudents() {
 return studentlist;
 }

 public int getNumberOfStudents() {
 return numberOfStudents;
 }

 public String getCourseName() {
 return courseName;
 }

 public void dropStudent(String student) {
	 if (studentlist.remove(student)) {
		 numberOfStudents--;
	 }
 }
 }