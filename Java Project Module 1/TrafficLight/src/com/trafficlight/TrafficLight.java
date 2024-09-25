package com.trafficlight;

public class TrafficLight {
    private enum LightState {
        RED, YELLOW, GREEN
    }

    private LightState currentState;
    private int redDuration;
    private int yellowDuration;
    private int greenDuration;

    public TrafficLight(int redDuration, int yellowDuration, int greenDuration) {
        this.redDuration = redDuration;
        this.yellowDuration = yellowDuration;
        this.greenDuration = greenDuration;
        this.currentState = LightState.RED; // Initial state
    }

    // Get the current light state
    public String getCurrentState() {
        return currentState.name();
    }

    // Transition to the next light based on the current state
    public void next() {
        switch (currentState) {
            case RED:
                currentState = LightState.GREEN;
                break;
            case GREEN:
                currentState = LightState.YELLOW;
                break;
            case YELLOW:
                currentState = LightState.RED;
                break;
        }
    }

    // Simulate the time spent in each state
    public void runCycle() {
        switch (currentState) {
            case RED:
                System.out.println("RED light for " + redDuration + " seconds.");
                break;
            case GREEN:
                System.out.println("GREEN light for " + greenDuration + " seconds.");
                break;
            case YELLOW:
                System.out.println("YELLOW light for " + yellowDuration + " seconds.");
                break;
        }
        next();
    }

    public static void main(String[] args) {
        // Example of running the traffic light for 10 cycles
        TrafficLight trafficLight = new TrafficLight(10, 3, 15);
        for (int i = 0; i < 10; i++) {
            trafficLight.runCycle();
        }
    }
}

