package retrofit;

class CallbackRunnable$1
  implements Runnable
{
  CallbackRunnable$1(CallbackRunnable paramCallbackRunnable, ResponseWrapper paramResponseWrapper) {}
  
  public void run()
  {
    CallbackRunnable.access$000(this.this$0).success(this.val$wrapper.responseBody, this.val$wrapper.response);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\CallbackRunnable$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */