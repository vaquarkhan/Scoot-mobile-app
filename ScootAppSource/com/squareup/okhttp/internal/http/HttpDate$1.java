package com.squareup.okhttp.internal.http;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

final class HttpDate$1
  extends ThreadLocal<DateFormat>
{
  protected DateFormat initialValue()
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
    localSimpleDateFormat.setLenient(false);
    localSimpleDateFormat.setTimeZone(HttpDate.access$000());
    return localSimpleDateFormat;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpDate$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */