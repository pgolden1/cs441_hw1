package com.example.myfirstapp;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
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

            String[] possibleStrings = {"Hello World in this style of text!",
                                        "Have you seen enough Hello Worlds yet?",
                                        "Hello World!",
                                        "System.out.println(\"Hello World!\");",
                                        "printf(\"Hello World!\");",
                                        "cout << \"Hello World!\" << endl;",
                                        "Hello from CS 441!",
                                        "Greetings silly human, take me to your leader!",
                                        "echo Hello World!",
                                        "Hello World in this text color!"
                                        };

            Typeface[] possibleTypefaces = {Typeface.MONOSPACE,
                                            Typeface.SERIF,
                                            Typeface.SANS_SERIF,
                                            Typeface.DEFAULT
                                        };

            @Override
            public void onClick(View view) {
                Random randNumGen = new Random();
                TextView helloTextView = (TextView) findViewById(R.id.label1);

                //change text
                int nextText = randNumGen.nextInt(possibleStrings.length);
                helloTextView.setText(possibleStrings[nextText]);

                //change color of text
                int randomColor = randNumGen.nextInt(16777215);
                String color = "#" + Integer.toHexString(randomColor);
                helloTextView.setTextColor(Color.parseColor(color));

                // change text style
                int nextStyle = randNumGen.nextInt(3);
                int nextTF = randNumGen.nextInt(possibleTypefaces.length);
                helloTextView.setTypeface(possibleTypefaces[nextTF], nextStyle);

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
