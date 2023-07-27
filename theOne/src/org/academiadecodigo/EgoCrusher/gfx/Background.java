package org.academiadecodigo.EgoCrusher.gfx;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Background {


    public static final int CELLSIZE = 40;//NO USE
    public static final int PADDING = 10;
    private Picture background;

    public Background() {
        background = new Picture(PADDING, PADDING, "background.png");
        background.draw();
    }

    //GETTERS WIDTH, HEIGHT
    public int getWidth(){
        return background.getWidth();
    }

    public int getHeight() {
       return background.getHeight();
    }
}
