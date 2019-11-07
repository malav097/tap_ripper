package com.mygdx.gameworld;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;


public class GameRender {

    private OrthographicCamera cam;
    private GameWorld myWorld;
    private ShapeRenderer shapeRenderer;
    private int midPointY;
    private int gameHeight;
    private SpriteBatch batcher;

    private static BitmapFont font;


    public GameRender(GameWorld world) {
        myWorld = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, 204);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);

        this.gameHeight = gameHeight;
        this.midPointY = midPointY;

    }

    public void render() {
        //Gdx.app.log("GameRenderer", "render");

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeType.Filled);

        // Draw sand color
        shapeRenderer.setColor(147 / 255.0f, 80 / 255.0f, 27 / 255.0f, 1);
        shapeRenderer.rect(0, 0, 136,  204);



        // Draw water
        shapeRenderer.setColor(55 / 255.0f, 80 / 255.0f, 100 / 255.0f, 1);
        shapeRenderer.rect(0,  0, 136, 170);

//        // Draw Grass
//        shapeRenderer.setColor(111 / 255.0f, 186 / 255.0f, 45 / 255.0f, 1);
//        shapeRenderer.rect(0, midPointY + 66, 136, 11);



        // Draw Surfer
        shapeRenderer.setColor(87 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);
        shapeRenderer.rect(myWorld.getsurfer().getX(), myWorld.getsurfer().getY(),
                myWorld.getsurfer().getWidth(), myWorld.getsurfer().getHeight());


        shapeRenderer.setColor(87 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);
        shapeRenderer.rect(myWorld.getsurfer().getBoundingCircle().x, myWorld.getsurfer().getBoundingCircle().y, myWorld.getsurfer().getBoundingCircle().width, myWorld.getsurfer().getBoundingCircle().height);


        //Gdx.app.log("touch","surfer = " + myWorld.getsurfer().getY());

//        public float getY() {
//            return myWorld.getsurfer().getY();
//        }


        shapeRenderer.end();

        shapeRenderer.begin(ShapeType.Line);

        shapeRenderer.setColor(255 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);

        shapeRenderer.rect(myWorld.getColumn().getX(), myWorld.getColumn().getY(),
                myWorld.getColumn().getWidth(), myWorld.getColumn().getHeight());

        shapeRenderer.setColor(255 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);

        shapeRenderer.rect(myWorld.getColumn().getX2(), myWorld.getColumn().getY2(),
                myWorld.getColumn().getWidth(), myWorld.getColumn().getHeight());



        shapeRenderer.setColor(255 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);

        shapeRenderer.rect(myWorld.getsurfer().getX(), myWorld.getsurfer().getY(),
                myWorld.getsurfer().getWidth(), myWorld.getsurfer().getHeight());


        if (myWorld.isReady()) {
            // Draw shadow first
            // Draw text
            shapeRenderer.rect(45, 45, 45, 45);
        } else {

            if (myWorld.isGameOver()) {

                shapeRenderer.rect(45, 45, 80, 80);
            }

        }
        shapeRenderer.end();




    }




}
