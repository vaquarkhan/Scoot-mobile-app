package android.support.v4.e;

import android.os.AsyncTask;

final class b
{
  static <Params, Progress, Result> void a(AsyncTask<Params, Progress, Result> paramAsyncTask, Params... paramVarArgs)
  {
    paramAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramVarArgs);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */