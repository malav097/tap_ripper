//package com.mygdx.game.States;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.mygdx.game.TapRipper;
//import com.mygdx.game.sprites.surfer;
//
//public class PlayState extends State{
//
//    private com.mygdx.game.sprites.surfer surfer;
//
//
//    public PlayState(GameStateManager gsm) {
//        super(gsm);
//        surfer = new surfer(50, 100);
//        cam.setToOrtho(false, TapRipper.WIDTH / 2, TapRipper.HEIGHT / 2);
//
//    }
//
//    @Override
//    protected void handleInput() {
//        if(Gdx.input.justTouched())
//            surfer.jump();
//
//    }
//
//    @Override
//    public void update(float dt) {
//        handleInput();
//        surfer.update(dt);
//
//    }
//
//    @Override
//    public void render(SpriteBatch sb) {
//        sb.setProjectionMatrix(cam.combined);
//        sb.begin();
//        sb.draw(surfer.getTexture(), surfer.getPosition().x, surfer.getPosition().y);
//        sb.end();
//
//    }
//
//    @Override
//    public void dispose() {
//
//    }
//}
