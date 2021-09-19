package Com.CreationalPatterns.SingletonPattern.Problem;

public class Main {
    public static void main(String[] args){
        ConfigManager manager = new ConfigManager();
        manager.set("name", "Mosh");
        // What if? somewhere in our application, we have another ConfigManager

        ConfigManager other = new ConfigManager();
        System.out.println(other.get("name"));
    }
}
