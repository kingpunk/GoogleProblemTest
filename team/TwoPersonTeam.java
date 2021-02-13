package team;

public class TwoPersonTeam extends BasicTeam {
  public int teamMemeber;

  TwoPersonTeam() {
    super();
    teamMemeber = 2;
  }

public int getTeamMemeber() {
	return teamMemeber;
}

public void setTeamMemeber(int teamMemeber) {
  this.teamMemeber = teamMemeber;
}


//every time a pizza is delivered to that team member, he/she is taken out, when the team memebers reach zero means all the team members recived for that perticular team.
public void pizzaRecevied() {
  this.teamMemeber--;
  if (this.teamMemeber == 0) {
    this.setPizzaRecived(true);
  }
}
  
}
