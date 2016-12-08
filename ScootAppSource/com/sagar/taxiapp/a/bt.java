package com.sagar.taxiapp.a;

import android.content.Context;
import android.support.v7.widget.ed;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public final class bt
  extends ed<bw>
{
  private Context a;
  private ArrayList<String> b;
  
  public bt(Context paramContext, ArrayList<String> paramArrayList)
  {
    this.a = paramContext;
    this.b = paramArrayList;
  }
  
  public int a()
  {
    return this.b.size();
  }
  
  public void a(bw parambw, int paramInt)
  {
    String[] arrayOfString = ((String)this.b.get(paramInt)).split(",");
    String str2 = arrayOfString[0];
    String str1 = "";
    int i = 1;
    if (i < arrayOfString.length)
    {
      if (i == arrayOfString.length - 1) {}
      for (str1 = str1 + arrayOfString[i];; str1 = str1 + arrayOfString[i] + ",")
      {
        i += 1;
        break;
      }
    }
    parambw.l.setText(str2);
    parambw.m.setText(str1);
    parambw.n.setOnClickListener(new bu(this, paramInt));
  }
  
  public bw c(ViewGroup paramViewGroup, int paramInt)
  {
    return new bw(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130968756, paramViewGroup, false));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */