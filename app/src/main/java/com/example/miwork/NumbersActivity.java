package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //TODO Define String Array For Numbers From One To Ten
        final ArrayList <word> words= new ArrayList<word>();

        words.add(new word("one" , "lutti" , R.drawable.number_one , R.raw.number_one));
        words.add(new word("Two" , "otiiko" , R.drawable.number_two ,R.raw.number_two ));
        words.add(new word("Three" , "tolookosu" , R.drawable.number_three , R.raw.number_three));
        words.add(new word("Four" , "oyyisa" , R.drawable.number_four , R.raw.number_four));
        words.add(new word("Five" , "massokka" , R.drawable.number_five , R.raw.number_five));
        words.add(new word("Six" , "temmokka" , R.drawable.number_six , R.raw.number_six));
        words.add(new word("Seven" , "kenekaku" , R.drawable.number_seven , R.raw.number_seven));
        words.add(new word("Eight" , "kawinta" , R.drawable.number_eight , R.raw.number_eight));
        words.add(new word("Nine" , "wo'e" , R.drawable.number_nine , R.raw.number_nine));
        words.add(new word("Ten" , "na'aacha" , R.drawable.number_ten , R.raw.number_ten));


        wordAdapter adapter = new wordAdapter(this , words);
        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                word word = words.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                player = MediaPlayer.create(NumbersActivity.this, word.getMaudioResourceID());

                // Start the audio file
                player.start();
            }
        });







    }
}


