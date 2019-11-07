package com.mygdx.gameobjects;
import com.badlogic.gdx.math.Vector2;
import java.util.Random;
import com.badlogic.gdx.math.Rectangle;


public class Columns {

    private Vector2 position;
    private Vector2 velocity;
    private Vector2 position2;
    private int width;
    private int height;
    private Vector2 acceleration;
    private float gameheight1;
    private float gamewith1;
    private int vel11;
    private int vel22;
    private int randomnumber;
    private Rectangle bounds;
    private Rectangle bounds2;



    public Columns(float x, float y, int width, int height, float gameheight, float gamewith, int vel1, int vel2) {
        this.width = width;
        this.height = height;
        position = new Vector2(x, y);
        position2 = new Vector2(x - 80, y);
        velocity = new Vector2(60, 0);
        gameheight1 = gameheight -80;
        gamewith1 = gamewith -5;
        bounds = new Rectangle(position.x, position.y, this.width, this.height );
        bounds2 = new Rectangle(position2.x, position2.y,this.width, this.height);
        vel11 = vel1;
        vel22 = vel2;
    }

    public void update(float delta) {

        Random r = new Random();
        randomnumber = r.nextInt(80)+ 1;
        acceleration = new Vector2(-randomnumber, 0);

        velocity.add(acceleration.cpy().scl(delta));


        if (velocity.x < vel11) {
            velocity.x = vel22;
        }
        if (position2.x != position.x - 80) {
            position2.x = position.x - 80;
        }
        if (position.y < 0) {
            position.y = 0;
        }
//        if (position.x < 20) {
//            position.x = 20;
//        }

        if (position.y > gameheight1) {
            position.y = gameheight1;
        }
        if (position.x > gamewith1) {
            position.x = gamewith1;
        }


        position.add(velocity.cpy().scl(delta));
        position2.add(velocity.cpy().scl(delta));
        bounds.setPosition(position.x , position.y);
        bounds2.setPosition(position2.x, position2.y);
    }


    public boolean collision(Rectangle surfer){
        return surfer.overlaps(bounds) || surfer.overlaps(bounds2);

    }

    public void onRestart(float x) {
        position.x = x;
        position2.x = x - 80;

    }



    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public float getX2() {
        return position2.x;
    }

    public float getY2() {
        return position2.y;
    }


    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }




}



