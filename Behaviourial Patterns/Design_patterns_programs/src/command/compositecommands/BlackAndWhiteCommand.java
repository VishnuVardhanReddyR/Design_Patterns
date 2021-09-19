package command.compositecommands;

import command.compositecommands.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
