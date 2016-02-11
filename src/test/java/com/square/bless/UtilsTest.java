package com.square.bless;

import com.square.bless.domain.Order;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by benoi on 11/02/2016.
 */
public class UtilsTest {

    @Test
    public void simpleTestDistance() {
        assertEquals(Utils.distance( 1,1,5,1),4 );
        assertEquals(Utils.distance( 1,1,4,2),4 );
    }

    @Test
    public void testScore() {
        Order o1  = new Order(0,0,null);
        o1.setCompletionTime(18);
        assertEquals(Utils.computeScore(o1, 50),64);
    }
}