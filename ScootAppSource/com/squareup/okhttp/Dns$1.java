package com.squareup.okhttp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

final class Dns$1
  implements Dns
{
  public List<InetAddress> lookup(String paramString)
  {
    if (paramString == null) {
      throw new UnknownHostException("hostname == null");
    }
    return Arrays.asList(InetAddress.getAllByName(paramString));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\Dns$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */