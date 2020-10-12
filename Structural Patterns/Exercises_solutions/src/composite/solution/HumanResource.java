package composite.solution;

public class HumanResource implements Team{
    @Override
    public void deploy() {
        System.out.println("Deploying a human resource");
    }
}
