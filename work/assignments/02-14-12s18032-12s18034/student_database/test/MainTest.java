/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test; 
import static org.junit.Assert.*;

/**
 *
 * @author 14-12s18032 SARAH H.M SIAHAAN
 * @author 14-12s18034 INGGRID ARITONANG
 */
public class MainTest {
    
    public MainTest() {
    }
    
    
    @Test
    public void testAdd() { 
       Main.reset();
        
    Main.add("12S17067", "Fradina"); 
    assertEquals(1, Main.count());   
    
    Main.add("12S18001", "Cindy"); 
    assertEquals(2, Main.count());
    
    Main.add("12S18002", "Wiranda"); 
    assertEquals(3, Main.count());
    
    Main.add("12S18003", "Citra"); 
    assertEquals(4, Main.count());
    
    Main.add("12S18004", "Rosalia");
    assertEquals(5, Main.count());
    
    }
    
    @Test
    public void testFind() { 
    String result;
    Main.reset();
    
    Main.add("12S17067", "Fradina"); 
    Main.add("12S18001", "Cindy"); 
    Main.add("12S18002", "Wiranda"); 
    Main.add("12S18003", "Citra"); 
    Main.add("12S18004", "Rosalia");
    
    result = Main.find("12S17067"); 
    assertEquals("12S17067 Fradina", result); 
    result = Main.find("12S18003"); 
    assertEquals("12S18003 Citra", result); 
    result = Main.find("12S18006"); 
    assertEquals("", result);
    }
    
    @Test 
    public void testCountNoData() { 
        Main.reset(); 
        assertEquals(0, Main.count()); 
    }
    
    @Test 
    public void testCountSomeData() { 
        Main.reset();
        
        Main.add("12S17067", "Fradina"); 
        Main.add("12S18001", "Cindy");
        Main.add("12S18002", "Wiranda"); 
        Main.add("12S18003", "Citra");
        Main.add("12S18004", "Rosalia");
     
        assertEquals(5, Main.count());
    }
     
    @Test
    public void testReset() {
        System.out.println("reset");
        Main.reset();
        assertEquals(0, Main.count()); 
        Main.add("12S17067", "Fradina");
        Main.add("12S18001", "Cindy"); 
        Main.reset(); 
        assertEquals(0, Main.count());
        Main.add("12S18002", "Wiranda"); 
        Main.add("12S18003", "Citra"); 
        Main.add("12S18004", "Rosalia"); 
        Main.reset(); 
        assertEquals(0, Main.count());
        
        // TODO review the generated test code and remove the default call to fail.
       
        
        
    }
   
}
