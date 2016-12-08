package android.support.v7.widget;

final class el
  implements ej
{
  private el(RecyclerView paramRecyclerView) {}
  
  public void a(fd paramfd)
  {
    paramfd.a(true);
    if ((paramfd.g != null) && (paramfd.h == null)) {
      paramfd.g = null;
    }
    paramfd.h = null;
    if ((!fd.e(paramfd)) && (!RecyclerView.c(this.a, paramfd.a)) && (paramfd.r())) {
      this.a.removeDetachedView(paramfd.a, false);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\el.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */