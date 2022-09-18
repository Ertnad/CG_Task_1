package ru.vsu.sc.tretyakov_d_s_2022.draw_object;

import java.awt.*;

public abstract class DrawingObject {
    protected double posCofX;
    protected double posCofY;
    protected double sizeCofX;
    protected double sizeCofY;
    protected Color color;

    public DrawingObject(double posCofX, double posCofY, double sizeCofX, double sizeCofY, Color color) {
        this.posCofX = posCofX;
        this.posCofY = posCofY;
        this.sizeCofX = sizeCofX;
        this.sizeCofY = sizeCofY;
        this.color = color;
    }

    public DrawingObject() {

    }

    public abstract void draw(Graphics2D gr2d, int windowCurrWidth, int windowCurrHeight);
}
