package com.it.tests;
import com.it.App;
import com.it.pages.DashBoardPage;
import com.it.pages.LoginPage;
import com.it.users.User;
import com.it.users.UserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class MyTest extends BaseTest{
//    private static int count;
    @Test
    public void myTest() throws InterruptedException, MalformedURLException {
        //  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
/*        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.i.ua");
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.i.ua");
        driver.quit();*/
        // System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

/*        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();*/
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*        driver.manage().window().maximize();
            driver.get("https://www.i.ua/");*/
        final List<User> randomUsers = UserFactory.getRandomUsers(200);
        randomUsers.forEach(System.out::println);
        app.login.login(validUser);
        Assert.assertEquals(app.board.getLbUserEmail(), validUser.email);


       /* driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys("ittest2");
       driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys("337774a");
        //driver.findElement(By.name("pass")).sendKeys(Keys.ENTER); // click on Enter button
        driver.findElement(By.xpath("//input[@tabindex='5']")).click();

        */

       /* final WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));//ожидание в теч. 10 сек
       webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='sn_menu_title']"))));
*/
/*       driver.findElement(By.xpath("//span[@class='sn_menu_title']")).getText();
        String text = driver.findElement(By.xpath("//span[@class='sn_menu_title']")).getText();
        Thread.sleep(2000);
        Assert.assertEquals(text, "ittest2@i.ua");*/
        //driver.quit();



    //    System.out.println(driver.getWindowHandle());
    //    System.out.println(driver.getWindowHandles());
       // driver.switchTo().window() //переключение между окнами через передаачу индентификатора

//        Thread.sleep(1000);
//        System.out.println(driver.manage().window().getPosition().getX());
//        System.out.println(driver.manage().window().getPosition().getY());
//        System.out.println(driver.manage().window().getSize().getHeight());
//        System.out.println(driver.manage().window().getSize().getWidth());
//        driver.manage().window().setPosition(new Point(30,30));
//
//        System.out.println(driver.manage().window().getPosition().getX());
//        System.out.println(driver.manage().window().getPosition().getY());
//        driver.manage().window().setSize(new Dimension(1000, 1000));
//        System.out.println(driver.manage().window().getSize().getHeight());
//        System.out.println(driver.manage().window().getSize().getWidth());
//        driver.manage().window().maximize();
//        System.out.println(driver.manage().getCookies());
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout();
//        driver.manage().timeouts().setScriptTimeout();
//        driver.findElement(By.);
//        driver.findElements();

//        driver.get("https://mvnrepository.com/");
//        Thread.sleep(1000);
//        driver.get("https://github.com/");
//        Thread.sleep(1000);
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
//        driver.navigate().back();
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//        driver.navigate().to("https://korrespondent.net/");
       // Thread.sleep(2000);



        //    driver.mdranage().window().maximize();


//        driver.get("https://www.i.ua/");
//        Thread.sleep(2000);
//        takeSnapShot(driver);
//        Assert.assertEquals(driver.getCurrentUrl(), "https://www.i.ua/");
     //   driver.close();//закрывает вкладку
      //  Thread.sleep(2000);
       // driver.quit();//закрывает браузер
    }

/*        public void takeSnapShot (WebDriver driver){

            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshot, new File("build//screenshot//screen" + count + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Path content = Paths.get("build//screenshot//screen" + count + ".png");
            try (InputStream is = Files.newInputStream(content)) {
                Allure.addAttachment("My attachment", is);
            } catch (IOException e) {
                //NOP
            }
            count++;
        }*/

    }

