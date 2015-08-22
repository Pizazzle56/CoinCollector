package com.icraftgames.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Shape2D;
import com.badlogic.gdx.math.Vector2;

public abstract class Entity {
	
	
		
	
	
	Vector2 Position;
	Texture Texture;
	Sprite Sprite;
	private Circle Bounds;
	
	
	
	public void init() {
		Sprite.setPosition(Position.x, Position.y);
		
	}
	
	
	public void render(SpriteBatch sb) {
		getBounds().x = Sprite.getX();
		getBounds().y = Sprite.getY();
		sb.draw(Sprite, Position.x, Position.y);
	}


	

	public Circle getBounds() {
		return Bounds;
	}


	public void setBounds(Circle bounds) {
		Bounds = bounds;
	}
	 
	

}
