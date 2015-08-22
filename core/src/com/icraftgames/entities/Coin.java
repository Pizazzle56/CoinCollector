package com.icraftgames.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;

public class Coin extends Entity {
	
	@Override
	public Circle getBounds() {
		return super.getBounds();
	}
	
	@Override
	public void setBounds(Circle bounds) {
		super.setBounds(bounds);
	}
	
	public Coin(Vector2 pos) {
		Position = pos;
		Position.x = pos.x;
		Position.y = pos.y;
		Texture = new Texture("Coin.png");
		Sprite = new Sprite(Texture);
		setBounds(new Circle(Position.x, Position.y , 5f));
	}
	
	@Override
	public void render(SpriteBatch sb) {
		super.render(sb);
		getBounds().x = Position.x;
		getBounds().y = Position.y;
		
	}

	

}
