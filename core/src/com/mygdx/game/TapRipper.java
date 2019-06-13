package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mygdx.screens.GameScreen;
//import com.badlogic.gdx.graphics.GL20;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.mygdx.game.States.GameStateManager;
//import com.mygdx.game.States.MenuState;




public class TapRipper extends Game {


	public static final int WIDTH = 480;
	public static final int HEIGHT = 800;
	public static final String TITLE = "Tap Ripper";
	private GameScreen setScreen;


//	private GameStateManager gsm;
//	private SpriteBatch batch;

//	SpriteBatch batch;
//	Texture img;
	
	@Override
	public void create () {
		Gdx.app.log("TapRipper", "created");
		setScreen(new GameScreen());

//		batch = new SpriteBatch();
//		gsm = new GameStateManager();
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		gsm.push(new MenuState(gsm));
//		img = new Texture("badlogic.png");

	}

//	@Override
//	public void render () {
//		Gdx.gl.glClearColor(1, 0, 0, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//
//		gsm.update(Gdx.graphics.getDeltaTime());
//		gsm.render(batch);
//
////		batch.begin();  a partir
////		batch.draw(img, 0, 0);
////		batch.end();
//	}
	
//	@Override
//	public void dispose () {
//		batch.dispose();
////		img.dispose();//
//	}
}
