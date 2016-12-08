package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;

class an
  implements LayoutInflater.Factory
{
  final ar a;
  
  an(ar paramar)
  {
    this.a = paramar;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.a.a(null, paramString, paramContext, paramAttributeSet);
  }
  
  public String toString()
  {
    return getClass().getName() + "{" + this.a + "}";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */