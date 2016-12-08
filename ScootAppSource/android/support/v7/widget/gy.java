package android.support.v7.widget;

import android.support.v4.g.a;
import android.support.v4.g.f;

final class gy
{
  final a<fd, gz> a = new a();
  final f<fd> b = new f();
  
  private ek a(fd paramfd, int paramInt)
  {
    Object localObject2 = null;
    int i = this.a.a(paramfd);
    Object localObject1;
    if (i < 0) {
      localObject1 = localObject2;
    }
    gz localgz;
    do
    {
      do
      {
        return (ek)localObject1;
        localgz = (gz)this.a.c(i);
        localObject1 = localObject2;
      } while (localgz == null);
      localObject1 = localObject2;
    } while ((localgz.a & paramInt) == 0);
    localgz.a &= (paramInt ^ 0xFFFFFFFF);
    if (paramInt == 4) {}
    for (paramfd = localgz.b;; paramfd = localgz.c)
    {
      localObject1 = paramfd;
      if ((localgz.a & 0xC) != 0) {
        break;
      }
      this.a.d(i);
      gz.a(localgz);
      return paramfd;
      if (paramInt != 8) {
        break label129;
      }
    }
    label129:
    throw new IllegalArgumentException("Must provide flag PRE or POST");
  }
  
  fd a(long paramLong)
  {
    return (fd)this.b.a(paramLong);
  }
  
  void a()
  {
    this.a.clear();
    this.b.c();
  }
  
  void a(long paramLong, fd paramfd)
  {
    this.b.b(paramLong, paramfd);
  }
  
  void a(fd paramfd, ek paramek)
  {
    gz localgz2 = (gz)this.a.get(paramfd);
    gz localgz1 = localgz2;
    if (localgz2 == null)
    {
      localgz1 = gz.a();
      this.a.put(paramfd, localgz1);
    }
    localgz1.b = paramek;
    localgz1.a |= 0x4;
  }
  
  void a(ha paramha)
  {
    int i = this.a.size() - 1;
    if (i >= 0)
    {
      fd localfd = (fd)this.a.b(i);
      gz localgz = (gz)this.a.d(i);
      if ((localgz.a & 0x3) == 3) {
        paramha.a(localfd);
      }
      for (;;)
      {
        gz.a(localgz);
        i -= 1;
        break;
        if ((localgz.a & 0x1) != 0)
        {
          if (localgz.b == null) {
            paramha.a(localfd);
          } else {
            paramha.a(localfd, localgz.b, localgz.c);
          }
        }
        else if ((localgz.a & 0xE) == 14) {
          paramha.b(localfd, localgz.b, localgz.c);
        } else if ((localgz.a & 0xC) == 12) {
          paramha.c(localfd, localgz.b, localgz.c);
        } else if ((localgz.a & 0x4) != 0) {
          paramha.a(localfd, localgz.b, null);
        } else if ((localgz.a & 0x8) != 0) {
          paramha.b(localfd, localgz.b, localgz.c);
        } else if ((localgz.a & 0x2) == 0) {}
      }
    }
  }
  
  boolean a(fd paramfd)
  {
    paramfd = (gz)this.a.get(paramfd);
    return (paramfd != null) && ((paramfd.a & 0x1) != 0);
  }
  
  ek b(fd paramfd)
  {
    return a(paramfd, 4);
  }
  
  void b() {}
  
  void b(fd paramfd, ek paramek)
  {
    gz localgz2 = (gz)this.a.get(paramfd);
    gz localgz1 = localgz2;
    if (localgz2 == null)
    {
      localgz1 = gz.a();
      this.a.put(paramfd, localgz1);
    }
    localgz1.a |= 0x2;
    localgz1.b = paramek;
  }
  
  ek c(fd paramfd)
  {
    return a(paramfd, 8);
  }
  
  void c(fd paramfd, ek paramek)
  {
    gz localgz2 = (gz)this.a.get(paramfd);
    gz localgz1 = localgz2;
    if (localgz2 == null)
    {
      localgz1 = gz.a();
      this.a.put(paramfd, localgz1);
    }
    localgz1.c = paramek;
    localgz1.a |= 0x8;
  }
  
  boolean d(fd paramfd)
  {
    paramfd = (gz)this.a.get(paramfd);
    return (paramfd != null) && ((paramfd.a & 0x4) != 0);
  }
  
  void e(fd paramfd)
  {
    gz localgz2 = (gz)this.a.get(paramfd);
    gz localgz1 = localgz2;
    if (localgz2 == null)
    {
      localgz1 = gz.a();
      this.a.put(paramfd, localgz1);
    }
    localgz1.a |= 0x1;
  }
  
  void f(fd paramfd)
  {
    paramfd = (gz)this.a.get(paramfd);
    if (paramfd == null) {
      return;
    }
    paramfd.a &= 0xFFFFFFFE;
  }
  
  void g(fd paramfd)
  {
    int i = this.b.b() - 1;
    for (;;)
    {
      if (i >= 0)
      {
        if (paramfd == this.b.c(i)) {
          this.b.a(i);
        }
      }
      else
      {
        paramfd = (gz)this.a.remove(paramfd);
        if (paramfd != null) {
          gz.a(paramfd);
        }
        return;
      }
      i -= 1;
    }
  }
  
  public void h(fd paramfd)
  {
    f(paramfd);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\gy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */