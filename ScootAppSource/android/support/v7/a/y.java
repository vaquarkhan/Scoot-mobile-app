package android.support.v7.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

final class y
  extends ArrayAdapter<CharSequence>
{
  y(x paramx, Context paramContext, int paramInt1, int paramInt2, CharSequence[] paramArrayOfCharSequence, ListView paramListView)
  {
    super(paramContext, paramInt1, paramInt2, paramArrayOfCharSequence);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramView = super.getView(paramInt, paramView, paramViewGroup);
    if ((this.b.C != null) && (this.b.C[paramInt] != 0)) {
      this.a.setItemChecked(paramInt, true);
    }
    return paramView;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */