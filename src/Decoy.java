import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Decoy extends GameObject{ 
  
  
    Room room;
    int lives = 1;
    int spriteOffset = 0;
    boolean dead = false;
    int coordX;
    int coordY;
      
   public Decoy(Room room, int x, int y) {
        super();
        this.room = room;
        this.coordX =  x;
        this.coordY =  y;
        //boundingBox( xcoorUpLeft, ycoorUpLeft, width, height)
        this.boundingBox = new Rectangle( coordX, coordY, 11, 11);
        spriteI = 0; spriteJ = 8;
    }
  
  
    public void update(float dt) {
            double x = boundingBox.getX();
            double y = boundingBox.getY();
    }

    public void draw(Graphics2D g) {
        double x = coordX;
        double y = coordY;
        drawSprite(g, 24, spriteI+spriteOffset,spriteJ, -5, -5);
        super.draw(g);
    }

    public void die(){
        dead = true;
        
    }

    public void reset() {
        this.boundingBox = new Rectangle((13*12)+8, 26*12+1, 11, 11);
        dead = false;
    }
    
     
}