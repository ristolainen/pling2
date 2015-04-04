package risto.pling2.matches;

import android.app.Activity;
import android.content.Context;
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
        matches.add(new Match('1', "Chelsea", "Stoke"));
        matches.add(new Match('2', "Everton", "Southhampton"));
        matches.add(new Match('2', "Liecester", "West Ham"));
        matches.add(new Match('X', "Manchester United", "Aston Villa"));
        matches.add(new Match('1', "Swansea", "Hull"));
        matches.add(new Match('1', "West Bromwich", "Queens Park Rangers"));
        matches.add(new Match('X', "Bolton", "Blackpool"));
        matches.add(new Match('1', "Leeds", "Blackburn"));
        matches.add(new Match('2', "Reading", "Cardiff"));
        matches.add(new Match('2', "Sheffield W", "Huddersfield"));
        matches.add(new Match('1', "Hamilton", "St Johnston"));
        matches.add(new Match('1', "Kilmarnoc", "Mothersw"));
        matches.add(new Match('X', "Kalmar FF", "Helsingborg"));
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
        TextView standing = (TextView) v.findViewById(R.id.standing);
        standing.setText(String.valueOf(match.getStanding()));
        TextView homeScore = (TextView) v.findViewById(R.id.homeScore);
        homeScore.setText(String.valueOf(match.getHomeScore()));
        TextView homeTeamName = (TextView) v.findViewById(R.id.homeTeamName);
        homeTeamName.setText(match.getHomeTeam());
        TextView awayScore = (TextView) v.findViewById(R.id.awayScore);
        awayScore.setText(String.valueOf(match.getAwayScore()));
        TextView awayTeamName = (TextView) v.findViewById(R.id.awayTeamName);
        awayTeamName.setText(match.getAwayTeam());
        return v;
    }
}
