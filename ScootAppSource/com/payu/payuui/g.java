package com.payu.payuui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.payu.india.Model.Emi;
import java.util.ArrayList;

final class g
  extends BaseAdapter
{
  Context a;
  ArrayList<Emi> b;
  
  public g(Context paramContext, ArrayList<Emi> paramArrayList)
  {
    this.a = paramContext;
    this.b = paramArrayList;
  }
  
  public Emi a(int paramInt)
  {
    return (Emi)this.b.get(paramInt);
  }
  
  public int getCount()
  {
    if (this.b != null) {
      return this.b.size();
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
      paramViewGroup.a.setText(localEmi.a());
      return paramView;
      paramViewGroup = (h)paramView.getTag();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */