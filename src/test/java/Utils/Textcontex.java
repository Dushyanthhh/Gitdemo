package Utils;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pageobject.Projectmanager;


public class Textcontex {
	
	public WebDriver driver;
	public String homepage;
	public Projectmanager projectmanager;
	public Genricutlis generic;
	public Testbase testbase;
	public Textcontex() throws IOException
	
	{
		 testbase=new Testbase();
		projectmanager=new Projectmanager(testbase.Webdrivermanager());
		generic =new Genricutlis(testbase.Webdrivermanager());
	}


}
