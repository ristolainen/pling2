package risto.pling2.matches;

/**
 * Created by krijoh on 2015-04-04.
 */
public class Match {
    private final MatchResult betResult;
    private MatchResult standing = MatchResult.X;
    private final String homeTeam;
    private int homeScore = 0;
    private final String awayTeam;
    private int awayScore = 0;
    private int stakes = 0;

    public Match(MatchResult betResult, String homeTeam, String awayTeam) {
        this.betResult = betResult;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public MatchResult getBetResult() {
        return betResult;
    }

    public MatchResult getStanding() {
        return standing;
    }

    public void setStanding(MatchResult standing) {
        this.standing = standing;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public int getStakes() {
        return stakes;
    }

    public void setStakes(int stakes) {
        this.stakes = stakes;
    }

    @Override
    public String toString() {
        return String.format("%s: %s - %s", standing, homeTeam, awayTeam);
    }
}
