package unit_tesing_5_9_2023;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

public class NewTest {
  @Test(groups = "groupA")
  public void f() {
	  System.out.println("Running methods 1");
  }
  
  @Test(groups = "groupA")
  public void f1() {
	  System.out.println("Running methods 2");
  }
  
  @Test(dependsOnGroups = "groupA")
  public void f2() {
	  System.out.println("Depends in methods");
  }
}
