package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //TODO Define String Array For Numbers From One To Ten
        ArrayList <word> words= new ArrayList<word>();

        words.add(new word("one" , "lutti" , R.drawable.number_one));
        words.add(new word("Two" , "otiiko" , R.drawable.number_two));
        words.add(new word("Three" , "tolookosu" , R.drawable.number_three));
        words.add(new word("Four" , "oyyisa" , R.drawable.number_four));
        words.add(new word("Five" , "massokka" , R.drawable.number_five));
        words.add(new word("Six" , "temmokka" , R.drawable.number_six));
        words.add(new word("Seven" , "kenekaku" , R.drawable.number_seven));
        words.add(new word("Eight" , "kawinta" , R.drawable.number_eight));
        words.add(new word("Nine" , "wo'e" , R.drawable.number_nine));
        words.add(new word("Ten" , "na'aacha" , R.drawable.number_ten));


        wordAdapter adapter = new wordAdapter(this , words);
        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);








    }
}


