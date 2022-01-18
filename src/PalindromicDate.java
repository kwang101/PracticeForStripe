import java.io.*;

public class PalindromicDate {
	
	public PalindromicDate() {
		// constructor
	}
	
	/**
	Every 4 years, when Feb has 29 days intead of 28
    **/
	private boolean IsLeapYear(int y)
	{
		return y % 4 == 0 && (y % 100 != 0 || year % 400 == 0)
	}
	
	// TODO: validating func using hashmap to map months -> days
}