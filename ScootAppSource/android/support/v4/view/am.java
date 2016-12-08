package android.support.v4.view;

import android.view.LayoutInflater;

final class am
{
  static ar a(LayoutInflater paramLayoutInflater)
  {
    paramLayoutInflater = paramLayoutInflater.getFactory();
    if ((paramLayoutInflater instanceof an)) {
      return ((an)paramLayoutInflater).a;
    }
    return null;
  }
  
  static void a(LayoutInflater paramLayoutInflater, ar paramar)
  {
    if (paramar != null) {}
    for (paramar = new an(paramar);; paramar = null)
    {
      paramLayoutInflater.setFactory(paramar);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */