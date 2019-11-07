package com.mygdx.gameworld;
import com.badlogic.gdx.Gdx;
//import com.mygdx.gameobjects.Columns2;
import com.mygdx.gameobjects.Surfer;
import com.mygdx.gameobjects.Columns;
import com.badlogic.gdx.utils.Timer;


public class GameWorld {

    private Surfer surfer;
    private Columns column;
    private GameState currentState;
    float  midPointY;
    private float gamewith1;
    private float gameheight1;





    public enum GameState {

        READY, RUNNING, GAMEOVER

    }
//    private Columns2 column2;


    public GameWorld(float midPointY, float gameheight, float gamewith) {

        this.midPointY = midPointY;
        gamewith1 = gamewith;
        gameheight1 = gameheight;
        currentState = GameState.READY;

        surfer = new Surfer(33 , midPointY - 5, 5,10,gameheight, gamewith);
        column = new Columns(gamewith -50 , 0, 5,800,gameheight, gamewith, -80, 100);

    }

    public void update(float delta) {

        switch (currentState) {
            case READY:
                updateReady(delta);
                break;

            case RUNNING:
            default:
                updateRunning(delta);
                break;

            case GAMEOVER:
                updateGameover(delta);
                break;


        }


    }

    private void updateReady(float delta) {
        // Do nothing for now

        surfer = new Surfer(33 , midPointY - 5, 5,10,gameheight1, gamewith1);
        column = new Columns(gamewith1 -50 , 0, 5,800,gameheight1, gamewith1, -80, 100);
    }

    private void updateGameover(float delta) {
    ///stop time



    }


    public void updateRunning(float delta) {
//        Gdx.app.log("GameWorld", "height " +);
        surfer.update(delta);
        column.update(delta);
//        column2.update(delta);


        if (getColumn().collision(getsurfer().getBoundingCircle())) {

            // AQUI MUERE

            currentState = GameState.GAMEOVER;


//            surfer.onRestart(midPointY - 5);
//            column.onRestart(gamewith1 - 50);
//            currentState = GameState.READY;
        }



    }

    public boolean isReady() {
        return currentState == GameState.READY;
    }

    public void start() {
        currentState = GameState.RUNNING;
    }

    public void restart() {
        currentState = GameState.READY;
//        surfer.onRestart(midPointY - 5);
//        column.onRestart(gamewith1 - 50);
        currentState = GameState.READY;
    }

    public boolean isGameOver() {
        return currentState == GameState.GAMEOVER;
    }



    public Surfer getsurfer() {
        return surfer;
    }
    public Columns getColumn()  {
        return column;
    }
//    public Columns2 getColumn2()  {
//        return column2;
//    }
}
