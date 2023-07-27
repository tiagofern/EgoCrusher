package org.academiadecodigo.EgoCrusher.gfx;

import org.academiadecodigo.EgoCrusher.gfx.Rebels.RebelFactory;
import org.academiadecodigo.EgoCrusher.gfx.Rebels.RebelTypes;
import org.academiadecodigo.EgoCrusher.gfx.Rebels.Rebels;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;



public class Action {

    private EgoShip ship;
    private Background background;
    private ArrayList<Rebels> rebelsShit;
    private RebelTypes rebelTypes;
    private RebelFactory rebelFactory;
    private boolean endGame;
    private boolean gameStarted;
    private int counter;
    private int size;
    Picture ego;
    Picture egoLogo;
    Picture menu;
    Picture gameOver;
    Picture gameOver2;
    Picture gameOver3;
    Picture gameOver4;
    Picture gameOver5;
    Picture gameOver1;
    Picture level1;
    Picture level2;
    Picture level3;
    Picture level4;
    Picture level5;
    Picture win;
    Picture win2;
    Picture win3;
    Picture ferrao;
    private Rebels rebels;
    private int hp = 4;
    private Text text;
    KeyboardLogic keyboard;

    public Action(int size) throws InterruptedException {
        this.gameStarted = gameStarted;
        this.size = size;
        ferrao = new Picture(1560 - Background.PADDING - Background.CELLSIZE-20, 400, "ferraoboss.png");
        level1 = new Picture(10,10, "levelone");
        level2 = new Picture(10,10, "leveltwo");
        level3 = new Picture(10,10, "levelthree");
        level4 = new Picture(10,10, "levelfour");
        level5 = new Picture(10,10, "levelfive");
        gameOver1 = new Picture(10, 10, "gameoverlevel1.png");
        gameOver2 = new Picture(10, 10, "gameoverlevel2.png");
        gameOver3 = new Picture(10, 10, "gameoverlevel3.png");
        gameOver4 = new Picture(10, 10, "gameoverlevel4.png");
        gameOver5 = new Picture(10, 10, "gameoverlevel5.png");
        egoLogo = new Picture(0,10, "ego.png");
        menu = new Picture(10,10,"menu.png");
        background = new Background();
        ego = new Picture(890, 30, "egobar.png");
        ego.draw();
        egoLogo.draw();
        ship = new EgoShip(20);
        ship.setSpeed(1);
        keyboard = new KeyboardLogic(ship,this );
        gameOver = new Picture(10,10, "gameOver.png");
        win = new Picture(10,10, "win.png");
        win2 = new Picture(10,10, "win2.png");
        win3 = new Picture(10,10, "win3.png");





    }

    //START THE GAME
    public void playGame() throws InterruptedException {
        menu.draw();
        System.out.println("menuuuu");
        while(!gameStarted){
            System.out.println("waiting");
        }
            menu.delete();
            giveMeRebels();
            theGame();
        }

    public void playMusic() {

            GameSounds.GameSounds11("/retro.wav");

    }


    public void setGameStarted(boolean gameStarted) {
        this.gameStarted = gameStarted;
    }

    //CONDITIOn TO WIN
    public void win() {
        endGame = true;
    }

