package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title) throws HeadlessException {
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sanSerifLarge = new Font("SansSerif",Font.BOLD,18);
        Font sanSerifSmall = new Font("SansSerif",Font.BOLD,12);
        g.setFont(sanSerifLarge);
        g.drawString("The test",60,60);
        g.setFont(sanSerifSmall);
        g.drawString("by Qamas",60,100);
    }
}
