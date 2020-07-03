package com.example.miwork;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.ListIterator;

public class wordAdapter extends ArrayAdapter<word> {
    private int colorID;

    public wordAdapter(@NonNull Context context, ArrayList<word> words) {
        super(context, 0, words);

    }

    // stop here
    @NonNull
    @Override

    //the int position is the index of array , convert view is response about scrolling up and down
    //, the parent is response about list view
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            // this is a fixed step
            LayoutInflater listitem = LayoutInflater.from(getContext());
            convertView = listitem.inflate(R.layout.items_list, parent, false);

        }
        // Get the object located at this position in the list
        word currentword = getItem(position);
        // find the TextView in the List_item.xml layout with the ID miWok_TextView.
        TextView miwokWord = convertView.findViewById(R.id.miwok_word);
        // Get the mi wok translation from the currentWord object and set this text on
        //the MiWok translation.
        // settext word
        miwokWord.setText(currentword.getMiwokTranslation());
        TextView defaultWord = convertView.findViewById(R.id.default_word);
        defaultWord.setText(currentword.getDefaultTranslation());
        // find the image resource
        ImageView imageIcon = (ImageView) convertView.findViewById(R.id.icon);
        // visiability.Gone تعني ان الصورة مش هتظهر والمكان الي كانت هتظهر فيه هيختفي
        // visability . Invisable تعني ان الصورة مش هتظهر ولكن هيكون المكان بتاعها لسه موجود
        // visability.Visable تعني ان الصورة هتظهر عادي بشكل طبيعي
        // if statment for check
        if (currentword.hasImage()) {
            imageIcon.setImageResource(currentword.getImageReasourceID());
        } else {
            imageIcon.setVisibility(View.GONE);
        }
        // return the whole list item layout (contain 2 TextView and 1 imageView ) so
        //that can be shown in ListView.
        // Find the color that the resource ID maps to
        return convertView;


    }


}




