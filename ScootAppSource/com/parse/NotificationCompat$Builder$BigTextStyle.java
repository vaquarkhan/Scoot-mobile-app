package com.parse;

public class NotificationCompat$Builder$BigTextStyle
  extends NotificationCompat.Builder.Style
{
  CharSequence mBigText;
  
  public NotificationCompat$Builder$BigTextStyle() {}
  
  public NotificationCompat$Builder$BigTextStyle(NotificationCompat.Builder paramBuilder)
  {
    setBuilder(paramBuilder);
  }
  
  public BigTextStyle bigText(CharSequence paramCharSequence)
  {
    this.mBigText = paramCharSequence;
    return this;
  }
  
  public BigTextStyle setBigContentTitle(CharSequence paramCharSequence)
  {
    this.mBigContentTitle = paramCharSequence;
    return this;
  }
  
  public BigTextStyle setSummaryText(CharSequence paramCharSequence)
  {
    this.mSummaryText = paramCharSequence;
    this.mSummaryTextSet = true;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NotificationCompat$Builder$BigTextStyle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */