package com.appsee;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

@TargetApi(21)
class yl
  extends MediaCodec.Callback
{
  private boolean l;
  
  public void C()
  {
    try
    {
      this.l = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void onError(MediaCodec paramMediaCodec, MediaCodec.CodecException paramCodecException)
  {
    ue.C(paramCodecException, fc.C("Bvuku$nj'rn`bk'aigh`nj`"));
  }
  
  public void onInputBufferAvailable(MediaCodec paramMediaCodec, int paramInt) {}
  
  public void onOutputBufferAvailable(MediaCodec paramMediaCodec, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    label375:
    for (;;)
    {
      try
      {
        if (this.l)
        {
          ue.C(null, fc.C("hjHqstrpEqabbvFrfmkeehb,.$pet$dekhb`'eapbv'gfhkffgl$pet$cmtthwb`&"));
          return;
        }
        if (xn.C(this.A)) {
          vd.C(1, fc.C("Cvfmimic'aigh`bv+$njca>'!c"), new Object[] { Integer.valueOf(paramInt) });
        }
        xn.C(this.A).K();
        ByteBuffer localByteBuffer = paramMediaCodec.getOutputBuffer(paramInt).duplicate();
        if ((paramBufferInfo.flags & 0x2) != 0)
        {
          if (xn.C(this.A)) {
            vd.H(1, fc.C("Bhqi`'ghjam`$avfib"));
          }
          paramBufferInfo.size = 0;
        }
        if ((paramBufferInfo.flags & 0x4) != 0)
        {
          if (xn.C(this.A)) {
            vd.H(1, fc.C("Bhqi`'AHW'bke`"));
          }
          paramBufferInfo.size = 0;
        }
        if (paramBufferInfo.size == 0) {
          break label375;
        }
        if (xn.C(this.A) == null)
        {
          vd.H(1, fc.C("Ir|bv'mt$njnpnekm}ac$hjk}'ki$amuws$cese'bueja',rwrekh~$np'ki$NJAKXKRPWQS[AKUIFPXGOEICB@."));
          xn.C(this.A, paramMediaCodec.getOutputFormat(paramInt));
        }
        long l1 = xn.H(this.A);
        if (xn.C(this.A).containsKey(Long.valueOf(l1)))
        {
          long l2 = ((Long)xn.C(this.A).get(Long.valueOf(l1))).longValue();
          if (xn.C(this.A)) {
            vd.C(1, fc.C("Sumsmic'bueja'bhv'pnib>'!c"), new Object[] { Long.valueOf(l2) });
          }
          paramBufferInfo.presentationTimeUs = l2;
          xn.C(this.A).writeSampleData(xn.C(this.A), localByteBuffer, paramBufferInfo);
          xn.C(this.A).remove(Long.valueOf(l1));
          xn.C(this.A).releaseOutputBuffer(paramInt, false);
          if ((paramBufferInfo.flags & 0x4) != 0) {
            xn.C(this.A).countDown();
          }
          xn.C(this.A).H();
          continue;
        }
      }
      finally {}
      tmp357_354[0] = Long.valueOf(xn.C(this.A) - 1L);
      vd.C(1, fc.C("Bhqi`'aigh`b`'bueja'snpo$ik'tuataipfpnki$smja+$tontwmic'bueja'!c"), tmp357_354);
    }
  }
  
  /* Error */
  public void onOutputFormatChanged(MediaCodec paramMediaCodec, android.media.MediaFormat paramMediaFormat)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 20	com/appsee/yl:l	Z
    //   6: ifeq +15 -> 21
    //   9: aconst_null
    //   10: ldc -74
    //   12: invokestatic 34	com/appsee/fc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   15: invokestatic 39	com/appsee/ue:C	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: aload_0
    //   22: getfield 15	com/appsee/yl:A	Lcom/appsee/xn;
    //   25: invokestatic 50	com/appsee/xn:C	(Lcom/appsee/xn;)Z
    //   28: ifeq +12 -> 40
    //   31: iconst_1
    //   32: ldc -72
    //   34: invokestatic 34	com/appsee/fc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   37: invokestatic 97	com/appsee/vd:H	(ILjava/lang/String;)V
    //   40: aload_0
    //   41: getfield 15	com/appsee/yl:A	Lcom/appsee/xn;
    //   44: aload_2
    //   45: invokestatic 114	com/appsee/xn:C	(Lcom/appsee/xn;Landroid/media/MediaFormat;)V
    //   48: goto -30 -> 18
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	yl
    //   0	56	1	paramMediaCodec	MediaCodec
    //   0	56	2	paramMediaFormat	android.media.MediaFormat
    // Exception table:
    //   from	to	target	type
    //   2	18	51	finally
    //   21	40	51	finally
    //   40	48	51	finally
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\yl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */