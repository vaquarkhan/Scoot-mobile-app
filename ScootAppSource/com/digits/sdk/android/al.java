package com.digits.sdk.android;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ListView;

public final class al
  implements DialogInterface.OnClickListener
{
  private final ai b;
  private AlertDialog c;
  
  al(CountryListSpinner paramCountryListSpinner, ai paramai)
  {
    this.b = paramai;
  }
  
  public void a()
  {
    if (this.c != null)
    {
      this.c.dismiss();
      this.c = null;
    }
  }
  
  public void a(int paramInt)
  {
    if (this.b == null) {
      return;
    }
    this.c = new AlertDialog.Builder(this.a.getContext()).setSingleChoiceItems(this.b, 0, this).create();
    this.c.setCanceledOnTouchOutside(true);
    ListView localListView = this.c.getListView();
    localListView.setFastScrollEnabled(true);
    localListView.postDelayed(new am(this, localListView, paramInt), 10L);
    this.c.show();
  }
  
  public boolean b()
  {
    return (this.c != null) && (this.c.isShowing());
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = (ah)this.b.getItem(paramInt);
    CountryListSpinner.a(this.a, paramDialogInterface.a);
    CountryListSpinner.a(this.a, paramDialogInterface.b, paramDialogInterface.a);
    a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */