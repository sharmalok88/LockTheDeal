package Assertions_pkg;

import org.testng.Assert;

public class Assertion_Class {

	public static void Assert_String_Compare(String actual,String expected)
	{
		if(actual.equals(expected))
		{
			System.out.println("Both Strings are compared : Assertion pass successfully");
		}
		else
		{
			System.out.println("Both Strings are not alike : Assertion failed");
		}
	}
	
	public static Boolean Assert_String_Compare_bool(String actual,String expected)
	{
		if(actual.equals(expected))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
}
