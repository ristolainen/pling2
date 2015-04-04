package risto.pling2.matches;

/**
 * Created by krijoh on 2015-04-04.
 */
public enum MatchResult {
    I('1'), X('X'), II('2');

    private char symbol;

    private MatchResult(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
