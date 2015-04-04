package risto.pling2.matches;

/**
 * Created by krijoh on 2015-04-04.
 */
public class Match {
    private final char standing;
    private final String homeTeam;
    private int homeScore = 0;
    private final String awayTeam;
    private int awayScore = 0;

    public Match(char standing, String homeTeam, String awayTeam) {
        this.standing = standing;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public char getStanding() {
        return standing;
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

    @Override
    public String toString() {
        return String.format("%s: %s - %s", standing, homeTeam, awayTeam);
    }
}
