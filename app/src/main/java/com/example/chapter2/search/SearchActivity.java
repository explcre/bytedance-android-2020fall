package com.example.chapter2.search;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chapter2.R;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    private static final String TAG = "SearchActivity";

    private RecyclerView mRecyclerView;
    private SearchAdapter mSearchAdapter = new SearchAdapter();

    private SearchLayout mSearchLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mRecyclerView = findViewById(R.id.rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mSearchAdapter);

        final List<String> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add("This is the " + i + "-th data");
        }
        mSearchAdapter.notifyItems(items);

        mSearchLayout = findViewById(R.id.search);
        mSearchLayout.setOnSearchTextChangedListener(new SearchLayout.OnSearchTextChangedListener() {
            @Override
            public void afterChanged(String text) {
                Log.i(TAG, "afterChanged: " + text);
                List<String> filters = new ArrayList<>();
                for (String item : items) {
                    if (item.contains(text)) {
                        filters.add(item);
                    }
                }
                mSearchAdapter.notifyItems(filters);
            }
        });

    }
}