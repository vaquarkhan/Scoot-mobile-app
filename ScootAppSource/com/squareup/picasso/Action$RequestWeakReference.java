package com.squareup.picasso;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class Action$RequestWeakReference<M>
  extends WeakReference<M>
{
  final Action action;
  
  public Action$RequestWeakReference(Action paramAction, M paramM, ReferenceQueue<? super M> paramReferenceQueue)
  {
    super(paramM, paramReferenceQueue);
    this.action = paramAction;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\Action$RequestWeakReference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */