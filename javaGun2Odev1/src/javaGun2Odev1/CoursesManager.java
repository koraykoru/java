package javaGun2Odev1;

public class CoursesManager {

	//userId ileri e�itimlerde userName olarak �a��r�labilecek. �imdilik userId olarak idare
	
	public void addToCourse(Courses course) {
		System.out.println(course.userId + " Numaral� Oturuma Eklenen Yeni Kurslar");
		System.out.println("--------------------------------");
		System.out.println("Course Item :" + course.id);
		System.out.println("Course Name :" + course.name);
		System.out.println("Course Progress :" + course.progress);
		System.out.println("Course Educator :" + course.instructor);
		System.out.println();
		
	}

}
