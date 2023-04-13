package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

public class FigureFactory {
    static ComplexCommand getFigure(Figures figure) {
        ComplexCommand figureCommands = new ComplexCommand();
        figureCommands.addCommand(new SetPositionCommand(10, 10));
        switch (figure) {
            case ANETA1: {
                figureCommands.addCommand(new OperateToCommand(10, 20));
                figureCommands.addCommand(new SetPositionCommand(80, 80));
                figureCommands.addCommand(new OperateToCommand(80, 100));
                figureCommands.addCommand(new OperateToCommand(90, 100));
                figureCommands.addCommand(new OperateToCommand(90, 10));
                break;
            }
            case SQUARE: {
                figureCommands.addCommand(new OperateToCommand(10, 200));
                figureCommands.addCommand(new OperateToCommand(200, 200));
                figureCommands.addCommand(new OperateToCommand(200, 10));
                figureCommands.addCommand(new OperateToCommand(10, 10));
                break;
            }
            case RECTANGLE: {
                figureCommands.addCommand(new OperateToCommand(60, 10));
                figureCommands.addCommand(new OperateToCommand(60, 20));
                figureCommands.addCommand(new OperateToCommand(10, 20));
                figureCommands.addCommand(new OperateToCommand(10, 10));
                break;
            }
        }
        return figureCommands;
    }
}
