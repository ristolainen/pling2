package risto.pling2.matches;

/**
 * Created by krijoh on 2015-04-04.
 */
public class Match {
    private final char standing;
    private final String homeTeam;
    private final String awayTeam;

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

    public String getAwayTeam() {
        return awayTeam;
    }

    @Override
    public String toString() {
        return String.format("%s: %s - %s", standing, homeTeam, awayTeam);
    }
}
