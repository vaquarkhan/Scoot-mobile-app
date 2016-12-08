package android.support.v4.b;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

final class t
{
  final IntentFilter a;
  final BroadcastReceiver b;
  boolean c;
  
  t(IntentFilter paramIntentFilter, BroadcastReceiver paramBroadcastReceiver)
  {
    this.a = paramIntentFilter;
    this.b = paramBroadcastReceiver;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("Receiver{");
    localStringBuilder.append(this.b);
    localStringBuilder.append(" filter=");
    localStringBuilder.append(this.a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */