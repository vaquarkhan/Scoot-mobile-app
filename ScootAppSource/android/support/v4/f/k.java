package android.support.v4.f;

final class k
  implements m
{
  public static final k a = new k(true);
  public static final k b = new k(false);
  private final boolean c;
  
  private k(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public int a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int k = 1;
    int j = 0;
    int m;
    for (int i = paramInt1;; i = m)
    {
      m = i;
      if (m >= paramInt1 + paramInt2) {
        break;
      }
      switch (i.b(Character.getDirectionality(paramCharSequence.charAt(m))))
      {
      default: 
        i = j;
        m += 1;
        j = i;
      }
    }
    if (this.c) {
      i = 0;
    }
    do
    {
      do
      {
        return i;
        i = 1;
        break;
        i = k;
      } while (!this.c);
      i = 1;
      break;
      if (j == 0) {
        break label131;
      }
      i = k;
    } while (this.c);
    return 0;
    label131:
    return 2;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\f\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */