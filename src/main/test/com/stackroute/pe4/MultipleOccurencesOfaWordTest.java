package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.MultipleOccurencesOfaWord;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurencesOfaWordTest {
    MultipleOccurencesOfaWord object;

    @Before
    public void setUp() throws Exception {
        object=new MultipleOccurencesOfaWord();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void givenStringShouldreturnMultipleoccurrence(){
        String result=object.check("se","She sells seashells by the seashore");
        String expected="found: 4 - 6found: 10 - 12found: 27 - 29";
        assertEquals(expected,result);
    }
    @Test
    public void givenStringShouldreturnMultipleoccurrences(){
        String result=object.check("se","She sells seasheLLs by the seashore");
        String expected="found: 4 - 6found: 10 - 12found: 27 - 29";
        assertEquals(expected,result);
    }

}