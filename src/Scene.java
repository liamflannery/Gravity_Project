package src;
import java.awt.Graphics;
import java.awt.Point;
import java.util.List;
import java.util.function.Consumer;
public class Scene {
    List<CelestialBody> bodies;
    public Scene(){

    }
    public void paint(Graphics g, Point mousePos) {
        Consumer<CelestialBody> paint = cb -> {
            cb.paint(g, mousePos);
        };
        doToEachCB(paint);
    }
    public void doToEachCB(Consumer<CelestialBody> func) {
        for(CelestialBody body : bodies){
            func.accept(body);
        }
        }
    public void set(List<CelestialBody> inBodies){
        bodies = inBodies;
    }
}
