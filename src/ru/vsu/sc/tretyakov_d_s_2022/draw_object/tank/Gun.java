package ru.vsu.sc.tretyakov_d_s_2022.draw_object.tank;

import ru.vsu.sc.tretyakov_d_s_2022.draw_object.DrawingObject;
import java.awt.*;
import static ru.vsu.sc.tretyakov_d_s_2022.util.DrawUtil.drawWithColor;

public class Gun extends DrawingObject {


    public Gun (double posCofX, double posCofY, double sizeCofX, double sizeCofY, Color color) {
        super(posCofX, posCofY, sizeCofX, sizeCofY, color);
    }

    @Override
    public void draw(Graphics2D gr2d, int windowCurrWidth, int windowCurrHeight) {
        drawWithColor(gr2d, this.color, () -> gr2d.fillRect(
                (int) (posCofX * windowCurrWidth),
                (int) (posCofY * windowCurrHeight),
                (int) (sizeCofX * windowCurrWidth),
                (int) (sizeCofY * windowCurrHeight)
        ));
    }
}
