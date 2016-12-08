package android.support.v7.widget;

import android.support.v7.a.d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

final class fo
  extends BaseAdapter
{
  private fo(fm paramfm) {}
  
  public int getCount()
  {
    return fm.a(this.a).getChildCount();
  }
  
  public Object getItem(int paramInt)
  {
    return ((fq)fm.a(this.a).getChildAt(paramInt)).b();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      return fm.a(this.a, (d)getItem(paramInt), true);
    }
    ((fq)paramView).a((d)getItem(paramInt));
    return paramView;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\fo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */