import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class FirstTest {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test method was started");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test method was started");
    }

        @Test
        public void checkSome() {
            System.out.println("I am the test method");
        }

        @Test(description = "Проверить что-то")
        public void checkAnybody(){
            System.out.println("I am the test method");
            }
        }


