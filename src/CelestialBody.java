package src;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
public class CelestialBody extends Ellipse2D {
    int x;
    int y;
    int size;
    Color colour;
    float mass;
    Vector3 initialVelocity;

   public CelestialBody(int inX, int inY, int inSize, Color inColour, float inMass, Vector3 inV){
        x = inX;
        y = inY;
        size = inSize;
        colour = inColour;
        mass = inMass;
        initialVelocity = inV;
        
   }
    @Override
    public Rectangle2D getBounds2D() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getX() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getY() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getWidth() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getHeight() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }
    public void translate(Vector3 velocity){
        x += velocity.x; 
        y += velocity.y;
    }

    @Override
    public void setFrame(double x, double y, double w, double h) {
        // TODO Auto-generated method stub
        
    }

    void paint(Graphics g, Point mousePos){
        g.setColor(colour);
        System.out.println(x + "" + y + "" + size);
        g.fillOval(x, y, size, size);
    }
    
}
