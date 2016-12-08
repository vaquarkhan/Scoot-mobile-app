package com.payu.payuui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.payu.india.Model.StoredCard;
import com.payu.india.c.c;
import java.util.ArrayList;

public final class o
  extends BaseAdapter
{
  private ArrayList<StoredCard> b;
  private Context c;
  private c d;
  
  public o(Context paramContext, ArrayList<StoredCard> paramArrayList)
  {
    this.c = paramArrayList;
    ArrayList localArrayList;
    this.b = localArrayList;
    this.d = new c();
  }
  
  private void a(p paramp, int paramInt)
  {
    String str = this.d.c(((StoredCard)this.b.get(paramInt)).g());
    int i = -1;
    switch (str.hashCode())
    {
    default: 
      switch (i)
      {
      default: 
        paramp.b.setImageResource(R.mipmap.card);
      }
      break;
    }
    for (;;)
    {
      paramp.d.setText(((StoredCard)this.b.get(paramInt)).f());
      paramp.e.setText(((StoredCard)this.b.get(paramInt)).b());
      return;
      if (!str.equals("VISA")) {
        break;
      }
      i = 0;
      break;
      if (!str.equals("LASER")) {
        break;
      }
      i = 1;
      break;
      if (!str.equals("DISCOVER")) {
        break;
      }
      i = 2;
      break;
      if (!str.equals("MAES")) {
        break;
      }
      i = 3;
      break;
      if (!str.equals("MAST")) {
        break;
      }
      i = 4;
      break;
      if (!str.equals("AMEX")) {
        break;
      }
      i = 5;
      break;
      if (!str.equals("DINR")) {
        break;
      }
      i = 6;
      break;
      if (!str.equals("JCB")) {
        break;
      }
      i = 7;
      break;
      if (!str.equals("SMAE")) {
        break;
      }
      i = 8;
      break;
      paramp.b.setImageResource(R.mipmap.visa);
      continue;
      paramp.b.setImageResource(R.mipmap.laser);
      continue;
      paramp.b.setImageResource(R.mipmap.discover);
      continue;
      paramp.b.setImageResource(R.mipmap.maestro);
      continue;
      paramp.b.setImageResource(R.mipmap.master);
      continue;
      paramp.b.setImageResource(R.mipmap.amex);
      continue;
      paramp.b.setImageResource(R.mipmap.diner);
      continue;
      paramp.b.setImageResource(R.mipmap.jcb);
      continue;
      paramp.b.setImageResource(R.mipmap.maestro);
    }
  }
  
  public int getCount()
  {
    if (this.b != null) {
      return this.b.size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    if (this.b != null) {
      return this.b.get(paramInt);
    }
    return Integer.valueOf(0);
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = ((LayoutInflater)this.c.getSystemService("layout_inflater")).inflate(R.layout.user_card_item, null);
      paramViewGroup = new p(this, paramView);
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.a(paramInt);
      a(paramViewGroup, paramInt);
      return paramView;
      paramViewGroup = (p)paramView.getTag();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */