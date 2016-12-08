package com.parse;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class ParseAnalytics$3
  extends LinkedHashMap<String, Boolean>
{
  protected boolean removeEldestEntry(Map.Entry<String, Boolean> paramEntry)
  {
    return size() > 10;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseAnalytics$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */