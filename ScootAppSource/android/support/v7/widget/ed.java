package android.support.v7.widget;

import android.support.v4.e.i;
import android.view.ViewGroup;
import java.util.List;

public abstract class ed<VH extends fd>
{
  private final ee a = new ee();
  private boolean b = false;
  
  public abstract int a();
  
  public int a(int paramInt)
  {
    return 0;
  }
  
  public abstract VH a(ViewGroup paramViewGroup, int paramInt);
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2);
  }
  
  public void a(RecyclerView paramRecyclerView) {}
  
  public void a(ef paramef)
  {
    this.a.registerObserver(paramef);
  }
  
  public void a(VH paramVH) {}
  
  public abstract void a(VH paramVH, int paramInt);
  
  public void a(VH paramVH, int paramInt, List<Object> paramList)
  {
    a(paramVH, paramInt);
  }
  
  public long b(int paramInt)
  {
    return -1L;
  }
  
  public final VH b(ViewGroup paramViewGroup, int paramInt)
  {
    i.a("RV CreateView");
    paramViewGroup = a(paramViewGroup, paramInt);
    paramViewGroup.e = paramInt;
    i.a();
    return paramViewGroup;
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    this.a.b(paramInt1, paramInt2);
  }
  
  public void b(RecyclerView paramRecyclerView) {}
  
  public void b(ef paramef)
  {
    this.a.unregisterObserver(paramef);
  }
  
  public final void b(VH paramVH, int paramInt)
  {
    paramVH.b = paramInt;
    if (b()) {
      paramVH.d = b(paramInt);
    }
    paramVH.a(1, 519);
    i.a("RV OnBindView");
    a(paramVH, paramInt, paramVH.u());
    paramVH.t();
    i.a();
  }
  
  public final boolean b()
  {
    return this.b;
  }
  
  public boolean b(VH paramVH)
  {
    return false;
  }
  
  public final void c()
  {
    this.a.a();
  }
  
  public void c(VH paramVH) {}
  
  public void d(VH paramVH) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */