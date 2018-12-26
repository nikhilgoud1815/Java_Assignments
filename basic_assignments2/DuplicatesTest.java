package junitForPalindrome;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class DuplicatesTest {
private Duplicates duplicates;
@Before
public void DuplicatesTestOne()
{
	duplicates=new Duplicates();
	
}
@Test
public void DuplicatesTestTwo(){
	assertEquals("abc",duplicates.removeDuplicate("abcbcb"));
}
@Test
public void DuplicatesTestThree(){
	assertEquals("javforschl",duplicates.removeDuplicate("javaforschool"));
}
@Test
public void DuplicatesTestFour(){
	assertEquals("Misp",duplicates.removeDuplicate("Mississippi"));
}
}
