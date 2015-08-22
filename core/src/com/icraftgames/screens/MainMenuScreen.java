package com.icraftgames.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.icraftgames.CoinCollector;



public class MainMenuScreen implements Screen {
	
	private Texture playTexture;
	private Sprite playSprite;
	private SpriteBatch sb;
	public static Rectangle playBounds;
	
	
	@Override
	public void show() {
		playTexture = new Texture("PlayButton.png");
		playSprite = new Sprite(playTexture);
		sb = new SpriteBatch();
		playBounds = new Rectangle(playSprite.getBoundingRectangle());
		playBounds.x = playSprite.getX();
		playBounds.y = playSprite.getY();
		playBounds.width = playBounds.width * 2;
		playBounds.height = playBounds.height * 2;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sb.begin();
		sb.draw(playSprite, Gdx.graphics.getWidth() / 1 - playSprite.getWidth() - 65, Gdx.graphics.getHeight() / 2 + playSprite.getHeight() - 300);
		sb.end();
		
		
		if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
			if(playBounds.contains(Gdx.input.getX(), Gdx.input.getY())) {
				
			}
			Gdx.app.log("Tag", "Starting the game");
			
		}
		
	}

	@Override
	public void resize(int width, int height) {
		
		
	}

	@Override
	public void pause() {
		
		
	}

	@Override
	public void resume() {
		
		
	}

	@Override
	public void hide() {
		
		
	}

	@Override
	public void dispose() {
		
		
	}

}
