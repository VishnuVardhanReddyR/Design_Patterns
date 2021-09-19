package state.problem;

public class Canvas {
    private ToolType currentTool;

    public void mouseDown(){
        if (currentTool == ToolType.SELECTION){
            System.out.println("selection icon");
        }
        else if (currentTool == ToolType.BRUSH){
            System.out.println("Brush icon");
        }
        else if (currentTool == ToolType.ERASER){
            System.out.println("Eraser icon");
        }
    }
    public void mouseUp(){
        if (currentTool == ToolType.SELECTION){
            System.out.println("draw dashed rectangle");
        }
        else if (currentTool == ToolType.BRUSH){
            System.out.println("draw a line");
        }
        else if (currentTool == ToolType.ERASER){
            System.out.println("Erase something");
        }
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
