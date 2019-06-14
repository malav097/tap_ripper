package com.mygdx.helpers;

import com.badlogic.gdx.InputProcessor;
import com.mygdx.gameobjects.Surfer;

public class InputHandler implements InputProcessor {

    private Surfer mysurfer;

    // Ask for a reference to the surfer when InputHandler is created.
    public InputHandler(Surfer surfer) {
        // mysurfer now represents the gameWorld's bird.
        mysurfer = surfer;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        mysurfer.onClick();
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
