package ms.usa.login;

public class BookStore {

//Global variable	
	
static String firstName = "Mary";
static String lastName = "Jane";
String title;
double volume;
int chapter;
String pubName;
int copyName;


public void getAuthorFirstName() {
	title = "The Peach";
	volume = 2.5;
	chapter = 1;
	pubName = "Swason";
	copyName = 2;
	String day = "Monday";
	int pNum = 5;
	System.out.println(title + volume + chapter + pubName + copyName + day + pNum);
	
}
	
public void getAuthorLastName() {
	title = "Castle";
	volume = 6.5;
	chapter = 3;
	pubName = "Jackson";
	copyName = 1;
	String day = "Tuesday";
	int pNum = 2;
	System.out.println(title + volume + chapter + pubName + copyName + day + pNum);
	
}

public void getTitle() {
	title = "Ready Player One";
	volume = 3.6;
	chapter = 10;
	pubName = "SerneyHouse";
	copyName = 8;
	String day = "Wednesday";
	int pNum = 4;
	System.out.println(title + volume + chapter + pubName + copyName + day + pNum);
}
	
public void getVolume() {
	title = "Two Flowers";
	volume = 1.4;
	chapter = 9;
	pubName = "Broadway";
	copyName = 8;
	String day = "Thursday";
	int pNum = 3;
	System.out.println(title + volume + chapter + pubName + copyName + day + pNum);
	
}

public void getChapter() {
	title = "The Tree";
	volume = 7.7;
	chapter = 15;
	pubName = "Star Planet";
	String day = "Friday";
	int pNum = 10;
	System.out.println(title + volume + chapter + pubName + copyName + day + pNum);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	BookStore obj = new BookStore();
	obj.getAuthorFirstName();
	obj.getAuthorLastName();
	obj.getTitle();
	obj.getVolume();
	obj.getChapter();
	}

}
