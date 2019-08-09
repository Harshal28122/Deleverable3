/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class PopulatingDeckTest {
    
    public PopulatingDeckTest() {
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
     * Test of getFace method, of class PopulatingDeck.
     */
    @Test
    public void testGetFaceGood() {
        System.out.println("getFace");
        PopulatingDeck instance = new PopulatingDeck();
        String expResult = "true";
        String result = instance.getFace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        @Test
    public void testGetFaceBad() {
        System.out.println("getFace");
        PopulatingDeck instance = new PopulatingDeck();
        String expResult = "false";
        String result = instance.getFace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        @Test
    public void testGetFaceBoundary() {
        System.out.println("getFace");
        PopulatingDeck instance = new PopulatingDeck();
        String expResult = "true";
        String result = instance.getFace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of canPlace method, of class PopulatingDeck.
     */
    @Test
    public void testCanPlaceGood() {
        System.out.println("canPlace");
        PopulatingDeck o = null;
        String c = "0";
        PopulatingDeck instance = new PopulatingDeck();
        boolean expResult = true;
        boolean result = instance.canPlace(o, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCanPlaceBad() {
        System.out.println("canPlace");
        PopulatingDeck o = null;
        String c = "0";
        PopulatingDeck instance = new PopulatingDeck();
        boolean expResult = false;
        boolean result = instance.canPlace(o, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCanPlaceBoundary() {
        System.out.println("canPlace");
        PopulatingDeck o = null;
        String c = "0";
        PopulatingDeck instance = new PopulatingDeck();
        boolean expResult = true;
        boolean result = instance.canPlace(o, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
