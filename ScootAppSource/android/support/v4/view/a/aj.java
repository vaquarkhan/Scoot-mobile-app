package android.support.v4.view.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

final class aj
  implements aq
{
  aj(ai paramai, ae paramae) {}
  
  public Object a(int paramInt)
  {
    l locall = this.a.a(paramInt);
    if (locall == null) {
      return null;
    }
    return locall.a();
  }
  
  public List<Object> a(String paramString, int paramInt)
  {
    paramString = this.a.a(paramString, paramInt);
    ArrayList localArrayList = new ArrayList();
    int i = paramString.size();
    paramInt = 0;
    while (paramInt < i)
    {
      localArrayList.add(((l)paramString.get(paramInt)).a());
      paramInt += 1;
    }
    return localArrayList;
  }
  
  public boolean a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return this.a.a(paramInt1, paramInt2, paramBundle);
  }
  
  public Object b(int paramInt)
  {
    l locall = this.a.b(paramInt);
    if (locall == null) {
      return null;
    }
    return locall.a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\a\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */