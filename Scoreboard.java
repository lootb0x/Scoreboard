public class Scoreboard
{
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String active;

        public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
        active = teamOne;

    }
    public String getScore()
        {
            return teamOneScore + "-" + teamTwoScore + "-" + active;
        }
    
    public void recordPlay(int score)
    {  
        if(teamOne.equals(active))  
        {teamOneScore += score;}
        if(teamTwo.equals(active))  
        {teamTwoScore += score;}
        
        if(score == 0)
        {
            if(active.equals(teamOne)) active = teamTwo;
            else if(active.equals(teamTwo)) active = teamOne;
        }

    }
    
}