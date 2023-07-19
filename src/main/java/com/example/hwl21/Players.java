package com.example.hwl21;

public interface Players {
    String getName();

    boolean run(int runLimit, String nameOfBar);

    boolean jump(int jumpLimit, String nameOfBar);
}
