package com.mygdx.gameworld;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class GameRender {

    private OrthographicCamera cam;
    private GameWorld myWorld;
    private ShapeRenderer shapeRenderer;
    private int midPointY;
    private int gameHeight;


    public GameRender(GameWorld world) {
        myWorld = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(false, 136, 204);
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

        shapeRenderer.rect(0, 0, 136, midPointY + 66);

        // Draw Grass
        shapeRenderer.setColor(111 / 255.0f, 186 / 255.0f, 45 / 255.0f, 1);
        shapeRenderer.rect(0, midPointY + 66, 136, 11);

        // Draw water
        shapeRenderer.setColor(55 / 255.0f, 80 / 255.0f, 100 / 255.0f, 1);
        shapeRenderer.rect(0,  midPointY+ 77, 136, 52);


        // Draw Surfer
        shapeRenderer.setColor(87 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);
        shapeRenderer.rect(myWorld.getsurfer().getX(), myWorld.getsurfer().getY(),
                myWorld.getsurfer().getWidth(), myWorld.getsurfer().getHeight());



        shapeRenderer.end();

        shapeRenderer.begin(ShapeType.Line);

        shapeRenderer.setColor(255 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);

        shapeRenderer.rect(myWorld.getsurfer().getX(), myWorld.getsurfer().getY(),
                myWorld.getsurfer().getWidth(), myWorld.getsurfer().getHeight());

        shapeRenderer.end();


    }
}
