package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CollectionTest {

	@Test(enabled = true)
	public static void fun() {
		//to create a ArrayList object using List reference variable
		//dynamic array and contains duplicate
		//store values basis insertion order
		//not synchronized (not thread safe)
		//allow random access to get the element because it store values basis on index
		ArrayList <String> alist = new ArrayList<String>();
		
		//methods
		//to add() new value to the list
		alist.add("pk");
		System.out.println("List : " + alist);
		alist.add("4");
		alist.add("zk");
		alist.add("6");
		System.out.println("List : " + alist);
		
		//to find size() of the list
		System.out.println("Size of list : " + alist.size());
		//to remove()
		
		//to get()
		String third = alist.get(2);
		System.out.println("Third element at second index : " + third);
		
		//to iterate over we can use for loop and Iterator
		//for loop
		for(int i = 0; i<alist.size(); i++)
			System.out.println("List using for loop : " + alist.get(i));
		
		//Iterator to loop throug the list
		Iterator<String> it = alist.iterator();
		while(it.hasNext()) {
			String itlist = it.next();
			System.out.println("New list in iterator : " + itlist);
		}
		
		//merging to arraylist together
		ArrayList <String> alNew = new ArrayList<String>();
		alNew.add("A");
		alNew.add("B");
		alNew.add("C");
		alNew.add("D");
		
		//add alNew to alist
		alist.addAll(alNew);
		System.out.println("All list : " + alist);
		
	}
	
	@Test
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chrome 10-12-19\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
