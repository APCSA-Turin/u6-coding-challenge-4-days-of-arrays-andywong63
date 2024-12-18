package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int runLeft;
        private int restLeft;
        private int distanceTraveled;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.runLeft = runDuration;
            this.restDuration = restDuration;
            this.restLeft = restDuration;
        }

        public String getName() {
            return name;
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }

        public void simulateSecond(){ //this method is required but not tested
            if (runLeft > 0) {
                distanceTraveled += speed;
                runLeft--;
            } else if (restLeft > 0) {
                restLeft--;
            } else {
                runLeft = runDuration;
                restLeft = restDuration;
            }
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        String winner = reindeers[0].getName();
        int winnerDistance = 0;
        for (int i = 0; i < reindeers.length; i++) {
            for (int j = 0; j < time; j++) {
                reindeers[i].simulateSecond();
            }
            if (reindeers[i].getDistanceTraveled() > winnerDistance) {
                winner = reindeers[i].getName();
                winnerDistance = reindeers[i].getDistanceTraveled();
            }
        }
        return winner;
    }

    
    public static void main(String[] args) { // for testing purposed
        Reindeer[] reindeers = {
            new Day4.Reindeer("Dasher", 100, 5, 2),
            new Day4.Reindeer("Dancer", 120, 4, 3),
            new Day4.Reindeer("Prancer", 110, 6, 1)
        };

        System.out.println(Day4.simulateRace(10, reindeers));
    }

 
}



