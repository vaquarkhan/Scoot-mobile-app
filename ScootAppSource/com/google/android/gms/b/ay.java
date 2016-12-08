package com.google.android.gms.b;

import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.x;

public final class ay
  extends ax
{
  public final be<? extends x, h> c;
  
  public void a(SparseArray<dy> paramSparseArray)
  {
    paramSparseArray = (dy)paramSparseArray.get(this.a);
    if (paramSparseArray != null) {
      paramSparseArray.a(this.c);
    }
  }
  
  public void a(Status paramStatus)
  {
    this.c.c(paramStatus);
  }
  
  public void a(h paramh)
  {
    this.c.b(paramh);
  }
  
  public boolean a()
  {
    return this.c.h();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */