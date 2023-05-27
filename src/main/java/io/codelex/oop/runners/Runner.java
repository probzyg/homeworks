package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(300, 550),
    INTERMEDIATE(240, 300),
    ADVANCED(200, 240);

    private int minimumTime;
    private int maximumTime;

    Runner(int minimumTime, int maximumTime) {
        this.minimumTime = minimumTime;
        this.maximumTime = maximumTime;
    }

    public int getMinimumTime() {
        return minimumTime;
    }

    public int getMaximumTime() {
        return maximumTime;
    }

    static Runner getFitnessLevel(int time) {
        Runner fitnessLevel = null;
        for (Runner runner : Runner.values()) {
            if (time >= runner.getMinimumTime() && time <= runner.getMaximumTime()) {
                fitnessLevel = runner;
            }
        }
        return fitnessLevel;
    }
}
