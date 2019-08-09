/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bhatt
 */
public class UnoTest {
    
    public UnoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Uno.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Uno.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class Uno.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        int cards = 0;
        ArrayList<PopulatingDeck> deck = null;
        Uno.draw(cards, deck);
        boolean expResult = true;
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
