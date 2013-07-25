package com.rex.seb.podcast;

import java.net.URL;

public class Subscription
{
  private String mName;
  private URL mUrl;
  private String mDescr;
  
  public Subscription(String name, String descr)
  {
    mName = name;
    mDescr = descr;
  }
  
  /** Accessors for member variables **/
  public String getName()
  {
    return mName;
  }
  
  public URL getURL()
  {
    return mUrl;
  }
  
  public String getDescr()
  {
    return mDescr;
  }
  
  @Override
  public String toString()
  {
    // WE'll need this for the ListView, I think
    return mName + "\n" + mDescr;
  }
}
