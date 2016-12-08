package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.bt;
import android.view.View;
import android.view.ViewGroup;

public abstract class as
  extends bt
{
  private final ah a;
  private av b = null;
  private Fragment c = null;
  
  public as(ah paramah)
  {
    this.a = paramah;
  }
  
  private static String a(int paramInt, long paramLong)
  {
    return "android:switcher:" + paramInt + ":" + paramLong;
  }
  
  public Parcelable a()
  {
    return null;
  }
  
  public abstract Fragment a(int paramInt);
  
  public Object a(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.b == null) {
      this.b = this.a.a();
    }
    long l = b(paramInt);
    Object localObject = a(paramViewGroup.getId(), l);
    localObject = this.a.a((String)localObject);
    if (localObject != null) {
      this.b.e((Fragment)localObject);
    }
    for (paramViewGroup = (ViewGroup)localObject;; paramViewGroup = (ViewGroup)localObject)
    {
      if (paramViewGroup != this.c)
      {
        paramViewGroup.e(false);
        paramViewGroup.f(false);
      }
      return paramViewGroup;
      localObject = a(paramInt);
      this.b.a(paramViewGroup.getId(), (Fragment)localObject, a(paramViewGroup.getId(), l));
    }
  }
  
  public void a(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  public void a(ViewGroup paramViewGroup) {}
  
  public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (this.b == null) {
      this.b = this.a.a();
    }
    this.b.d((Fragment)paramObject);
  }
  
  public boolean a(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).v() == paramView;
  }
  
  public long b(int paramInt)
  {
    return paramInt;
  }
  
  public void b(ViewGroup paramViewGroup)
  {
    if (this.b != null)
    {
      this.b.b();
      this.b = null;
      this.a.b();
    }
  }
  
  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup = (Fragment)paramObject;
    if (paramViewGroup != this.c)
    {
      if (this.c != null)
      {
        this.c.e(false);
        this.c.f(false);
      }
      if (paramViewGroup != null)
      {
        paramViewGroup.e(true);
        paramViewGroup.f(true);
      }
      this.c = paramViewGroup;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */