package com.mixpanel.android.c;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

public final class bd
  extends at
{
  private static final Set<Integer> d = new HashSet(Arrays.asList(new Integer[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(7) }));
  private static final Set<Integer> e = new HashSet(Arrays.asList(new Integer[] { Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(8) }));
  private final WeakHashMap<View, int[]> a = new WeakHashMap();
  private final List<bc> b;
  private final String c;
  private boolean f;
  private final bg g;
  private final az h;
  
  public bd(List<aa> paramList, List<bc> paramList1, String paramString, bg parambg)
  {
    super(paramList);
    this.b = paramList1;
    this.c = paramString;
    this.f = true;
    this.g = parambg;
    this.h = new az(null);
  }
  
  private boolean a(Set<Integer> paramSet, SparseArray<View> paramSparseArray)
  {
    TreeMap localTreeMap = new TreeMap(new be(this));
    int j = paramSparseArray.size();
    int i = 0;
    while (i < j)
    {
      View localView = (View)paramSparseArray.valueAt(i);
      int[] arrayOfInt = ((RelativeLayout.LayoutParams)localView.getLayoutParams()).getRules();
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramSet.iterator();
      while (localIterator.hasNext())
      {
        int k = arrayOfInt[((Integer)localIterator.next()).intValue()];
        if ((k > 0) && (k != localView.getId())) {
          localArrayList.add(paramSparseArray.get(k));
        }
      }
      localTreeMap.put(localView, localArrayList);
      i += 1;
    }
    return this.h.a(localTreeMap);
  }
  
  public void a()
  {
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      View localView = (View)((Map.Entry)localObject).getKey();
      localObject = (int[])((Map.Entry)localObject).getValue();
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localView.getLayoutParams();
      int i = 0;
      while (i < localObject.length)
      {
        localLayoutParams.addRule(i, localObject[i]);
        i += 1;
      }
      localView.setLayoutParams(localLayoutParams);
    }
    this.f = false;
  }
  
  public void a(View paramView)
  {
    paramView = (ViewGroup)paramView;
    SparseArray localSparseArray = new SparseArray();
    int j = paramView.getChildCount();
    int i = 0;
    View localView;
    while (i < j)
    {
      localView = paramView.getChildAt(i);
      int k = localView.getId();
      if (k > 0) {
        localSparseArray.put(k, localView);
      }
      i += 1;
    }
    j = this.b.size();
    i = 0;
    if (i < j)
    {
      paramView = (bc)this.b.get(i);
      localView = (View)localSparseArray.get(paramView.a);
      if (localView != null) {}
    }
    for (;;)
    {
      i += 1;
      break;
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localView.getLayoutParams();
      int[] arrayOfInt = (int[])localLayoutParams.getRules().clone();
      if (arrayOfInt[paramView.b] != paramView.c)
      {
        if (this.a.containsKey(localView))
        {
          localLayoutParams.addRule(paramView.b, paramView.c);
          if (!d.contains(Integer.valueOf(paramView.b))) {
            break label258;
          }
          paramView = d;
        }
        for (;;)
        {
          if ((paramView == null) || (a(paramView, localSparseArray))) {
            break label288;
          }
          a();
          this.g.a(new bb("circular_dependency", this.c));
          return;
          this.a.put(localView, arrayOfInt);
          break;
          label258:
          if (e.contains(Integer.valueOf(paramView.b))) {
            paramView = e;
          } else {
            paramView = null;
          }
        }
        label288:
        localView.setLayoutParams(localLayoutParams);
      }
    }
  }
  
  public void b(View paramView)
  {
    if (this.f) {
      c().a(paramView, b(), this);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */