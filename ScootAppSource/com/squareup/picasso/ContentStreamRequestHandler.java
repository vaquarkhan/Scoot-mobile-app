package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

class ContentStreamRequestHandler
  extends RequestHandler
{
  final Context context;
  
  ContentStreamRequestHandler(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public boolean canHandleRequest(Request paramRequest)
  {
    return "content".equals(paramRequest.uri.getScheme());
  }
  
  InputStream getInputStream(Request paramRequest)
  {
    return this.context.getContentResolver().openInputStream(paramRequest.uri);
  }
  
  public RequestHandler.Result load(Request paramRequest, int paramInt)
  {
    return new RequestHandler.Result(getInputStream(paramRequest), Picasso.LoadedFrom.DISK);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\ContentStreamRequestHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */