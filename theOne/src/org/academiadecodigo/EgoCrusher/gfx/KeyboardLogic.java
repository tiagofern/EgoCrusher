package org.academiadecodigo.EgoCrusher.gfx;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.io.IOException;
import java.net.URISyntaxException;

public class KeyboardLogic implements KeyboardHandler {

    private Keyboard keyboard;
    private EgoShip ship;
    Action action;


    public KeyboardLogic(EgoShip ship, Action action) {
        this.ship = ship;
        this.action = action;
        theFlow();
    }

    public void theFlow(){

        keyboard = new Keyboard(this);


        KeyboardEvent up= new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_K);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_J);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_H);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_L);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent restart = new KeyboardEvent();
        restart.setKey(KeyboardEvent.KEY_SPACE);
        restart.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent exit = new KeyboardEvent();
        exit.setKey(KeyboardEvent.KEY_Q);
        exit.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);




        keyboard.addEventListener(exit);
        keyboard.addEventListener(restart);
        keyboard.addEventListener(right);
        keyboard.addEventListener(left);
        keyboard.addEventListener(down);
        keyboard.addEventListener(up);

    }




    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_Q:
                System.exit(0);
                break;
            case KeyboardEvent.KEY_L:
                ship.moveRight();
                break;
            case KeyboardEvent.KEY_H:
                ship.moveLeft();
                break;
            case KeyboardEvent.KEY_K:
                ship.moveUp();
                break;
            case KeyboardEvent.KEY_J:
                ship.moveDown();
                break;
            case KeyboardEvent.KEY_SPACE:
                    action.setGameStarted(true);
                break;


        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
