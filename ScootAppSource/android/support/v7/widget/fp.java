package android.support.v7.widget;

import android.support.v7.a.d;
import android.view.View;
import android.view.View.OnClickListener;

final class fp
  implements View.OnClickListener
{
  private fp(fm paramfm) {}
  
  public void onClick(View paramView)
  {
    ((fq)paramView).b().d();
    int j = fm.a(this.a).getChildCount();
    int i = 0;
    if (i < j)
    {
      View localView = fm.a(this.a).getChildAt(i);
      if (localView == paramView) {}
      for (boolean bool = true;; bool = false)
      {
        localView.setSelected(bool);
        i += 1;
        break;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\fp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */