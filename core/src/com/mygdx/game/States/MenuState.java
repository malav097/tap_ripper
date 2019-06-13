//package com.mygdx.game.States;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.mygdx.game.TapRipper;
//
//public class MenuState extends State{
//
//    private Texture background;
//    private Texture startbtn;
//
//
//    public MenuState(GameStateManager gsm) {
//        super(gsm);
//
//        background = new Texture("badlogic.png");
//        startbtn = new Texture("start.png");
//
//    }
//
//    @Override
//    public void handleInput() {
//        if(Gdx.input.justTouched()){
//            gsm.set(new PlayState(gsm));
//            dispose();
//        }
//
//
//    }
//
//    @Override
//    public void update(float dt) {
//        handleInput();
//
//    }
//
//    @Override
//    public void render(SpriteBatch sb) {
//        sb.begin();
//        sb.draw(background, 0 , 0 , TapRipper.WIDTH, TapRipper.HEIGHT);
//        sb.draw(startbtn, (TapRipper.WIDTH / 2) - (startbtn.getWidth() / 2), TapRipper.HEIGHT / 2 );
//        sb.end();
//
//
//    }
//
//    @Override
//    public void dispose() {
//        background.dispose();
//        startbtn.dispose();
//
//    }
//}
