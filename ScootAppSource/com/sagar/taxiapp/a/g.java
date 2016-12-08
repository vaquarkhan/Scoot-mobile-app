package com.sagar.taxiapp.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import java.util.ArrayList;

public final class g
  extends BaseAdapter
{
  public static final String[] a = { "" };
  public static final String[] b = { "" };
  public static final String[] c = { "" };
  private static final String[] e = { "Hatchback", "Sedan", "Luxury" };
  private LayoutInflater d;
  private int[] f = { 0, 0, 0 };
  private boolean g = false;
  private ArrayList<Integer> h = new ArrayList();
  
  public g(Context paramContext)
  {
    this.d = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    this.h = new ArrayList();
  }
  
  public void a()
  {
    if (this.g)
    {
      int i = 0;
      while (i < 3)
      {
        this.h.add(i, Integer.valueOf(0));
        i += 1;
      }
    }
    this.g = false;
    notifyDataSetChanged();
  }
  
  public int[] b()
  {
    return this.f;
  }
  
  public void c()
  {
    this.g = true;
    this.f[0] = 0;
    this.f[1] = 0;
    this.f[2] = 0;
    this.h.clear();
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    return e.length;
  }
  
  public Object getItem(int paramInt)
  {
    return e[paramInt];
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramView;
    if (paramView == null) {
      localView = this.d.inflate(2130968685, paramViewGroup, false);
    }
    paramView = e[paramInt];
    paramViewGroup = (RadioButton)localView.findViewById(2131755528);
    if (this.g) {
      paramViewGroup.setChecked(false);
    }
    for (;;)
    {
      paramViewGroup.setText(paramView);
      paramViewGroup.setOnClickListener(new h(this, paramInt));
      return localView;
      if (this.f[paramInt] == 1) {
        paramViewGroup.setChecked(true);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */