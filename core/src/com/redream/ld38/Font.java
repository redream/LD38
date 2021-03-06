package com.redream.ld38;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Font extends Sprite{
	private String txt;
	
	public float scale = 1;
	
	public static int POS_LEFT = 0;
	public static int POS_RIGHT = 1;
	public static int POS_CENTER = 2;
	
	private static GlyphLayout glyphLayout = new GlyphLayout();
	
	private int pos = 0;
	
	public Font(String txt,float x,float y,int pos){
		this.txt = txt;
		this.x = x;
		this.y = y;
		this.pos = pos;
	}
	
	public void render(SpriteBatch batch){
		float x = this.x;
		float y = this.y;
		glyphLayout.setText(Resources.font, txt);
		if(pos == POS_RIGHT) x -= glyphLayout.width;
		if(pos == POS_CENTER) x -= glyphLayout.width/2;
		Resources.font.setColor(Color.BLACK);
		Resources.font.getData().setScale(scale);

		Resources.font.draw(batch, txt, x, y);
	}
}
