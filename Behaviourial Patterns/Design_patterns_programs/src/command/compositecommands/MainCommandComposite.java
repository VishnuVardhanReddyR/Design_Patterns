package command.compositecommands;

import command.implementation.fx.Button;

public class MainCommandComposite {
    public static void main(String[] args){
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
        composite.execute();
    }
}
