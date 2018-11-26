package com.poi.boxcir;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BoxGame extends ApplicationAdapter { //ApplicationAdapter = Libgdx preset
	SpriteBatch batch;
	Texture img;
	Player e;
	
	@Override //Calls method from here instead of ApplicationAdapter
	public void create () {
		batch = new SpriteBatch(); //Creates object that draws stuff 
		img = new Texture("badlogic.jpg"); //Loading image in
		e = new Player(img);
	}

	@Override
	public void render () { //60 fps
		Gdx.gl.glClearColor(1, 1, 1, 1); 			// Sets the clear color (fills the canvas with set color)
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);	// Clears the canvas of ^
		e.update(Gdx.graphics.getDeltaTime());
		batch.begin();			//
		e.draw(batch);
		batch.draw(img, 0, 0);	// Draws stuff
		batch.end();			//
	}
	
	@Override
	public void dispose () {
		batch.dispose(); // Get rid of stuff from system memory. 
		img.dispose();	 // Add to the code as needed. Dispose of everything that is imported
	}
}

//New classes should have update and draw methods. Draw calls the batch. Update calls delta time