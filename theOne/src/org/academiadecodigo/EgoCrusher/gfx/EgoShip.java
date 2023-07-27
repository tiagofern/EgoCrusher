package org.academiadecodigo.EgoCrusher.gfx;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class EgoShip {

    public static final int CELLSIZE = 40;
    private Picture ship;
    private int row;
    private int col;


    private int speed = 1;
    KeyboardLogic keyboard;


    public EgoShip(int row){
        this.row = row;
        col = 400; //????????
        ship = new Picture(10, col, "ship.png");
        ship.draw();
        //keyboard = new KeyboardLogic(this, );

    }

    //GETTERS COLS ROWS / X Y

    public int getX() {
        return ship.getX();
    }

    public int getY() {
        return ship.getY();
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }


    //COLS AND ROWS TO PIXELS

    public int rowToY(int row) {
        int y = (row * CELLSIZE) + Background.PADDING;
        return y;
    }

    public int colToX(int col) {
        int x = (col * CELLSIZE) + Background.PADDING;
        return x;
    }

    //MOVEMENT
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void moveLeft() {
        if (ship.getX() > 10) {
            ship.translate(-(speed * (CELLSIZE )- 20), 0);
            col -= speed;
        }
    }

    public void moveRight() {
        if (ship.getX() < 1200) {
            ship.translate(speed * (CELLSIZE)+20, 0);
            col += speed;
        }
    }



    public void moveUp() {
        if (ship.getY() > 155) {
            ship.translate(0, -speed * (CELLSIZE)-20);
            col -= speed;
        }
    }

    public void moveDown() {
        if (ship.getY() < 755 - Background.CELLSIZE * 3) {
            ship.translate(0, speed * (CELLSIZE +20));
            col += speed;
        }
    }

    public Picture getShip() {
        return ship;
    }
}
