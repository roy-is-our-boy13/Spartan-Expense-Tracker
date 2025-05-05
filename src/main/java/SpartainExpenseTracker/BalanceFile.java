/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpartainExpenseTracker;

import java.util.*;
import java.io.File;

/**
 *
 * @author royperlman
 */
public class BalanceFile 
{
	
	//this class just creates and adds the record to the file. nothing more

	public static void sop(Object x)
	{
		System.out.println(x);
	}

	private Formatter f;

	public void openFile() 
	{
		try 
		{
			f = new Formatter("UserProfileDataBase.txt");

		} catch (Exception e)
                {
			sop("there is an error");
		}
	}

	public void addRecord(double bal)
	{
		// add a balance record into UserProfileDataBase.txt
		f.format("%s", bal + " ");
	}

	public void closeFile() 
	{
		f.close();
	}
}
