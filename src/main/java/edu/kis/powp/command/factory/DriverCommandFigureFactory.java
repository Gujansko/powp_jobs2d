package edu.kis.powp.command.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class DriverCommandFigureFactory {
    public static ComplexCommand driverCommandFigure1(Job2dDriver driver) {
        DriverCommand[] commands = {
                new SetPositionCommand(0, 0, driver),
                new OperateToCommand(0, 200, driver),
                new OperateToCommand(100, 100, driver),
                new OperateToCommand(200, 0, driver),
                new OperateToCommand(0, 0, driver)};

        return new ComplexCommand(commands);
    }

    public static ComplexCommand driverCommandFigure2(Job2dDriver driver) {
        DriverCommand[] commands = {
                new SetPositionCommand(0, 0, driver),
                new OperateToCommand(0, 100, driver),
                new OperateToCommand(100, 100, driver),
                new OperateToCommand(100, 0, driver),
                new OperateToCommand(0, 0, driver)};

        return new ComplexCommand(commands);
    }
}