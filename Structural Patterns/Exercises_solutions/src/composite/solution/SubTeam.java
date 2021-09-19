package composite.solution;

import java.util.ArrayList;
import java.util.List;

public class SubTeam implements Team{
    private List<Team> teams = new ArrayList<>();

    public void addMember(Team team){
        teams.add(team);
    }

    @Override
    public void deploy() {
        for(var team : teams){
            team.deploy();
        }
    }
}
