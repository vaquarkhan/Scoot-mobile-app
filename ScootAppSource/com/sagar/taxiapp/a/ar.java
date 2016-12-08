package com.sagar.taxiapp.a;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.v4.b.c;
import android.support.v7.a.ah;
import android.support.v7.widget.CardView;
import android.support.v7.widget.ed;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.sagar.taxiapp.beans.m;
import com.scootapp.tv.a.a;
import com.scootapp.tv.d.g;
import java.util.ArrayList;

public final class ar
  extends ed<bb>
{
  private ArrayList<m> a;
  private ah b;
  private ClipboardManager c;
  
  public ar(ah paramah, ArrayList<m> paramArrayList)
  {
    this.a = paramArrayList;
    this.b = paramah;
    this.c = ((ClipboardManager)this.b.getSystemService("clipboard"));
  }
  
  private void a(m paramm)
  {
    if ((paramm.b == null) || (paramm.b.isEmpty()) || ("".equals(paramm.b)) || ("null".equals(paramm.b)))
    {
      Toast.makeText(this.b, "No Coupon code available", 1).show();
      return;
    }
    if ("Scoot".equalsIgnoreCase(paramm.g))
    {
      g localg = new g(this.b).a("Warning !!").b("The offer will be considered redeemed once you view this offer. Are you sure you want to proceed and redeem this offer?").c("Yes").d("No").c(c.c(this.b, 2131689705)).d(c.c(this.b, 2131689705));
      AlertDialog localAlertDialog = localg.show();
      localg.a(new aw(this, localAlertDialog, paramm));
      localg.b(new ba(this, localAlertDialog));
      return;
    }
    paramm = ClipData.newPlainText("Coupon Code", paramm.b);
    this.c.setPrimaryClip(paramm);
    Toast.makeText(this.b, "Coupon code has been copied to the clipboard", 1).show();
  }
  
  public int a()
  {
    return this.a.size();
  }
  
  public void a(bb parambb, int paramInt)
  {
    m localm = (m)this.a.get(paramInt);
    parambb.l.setText(localm.d);
    if ((localm.b == null) || (localm.b.isEmpty()) || ("".equals(localm.b)) || ("null".equals(localm.b))) {
      parambb.m.setText("No Code");
    }
    for (;;)
    {
      parambb.n.setCardBackgroundColor(a.a(this.b, localm.f));
      parambb.m.setOnClickListener(new as(this, localm));
      parambb.p.setOnClickListener(new at(this, localm));
      return;
      if ("Scoot".equalsIgnoreCase(localm.g)) {
        parambb.m.setText("Redeem");
      }
    }
  }
  
  public bb c(ViewGroup paramViewGroup, int paramInt)
  {
    return new bb(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130968726, paramViewGroup, false));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */