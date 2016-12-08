package com.squareup.picasso;

final class BitmapHunter$2
  extends RequestHandler
{
  public boolean canHandleRequest(Request paramRequest)
  {
    return true;
  }
  
  public RequestHandler.Result load(Request paramRequest, int paramInt)
  {
    throw new IllegalStateException("Unrecognized type of request: " + paramRequest);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\BitmapHunter$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */