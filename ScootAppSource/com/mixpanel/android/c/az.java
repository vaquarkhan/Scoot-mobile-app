package com.mixpanel.android.c;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

final class az
{
  private boolean a(TreeMap<View, List<View>> paramTreeMap, View paramView, List<View> paramList)
  {
    if (paramList.contains(paramView)) {
      return false;
    }
    if (paramTreeMap.containsKey(paramView))
    {
      List localList = (List)paramTreeMap.remove(paramView);
      paramList.add(paramView);
      int j = localList.size();
      int i = 0;
      while (i < j)
      {
        if (!a(paramTreeMap, (View)localList.get(i), paramList)) {
          return false;
        }
        i += 1;
      }
      paramList.remove(paramView);
    }
    return true;
  }
  
  public boolean a(TreeMap<View, List<View>> paramTreeMap)
  {
    ArrayList localArrayList = new ArrayList();
    while (!paramTreeMap.isEmpty()) {
      if (!a(paramTreeMap, (View)paramTreeMap.firstKey(), localArrayList)) {
        return false;
      }
    }
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */