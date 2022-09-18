package ru.vsu.sc.tretyakov_d_s_2022.draw_object.tank;

import ru.vsu.sc.tretyakov_d_s_2022.draw_object.CompositeDrawingObject;
import java.awt.*;

public class Tank extends CompositeDrawingObject {

   double x, y;
   int n;
   String string;
   Color color;

   public Tank(double x, double y, int n, String string, Color color) {
       this.x = x;
       this.y = y;
       this.string = string;
       this.color = color;
       this.n = n;
   }



    public void draw(Tank tank) {
       tank.addDrawingObject(new Gun(((x * 0.01) + 0.04 * n), 0.49 + (y * 0.01), n * (0.1-0.04), 0.05, Color.BLACK));
       tank.addDrawingObject(new Turret(((x * 0.01) + 0.02 * n), 0.44 + (y * 0.01), n * (0.1 - 0.045), 0.2, color));
        ModelLabel modelLabel = new ModelLabel(((x * 0.01) + 0.03 * n), 0.54 + (y * 0.01), n * (0.1 - 0.02), n * (0.1 - 0.04), Color.WHITE);
        modelLabel.setModelName(string);
        tank.addDrawingObject(modelLabel);
        tank.addDrawingObject(new Track( (x * 0.01),  0.6 + (y * 0.01),  n * 0.1, 0.15, color));

        for (int i = 0; i < n; i++) {
           tank.addDrawingObject(
                   new Wheel((0.1 * i) + (x * 0.01), 0.61 + (y * 0.01), 0.1, 0.13, new Color(0x282828))
           );
       }
   }
}
