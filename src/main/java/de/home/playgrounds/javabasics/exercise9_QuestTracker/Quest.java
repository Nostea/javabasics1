package de.home.playgrounds.javabasics.exercise9_QuestTracker;

public abstract class Quest {
    private String description;
    private int targetValue;
    private int currentValue;
    private boolean isComplete;

    public Quest(String description, int targetValue) {
        this.description = description;
        this.targetValue = targetValue;
        this.currentValue = 0;
        this.isComplete = false;
    }

    public double getProgressPercentage(){
        double progress = this.currentValue / this.targetValue;
        return progress;
    }

    public boolean setCompletedQuest() {
        return this.isComplete = true;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public void updateProgress(int amount) {
        setCurrentValue(currentValue + amount);
    }



}
