package com.rex.seb.podcast;

import java.util.ArrayList;
import java.util.List;

import com.rex.seb.android.adapters.PodcastListViewAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity
{

  //------------------------------------------------
  // I should use a ListView and an ArrayAdapter to populate the list programatically
  //------------------------------------------------

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    List<Subscription> subs = new ArrayList<Subscription>();
    Subscription sub1 = new Subscription("title1", "description1");
    Subscription sub2 = new Subscription("title2", "description2");
    
    subs.add(sub1);
    subs.add(sub2);
    
    ListView listView = (ListView) findViewById(R.id.list);
    PodcastListViewAdapter adapter = new PodcastListViewAdapter(this, R.layout.podcast_list_item, subs);
    
    listView.setAdapter(adapter);
  }
}
