package ru.vsu.sc.tretyakov_d_s_2022;

import ru.vsu.sc.tretyakov_d_s_2022.draw_object.*;
import ru.vsu.sc.tretyakov_d_s_2022.draw_object.tank.*;
import ru.vsu.sc.tretyakov_d_s_2022.draw_object.Tree;

import javax.swing.*;
import java.awt.*;


public class DrawPanel extends JPanel {

    World world;
    Tank tank;

    public DrawPanel() {

        world = new World();
        world.addDrawingObject(new Sky(0, 0 ,1, 0.7,  new Color(124, 197, 241)));
        world.addDrawingObject(new Land (0, 0.7 ,1, 0.35,  new Color(0x609D10)));
        world.addDrawingObject(new Sun(0.2, 0.1, 0.1, 0.1, new Color(0xF1A30D)));

        for (int i = 0; i < 6; i++) {
            world.addDrawingObject(new Tree(0 + (i * 0.2), 0.5, 0.03, 0.2, new Color(0x4B251D)));
        }


        tank = new Tank(0, -30, 10, "АБВ-34", new Color(0x0B3B03));
        tank.draw(tank);


        world.addDrawingObject(tank);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr2d = (Graphics2D) g;
        this.world.draw(gr2d, this.getWidth(), this.getHeight());
    }
}
