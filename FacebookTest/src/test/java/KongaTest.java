
// Visit the URL konga
//Sign in to Konga successfully
//From the categories,click on the "Computer and accessories"
//Click on the Laptop SubCategory
//Click on the Apple MacBooks
//Add an item to the cart
//Select Address
//Continue to make payment
//Select a Card Payment Method
//Input Invalid Card details
//Print Out the error message.Invalid card number
//Close the iFrame that displays the input card Modal

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



//I want to Automate the ordering flow of Konga

   public class KongaTest {
    private ChromeDriver driver;

    @BeforeTest
    public void start() throws InterruptedException {
        //1.locate where the chrome driver is
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ES\\Downloads\\Bughunter-About-me\\FacebookTest\\resources\\chromedriver.exe");
        //2.Open chrome browser
        driver = new ChromeDriver();
        //3.Input Konga page URL
        driver.get("https://www.konga.com/");
        Thread.sleep(5000);
        //4.Maximize the page
        driver.manage().window().maximize();
        //5.Click on the sign_in button to Open the sign_in page
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(5000);
    }
    @Test (priority = 0)
    public void positiveSignup() throws InterruptedException{
        //6.Enter Correct Email Address
        driver.findElement(By.id("username")).sendKeys("orimoladeo3@gmail.com");
        //7. Enter correct password
        String user_password = "user_password";
        driver.findElement(By.id("password")).sendKeys("Upsy1515");
        //8.Click on Login button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 1)
    public void selectItem() throws InterruptedException   {
             //9.From the categories,click on the "Computer and accessories"
             driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]")).click();
             Thread.sleep(10000);
             //10. Click on the Laptop SubCategory
             driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li[2]/a")).click();
             Thread.sleep(30000);
             //11.Click on the Apple MacBooks
             driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li[4]/a/ul/li[1]/a/label")).click();
             Thread.sleep(10000);
             //12. Add an item to the Cart
             driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/section/section/section/ul/li[25]/div/div/div[2]/form/div[3]/button")).click();
             Thread.sleep(30000);
             //13.Checkout
             driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/a[2]/span[1]")).click();
             Thread.sleep(10000);
             //14.My cart
             driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/section/section/aside/div[3]/div/div[2]/button")).click();
             Thread.sleep(30000);
         }
         @Test(priority = 2)
                 public void adddress() throws InterruptedException{
             //15.Click on change
             driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[1]/div[2]/div/button")).click();
             Thread.sleep(20000);
             //16. Select Address
             driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/button")).click();
             Thread.sleep(10000);
             //17.Check Address Box
             driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/div[2]/div/form/button")).click();
             Thread.sleep(10000);
             //18. Click on Use this Address
             driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[3]/div/div/div/a")).click();
             Thread.sleep(10000);
             //19.Click Pay Now Box
             driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/span/input")).click();
             Thread.sleep(10000);
             //23.Click on Continue to Make Payment
             driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[3]/div[2]/div/button")).click();
             Thread.sleep(50000);
         }

         @Test(priority = 3)
          public void selectCardMethod() throws InterruptedException{
           //21 select a card payment method
           //21.1 change from default to iframe
           WebElement paymethod = driver.findElement(By.tagName("iframe"));
           driver.switchTo().frame("kpg-frame-component");
           Thread.sleep(7000);
           System.out.println("Payment Method");
           //22 select card payment method
           WebElement cardpayment = driver.findElement(By.className("Card"));
           cardpayment.click();
           System.out.println("Select card method");
           Thread.sleep(5000);
           //24.Click Card
             driver.findElement(By.xpath("//*[@id=\"channel-template\"]/div[2]/div/div[3]/button")).click();
             Thread.sleep(10000);
             //25.Click on card number field
             driver.findElement(By.xpath("//*[@id=\"card-number\"]")).click();
             Thread.sleep(10000);
             //26.Input Invalid Card Number
             driver.findElement(By.id("input-card-no-container")).sendKeys("keysToSend.1515151515151");
             Thread.sleep(10000);
             //27.Click on Date field
             driver.findElement(By.xpath("//*[@id=\"expiry\"]")).click();
             Thread.sleep(10000);
             //28.Input Invalid Date
             driver.findElement(By.id("expiry")).sendKeys("keysToSend.06/24");
             Thread.sleep(10000);
             //29.click on CVV field
             driver.findElement(By.xpath("//*[@id=\"cvv\"]")).click();
             Thread.sleep(10000);
             //30.Input Invalid CVV
             driver.findElement(By.id("//*[@id=")).sendKeys("keysToSend.155");
             Thread.sleep(10000);
             //31.Click on Card pin field
             driver.findElement(By.xpath("//*[@id=\"card-pin-new\"]")).click();
             Thread.sleep(10000);
             //32.Input Invalid Card Pin
             driver.findElement(By.id("card-pin-new")).sendKeys("keysToSend.1515");
             Thread.sleep(10000);
         }

              @Test(priority = 4)
                 public void paymentOption() throws InterruptedException{
             //33.Click on Pay Now
             driver.findElement(By.xpath("//*[@id=\"validateCardForm\"]")).click();
             Thread.sleep(10000);
             //34.Print out the Error Message.Invalid Card Number
             driver.findElement(By.id("card-number_unhappy"));
             Thread.sleep(10000);
             //System.out.println(error.getText("Invalid card number"));
             Thread.sleep(5000);
             //35.Close the iFrame that displays the input card Modal
             driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[1]/aside")).click();
             Thread.sleep(10000);
         }
             @AfterTest
             public void quitBrowser(){
             //36.Close Browser
             driver.quit();




    }
}


