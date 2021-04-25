package javaGun2Odev1;


public class UpdateData {
	
	MainMenu mainMenu1=new MainMenu(1,"Kursalar�m");
	MainMenu mainMenu2=new MainMenu(2,"T�m Kurslar");
	MainMenu mainMenu3=new MainMenu(3,"Kampa Haz�rl�k");
	MainMenu mainMenu4=new MainMenu(4,"S�k Sorulan Sorular");
	
	MainMenu[] mainMenus= {mainMenu1,mainMenu2,mainMenu3,mainMenu4};

	
	Courses course1=new Courses(1,14345,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� C#,Angular",52,"Engin Demiro�");
	Courses course2=new Courses(2,14345,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� Java,React",32,"Engin Demiro�");
	Courses course3=new Courses(3,14345,"Programlamaya Giri� i�in Temel Kurs",98,"Engin Demiro�");	

	//Courses[] course={course1,course2,course3};
	CoursesManager coursesManager=new CoursesManager();
	
	
	
	
	
	public UpdateData() {

		for (MainMenu mainMenu:mainMenus) {
			System.out.println("Menu Item (" + mainMenu.id + "): " + mainMenu.name);
		}
		
		System.out.println("----------------------------");
		
		coursesManager.addToCourse(course1);
		coursesManager.addToCourse(course2);
		coursesManager.addToCourse(course3);
		
	}
}
