package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import com.example.miwork.NumbersActivity;
import com.example.miwork.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // set button

        // find the view that shows number category
        TextView number = (TextView) findViewById(R.id.numbers);
        // set a click listener on view
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // make Toast that show what happen when you click on Numbers List
                Toast.makeText(view.getContext(),
                        "open number of list" , Toast.LENGTH_SHORT).show();
                // create a new intent to show (@Link Numbers Activity)
                Intent Numberintent = new Intent(MainActivity.this ,
                        NumbersActivity.class);
                // start new Activity
                startActivity(Numberintent);
            }

        });
        //find the view that shows family category
        final TextView family = (TextView) findViewById(R.id.family);
        // set a click listener on view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // make Toast that show what happen when you click on Family List
                Toast.makeText(view.getContext(),"Open Family List",Toast.LENGTH_SHORT).show();
                // create a new intent to show (@Link Family Activity)
                Intent familyintent = new Intent(MainActivity.this , FamilyActivity.class);
                //start the new activity
                startActivity(familyintent);
            }
        });
        TextView color =(TextView) findViewById(R.id.colors);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext() , "open Colors List ",Toast.LENGTH_SHORT).show();
                Intent familyintent = new Intent(MainActivity.this , ColorsActivity.class);
                startActivity(familyintent);
            }
        });
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Open Phrases List" , Toast.LENGTH_SHORT).show();
                Intent phrasesintent = new Intent(MainActivity.this , PhrasesActivity.class);
                startActivity(phrasesintent);
            }
        });


    }


}
