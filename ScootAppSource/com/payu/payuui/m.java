package com.payu.payuui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.payu.india.Model.StoredCard;
import com.payu.india.c.c;
import java.util.ArrayList;

public final class m
  extends BaseAdapter
{
  private ArrayList<StoredCard> b;
  private Context c;
  
  public m(Context paramContext, ArrayList<StoredCard> paramArrayList)
  {
    this.c = paramArrayList;
    ArrayList localArrayList;
    this.b = localArrayList;
  }
  
  private void a(n paramn, int paramInt)
  {
    String str = PayUOneClickPaymentActivity.a(this.a).c(((StoredCard)this.b.get(paramInt)).g());
    int i = -1;
    switch (str.hashCode())
    {
    default: 
      switch (i)
      {
      default: 
        paramn.b.setImageResource(R.mipmap.card);
      }
      break;
    }
    for (;;)
    {
      paramn.d.setText(((StoredCard)this.b.get(paramInt)).f());
      paramn.e.setText(((StoredCard)this.b.get(paramInt)).b());
      paramn.i.setVisibility(8);
      paramn.h.setEnabled(true);
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
      paramn.b.setImageResource(R.mipmap.visa);
      continue;
      paramn.b.setImageResource(R.mipmap.laser);
      continue;
      paramn.b.setImageResource(R.mipmap.discover);
      continue;
      paramn.b.setImageResource(R.mipmap.maestro);
      continue;
      paramn.b.setImageResource(R.mipmap.master);
      continue;
      paramn.b.setImageResource(R.mipmap.amex);
      continue;
      paramn.b.setImageResource(R.mipmap.diner);
      continue;
      paramn.b.setImageResource(R.mipmap.jcb);
      continue;
      paramn.b.setImageResource(R.mipmap.maestro);
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
      paramViewGroup = new n(this, paramView);
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.a(paramInt);
      a(paramViewGroup, paramInt);
      return paramView;
      paramViewGroup = (n)paramView.getTag();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */