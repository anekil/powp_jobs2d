package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver {
    private int startX = 0, startY = 0;
    private DrawPanelController drawerController;
    protected ILine line;

    public LineDrawerAdapter(DrawPanelController drawerController, ILine line) {
        super();
        this.drawerController = drawerController;
        this.line = line;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        drawerController.drawLine(line);
        setPosition(x, y);
    }

    @Override
    public String toString() {
        return "Special driver";
    }
}

