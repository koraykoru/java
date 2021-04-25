package javaGun2Odev1;


public class UpdateData {
	
	MainMenu mainMenu1=new MainMenu(1,"Kursalarım");
	MainMenu mainMenu2=new MainMenu(2,"Tüm Kurslar");
	MainMenu mainMenu3=new MainMenu(3,"Kampa Hazırlık");
	MainMenu mainMenu4=new MainMenu(4,"Sık Sorulan Sorular");
	
	MainMenu[] mainMenus= {mainMenu1,mainMenu2,mainMenu3,mainMenu4};

	
	Courses course1=new Courses(1,14345,"Yazılım Geliştirici Yetiştirme Kampı C#,Angular",52,"Engin Demiroğ");
	Courses course2=new Courses(2,14345,"Yazılım Geliştirici Yetiştirme Kampı Java,React",32,"Engin Demiroğ");
	Courses course3=new Courses(3,14345,"Programlamaya Giriş için Temel Kurs",98,"Engin Demiroğ");	

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
