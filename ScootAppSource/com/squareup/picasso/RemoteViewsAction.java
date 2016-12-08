package com.squareup.picasso;

import android.graphics.Bitmap;
import android.widget.RemoteViews;

abstract class RemoteViewsAction
  extends Action<RemoteViewsAction.RemoteViewsTarget>
{
  final RemoteViews remoteViews;
  private RemoteViewsAction.RemoteViewsTarget target;
  final int viewId;
  
  RemoteViewsAction(Picasso paramPicasso, Request paramRequest, RemoteViews paramRemoteViews, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Object paramObject, String paramString)
  {
    super(paramPicasso, null, paramRequest, paramInt3, paramInt4, paramInt2, null, paramString, paramObject, false);
    this.remoteViews = paramRemoteViews;
    this.viewId = paramInt1;
  }
  
  void complete(Bitmap paramBitmap, Picasso.LoadedFrom paramLoadedFrom)
  {
    this.remoteViews.setImageViewBitmap(this.viewId, paramBitmap);
    update();
  }
  
  public void error()
  {
    if (this.errorResId != 0) {
      setImageResource(this.errorResId);
    }
  }
  
  RemoteViewsAction.RemoteViewsTarget getTarget()
  {
    if (this.target == null) {
      this.target = new RemoteViewsAction.RemoteViewsTarget(this.remoteViews, this.viewId);
    }
    return this.target;
  }
  
  void setImageResource(int paramInt)
  {
    this.remoteViews.setImageViewResource(this.viewId, paramInt);
    update();
  }
  
  abstract void update();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\RemoteViewsAction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */