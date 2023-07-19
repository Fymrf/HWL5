package com.example.hwl21;

public class Wall implements Barriers {
    private int height;
    private String nameOfBar;

    public Wall(int height, String nameOfBar) {
        this.height = height;
        this.nameOfBar = nameOfBar;
    }

    public boolean success(Players player, Barriers barrier) {
        return player.jump(height, nameOfBar);
    }
}
