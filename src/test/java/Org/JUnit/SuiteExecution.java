package Org.JUnit;


import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Sample1.class,Sample2.class, Sample3.class })
public class SuiteExecution {
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(SuiteExecution.class);
		System.out.println(r.getRunCount());
			
		System.out.println(r.getIgnoreCount());
		
		List<Failure> failures = r.getFailures();
		for (int i = 0; i < failures.size(); i++) {
			 
			System.out.println(failures.get(i));
		}
		
	}

}
