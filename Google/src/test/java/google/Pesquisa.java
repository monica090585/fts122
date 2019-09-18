package google;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Pesquisa {
	WebDriver driver;
	String url;
	
	@Before
	public void Iniciar() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monica\\eclipse-workspace\\Google\\src\\test\\resources\\drivers\\chrome\\76\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "https://www.google.com.br";
		
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}
	@After
	public void Finalizar() {
		driver.quit();
	}
	
	@Given("^que acesso o Google$")
	public void que_acesso_o_Google() throws Throwable {
	    driver.get(url);
	}

	@When("^digito \"([^\"]*)\" e aperto Enter$")
	public void digito_e_aperto_Enter(String termo) throws Throwable {
	   /*
		driver.findElement(By.name("q")).clear();
	    driver.findElement(By.name("q")).sendKeys("chocolate");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   */
		
	    WebElement txtConsulta = driver.findElement(By.name("q"));
	    	txtConsulta.clear();
	    	txtConsulta.sendKeys(termo);
	    	txtConsulta.sendKeys(Keys.ENTER);
	}

	@Then("^exibe uma pagina com links e o titulo \"([^\"]*)\"$")
	public void exibe_uma_pagina_com_links_e_o_titulo(String resultado) throws Throwable {
	   assertEquals(resultado,driver.getTitle());
	}
}
