package com.mygdx.gameobjects;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;



public class Surfer {

    private Rectangle rect = new Rectangle(70, 100, 17, 12);

    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private float rotation; // For handling surfer rotation
    private int width;
    private int height;



    public Surfer(float x, float y, int width, int height) {
        this.width = width;
        this.height = height;
        position = new Vector2(x, y);
        velocity = new Vector2(0, 0);
        acceleration = new Vector2(-100, 0);
    }

    public void update(float delta) {

        velocity.add(acceleration.cpy().scl(delta));

        if (velocity.x < -100) {
            velocity.x = -100;
        }

        position.add(velocity.cpy().scl(delta));

    }

    public void onClick() {
        velocity.x = 60;
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


}


