package ru.vsu.sc.tretyakov_d_s_2022.draw_object.tank;

import ru.vsu.sc.tretyakov_d_s_2022.draw_object.DrawingObject;
import java.awt.*;
import static ru.vsu.sc.tretyakov_d_s_2022.util.DrawUtil.drawWithColor;
import static ru.vsu.sc.tretyakov_d_s_2022.util.DrawUtil.drawWithFont;

public class ModelLabel extends DrawingObject {
    private String modelName = "default";

    public ModelLabel(double posCofX, double posCofY, double sizeCofX, double sizeCofY, Color color) {
        super(posCofX, posCofY, sizeCofX, sizeCofY, color);
    }

    @Override
    public void draw(Graphics2D gr2d, int windowCurrWidth, int windowCurrHeight) {
        drawWithColor(gr2d, this.color, () -> drawWithFont(gr2d, new Font("Arial", Font.BOLD,
                        Math.min(
                                (int) (0.2 * sizeCofX * windowCurrWidth),
                                (int) (0.2 * sizeCofY * windowCurrHeight)
                                )),
                        () -> gr2d.drawString(
                                this.modelName,
                                (int) (posCofX * windowCurrWidth),
                                (int) (posCofY * windowCurrHeight)
                        )
                )
        );
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
