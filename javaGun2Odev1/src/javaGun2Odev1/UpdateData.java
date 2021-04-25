package javaGun2Odev1;


public class UpdateData {
	
	MainMenu mainMenu1=new MainMenu(1,"Kursalarim");
	MainMenu mainMenu2=new MainMenu(2,"Tum Kurslar");
	MainMenu mainMenu3=new MainMenu(3,"Kampa Hazirlik");
	MainMenu mainMenu4=new MainMenu(4,"Sk Sorulan Sorular");
	
	MainMenu[] mainMenus= {mainMenu1,mainMenu2,mainMenu3,mainMenu4};

	
	Courses course1=new Courses(1,14345,"Yazilim Gelistirici Yetistirme Kampi C#,Angular",52,"Engin Demirog");
	Courses course2=new Courses(2,14345,"Yazilim Gelistirici Yetistirme Kampi Java,React",32,"Engin Demirog");
	Courses course3=new Courses(3,14345,"Programlamaya Giris icin Temel Kurs",98,"Engin Demirog");	

	CoursesManager coursesManager=new CoursesManager();
	
	public void listData() {

		for (MainMenu mainMenu:mainMenus) {
			System.out.println("Menu Item (" + mainMenu.id + "): " + mainMenu.name);
		}
		
		System.out.println("----------------------------");
		
		coursesManager.addToCourse(course1);
		coursesManager.addToCourse(course2);
		coursesManager.addToCourse(course3);
	}
	
}
