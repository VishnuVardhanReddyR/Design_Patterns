package Com.CreationalPatterns.ProtoTypePattern.Implementation;

public class ContextMenu {
    public void duplicate(Component component){
        Component newComponent = component.clone();
        // Add newComponent to our document
    }
}
