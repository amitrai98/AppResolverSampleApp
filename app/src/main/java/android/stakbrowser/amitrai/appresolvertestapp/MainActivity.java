package android.stakbrowser.amitrai.appresolvertestapp;

import android.os.Bundle;
import android.stakbrowser.amitrai.andoridlibraryproject.AppResolver;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView list_options = null;

    final ArrayList<String> list = new ArrayList<String>();

    private ArrayAdapter<String> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();

//        AppResolver.openYouTube(this, "https://www.youtube.com/user/tseries");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
     * initalizing view elements
     */
    private void init(){
        list_options = (ListView) findViewById(R.id.list_options);

        list.add("Facebook");
        list.add("Twitter");
        list.add("Linkedin");
        list.add("Youtube");
        list.add("Gplus");
        list.add("Bloger");
        list.add("Pinterest");
        list.add("Instagram");

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list);

        list_options.setAdapter(adapter);

        list_options.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        AppResolver.resolve(MainActivity.this, "https://www.facebook.com/adamxadam");
                        break;
                    case 1:
                        AppResolver.resolve(MainActivity.this, "https://twitter.com/narendramodi");
                        break;
                    case 2:
                        AppResolver.resolve(MainActivity.this, "https://www.linkedin.com/company/infosys");
                        break;
                    case 3:
                        AppResolver.resolve(MainActivity.this, "https://www.youtube.com/user/TEDtalksDirector");
                        break;
                    case 4:
                        AppResolver.resolve(MainActivity.this, "https://plus.google.com/me");
                        break;
                    case 5:
                        AppResolver.resolve(MainActivity.this, "android-developers.blogspot.com/");
                        break;
                    case 6:
                        AppResolver.resolve(MainActivity.this, "https://www.pinterest.com/tednews/");
                        break;
                    case 7:
                        AppResolver.resolve(MainActivity.this, "https://www.instagram.com/ted/");
                        break;


                }

            }
        });
    }
}
