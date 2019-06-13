package com.mygdx.gameworld;
import com.badlogic.gdx.Gdx;
import com.mygdx.gameobjects.Surfer;


public class GameWorld {

    private Surfer surfer;


    public GameWorld(int midPointY) {
        surfer = new Surfer(33 , midPointY - 5, 17, 12);
    }

    public void update(float delta) {
        Gdx.app.log("GameWorld", "update");
        surfer.update(delta);


    }
    public Surfer getsurfer() {
        return surfer;
    }

}
