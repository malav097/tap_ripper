//package com.mygdx.gameobjects;
//import com.badlogic.gdx.math.Vector2;
//
//public class Columns2 {
//
//    private Vector2 position;
//    private Vector2 velocity;
//    private int width;
//    private int height;
//    private boolean isScrolledLeft;
//
//    private float rotation; // For handling surfer rotation
//    private Vector2 acceleration;
//    private float gameheight1;
//    private float gamewith1;
//    private int vel11;
//    private int vel22;
//
//
//
//    public Columns2(float x, float y, int width, int height, float gameheight, float gamewith, int aceleration, int vel1, int vel2) {
//        this.width = width;
//        this.height = height;
//        position = new Vector2(x, y);
//        velocity = new Vector2(0, 0);
//        acceleration = new Vector2(aceleration, 0);
//        gameheight1 = gameheight -80;
//        gamewith1 = gamewith -5;
//        vel11 = vel1;
//        vel22 = vel2;
//    }
//
//    public void update(float delta) {
//
//        velocity.add(acceleration.cpy().scl(delta));
//
//        if (velocity.x > vel11) {
//            velocity.x = vel22;
//        }
//        if (position.y < 0) {
//            position.y = 0;
//        }
//        if (position.x < 0) {
//            position.x = 0;
//        }
//        if (position.y > gameheight1) {
//            position.y = gameheight1;
//        }
//        if (position.x > gamewith1) {
//            position.x = gamewith1;
//        }
//
//
//        position.add(velocity.cpy().scl(delta));
//
//    }
//
//
//    public float getX() {
//        return position.x;
//    }
//
//    public float getY() {
//        return position.y;
//    }
//
//    public float getWidth() {
//        return width;
//    }
//
//    public float getHeight() {
//        return height;
//    }
//
//    public float getRotation() {
//        return rotation;
//    }
//
//
//}