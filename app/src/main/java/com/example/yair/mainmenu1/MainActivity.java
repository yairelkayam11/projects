package com.example.yair.mainmenu1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout LL;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LL = (LinearLayout) findViewById(R.id.LL);
        btn = (Button) findViewById(R.id.btn);
    }

    public boolean onCreateOptionsMenu (Menu menu) {



        getMenuInflater().inflate(R.menu.main, menu);

        return true;
        }

        public boolean onOptionsItemSelected(MenuItem item) {

        String st = item.getTitle().toString();

        if (st.equals("Red"))
            LL.setBackgroundColor(Color.RED);
        if (st.equals("Blue"))
            LL.setBackgroundColor(Color.BLUE);
        if (st.equals("Pink"))
            LL.setBackgroundColor(Color.MAGENTA);

        return true;

        }

        public void yair(View view) {

            Intent go = new Intent(this, Main2Activity.class);
            startActivity(go);
        }
    }
