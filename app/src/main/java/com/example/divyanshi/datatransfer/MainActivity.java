package com.example.divyanshi.datatransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button tr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tr = (Button)findViewById(R.id.transfer);
       final EditText name = (EditText)findViewById(R.id.etname);
        final EditText age = (EditText)findViewById(R.id.etage);
         final EditText id = (EditText)findViewById(R.id.etid);

     tr.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick(View v)
         {
             Intent intent = new Intent(getApplicationContext(),transferActivity.class);
             intent.putExtra("name",name.getText().toString());
             int aget = Integer.parseInt(age.getText().toString());
             intent.putExtra("age",aget);
             int idt = Integer.parseInt(id.getText().toString());
             intent.putExtra("id",idt);
             startActivity(intent);
         }
     });
    }
}
