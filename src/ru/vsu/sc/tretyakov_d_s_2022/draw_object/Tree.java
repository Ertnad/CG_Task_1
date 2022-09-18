package ru.vsu.sc.tretyakov_d_s_2022.draw_object;

import java.awt.*;
import static ru.vsu.sc.tretyakov_d_s_2022.util.DrawUtil.drawWithColor;

public class Tree extends DrawingObject {



    public Tree (double posCofX, double posCofY, double sizeCofX, double sizeCofY, Color color) {
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

        drawWithColor(gr2d, Color.black, () -> gr2d.drawRect(
                (int) (posCofX * windowCurrWidth),
                (int) (posCofY * windowCurrHeight),
                (int) (sizeCofX * windowCurrWidth),
                (int) (sizeCofY * windowCurrHeight)
        ));

        int [] xPoints = {(int) ((posCofX + (sizeCofX / 2)) * windowCurrWidth),(int) ((posCofX - ((sizeCofX / 2) + 0.01)) * windowCurrWidth), (int) ((posCofX + ((sizeCofX * 3/2) + 0.01)) * windowCurrWidth)};
        int [] yPoints = {(int) ((posCofY - 0.1) * windowCurrHeight),(int) ((posCofY + 0.1) * windowCurrHeight), (int) ((posCofY + 0.1) * windowCurrHeight)};

        drawWithColor(gr2d, new Color(0x1D2C05), () -> gr2d.fillPolygon(xPoints, yPoints, 3));


    }
}