package com.squareup.okhttp;

import java.net.InetAddress;
import java.util.List;

public abstract interface Dns
{
  public static final Dns SYSTEM = new Dns.1();
  
  public abstract List<InetAddress> lookup(String paramString);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\Dns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */