package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class dg
  implements AdapterView.OnItemSelectedListener
{
  dg(dd paramdd) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt != -1)
    {
      paramAdapterView = dd.a(this.a);
      if (paramAdapterView != null) {
        dh.a(paramAdapterView, false);
      }
    }
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */