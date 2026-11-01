package com.automateWebsite;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
//		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.id("j_idt88:name"));
		name.sendKeys("lisa" + Keys.ENTER);
//		
		WebElement countryappend = driver.findElement(By.id("j_idt88:j_idt91"));
		countryappend.sendKeys(" India");
//		
		WebElement disable = driver.findElement(By.id("j_idt88:j_idt93"));
		System.out.println(disable.getAttribute("disabled")); //true
//		
//		System.out.println(disable.getDomAttribute("disabled"));
		
		@Nullable
		String value = disable.getAttribute("class");
		String[] split = value.split("-");
		System.out.println(split[split.length-1]);
		
		if(disable.isEnabled()) {
			System.out.println("box is enable ");
		}else {
			System.out.println("box is not enable");
		}
//		
		WebElement clear = driver.findElement(By.id("j_idt88:j_idt95"));
		clear.clear();
		System.out.println(clear.getAttribute("value"));
		
//		WebElement retrieve = driver.findElement(By.id("j_idt88:j_idt97"));
//		String value1 = retrieve.getAttribute("value");
//		System.out.println(value1);
//		
		WebElement tab = driver.findElement(By.id("j_idt88:j_idt99"));
		tab.sendKeys("testexample@gmail.com", Keys.TAB);
		Thread.sleep(5);
		WebElement active = driver.switchTo().activeElement();
		String actualid = active.getAttribute("id");
		if(actualid.equals("j_idt88:j_idt101")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		active.sendKeys("heloo it meeeeeeeee" + Keys.ENTER);
//		
//		// text editor get the active element and send keys
//		
		WebElement para =driver.findElement(By.id("j_idt88:j_idt103_editor"));
		WebElement subpara = para.findElement(By.tagName("div")).findElement(By.tagName("p"));
		subpara.sendKeys("type something that you knew");
		
//		WebElement typepara = driver.findElement(By.cssSelector("[contenteditable='true']"));
//		typepara.sendKeys("heloo it me lisa");
//		
//		WebElement para = driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']//p"));
//		para.sendKeys("type anything you want" + Keys.ENTER);
//		
//		// enter and show error message
//		
		WebElement enteranderror = driver.findElement(By.id("j_idt106:thisform:age"));
		enteranderror.sendKeys(Keys.ENTER);
		
		WebElement errormessage = driver.findElement(By.xpath("//div[@id='j_idt106:thisform:j_idt110']"));
		
		String error = errormessage.getText();
		System.out.println(error);
//		
//		 //another method 
//		WebElement enteranderror = driver.findElement(By.id("j_idt106:thisform:age"));
//		enteranderror.sendKeys(Keys.ENTER);
//		WebElement error = driver.findElement(By.cssSelector("[role='alert']"));
//		String errormeg = error.getText();
//		System.out.println(errormeg);
//		
//		//click and confirm label position change 
//		WebElement position = driver.findElement(By.id("j_idt106:float-input"));
//		WebElement label = driver.findElement(By.id("j_idt106:j_idt113")) ;
//		Point location = label.getLocation();
//		int beforex = location.getX();
//		int beforeY = location.getY();
//		System.out.println(beforex);
//		System.out.println(beforeY);
//		
//		position.click();
//		
//		label = driver.findElement(By.id("j_idt106:j_idt113")) ;
//		location = label.getLocation();
//		int afterx = location.getX();
//		int afterY = location.getY();
//		System.out.println(afterx);
//		System.out.println(afterY);
//		
//		if(beforeY != afterY) {
//			System.out.println("posistion are changed");
//		}else {
//			System.out.println("position are not changed");
//		}
		
		WebElement floatelmt = driver.findElement(By.id("j_idt106:auto-complete_input"));
		floatelmt.sendKeys("lisa");
		Thread.sleep(2000);
		List<WebElement> listelementsv = driver.findElements(By.xpath("/html[1]/body[1]/span[1]/ul[1]/li"));
		listelementsv.get(2).click();
		
		WebElement floateleme = driver.findElement(By.id("j_idt106:auto-complete_input"));
		floatelmt.sendKeys("lisa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='j_idt106:auto-complete_panel']//li[3]")).click();
		
		WebElement calendorinput = driver.findElement(By.id("j_idt106:j_idt116_input"));
		calendorinput.sendKeys("5/22/2026");
		List<WebElement> rows = driver.findElements(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/table[1]/tbody[1]/tr"));
		System.out.println("table row : " + rows.size());
		boolean flag = false;
		for(int i=0 ; i<rows.size(); i++) {
			if(i<=rows.size()-1) {                                        
			List<WebElement> columns = rows.get(i).findElements(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/table[1]/tbody[1]/tr[" + (i+1) + "]/td"));
			
			System.out.println("Table column : " + columns.size());
			for(int j=0; j<=columns.size()-1; j++) {
				if(j<=columns.size()-1) {
					Thread.sleep(1000);
					WebElement element = columns.get(j).findElement(By.xpath("./*[1]"));
					if(element.getTagName().equals("span")) {
						System.out.println(element.getTagName() + ":" + element.getText() + "which mean no element");
						continue;
					}else {
						WebElement a = columns.get(j).findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/table[1]/tbody[1]/tr["+ (i+1) + "]/td["+(j+1)+"]/a"));
						System.out.println(a.getTagName() + ":" + a.getText());
						@Nullable
						String classtext = a.getAttribute("class");
						if(classtext.contains("active")) {
							String data = a.getText();
							System.out.println("active data: " + data);
							a.click();
							flag=true;
							break;
						}
					}
				}
			}
			}
			if(flag) {
				break;
			}
		}
		WebElement spin = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/span[3]/a[1]"));
		spin.click();
		spin.click();
		spin.click();
		String inputvalue = driver.findElement(By.id("j_idt106:j_idt118_input")).getAttribute("aria-valuenow");
		System.out.println(inputvalue);
		
		WebElement input = driver.findElement(By.id("j_idt106:slider"));
		input.sendKeys("50");
		WebElement slideinpu = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/span[1]"));
		Thread.sleep(1000);
		String cssstyle = slideinpu.getAttribute("style");
		System.out.println(cssstyle);
		String substring = cssstyle.substring(cssstyle.length()-4,cssstyle.length()-2);
		System.out.println(substring);
		
		driver.findElement(By.id("j_idt106:j_idt122")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		
		WebElement inputdiv = driver.findElement(By.id("j_idt106:j_idt124_editor"));
		WebElement foundpara = inputdiv.findElement(By.tagName("div")).findElement(By.tagName("p"));
		foundpara.sendKeys("write whatever you want");
		
		
//		WebElement slideInput = driver.findElement(By.id("j_idt106:slider"));
//		slideInput.sendKeys("50");
//		WebElement slideElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/span[1]"));
//		Thread.sleep(1000);
//		String slideCss = slideElement.getAttribute("style");
//		System.out.println(slideCss);
//		String slideSub = slideCss.substring(slideCss.length()-4,slideCss.length()-2);
//		System.out.println(slideSub);
//		driver.findElement(By.id("j_idt106:j_idt122")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
//		Thread.sleep(5000);//15000ms = 15s
//		driver.quit();
//		
		Thread.sleep(15000);
		driver.quit();
		

	}

}
