package com.sagar.taxiapp.b;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.support.v4.app.bd;
import android.support.v4.app.be;
import android.support.v4.b.n;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sagar.taxiapp.a.bc;
import com.sagar.taxiapp.a.bn;
import com.scootapp.tv.a.a;
import java.util.ArrayList;
import java.util.List;

public final class d
  extends Fragment
  implements be<List<com.sagar.taxiapp.beans.b>>
{
  private static List<bn> a = new ArrayList();
  private static bc b;
  private static List<com.sagar.taxiapp.beans.b> c = new ArrayList();
  private static TextView d;
  
  private static void b(List<com.sagar.taxiapp.beans.b> paramList)
  {
    if (paramList.size() > 0)
    {
      a.clear();
      d.setVisibility(8);
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        bn localbn = new bn(0, (com.sagar.taxiapp.beans.b)paramList.get(i));
        localbn.c = new ArrayList();
        localbn.c.add(new bn(1, null));
        a.add(localbn);
        i += 1;
      }
      b.a(a);
    }
  }
  
  public n<List<com.sagar.taxiapp.beans.b>> a(int paramInt, Bundle paramBundle)
  {
    return new e(k());
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968689, paramViewGroup, false);
    paramViewGroup = (RecyclerView)paramLayoutInflater.findViewById(2131755552);
    d = (TextView)paramLayoutInflater.findViewById(2131755553);
    paramViewGroup.setLayoutManager(new LinearLayoutManager(k(), 1, false));
    c.clear();
    a.clear();
    b = new bc(a);
    paramViewGroup.setAdapter(new jp.wasabeef.recyclerview.a.b(b));
    paramViewGroup.setHasFixedSize(true);
    u().a(1, null, this).l();
    return paramLayoutInflater;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
  }
  
  public void a(n<List<com.sagar.taxiapp.beans.b>> paramn) {}
  
  public void a(n<List<com.sagar.taxiapp.beans.b>> paramn, List<com.sagar.taxiapp.beans.b> paramList)
  {
    b(paramList);
  }
  
  public void w()
  {
    super.w();
    if (a.a)
    {
      Intent localIntent = new Intent();
      localIntent.setAction("BOOKING_UPDATED");
      l().sendBroadcast(localIntent);
      a.a = false;
    }
  }
  
  public void x()
  {
    super.x();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */