package com.rex.seb.podcast;

import java.net.URL;

public class Subscription
{
  private String mName;
  private URL mUrl;
  
  public Subscription(String name, URL url)
  {
    mName = name;
    mUrl = url;
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
}
