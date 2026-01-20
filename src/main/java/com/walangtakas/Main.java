package com.walangtakas;

import com.walangtakas.core.EngineManager;
import com.walangtakas.core.WindowManager;
import com.walangtakas.core.utils.Consts;
import com.walangtakas.test.TestGame;
import lombok.Getter;

public class Main {
    @Getter
    private static WindowManager window;
    @Getter
    private static TestGame game;

    public static void main(String[] args) {
        window = new WindowManager(Consts.TITLE, 1600, 900, false);
        game = new TestGame();
        EngineManager engine = new EngineManager();

        try {
            engine.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
