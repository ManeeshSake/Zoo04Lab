package edu.nwmissouri.zoo04lab;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Test Walrus using JUnit5
 *
 * @Rehaman_Naguru_Abdur
 */
public class WalrusTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public WalrusTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test speak method, of class Walrus.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm walrus, I growls, taps and make bell-like sounds below water.";
        var walrus = new Walrus("Wal");
        walrus.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class Walrus.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "When I move, I walk, walk, walk.";
        var walrus = new Walrus("Allie");
        walrus.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function walrusAddition()
     *
     * @throws Exception
     */
    @Test
    public void testWalrusAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var walrus = new Walrus("Wal");
        double actual = Walrus.getWalrusAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

}
