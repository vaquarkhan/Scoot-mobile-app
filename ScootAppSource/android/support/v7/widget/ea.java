package android.support.v7.widget;

final class ea
  implements ha
{
  ea(RecyclerView paramRecyclerView) {}
  
  public void a(fd paramfd)
  {
    this.a.f.a(paramfd.a, this.a.b);
  }
  
  public void a(fd paramfd, ek paramek1, ek paramek2)
  {
    this.a.b.d(paramfd);
    RecyclerView.a(this.a, paramfd, paramek1, paramek2);
  }
  
  public void b(fd paramfd, ek paramek1, ek paramek2)
  {
    RecyclerView.b(this.a, paramfd, paramek1, paramek2);
  }
  
  public void c(fd paramfd, ek paramek1, ek paramek2)
  {
    paramfd.a(false);
    if (RecyclerView.d(this.a)) {
      if (this.a.g.a(paramfd, paramfd, paramek1, paramek2)) {
        RecyclerView.e(this.a);
      }
    }
    while (!this.a.g.c(paramfd, paramek1, paramek2)) {
      return;
    }
    RecyclerView.e(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */