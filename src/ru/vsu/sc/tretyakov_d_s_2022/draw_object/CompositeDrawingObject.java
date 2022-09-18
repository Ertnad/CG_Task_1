package ru.vsu.sc.tretyakov_d_s_2022.draw_object;

import java.awt.*;
import java.util.ArrayList;

public abstract class CompositeDrawingObject extends DrawingObject {

    private final ArrayList<DrawingObject> drawingObjects = new ArrayList<>();

    public CompositeDrawingObject() {
        super();
    }

    public void addDrawingObject(DrawingObject drawingObjects) {
        this.drawingObjects.add(drawingObjects);
    }

    @Override
    public void draw(Graphics2D g2d, int windowCurrWidth, int windowCurrHeight) {
        this.drawingObjects.forEach(drawingObject -> drawingObject.draw(g2d, windowCurrWidth, windowCurrHeight));
    }
}
