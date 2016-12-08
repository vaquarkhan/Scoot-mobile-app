package com.digits.sdk.android;

import android.content.res.Resources;
import android.util.SparseIntArray;

class br
  implements co
{
  protected final SparseIntArray a = new SparseIntArray(10);
  private final Resources b;
  
  br(Resources paramResources)
  {
    this.a.put(88, R.string.dgts__confirmation_error_alternative);
    this.a.put(284, R.string.dgts__network_error);
    this.a.put(302, R.string.dgts__network_error);
    this.a.put(240, R.string.dgts__network_error);
    this.a.put(87, R.string.dgts__network_error);
    this.b = paramResources;
  }
  
  public String a()
  {
    return this.b.getString(R.string.dgts__try_again);
  }
  
  public String a(int paramInt)
  {
    paramInt = this.a.indexOfKey(paramInt);
    if (paramInt < 0) {
      return a();
    }
    return this.b.getString(this.a.valueAt(paramInt));
  }
  
  public String b()
  {
    return this.b.getString(R.string.dgts__network_error);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */