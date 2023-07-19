package com.example.hwl21;

public class RunTrack implements Barriers {
    private int length;
    private String nameOfBar;

    public RunTrack(int length, String nameOfBar) {
        this.length = length;
        this.nameOfBar = nameOfBar;
    }

    public boolean success(Players player, Barriers barrier) {
        return player.run(length, nameOfBar);
    }

}
