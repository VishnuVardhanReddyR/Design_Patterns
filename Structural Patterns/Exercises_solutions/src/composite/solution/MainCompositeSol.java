package composite.solution;

public class MainCompositeSol {
    public static void main(String[] args){
        var subteam1 = new SubTeam();
        subteam1.addMember(new Truck());
        subteam1.addMember(new HumanResource());
        subteam1.addMember(new HumanResource());

        var subTeam2 = new SubTeam();
        subTeam2.addMember(new Truck());
        subTeam2.addMember(new HumanResource());
        subTeam2.addMember(new HumanResource());

        var team = new SubTeam();
        team.addMember(subteam1);
        team.addMember(subTeam2);

        team.deploy();
    }
}
