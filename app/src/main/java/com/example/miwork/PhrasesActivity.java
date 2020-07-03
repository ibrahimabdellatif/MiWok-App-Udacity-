package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //TODO Define String Array For Numbers From One To Ten
        ArrayList<word> words= new ArrayList<word>();

        words.add(new word("Where are you going?" , "minto wuksus" ));
        words.add(new word("What is your name?" , "tinnә oyaase'nә"));
        words.add(new word("My name is..." , "oyaaset..."));
        words.add(new word("How are you feeling?" , "michәksәs?"));
        words.add(new word("I’m feeling good." , "kuchi achit"));
        words.add(new word("Are you coming?" , "әәnәs'aa?"));
        words.add(new word("Yes, I’m coming." , "hәә’ әәnәm"));
        words.add(new word("I’m coming" , "әәnәm"));
        words.add(new word("Let's go." , "yoowutis"));
        words.add(new word("Come here" , "әnni'nem"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        wordAdapter adapter = new wordAdapter(this , words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
