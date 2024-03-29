package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

import javax.xml.bind.ValidationEventLocator;

public class surfer {

    private static final int WAVEFWRD = -15;
    private Vector3 position;
    private Vector3 velocity;
    private Texture surfer;

    public surfer(int x, int y){
        position = new Vector3(x, y ,0);
        velocity = new Vector3(0, 0, 0);
        surfer = new Texture("surfer.png");
    }

    public void update(float dt){
        velocity.add(WAVEFWRD, 0, 0);
        velocity.scl(dt);
        position.add(velocity.x, 0, 0);

        velocity.scl(1/dt);
    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return surfer;
    }

    public void jump(){
        velocity.x = 250;


    }
}
