package src;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Vector;
public class Stage {
    List<CelestialBody> bodies;
    public Scene scene;
    private Object underMouseS;
    Vector3 sunIV;
    public Stage() {
        
        scene = new Scene();
        bodies = new ArrayList<CelestialBody>();
        CelestialBody sun = new CelestialBody(0, 0, 100, Color.yellow, 100, new Vector3(10,0,0));
        bodies.add(sun);
        scene.set(bodies);
        
        
    }

    public void paint(Graphics g, Point mouseLoc) {
        scene.paint(g, mouseLoc);   
        underMouse(g, mouseLoc);
        moveBodies();        
    }
    private void moveBodies() {
        for(CelestialBody body: bodies){
            body.translate(body.initialVelocity);
        }
    }

    public void underMouse(Graphics g, Point mouseLoc){
    }
    public void mouseClicked(int x, int y){
        
    }
    
}