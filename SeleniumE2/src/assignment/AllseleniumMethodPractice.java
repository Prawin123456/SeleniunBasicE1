package assignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllseleniumMethodPractice {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.get("https://upsc.gov.in/");
        Thread.sleep(2000);
    //    Object titleOfwebpage = driver.getTitle();
    //    System.out.println(titleOfwebpage);
    //    Thread.sleep(2000);
     // 
       // String sourceCodeOfwebpage = driver.getPageSource();
     //   System.out.println(sourceCodeOfwebpage);
      
      //  driver.close();
       
     //   driver.manage().window().minimize();
    //    Thread.sleep(2000);
      
        //driver.manage().window().fullscreen();
     
        //  Dimension sizeOfWebPage = driver.manage().window().getSize();
        //  System.out.println(sizeOfWebPage);
       //   Thread.sleep(1000); 
       
       // driver.manage().window().setSize(new Dimension(500,500) );
   
        //  Point positionOfwebPage = driver.manage().window().getPosition();
        // System.out.println(positionOfwebPage);
    
    
       // driver.manage().window().setPosition(new Point(200, 100));
       
       
        
        //navigation method
   
        //  driver.navigate().to("https://upsc.gov.in/");
     //   driver.navigate().to(new URL("https://upsc.gov.in/"));
    //    Navigation nav = driver.navigate();
     //   nav.back();
    //    Thread.sleep(1000);
    //    nav.forward();
    //    Thread.sleep(1000);
    //    nav.forward();
    //    Thread.sleep(1000);
    //    nav.refresh();
       
        //className
       
        //its consist alphanumberic value
        //class=aabA-662-ccL
        //ctrl+shift+i=for inspect
        
        //cssSelector
       
        //cascading style sheet
        //condition
        //1.atleast one attribute should be present
        //2.unidirectional
        //syntax-tagname[an='av']
        
        
        
        
        
        //Xpath 
       
        //its kind of relative path(//)
        //multidirctional
        
      //1.Xpath by attribut
        // syntax=tagname[@AN='AV']
        
        //2.xpath by text function and visible text
        //syntax-//tagname[text()='TV']
        //ex-//span[text()='shoping cart']
        
        //3.Xpath by contains attribute
        //ex='selenium batch is off'
        //one part we use to find
        //Syntax-tagname[contains(@AN,'AV')]
        //tagname[contains(text(),'TV']
        
        //4.Xpath by Multiple attribute-AND,OR,NOT
        //SYNTAX-//tagname[@AN='AV' and @AN='AV']
        
        //5.xPATH BY dEPENDENT AND INDEPENDENT XPATH AND Xpath by surrounding
        //steps
        //1.identify which is dependent and independent
        //anything which is duplicated=dependent
        //anything which is unique=independent
        //2.write xpath for independent
        //3.traverse back to meet common point
        //update xpath expression by writing xpath for dependent element
        //EX-//span[text()='apple']/../..//button[@type='button']
        
        
        //6.xpath by axes
        //  //tagname[@AN='AV']/axes name::tagname
        //td[text()='kgf']/following-sibling::td
        //td[text()='kgf']/preceding-sibling::td
        //td[text()='kgf']/ancestor::td
        
        
        //xpath by index 
        //syntax-(Xpath)[index]
        //ex-(//p[text()='maza'])[4]
        
        
        
       
       driver.quit();
        

	}

}
