package android.support.design.widget;

import android.support.v4.view.cb;
import android.view.ViewPropertyAnimator;

class al
  extends af
{
  private boolean m;
  
  al(de paramde, ax paramax)
  {
    super(paramde, paramax);
  }
  
  private void e(float paramFloat)
  {
    if (this.a != null) {
      this.a.a(-paramFloat);
    }
    if (this.d != null) {
      this.d.b(-paramFloat);
    }
  }
  
  void a(aq paramaq, boolean paramBoolean)
  {
    if ((this.m) || (this.k.getVisibility() != 0)) {
      if (paramaq != null) {
        paramaq.b();
      }
    }
    do
    {
      return;
      if ((cb.F(this.k)) && (!this.k.isInEditMode())) {
        break;
      }
      this.k.a(8, paramBoolean);
    } while (paramaq == null);
    paramaq.b();
    return;
    this.k.animate().cancel();
    this.k.animate().scaleX(0.0F).scaleY(0.0F).alpha(0.0F).setDuration(200L).setInterpolator(a.c).setListener(new am(this, paramBoolean, paramaq));
  }
  
  void b(aq paramaq, boolean paramBoolean)
  {
    if ((this.m) || (this.k.getVisibility() != 0))
    {
      if ((!cb.F(this.k)) || (this.k.isInEditMode())) {
        break label127;
      }
      this.k.animate().cancel();
      if (this.k.getVisibility() != 0)
      {
        this.k.setAlpha(0.0F);
        this.k.setScaleY(0.0F);
        this.k.setScaleX(0.0F);
      }
      this.k.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setDuration(200L).setInterpolator(a.d).setListener(new an(this, paramBoolean, paramaq));
    }
    label127:
    do
    {
      return;
      this.k.a(0, paramBoolean);
      this.k.setAlpha(1.0F);
      this.k.setScaleY(1.0F);
      this.k.setScaleX(1.0F);
    } while (paramaq == null);
    paramaq.a();
  }
  
  boolean d()
  {
    return true;
  }
  
  void e()
  {
    e(this.k.getRotation());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */