package risto.pling2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import risto.pling2.matches.Match;


public class MainActivity extends ActionBarActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView matchList = (ListView) findViewById(R.id.matchList);
        final ArrayAdapter<Match> adapter = new ArrayAdapter<Match>(this, android.R.layout.simple_list_item_1, matches);
        matchList.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
