package SpartainExpenseTracker;

import java.util.*;
import java.io.File;

public class UserFile 
{

	public static void sop(Object x) 
        {
		System.out.println(x);
	}

	private Formatter f;

	public void openFile() 
        {
		try
                {
			f = new Formatter("UserDB.txt");

		} catch (Exception e) 
                {
			sop("there is an error");
		}
	}

	public void addRecords(long iD, String fName, String lName) 
        {
		// add ID, fName, lName
		f.format("%s%s%s", iD + " ", fName + " ", lName + " ");
	}

	public void closeFile() 
        {
		f.close();
	}
}
