package org.academiadecodigo.EgoCrusher.gfx.Rebels;

import org.academiadecodigo.EgoCrusher.gfx.Background;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Rebels {

    private int col;
    private int row;
    private RebelTypes rebel;

    private int random;
    private int theRandom;
    private Picture rebelPicture;
    private Background background;



    public Rebels(RebelTypes rebel) {
        this.rebel = rebel;
        col = 1560 - Background.PADDING - Background.CELLSIZE-20; // extremo direito ----> [      x]   A REVER
        rebelPicture = new Picture(col, gimmeRandom(),rebel.getPic());
        row = rebelPicture.getY() / Background.CELLSIZE - Background.CELLSIZE * 3;
    }

    public int gimmeRandom() {
        random =180 + (int) (Math.ceil(Math.random() * 600 - Background.CELLSIZE * 2)); //Math.floor(Math.random() * 610);
        if (random > 20 && (random % 25 == 0)) {
            theRandom = random;
            return theRandom;
        }
        return gimmeRandom();
    }


    //GETTERS
    public int getX(){
        return rebelPicture.getX();
    }
    public int getY(){
        return rebelPicture.getY();
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }


    //DRAW
    public void draw() {
        rebelPicture.draw();
    }

    //MOVE
    public void move(int units) {
        rebelPicture.translate(-Background.CELLSIZE * units, 0);
        row += units;
    }
    //DELETE
    public void delete(){
        rebelPicture.delete();
    }

    //GET PICTURE


    public Picture getRebelPicture() {
        return rebelPicture;
    }
}
