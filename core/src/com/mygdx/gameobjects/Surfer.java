package com.mygdx.gameobjects;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Circle;




public class Surfer {

    //private Rectangle rect = new Rectangle(70, 100, 17, 12);

    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private float rotation; // For handling surfer rotation
    private int width;
    private int height;
    private float gameheight1;
    private float gamewith1;
    private Rectangle bounds;



    public Surfer(float x, float y, int width, int height, float gameheight, float gamewith) {
        this.width = width;
        this.height = height;

        position = new Vector2(x, y);
        velocity = new Vector2(0, 0);
        acceleration = new Vector2(-100, 0);
        gameheight1 = gameheight -80;
        gamewith1 = gamewith -5;
        bounds = new Rectangle();
    }

    public void update(float delta) {

        velocity.add(acceleration.cpy().scl(delta));

        if (velocity.x < -100) {
            velocity.x = -100;
        }
        if (position.y < 0) {
            position.y = 0;
        }
        if (position.x < 0) {
            position.x = 0;
        }
        if (position.y > gameheight1) {
            position.y = gameheight1;
        }
        if (position.x > gamewith1) {
            position.x = gamewith1;
        }
        position.add(velocity.cpy().scl(delta));

        bounds.set(position.x , position.y , this.width, this.height);

    }

    public void onClick(int vel) {
        velocity.x = 60;
        velocity.y = vel;


    }

    public void onRestart(float y) {
        position.y = y;
        position.x = 33;
        acceleration.x = -100;


    }







    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getRotation() {
        return rotation;
    }
    public Rectangle getBoundingCircle() {
        return bounds;
    }

}


