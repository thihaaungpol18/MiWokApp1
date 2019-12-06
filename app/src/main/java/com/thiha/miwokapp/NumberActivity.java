package com.thiha.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ListView listView = findViewById(R.id.list);


        ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("One", "Lut:i", R.drawable.number_one));
        words.add(new Word("Two", "’oṭi:ko", R.drawable.number_two));
        words.add(new Word("Three", "tolo:koshu", R.drawable.number_three));
        words.add(new Word("Four", "’oy:is:a", R.drawable.number_four));
        words.add(new Word("Five", "mash:ok:a", R.drawable.number_five));
        words.add(new Word("Six", "tem:ok:a", R.drawable.number_six));
        words.add(new Word("Seven", "kenek:aku", R.drawable.number_seven));
        words.add(new Word("Eight", "kaw:inṭa", R.drawable.number_eight));
        words.add(new Word("Nine", "Wo'e", R.drawable.number_nine));
        words.add(new Word("Ten", "na’a:cha", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        listView.setAdapter(adapter);

    }
}
