package com.capgemini;

import java.io.File;

public class FileExistsOrNot {

	File file = new File("C://Users/anikhil/workspace/Java_Assignment/src/ArmstrongNumber.java");
	public boolean checkFile(){
    if (file.exists())
    {
      return true;
    }
    else{
    	return false;
    }
}
}