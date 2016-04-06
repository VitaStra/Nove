package io.selendroid.mainTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import java.util.ArrayList;
import java.util.List;
import org.junit.runner.notification.Failure;



import io.selendroid.demo.*;
import io.selendroid.demo.mobileweb.*;
import io.selendroid.demo.nativeui.*;
import io.selendroid.demo.webui.*;
import org.junit.internal.TextListener;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class mainTest {

	public static void main(String[] args)
	{
		    Class<?> [] classesArray = {
		    	io.selendroid.demo.SelendroidIntegrationTest.class,
		    	io.selendroid.demo.mobileweb.MobileWebTest.class,
		        //io.selendroid.demo.SelendroidIntegrationTest.class,
		        //io.selendroid.demo.webui.EmployeeDirectoryTest.class
		    };
		    //JUnitCore.runClasses(classesArray);
		    //JUnitCore.main("io.selendroid.demo.SelendroidIntegrationTest");
		    Result junit = JUnitCore.runClasses(classesArray);
		    //junit.addListener(new TextListener(System.out));
		    //JUnitCore.runClasses(classesArray);
		    for (Failure failure : junit.getFailures()) {
		         System.out.println(failure.toString());
		      }
		      System.out.println(junit.wasSuccessful());
		}

		    //JUnitCore.main("io.selendroid.demo.mobileweb.MobileWebTest");
		    

    }

	
	//@Test
	//public static void main(String[] args) throws Exception { 
		//Result result = junit.runClasses("io.selendroid.demo.SelendroidIntegrationTest");
		//org.junit.runner.JUnitCore.main("io.selendroid.demo.SelendroidIntegrationTest");
		//org.junit.runner.JUnitCore.main("io.selendroid.demo.mobileWeb.MobileWebTest");
	//}


