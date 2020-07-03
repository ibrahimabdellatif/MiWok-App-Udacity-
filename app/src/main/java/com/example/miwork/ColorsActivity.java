package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //TODO Define String Array For Numbers From One To Ten
        final ArrayList<word> words= new ArrayList<word>();

        words.add(new word("Red" , "weṭeṭṭi" , R.drawable.color_red , R.raw.color_red));
        words.add(new word("Green" , "chokokki" , R.drawable.color_green , R.raw.color_green));
        words.add(new word("Brown" , "ṭakaakk" , R.drawable.color_brown , R.raw.color_brown));
        words.add(new word("Gray " , "ṭopoppi" , R.drawable.color_gray , R.raw.color_gray));
        words.add(new word("Black" , "kululli" , R.drawable.color_black , R.raw.color_black));
        words.add(new word("White" , "kelelli" , R.drawable.color_white , R.raw.color_white));
        words.add(new word("Dusty Yellow" , "topiisә" , R.drawable.color_dusty_yellow , R.raw.color_dusty_yellow));
        words.add(new word("Mustard Yellow" , "chiwiiṭә" , R.drawable.color_mustard_yellow , R.raw.color_mustard_yellow));


        // Create an {@link ArrayAdapter}, whose data sourceME is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        wordAdapter adapter = new wordAdapter(this , words);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word word = words.get(position);
              MediaPlayer  player = MediaPlayer.create(ColorsActivity.this, word.getMaudioResourceID());
              player.start();

            }
        });
    }
}
