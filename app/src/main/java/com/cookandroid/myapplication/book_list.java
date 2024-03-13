package com.cookandroid.myapplication;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.cookandroid.myapplication.R.layout;

public class book_list extends AppCompatActivity {
    public book_list() {
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.book_list);
    }
}
