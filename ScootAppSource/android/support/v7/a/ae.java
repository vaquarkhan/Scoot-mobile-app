package android.support.v7.a;

import android.content.Context;
import android.widget.ArrayAdapter;

final class ae
  extends ArrayAdapter<CharSequence>
{
  public ae(Context paramContext, int paramInt1, int paramInt2, CharSequence[] paramArrayOfCharSequence)
  {
    super(paramContext, paramInt1, paramInt2, paramArrayOfCharSequence);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */