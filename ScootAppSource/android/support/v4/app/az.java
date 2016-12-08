package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

final class az
  extends Transition.EpicenterCallback
{
  private Rect b;
  
  az(bb parambb) {}
  
  public Rect onGetEpicenter(Transition paramTransition)
  {
    if ((this.b == null) && (this.a.a != null)) {
      this.b = aw.b(this.a.a);
    }
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */