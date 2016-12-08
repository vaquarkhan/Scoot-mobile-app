package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap.Config;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class Picasso$Builder
{
  private Cache cache;
  private final Context context;
  private Bitmap.Config defaultBitmapConfig;
  private Downloader downloader;
  private boolean indicatorsEnabled;
  private Picasso.Listener listener;
  private boolean loggingEnabled;
  private List<RequestHandler> requestHandlers;
  private ExecutorService service;
  private Picasso.RequestTransformer transformer;
  
  public Picasso$Builder(Context paramContext)
  {
    if (paramContext == null) {
      throw new IllegalArgumentException("Context must not be null.");
    }
    this.context = paramContext.getApplicationContext();
  }
  
  public Builder addRequestHandler(RequestHandler paramRequestHandler)
  {
    if (paramRequestHandler == null) {
      throw new IllegalArgumentException("RequestHandler must not be null.");
    }
    if (this.requestHandlers == null) {
      this.requestHandlers = new ArrayList();
    }
    if (this.requestHandlers.contains(paramRequestHandler)) {
      throw new IllegalStateException("RequestHandler already registered.");
    }
    this.requestHandlers.add(paramRequestHandler);
    return this;
  }
  
  public Picasso build()
  {
    Context localContext = this.context;
    if (this.downloader == null) {
      this.downloader = Utils.createDefaultDownloader(localContext);
    }
    if (this.cache == null) {
      this.cache = new LruCache(localContext);
    }
    if (this.service == null) {
      this.service = new PicassoExecutorService();
    }
    if (this.transformer == null) {
      this.transformer = Picasso.RequestTransformer.IDENTITY;
    }
    Stats localStats = new Stats(this.cache);
    return new Picasso(localContext, new Dispatcher(localContext, this.service, Picasso.HANDLER, this.downloader, this.cache, localStats), this.cache, this.listener, this.transformer, this.requestHandlers, localStats, this.defaultBitmapConfig, this.indicatorsEnabled, this.loggingEnabled);
  }
  
  @Deprecated
  public Builder debugging(boolean paramBoolean)
  {
    return indicatorsEnabled(paramBoolean);
  }
  
  public Builder defaultBitmapConfig(Bitmap.Config paramConfig)
  {
    if (paramConfig == null) {
      throw new IllegalArgumentException("Bitmap config must not be null.");
    }
    this.defaultBitmapConfig = paramConfig;
    return this;
  }
  
  public Builder downloader(Downloader paramDownloader)
  {
    if (paramDownloader == null) {
      throw new IllegalArgumentException("Downloader must not be null.");
    }
    if (this.downloader != null) {
      throw new IllegalStateException("Downloader already set.");
    }
    this.downloader = paramDownloader;
    return this;
  }
  
  public Builder executor(ExecutorService paramExecutorService)
  {
    if (paramExecutorService == null) {
      throw new IllegalArgumentException("Executor service must not be null.");
    }
    if (this.service != null) {
      throw new IllegalStateException("Executor service already set.");
    }
    this.service = paramExecutorService;
    return this;
  }
  
  public Builder indicatorsEnabled(boolean paramBoolean)
  {
    this.indicatorsEnabled = paramBoolean;
    return this;
  }
  
  public Builder listener(Picasso.Listener paramListener)
  {
    if (paramListener == null) {
      throw new IllegalArgumentException("Listener must not be null.");
    }
    if (this.listener != null) {
      throw new IllegalStateException("Listener already set.");
    }
    this.listener = paramListener;
    return this;
  }
  
  public Builder loggingEnabled(boolean paramBoolean)
  {
    this.loggingEnabled = paramBoolean;
    return this;
  }
  
  public Builder memoryCache(Cache paramCache)
  {
    if (paramCache == null) {
      throw new IllegalArgumentException("Memory cache must not be null.");
    }
    if (this.cache != null) {
      throw new IllegalStateException("Memory cache already set.");
    }
    this.cache = paramCache;
    return this;
  }
  
  public Builder requestTransformer(Picasso.RequestTransformer paramRequestTransformer)
  {
    if (paramRequestTransformer == null) {
      throw new IllegalArgumentException("Transformer must not be null.");
    }
    if (this.transformer != null) {
      throw new IllegalStateException("Transformer already set.");
    }
    this.transformer = paramRequestTransformer;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\Picasso$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */