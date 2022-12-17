package com.mary;

import java.util.HashSet;
import java.util.Set;
import java.io.*;
// import org.apache.commons.launcher.Launcher;
import org.junit.Test;
// import org.testng.Assert;
// import org.testng.annotations.Test;


/* If don't add static, the task compileTestJava will fail
 * Cannot find symbol: class assertEquals; location: class org.junit Assert
 * symbol: method assertEquals(int,int); location: class com.mary.GradleTutorialTest
 */
import static org.junit.Assert.assertEquals;
// import static org.testng.Assert.assertEquals;

/* have to add it separtately as a dependency
 * for gradle to download and include on the java class path
 * when our test is compiled and run
 */
public class GradleTutorialTest {

    // @Test
    // public void verifyNoExceptionThrown() {
    //     GradleTutorial.main(new String[]{});
    // }
    

    @Test
    public void testAdd() {
        assertEquals(42, Integer.sum(19, 23));
    }

    @Test
    public void testAdd2() {
        assertEquals(41, Integer.sum(19, 23));
    }

    @Test 
    public void flakyTest1() {
        System.out.println("***---***");
        // System.out.println(System.getProperty("sun.boot.class.path")+"\n");
        // System.out.println(Launcher.getBootstrapClassPath().getURLs());
        // System.out.println(System.getProperty("java.class.path"));
        Set<String> s = new HashSet<>();
        s.add("1");
        s.add("2");
        String s_s = s.toString();
        System.out.println(s_s);
        String s_string = s.toString();
        System.out.println(s_string);
        assertEquals("[1, 2]", s_string);
    }

    @Test
    public void flakyTest2() {
        Set<String> s1 = new HashSet<String>();
        s1.add("monday");
        s1.add("Chicago");
        s1.add("Plato");
        int i=0;
        System.out.println(s1.toString());
        for (String ele : s1) {
            if(i==0) assertEquals("Chicago", ele);
            else if(i==1) assertEquals("Plato", ele);
            else if(i==2) assertEquals("monday", ele);
            i++;
        }
    }
}