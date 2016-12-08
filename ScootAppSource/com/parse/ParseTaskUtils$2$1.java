package com.parse;

import a.ac;
import a.o;

class ParseTaskUtils$2$1
  implements Runnable
{
  ParseTaskUtils$2$1(ParseTaskUtils.2 param2, o paramo) {}
  
  public void run()
  {
    try
    {
      localObject1 = this.val$task.g();
      if ((localObject1 == null) || ((localObject1 instanceof ParseException))) {
        break label191;
      }
      localObject1 = new ParseException((Throwable)localObject1);
    }
    finally
    {
      label191:
      for (;;)
      {
        Object localObject1;
        if (this.val$task.d()) {
          this.this$0.val$tcs.c();
        }
        for (;;)
        {
          throw ((Throwable)localObject2);
          if (this.val$task.e()) {
            this.this$0.val$tcs.b(this.val$task.g());
          } else {
            this.this$0.val$tcs.b(this.val$task.f());
          }
        }
      }
    }
    this.this$0.val$callback.done(this.val$task.f(), (ParseException)localObject1);
    if (this.val$task.d())
    {
      this.this$0.val$tcs.c();
      return;
    }
    if (this.val$task.e())
    {
      this.this$0.val$tcs.b(this.val$task.g());
      return;
    }
    this.this$0.val$tcs.b(this.val$task.f());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseTaskUtils$2$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */