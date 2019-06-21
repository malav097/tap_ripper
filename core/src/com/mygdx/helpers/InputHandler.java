package com.mygdx.helpers;
import com.mygdx.screens.GameScreen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.mygdx.gameobjects.Surfer;

public class InputHandler implements InputProcessor {

    private Surfer mysurfer;
    private int midpoint;
    private int vel;


    // Ask for a reference to the surfer when InputHandler is created.
    public InputHandler(Surfer surfer,int midPointY) {
        // mysurfer now represents the gameWorld's surfer.
        mysurfer = surfer;
        midpoint = midPointY;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {



        if (screenY > midpoint) {
            vel = -15;

        } else {
            vel = 15;
        }



        mysurfer.onClick(vel);
        Gdx.app.log("touch","X = " + screenX + " Y = " + screenY);
        return true; // Return true to say we handled the touch.

    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }

}
