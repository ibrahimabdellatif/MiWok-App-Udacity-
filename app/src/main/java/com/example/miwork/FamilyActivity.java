package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //TODO Define String Array For Numbers From One To Ten
        final ArrayList<word> words= new ArrayList<word>();

        words.add(new word("Father" , "әpә" , R.drawable.family_father , R.raw.family_father ));
        words.add(new word("Mother" , "әṭa" , R.drawable.family_mother  , R.raw.family_mother));
        words.add(new word("Son" , "angsi" , R.drawable.family_son , R.raw.family_son));
        words.add(new word("Daughter" , "tune" , R.drawable.family_daughter , R.raw.family_daughter));
        words.add(new word("Older Brother" , "taachi" , R.drawable.family_older_brother , R.raw.family_older_brother));
        words.add(new word("Younger Brother" , "chalitti" , R.drawable.family_younger_brother , R.raw.family_younger_brother));
        words.add(new word("Older Sister" , "teṭe" , R.drawable.family_older_sister , R.raw.family_older_sister));
        words.add(new word("Younger Sister" , "kolliti" , R.drawable.family_younger_sister , R.raw.family_younger_sister));
        words.add(new word("GrandMother" , "ama" , R.drawable.family_grandmother , R.raw.family_grandmother));
        words.add(new word("GrandFather" , "paapa" , R.drawable.family_grandfather , R.raw.family_grandfather));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
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
                MediaPlayer player = MediaPlayer.create(FamilyActivity.this , word.getMaudioResourceID());
                player.start();
            }
        });
    }
}
