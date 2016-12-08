package com.payu.payuui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.payu.india.Model.Emi;
import java.util.ArrayList;

final class f
  extends BaseAdapter
{
  Context a;
  ArrayList<Emi> b;
  Emi c;
  ArrayList<Emi> d;
  
  public f(Context paramContext, ArrayList<Emi> paramArrayList, Emi paramEmi)
  {
    this.a = paramContext;
    this.b = paramArrayList;
    this.c = paramEmi;
    this.d = null;
    this.d = new ArrayList();
    int i = 0;
    while (i < paramArrayList.size())
    {
      if (((Emi)paramArrayList.get(i)).a().contentEquals(paramEmi.a())) {
        this.d.add(paramArrayList.get(i));
      }
      i += 1;
    }
  }
  
  public Emi a(int paramInt)
  {
    return (Emi)this.d.get(paramInt);
  }
  
  public int getCount()
  {
    if (this.d != null) {
      return this.d.size();
    }
    return 0;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(R.layout.emi_list_item, null);
      paramViewGroup = new h(paramView);
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      Emi localEmi = a(paramInt);
      paramViewGroup.a.setText(localEmi.c());
      return paramView;
      paramViewGroup = (h)paramView.getTag();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */