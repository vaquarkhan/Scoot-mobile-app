package b.a.a.a.a.f;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class e<T>
{
  private final c a;
  private final f<T> b;
  private final String c;
  
  public e(c paramc, f<T> paramf, String paramString)
  {
    this.a = paramc;
    this.b = paramf;
    this.c = paramString;
  }
  
  public T a()
  {
    SharedPreferences localSharedPreferences = this.a.a();
    return (T)this.b.b(localSharedPreferences.getString(this.c, null));
  }
  
  @SuppressLint({"CommitPrefEdits"})
  public void a(T paramT)
  {
    this.a.a(this.a.b().putString(this.c, this.b.a(paramT)));
  }
  
  public void b()
  {
    this.a.b().remove(this.c).commit();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\f\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */