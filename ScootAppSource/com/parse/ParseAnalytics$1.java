package com.parse;

import a.l;
import a.m;
import a.o;

final class ParseAnalytics$1
  implements m<String, o<Void>>
{
  ParseAnalytics$1(l paraml) {}
  
  public o<Void> then(o<String> paramo)
  {
    paramo = (String)paramo.f();
    return ParseAnalytics.getAnalyticsController().trackAppOpenedInBackground((String)this.val$pushHash.a(), paramo);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseAnalytics$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */