package ru.vsu.sc.tretyakov_d_s_2022;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        this.setSize(900, 600);
        this.setTitle("Tank");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.add(new DrawPanel());
    }
}
