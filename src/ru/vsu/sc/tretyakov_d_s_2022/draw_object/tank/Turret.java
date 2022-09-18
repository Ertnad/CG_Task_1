package ru.vsu.sc.tretyakov_d_s_2022.draw_object.tank;

import ru.vsu.sc.tretyakov_d_s_2022.draw_object.DrawingObject;
import java.awt.*;
import static ru.vsu.sc.tretyakov_d_s_2022.util.DrawUtil.drawWithColor;

public class Turret extends DrawingObject {


    public Turret (double posCofX, double posCofY, double sizeCofX, double sizeCofY, Color color) {
        super(posCofX, posCofY, sizeCofX, sizeCofY, color);
    }

    @Override
    public void draw(Graphics2D gr2d, int windowCurrWidth, int windowCurrHeight) {
        drawWithColor(gr2d, this.color, () -> gr2d.fillRoundRect(
                (int) (posCofX * windowCurrWidth),
                (int) (posCofY * windowCurrHeight),
                (int) (sizeCofX * windowCurrWidth),
                (int) (sizeCofY * windowCurrHeight),
                (int) ((sizeCofX * windowCurrWidth) / 2),
                (int) (sizeCofY * windowCurrHeight)
        ));

        drawWithColor(gr2d, Color.black, () -> gr2d.drawRoundRect(
                (int) (posCofX * windowCurrWidth),
                (int) (posCofY * windowCurrHeight),
                (int) (sizeCofX * windowCurrWidth),
                (int) (sizeCofY * windowCurrHeight),
                (int) ((sizeCofX * windowCurrWidth) / 2),
                (int) (sizeCofY * windowCurrHeight)
        ));


    }
}