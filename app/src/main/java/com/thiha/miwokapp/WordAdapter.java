package com.thiha.miwokapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {

    int mColorCode;
    View linearLayout;


    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects, int colorCode) {
        super(context, 0, objects);
        mColorCode = colorCode;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        TextView defaultTV, miwokTV;
        ImageView imageView;

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = (Word) getItem(position);

        defaultTV = listItemView.findViewById(R.id.defaultTV);
        miwokTV = listItemView.findViewById(R.id.miwokTV);
        imageView = listItemView.findViewById(R.id.imageView);

        defaultTV.setText(currentWord.getDefaultTranslation());

        miwokTV.setText(currentWord.getMiwokTranslation());


        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getmImageResource());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }


        int color = ContextCompat.getColor(getContext(), mColorCode);

        linearLayout = listItemView.findViewById(R.id.linearLayout);
        linearLayout.setBackgroundColor(color);


        return listItemView;
    }
}
