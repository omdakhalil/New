package class04;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class anootations02 {
    @BeforeClass
    public void beforeClass(){
        System.out.println("i am before class");
    }

    @BeforeMethod
    public void before() {
        System.out.println("i am before Method");
    }

    @AfterMethod
    public void after() {
        System.out.println("i am after Method");
    }

    @Test
    public void TestA() {
        System.out.println("i am test A");
    }

    @Test
    public void TestB() {
        System.out.println("i am test B");
    }
}
