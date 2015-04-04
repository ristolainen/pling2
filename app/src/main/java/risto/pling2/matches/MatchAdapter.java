package risto.pling2.matches;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import risto.pling2.R;

/**
 * Created by krijoh on 2015-04-04.
 */
public class MatchAdapter extends BaseAdapter {
    private List<Match> matches = new ArrayList<>();

    {
        matches.add(new Match(MatchResult.I, "Chelsea", "Stoke"));
        matches.add(new Match(MatchResult.II, "Everton", "Southhampton"));
        matches.add(new Match(MatchResult.II, "Liecester", "West Ham"));
        matches.add(new Match(MatchResult.X, "Manchester United", "Aston Villa"));
        matches.add(new Match(MatchResult.X, "Swansea", "Hull"));
        matches.add(new Match(MatchResult.I, "West Bromwich", "Queens Park Rangers"));
        matches.add(new Match(MatchResult.X, "Bolton", "Blackpool"));
        matches.add(new Match(MatchResult.I, "Leeds", "Blackburn"));
        matches.add(new Match(MatchResult.II, "Reading", "Cardiff"));
        matches.add(new Match(MatchResult.II, "Sheffield W", "Huddersfield"));
        matches.add(new Match(MatchResult.I, "Hamilton", "St Johnston"));
        matches.add(new Match(MatchResult.I, "Kilmarnoc", "Mothersw"));
        matches.add(new Match(MatchResult.X, "Kalmar FF", "Helsingborg"));
    }

    private final Activity activity;

    public MatchAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return matches.size();
    }

    @Override
    public Object getItem(int position) {
        return matches.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Match match = matches.get(position);
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.match, null);
        TextView result = (TextView) v.findViewById(R.id.betResult);
        result.setText(String.valueOf(match.getBetResult().getSymbol()));
        TextView homeScore = (TextView) v.findViewById(R.id.homeScore);
        homeScore.setText(String.valueOf(match.getHomeScore()));
        TextView homeTeamName = (TextView) v.findViewById(R.id.homeTeamName);
        homeTeamName.setText(match.getHomeTeam());
        TextView awayScore = (TextView) v.findViewById(R.id.awayScore);
        awayScore.setText(String.valueOf(match.getAwayScore()));
        TextView awayTeamName = (TextView) v.findViewById(R.id.awayTeamName);
        awayTeamName.setText(match.getAwayTeam());
        TextView standing = (TextView) v.findViewById(R.id.standing);
        standing.setText(String.valueOf(match.getStanding().getSymbol()));
        TextView stakes = (TextView) v.findViewById(R.id.stakes);
        stakes.setText(String.valueOf(match.getStakes()));
        if (match.getBetResult() == match.getStanding()) {
            v.setBackgroundColor(Color.argb(255, 200, 255, 200));
        }
        return v;
    }
}
