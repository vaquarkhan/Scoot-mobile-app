package com.squareup.picasso;

import android.widget.RemoteViews;

class RemoteViewsAction$RemoteViewsTarget
{
  final RemoteViews remoteViews;
  final int viewId;
  
  RemoteViewsAction$RemoteViewsTarget(RemoteViews paramRemoteViews, int paramInt)
  {
    this.remoteViews = paramRemoteViews;
    this.viewId = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (RemoteViewsTarget)paramObject;
    } while ((this.viewId == ((RemoteViewsTarget)paramObject).viewId) && (this.remoteViews.equals(((RemoteViewsTarget)paramObject).remoteViews)));
    return false;
  }
  
  public int hashCode()
  {
    return this.remoteViews.hashCode() * 31 + this.viewId;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\RemoteViewsAction$RemoteViewsTarget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */