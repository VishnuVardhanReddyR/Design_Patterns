package state.implementation;

public class EraserTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("eraser icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("erased something");
    }
}