    //GIMME REBELS
    public void giveMeRebels() {
        rebelFactory = new RebelFactory();
        rebelsShit = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            this.rebelsShit.add(rebelFactory.createRebels());
        }
    }

    //THE GAME FLOW
    public void theGame() throws InterruptedException {

        for (Rebels r : rebelsShit) {
            counter++;
            Picture gg = loose();
            Picture winGame = winning();

            if (hp == 0) {

                TimeUnit.MILLISECONDS.sleep(1000);
                gg.draw();

                TimeUnit.MILLISECONDS.sleep(5000);
                gg.delete();
                reinitilize();
                break;
            } else {
                r.draw();

                while (r.getX() > 0) {


                    //COUNTER<15
                    if (counter < 10) {
                        level1.draw();


                        TimeUnit.MILLISECONDS.sleep(40);
                        r.move(1);


                        level1.delete();

                        if ((r.getRebelPicture().getX()<ship.getShip().getMaxX()-10 &&
                                r.getRebelPicture().getY()<ship.getShip().getMaxY() &&
                                r.getRebelPicture().getMaxY() > ship.getShip().getY())) {
                            hitShip(r);

                            break;
                        } else if (r.getX() <= 0) {
                            r.delete();
                            ego.grow(10,0);

                        }


                        //COUNTER<30
                    } else if (counter < 20) {
                        TimeUnit.MILLISECONDS.sleep(35);
                        //r.getRebelPicture().grow(0.5,0.5);
                        r.move(1);



                        if (r.getRebelPicture().getX()<ship.getShip().getMaxX()-10 &&
                                r.getRebelPicture().getY()<ship.getShip().getMaxY() &&
                                r.getRebelPicture().getMaxY() > ship.getShip().getY()) {
                            hitShip(r);

                            break;
                        } else if (r.getX() <= 0) {
                        r.delete();
                            ego.grow(10,0);

                    }

                        //COUNTER<16

                    } else if (counter < 30) {


                        TimeUnit.MILLISECONDS.sleep(30);
                        r.move(1);



                        if (r.getRebelPicture().getX()<ship.getShip().getMaxX()-10 &&
                                r.getRebelPicture().getY()<ship.getShip().getMaxY() &&
                                r.getRebelPicture().getMaxY() > ship.getShip().getY()) {
                            hitShip(r);

                            break;
                        } else if (r.getX() <= 0) {
                        r.delete();
                            ego.grow(10,0);

                    }

                        //COUNTER<40
                    } else if (counter < 45) {
                        TimeUnit.MILLISECONDS.sleep(25);
                        r.move(1);
                        r.getRebelPicture().grow(0.7,0.7);



                        if (r.getRebelPicture().getX()<ship.getShip().getMaxX()-10 &&
                                r.getRebelPicture().getY()<ship.getShip().getMaxY() &&
                                r.getRebelPicture().getMaxY() > ship.getShip().getY()) {
                            hitShip(r);
                            break;
                        } else if (r.getX() <= 0) {
                            r.delete();
                            ego.grow(10,0);

                        }


                    } else if (counter < 65) {
                        TimeUnit.MILLISECONDS.sleep(20);
                        r.getRebelPicture().grow(0.9,0.9);
                        r.move(1);


                        if (r.getRebelPicture().getX()-20<ship.getShip().getMaxX()-10 &&
                                r.getRebelPicture().getY()<ship.getShip().getMaxY() &&
                                r.getRebelPicture().getMaxY() > ship.getShip().getY()) {
                            hitShip(r);
                            break;

                        } else if (r.getX() <= 0) {
                        r.delete();
                            ego.grow(10,0);
                    }
                        //COUNTER<SIZE
                    } else if (counter <= size) {
                        System.out.println("counter: " + counter + "size: " + size);
                        TimeUnit.MILLISECONDS.sleep(15);
                        r.getRebelPicture().grow(1.1,1.1);
                        r.move(1);


                        if (r.getRebelPicture().getX()-20<ship.getShip().getMaxX()-10 &&
                                r.getRebelPicture().getY()<ship.getShip().getMaxY() &&
                                r.getRebelPicture().getMaxY() > ship.getShip().getY()) {
                            hitShip(r);
                            break;

                        } else if (r.getX() <= 0) {
                            r.delete();
                            ego.grow(10,0);
                        }

                    }

                }

            }

        } if(counter == size){
            win();
            Picture winGame = winning();
            ship.getShip().load("shipvictory.png");

            TimeUnit.MILLISECONDS.sleep(1500);
            winGame.draw();
            //============
            TimeUnit.MILLISECONDS.sleep(4000);
            winGame.delete();
            reinitilize();


            //================


            System.out.println("win");
        }

        System.out.println(hp);
        System.out.println(counter);

    }

    private void reinitilize() throws InterruptedException {
        ship.getShip().delete();
        ego.delete();
        egoLogo.delete();
        ego = new Picture(890, 30, "egobar.png");
        ego.draw();
        egoLogo.draw();
        counter = 0;
        hp = 4;
        ship = new EgoShip(20);
        keyboard = new KeyboardLogic(ship,this );


        setGameStarted(false);
        playGame();
    }

    private void hitShip(Rebels r) {
        r.delete();
        hp--;
        switch(hp){
            case 3:
                ship.getShip().load("shipGONE (1).png");
                break;
            case 2:
                ship.getShip().load("shipGONE2 (1).png");
                break;
            case 1:
                ship.getShip().load("shipGONE3 (1).png");
                break;
            case 0:
                ship.getShip().load("shipGONE5.png");
                break;
        }
        System.out.println("hp is " + hp);
    }

    public Picture loose() {
        switch ((int)Math.ceil(Math.random() * 5)) {
            case 1:
                return gameOver1;
            case 2:
                return gameOver2;
            case 3:
                return gameOver3;
            case 4:
                return gameOver4;
            case 5:
                return gameOver5;

            default:
                break;
        }
        return null;
    }

    public Picture winning() {
        switch ((int)Math.ceil(Math.random() * 3)) {
            case 1:
                return win;
            case 2:
                return win2;
            case 3:
                return win3;

            default:
                break;
        }
        return null;
    }




}

