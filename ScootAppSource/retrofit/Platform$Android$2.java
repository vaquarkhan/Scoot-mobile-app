package retrofit;

import java.util.concurrent.ThreadFactory;

class Platform$Android$2
  implements ThreadFactory
{
  Platform$Android$2(Platform.Android paramAndroid) {}
  
  public Thread newThread(Runnable paramRunnable)
  {
    return new Thread(new Platform.Android.2.1(this, paramRunnable), "Retrofit-Idle");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\Platform$Android$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */