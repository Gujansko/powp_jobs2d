package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.factory.DriverCommandFigureFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;
	private final FigureType figureScript;

	public SelectTestFigureOptionListener(DriverManager driverManager, FigureType figureScript) {
		this.driverManager = driverManager;
		this.figureScript = figureScript;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (figureScript) {
			case JOE1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case JOE2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case COMMAND1:
				DriverCommandFigureFactory.driverCommandFigure1(driverManager.getCurrentDriver()).execute();
				break;
			case COMMAND2:
				DriverCommandFigureFactory.driverCommandFigure2(driverManager.getCurrentDriver()).execute();
				break;
			default:
				break;
		}
	}
}

