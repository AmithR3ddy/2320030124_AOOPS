package com.trafficlight;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TrafficLightTest {

    private TrafficLight trafficLight;

    @Before
    public void setup() {
        // Set up the traffic light with the desired timing
        trafficLight = new TrafficLight(10, 3, 15);
    }

    @Test
    public void testInitialLightState() {
        // Test initial state
        assertEquals("Initial state should be RED.", "RED", trafficLight.getCurrentState());
    }

    @Test
    public void testTransitionFromRedToGreen() {
        trafficLight.next();
        assertEquals("State should transition to GREEN from RED.", "GREEN", trafficLight.getCurrentState());
    }

    @Test
    public void testTransitionFromGreenToYellow() {
        trafficLight.next(); // RED -> GREEN
        trafficLight.next(); // GREEN -> YELLOW
        assertEquals("State should transition to YELLOW from GREEN.", "YELLOW", trafficLight.getCurrentState());
    }

    @Test
    public void testTransitionFromYellowToRed() {
        trafficLight.next(); // RED -> GREEN
        trafficLight.next(); // GREEN -> YELLOW
        trafficLight.next(); // YELLOW -> RED
        assertEquals("State should transition to RED from YELLOW.", "RED", trafficLight.getCurrentState());
    }

    @Test
    public void testFullCycle() {
        // Test full cycle: RED -> GREEN -> YELLOW -> RED
        trafficLight.next(); // RED -> GREEN
        trafficLight.next(); // GREEN -> YELLOW
        trafficLight.next(); // YELLOW -> RED
        assertEquals("After a full cycle, the state should be RED.", "RED", trafficLight.getCurrentState());
    }
}