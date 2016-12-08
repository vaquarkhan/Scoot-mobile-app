package android.support.v7.widget;

final class dx
  implements Runnable
{
  dx(RecyclerView paramRecyclerView) {}
  
  public void run()
  {
    if ((!RecyclerView.a(this.a)) || (this.a.isLayoutRequested())) {
      return;
    }
    if (RecyclerView.b(this.a))
    {
      RecyclerView.a(this.a, true);
      return;
    }
    RecyclerView.c(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */