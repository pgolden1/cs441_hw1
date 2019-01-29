package com.example.myfirstapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            String[] possibleStrings = {"Now I'm over here! Hello World!",
                                        "Lookie over here! Hello World!",
                                        "Do ya see me Hello Worlding over here?",
                                        "Hello World!",
                                        "System.out.println(\"Hello World!\");",
                                        "printf(\"Hello World!\");",
                                        "cout << \"Hello World!\" << endl;",
                                        "Hello from CS 441!",
                                        "Greetings silly human, take me to your leader!",
                                        "echo Hello World!"
                                        };
            @Override
            public void onClick(View view) {
                Random randNumGen = new Random();
                TextView helloTextView = (TextView) findViewById(R.id.label1);

                int nextText = randNumGen.nextInt(possibleStrings.length);
                helloTextView.setText(possibleStrings[nextText]);

                int randomColor = randNumGen.nextInt(16777215);
                String color = "#" + Integer.toHexString(randomColor);
                helloTextView.setTextColor(Color.parseColor(color));

                // reposition text

                // change font stuff

                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                       // .setAction("Action", null).show();
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
}
