package io.codelex.enums.practice;

public enum CardinalPoints {
    NORTH("North", "up"),
    SOUTH("South","down"),
    EAST("East", "right"),
    WEST("West", "left");

    private final String direction;
    private final String wayToGo;

    CardinalPoints(String direction, String wayToGo){
        this.direction = direction;
        this.wayToGo = wayToGo;
    }

    public String getDirection() {
        return direction;
    }

    public String getWayToGo() {
        return wayToGo;
    }
}
