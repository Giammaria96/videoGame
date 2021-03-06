package videogame.states;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Emanuele Feola
 */
public abstract class State {
    private static State currentState;
    
    public static void setState(State state){
        currentState = state;
    }
    
    public static State getState(){
        return currentState;
    }
    
    public abstract void update();
    public abstract void render(Graphics g);
    public abstract BufferedImage getBackground();
}
