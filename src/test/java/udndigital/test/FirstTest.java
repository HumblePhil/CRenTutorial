package udndigital.test;


import java.util.ArrayList;

import org.junit.Test;

import udndigital.A;
import junit.framework.TestCase;

public class FirstTest extends TestCase {
	
	//@Test
    public void testGetNumber() {
    	A a = new A();
        assertEquals(5, a.getNumber());
    }
    
    public void testGetName() {
    	A a = new A();
    	assertEquals("Tom", a.getName());
    }
}
