package com.icraftgames.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

public class GameOverScreen implements Screen {

	private BitmapFont font;
	private Texture exitTexture;
	private Sprite exitSprite;
	private SpriteBatch sb;
	private static Rectangle exitBounds;
	
	@Override
	public void show() {
		font = new BitmapFont(Gdx.files.internal("font.fnt"));
		exitTexture = new Texture("ExitButton.png");
		exitSprite = new Sprite(exitTexture);
		exitSprite.setPosition(Gdx.graphics.getWidth() / 2 - 110, Gdx.graphics.getHeight() / 2 -300);
		exitBounds = exitSprite.getBoundingRectangle();
		exitBounds.x = Gdx.graphics.getWidth() / 2 - 110;
		exitBounds.y = Gdx.graphics.getHeight() / 2 - 300;
		sb = new SpriteBatch();
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sb.begin();
		font.draw(sb, "Game Over!", Gdx.graphics.getWidth() / 2 - 75, Gdx.graphics.getHeight() / 2 + 200);
		exitSprite.draw(sb);
		
		sb.end();
		
		
		
		exitBounds.x = Gdx.graphics.getWidth() / 2 - 110;
		exitBounds.y = Gdx.graphics.getHeight() / 2 - 300;
		if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
			if(exitBounds.contains(640 - Gdx.input.getX(), 640 - Gdx.input.getY())) {
				Gdx.app.exit();
			}
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
