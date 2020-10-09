package command.compositecommands;

import command.compositecommands.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
