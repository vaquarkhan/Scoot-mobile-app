package android.support.v7.widget;

import android.view.View;

final class fl
{
  static int a(fa paramfa, du paramdu, View paramView1, View paramView2, en paramen, boolean paramBoolean)
  {
    if ((paramen.t() == 0) || (paramfa.e() == 0) || (paramView1 == null) || (paramView2 == null)) {
      return 0;
    }
    if (!paramBoolean) {
      return Math.abs(paramen.d(paramView1) - paramen.d(paramView2)) + 1;
    }
    int i = paramdu.b(paramView2);
    int j = paramdu.a(paramView1);
    return Math.min(paramdu.f(), i - j);
  }
  
  static int a(fa paramfa, du paramdu, View paramView1, View paramView2, en paramen, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    int j = i;
    if (paramen.t() != 0)
    {
      j = i;
      if (paramfa.e() != 0)
      {
        j = i;
        if (paramView1 != null)
        {
          if (paramView2 != null) {
            break label45;
          }
          j = i;
        }
      }
    }
    return j;
    label45:
    i = Math.min(paramen.d(paramView1), paramen.d(paramView2));
    j = Math.max(paramen.d(paramView1), paramen.d(paramView2));
    if (paramBoolean2) {}
    for (i = Math.max(0, paramfa.e() - j - 1);; i = Math.max(0, i))
    {
      j = i;
      if (!paramBoolean1) {
        break;
      }
      j = Math.abs(paramdu.b(paramView2) - paramdu.a(paramView1));
      int k = Math.abs(paramen.d(paramView1) - paramen.d(paramView2));
      float f = j / (k + 1);
      return Math.round(i * f + (paramdu.c() - paramdu.a(paramView1)));
    }
  }
  
  static int b(fa paramfa, du paramdu, View paramView1, View paramView2, en paramen, boolean paramBoolean)
  {
    if ((paramen.t() == 0) || (paramfa.e() == 0) || (paramView1 == null) || (paramView2 == null)) {
      return 0;
    }
    if (!paramBoolean) {
      return paramfa.e();
    }
    int i = paramdu.b(paramView2);
    int j = paramdu.a(paramView1);
    int k = Math.abs(paramen.d(paramView1) - paramen.d(paramView2));
    return (int)((i - j) / (k + 1) * paramfa.e());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\fl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */