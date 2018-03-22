package com.example.divyanshi.datatransfer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class transferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        TextView rct = (TextView)findViewById(R.id.receiveddata);
        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {
            String name = bundle.getString("name");
            int age = bundle.getInt("age", 0);
            int id = bundle.getInt("id", 0);
            rct.setText("   NAME IS: " + name + " AGE IS: " + age + " ID IS: " + id);
        }

    }

}
