package fr.dauphine.ja.huestelle.td00;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple PrimeCollection.
 */
public class PrimeCollectionTest 
    extends TestCase
{
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }
    public boolean test0IsNotPrime() {
    	if(PrimeCollection.isPrime(0)==false) {
    		return true;
    	}
    	return false;
    }
    public boolean testTwoIsPrime(){
    	if(PrimeCollection.isPrime(2)==false) {
    		return false;
    	}
    	return true;
    }
    public boolean  test9IsNotPrime(){
    	if(PrimeCollection.isPrime(9)==false) {
    		return true;
    	}
    	return false;
    }
    /**
     * Rigourous Test :-)
     */
    public void testPrimeCollection()
    {
        assertTrue(test0IsNotPrime());
        assertTrue(testTwoIsPrime());
        assertTrue(test9IsNotPrime());
    }
}