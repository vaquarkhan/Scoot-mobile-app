package com.sagar.taxiapp.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import java.util.ArrayList;

public final class i
  extends BaseAdapter
{
  private ArrayList<Integer> a;
  private ArrayList<String> b;
  private ArrayList<Integer> c;
  private LayoutInflater d;
  private boolean e = true;
  
  public i(Context paramContext, ArrayList<String> paramArrayList)
  {
    this.b = paramArrayList;
    this.d = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    this.c = new ArrayList();
    this.a = new ArrayList();
  }
  
  public ArrayList<Integer> a()
  {
    return this.c;
  }
  
  public void a(ArrayList<String> paramArrayList)
  {
    this.b = paramArrayList;
    if (this.e)
    {
      int i = 0;
      while (i < this.b.size())
      {
        this.a.add(i, Integer.valueOf(0));
        i += 1;
      }
    }
    this.e = false;
    notifyDataSetChanged();
  }
  
  public void b()
  {
    this.e = true;
    this.c.clear();
    this.a.clear();
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    return this.b.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.b.get(paramInt);
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
    paramView = (String)this.b.get(paramInt);
    paramViewGroup = (RadioButton)localView.findViewById(2131755528);
    paramViewGroup.setChecked(false);
    if (this.e) {
      paramViewGroup.setChecked(false);
    }
    for (;;)
    {
      paramViewGroup.setText(paramView);
      paramViewGroup.setOnClickListener(new j(this, paramInt, paramViewGroup));
      return localView;
      if (this.c.contains(Integer.valueOf(paramInt))) {
        paramViewGroup.setChecked(true);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */