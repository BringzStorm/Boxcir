package com.poi.boxcir;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player {
	
	Sprite playerSprite;
	
	public Player(Texture t) {
		playerSprite = new Sprite(t);
		playerSprite.setPosition(0, 0);
	}
	
	public void update(float delta) {
		
	}
	
	public void draw(SpriteBatch batch) { 
		playerSprite.draw(batch);
	}
}
