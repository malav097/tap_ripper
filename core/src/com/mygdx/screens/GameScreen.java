package com.mygdx.screens;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.Gdx;
import com.mygdx.helpers.InputHandler;
import com.mygdx.screens.GameScreen;
import com.mygdx.gameworld.GameWorld;
import com.mygdx.gameworld.GameRender;



public class GameScreen implements Screen {

    private GameWorld world;
    private GameRender renderer;
    private float gamesurfery;
    private boolean col;

    public GameScreen() {
        Gdx.app.log("GameScreen", "Attached");

        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);


        float screenmidy = (float) (screenHeight / 2);

        float midPointY = (int) (gameHeight / 2);


        world = new GameWorld(midPointY, gameHeight, gameWidth);
        renderer = new GameRender(world);


        //Gdx.input.setInputProcessor(new InputHandler(world.getsurfer()));
        Gdx.app.log("GameScreen", "Midpoint " + midPointY);
        Gdx.app.log("GameScreen", "Height " + screenHeight);
        Gdx.app.log("GameScreen", "gameheight "  + gameHeight);
    }

    @Override
    public void render(float delta) {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);


        world.update(delta);
        renderer.render();

        gamesurfery = world.getsurfer().getY() * screenHeight / gameHeight;

        gamesurfery = gamesurfery + 3;

        col = world.getColumn().collision(world.getsurfer().getBoundingCircle());

        Gdx.input.setInputProcessor(new InputHandler(world, gamesurfery));

        Gdx.app.log("touch","surfer = " + col);


    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "resizing");
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide called");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume called");
    }

    @Override
    public void dispose() {
        // Leave blank
    }






}
