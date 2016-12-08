package com.parse;

class PushHistory$Entry
  implements Comparable<Entry>
{
  public String pushId;
  public String timestamp;
  
  public PushHistory$Entry(String paramString1, String paramString2)
  {
    this.pushId = paramString1;
    this.timestamp = paramString2;
  }
  
  public int compareTo(Entry paramEntry)
  {
    return this.timestamp.compareTo(paramEntry.timestamp);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\PushHistory$Entry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */