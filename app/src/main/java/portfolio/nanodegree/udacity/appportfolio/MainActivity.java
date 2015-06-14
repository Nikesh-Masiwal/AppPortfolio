package portfolio.nanodegree.udacity.appportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements OnClickListener {

    private Button spotifyBtn,scoresBtn,libraryBtn,biggerBtn,readerBtn,capstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        spotifyBtn = (Button) findViewById(R.id.streamBtn);
        spotifyBtn.setOnClickListener(this);

        scoresBtn = (Button) findViewById(R.id.scoresBtn);
        scoresBtn.setOnClickListener(this);

        libraryBtn = (Button) findViewById(R.id.libraryBtn);
        libraryBtn.setOnClickListener(this);

        biggerBtn = (Button) findViewById(R.id.biggerBtn);
        biggerBtn.setOnClickListener(this);

        readerBtn = (Button) findViewById(R.id.baconBtn);
        readerBtn.setOnClickListener(this);

        capstoneBtn = (Button) findViewById(R.id.captoneBtn);
        capstoneBtn.setOnClickListener(this);




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

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.streamBtn: /** Start Spotify Streamer */

                Toast.makeText(getBaseContext(),"This Button will open my Spotify Streamer App",Toast.LENGTH_SHORT).show();

                break;

            case R.id.scoresBtn: /**  Start Scores App  */

                Toast.makeText(getBaseContext(),"This Button will open my Scores App",Toast.LENGTH_SHORT).show();

                break;

            case R.id.libraryBtn: /**  Start Library App */

                Toast.makeText(getBaseContext(),"This Button will open my Library App",Toast.LENGTH_SHORT).show();

                break;

            case R.id.biggerBtn: /** Build it Bigger App */

                Toast.makeText(getBaseContext(),"This Button will open my Build it Bigger App",Toast.LENGTH_SHORT).show();

                break;

            case R.id.baconBtn: /** Start Bacon App */

                Toast.makeText(getBaseContext(),"This Button will open my Bacon App",Toast.LENGTH_SHORT).show();

                break;

            case R.id.captoneBtn: /** Start Captone App */

                Toast.makeText(getBaseContext(),"This Button will open my Captone App",Toast.LENGTH_SHORT).show();

                break;

            default:

                Toast.makeText(getBaseContext(),"Error,Reached undefined case",Toast.LENGTH_SHORT).show();

                break;


        }


    }
}
