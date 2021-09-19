package Com.CreationalPatterns.ProtoTypePattern.Implementation;

public interface Component {
    void render();
    Component clone();
}
