package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.Protocol;
import d.i;
import d.j;
import d.k;
import java.io.IOException;
import java.util.logging.Logger;

public final class Http2
  implements Variant
{
  private static final k CONNECTION_PREFACE = k.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
  static final byte FLAG_ACK = 1;
  static final byte FLAG_COMPRESSED = 32;
  static final byte FLAG_END_HEADERS = 4;
  static final byte FLAG_END_PUSH_PROMISE = 4;
  static final byte FLAG_END_STREAM = 1;
  static final byte FLAG_NONE = 0;
  static final byte FLAG_PADDED = 8;
  static final byte FLAG_PRIORITY = 32;
  static final int INITIAL_MAX_FRAME_SIZE = 16384;
  static final byte TYPE_CONTINUATION = 9;
  static final byte TYPE_DATA = 0;
  static final byte TYPE_GOAWAY = 7;
  static final byte TYPE_HEADERS = 1;
  static final byte TYPE_PING = 6;
  static final byte TYPE_PRIORITY = 2;
  static final byte TYPE_PUSH_PROMISE = 5;
  static final byte TYPE_RST_STREAM = 3;
  static final byte TYPE_SETTINGS = 4;
  static final byte TYPE_WINDOW_UPDATE = 8;
  private static final Logger logger = Logger.getLogger(Http2.FrameLogger.class.getName());
  
  private static IllegalArgumentException illegalArgument(String paramString, Object... paramVarArgs)
  {
    throw new IllegalArgumentException(String.format(paramString, paramVarArgs));
  }
  
  private static IOException ioException(String paramString, Object... paramVarArgs)
  {
    throw new IOException(String.format(paramString, paramVarArgs));
  }
  
  private static int lengthWithoutPadding(int paramInt, byte paramByte, short paramShort)
  {
    short s = paramInt;
    if ((paramByte & 0x8) != 0) {
      s = paramInt - 1;
    }
    if (paramShort > s) {
      throw ioException("PROTOCOL_ERROR padding %s > remaining length %s", new Object[] { Short.valueOf(paramShort), Integer.valueOf(s) });
    }
    return (short)(s - paramShort);
  }
  
  private static int readMedium(j paramj)
  {
    return (paramj.i() & 0xFF) << 16 | (paramj.i() & 0xFF) << 8 | paramj.i() & 0xFF;
  }
  
  private static void writeMedium(i parami, int paramInt)
  {
    parami.i(paramInt >>> 16 & 0xFF);
    parami.i(paramInt >>> 8 & 0xFF);
    parami.i(paramInt & 0xFF);
  }
  
  public Protocol getProtocol()
  {
    return Protocol.HTTP_2;
  }
  
  public FrameReader newReader(j paramj, boolean paramBoolean)
  {
    return new Http2.Reader(paramj, 4096, paramBoolean);
  }
  
  public FrameWriter newWriter(i parami, boolean paramBoolean)
  {
    return new Http2.Writer(parami, paramBoolean);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\Http2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */