/**
 * @author Morgan Thornton
 */
package org.howard.edu.lsp.finalsycs363.problem;

import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author PC
 */
public class SongsDatabaseTest {
    
    public SongsDatabaseTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

 /**
     * Test of addSong method, of class SongsDatabase.
     */
    @Test
    @DisplayName("Test for addSong")
    public void testAddSong() {
        System.out.println("addSong");
        SongsDatabase instance = new SongsDatabase();
        instance.addSong("Rap", "Savage");
        instance.addSong("Rap", "Gin and Juice");
        instance.addSong("Jazz", "Always There");
        Set<String> songs = instance.getSongs("Rap");
        
        String expResult = "Rap";
        String result = instance.getGenreOfSong("Savage");
        assertEquals(expResult, result);
        
    }

  /**
     * Test of getSongs method, of class SongsDatabase.
     */
    @Test
    @DisplayName("Test for getSongs")
    public void testGetSongs() {
        System.out.println("getSongs");
        SongsDatabase instance = new SongsDatabase();
        instance.addSong("Rap", "Savage");
        instance.addSong("Rap", "Gin and Juice");
        instance.addSong("Jazz", "Always There");
        Set<String> songs = instance.getSongs("Rap");
        int expResult = 2;
        int result = songs.size();
        assertEquals(expResult, result);
        
        songs = instance.getSongs("Jazz");
        expResult = 1;
        result = songs.size();
        assertEquals(expResult, result);

    }

   /**
     * Test of getGenreOfSong method, of class SongsDatabase.
     */
    @Test
    @DisplayName("Test for getGenreOfSong")
    public void testGetGenreOfSong() {
        System.out.println("getGenreOfSong");
        SongsDatabase instance = new SongsDatabase();
        instance.addSong("Rap", "Savage");
        instance.addSong("Rap", "Gin and Juice");
        instance.addSong("Jazz", "Always There");
        
        String expResult = "Rap";
        String result = instance.getGenreOfSong("Savage");
        assertEquals(expResult, result);
        
        expResult = "Jazz";
        result = instance.getGenreOfSong("Always There");
        assertEquals(expResult, result);

    }

