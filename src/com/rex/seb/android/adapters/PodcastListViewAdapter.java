package com.rex.seb.android.adapters;

import java.net.URL;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.rex.seb.podcast.R;
import com.rex.seb.podcast.Subscription;

public class PodcastListViewAdapter extends ArrayAdapter<Subscription>
{
  Context mContext;
  
  private class SubscriptionViewHolder
  {
    TextView txtTitle;
  }
  
  public PodcastListViewAdapter(Context context, int resourceId, List<Subscription> subs)
  {
    super(context, resourceId, subs);
    this.mContext = context;
  }
  
  @Override
  public View getView(int position, View convertView, ViewGroup parent)
  {
    SubscriptionViewHolder holder = null;
    Subscription sub = getItem(position);
    
    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
    
    if (convertView == null)
    {
      convertView = inflater.inflate(R.layout.podcast_list_item, null);
      holder = new SubscriptionViewHolder();
      holder.txtTitle = (TextView) convertView.findViewById(R.id.title);
      convertView.setTag(holder);
    }
    else
    {
      holder = (SubscriptionViewHolder) convertView.getTag();
    }
    
    holder.txtTitle.setText(sub.getName());
    
    return convertView;
  }
}

