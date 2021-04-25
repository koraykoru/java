package javaGun2Odev1;

public class CoursesManager {

	//userId ileri egitimlerde userName olarak cagirilebilecek. Simdilik userId olarak idare
	
	public void addToCourse(Courses course) {
		System.out.println(course.userId + " Numaralý Oturuma Eklenen Yeni Kurslar");
		System.out.println("--------------------------------");
		System.out.println("Course Item :" + course.id);
		System.out.println("Course Name :" + course.name);
		System.out.println("Course Progress :" + course.progress);
		System.out.println("Course Educator :" + course.instructor);
		System.out.println();
		
	}
	
	public void deleteToCourse(Courses course) {
		System.out.println(course.userId + " Numarali Oturumun Kurs Bilgisi Silindi");
	}

}
