package com.parse;

import a.ac;
import a.m;
import a.o;
import com.parse.http.ParseHttpRequest;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ParseRequest$4
  implements m<Response, o<Response>>
{
  ParseRequest$4(ParseRequest paramParseRequest, o paramo, int paramInt, long paramLong, ParseHttpClient paramParseHttpClient, ParseHttpRequest paramParseHttpRequest, ProgressCallback paramProgressCallback) {}
  
  public o<Response> then(o<Response> paramo)
  {
    Exception localException = paramo.g();
    Object localObject = paramo;
    if (paramo.e())
    {
      localObject = paramo;
      if ((localException instanceof ParseException))
      {
        if ((this.val$cancellationToken == null) || (!this.val$cancellationToken.d())) {
          break label46;
        }
        localObject = o.i();
      }
    }
    label46:
    do
    {
      do
      {
        return (o<Response>)localObject;
        if (!(localException instanceof ParseRequest.ParseRequestException)) {
          break;
        }
        localObject = paramo;
      } while (((ParseRequest.ParseRequestException)localException).isPermanentFailure);
      localObject = paramo;
    } while (this.val$attemptsMade >= ParseRequest.access$000(this.this$0));
    PLog.i("com.parse.ParseRequest", "Request failed. Waiting " + this.val$delay + " milliseconds before attempt #" + (this.val$attemptsMade + 1));
    paramo = new ac();
    ParseExecutors.scheduled().schedule(new ParseRequest.4.1(this, paramo), this.val$delay, TimeUnit.MILLISECONDS);
    return paramo.a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRequest$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */