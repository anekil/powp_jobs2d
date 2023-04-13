package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private Figures figure;

	public SelectTestFigureOptionListener(DriverManager driverManager, Figures figure) {
		this.driverManager = driverManager;
		this.figure = figure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (figure){
			case JOE1: FiguresJoe.figureScript1(driverManager.getCurrentDriver()); return;
			case JOE2: FiguresJoe.figureScript2(driverManager.getCurrentDriver()); return;
			case ANETA1: case SQUARE: case RECTANGLE:
			FigureFactory.getFigure(figure).execute(driverManager.getCurrentDriver()); return;
		}
	}
}
