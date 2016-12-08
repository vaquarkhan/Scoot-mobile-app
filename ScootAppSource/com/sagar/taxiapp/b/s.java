package com.sagar.taxiapp.b;

import android.os.AsyncTask;

public final class s
  extends AsyncTask<String, String, String>
{
  public s(h paramh) {}
  
  /* Error */
  protected String a(String... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 11	com/sagar/taxiapp/b/s:a	Lcom/sagar/taxiapp/b/h;
    //   4: invokestatic 26	java/net/InetAddress:getLocalHost	()Ljava/net/InetAddress;
    //   7: invokevirtual 30	java/net/InetAddress:getHostAddress	()Ljava/lang/String;
    //   10: invokestatic 36	com/sagar/taxiapp/b/h:g	(Lcom/sagar/taxiapp/b/h;Ljava/lang/String;)Ljava/lang/String;
    //   13: pop
    //   14: invokestatic 42	java/net/NetworkInterface:getNetworkInterfaces	()Ljava/util/Enumeration;
    //   17: astore_1
    //   18: aload_1
    //   19: invokeinterface 48 1 0
    //   24: ifeq +122 -> 146
    //   27: aload_1
    //   28: invokeinterface 52 1 0
    //   33: checkcast 38	java/net/NetworkInterface
    //   36: invokevirtual 55	java/net/NetworkInterface:getInetAddresses	()Ljava/util/Enumeration;
    //   39: astore_2
    //   40: aload_2
    //   41: invokeinterface 48 1 0
    //   46: ifeq -28 -> 18
    //   49: aload_2
    //   50: invokeinterface 52 1 0
    //   55: checkcast 22	java/net/InetAddress
    //   58: astore_3
    //   59: ldc 57
    //   61: new 59	java/lang/StringBuilder
    //   64: dup
    //   65: invokespecial 60	java/lang/StringBuilder:<init>	()V
    //   68: ldc 62
    //   70: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: aload_3
    //   74: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   77: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: invokestatic 78	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   83: pop
    //   84: aload_3
    //   85: instanceof 80
    //   88: ifeq -48 -> 40
    //   91: aload_3
    //   92: invokevirtual 83	java/net/InetAddress:isLoopbackAddress	()Z
    //   95: ifne -55 -> 40
    //   98: ldc 57
    //   100: new 59	java/lang/StringBuilder
    //   103: dup
    //   104: invokespecial 60	java/lang/StringBuilder:<init>	()V
    //   107: ldc 85
    //   109: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: aload_3
    //   113: invokevirtual 30	java/net/InetAddress:getHostAddress	()Ljava/lang/String;
    //   116: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: invokestatic 78	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   125: pop
    //   126: aload_0
    //   127: getfield 11	com/sagar/taxiapp/b/s:a	Lcom/sagar/taxiapp/b/h;
    //   130: aload_3
    //   131: invokevirtual 30	java/net/InetAddress:getHostAddress	()Ljava/lang/String;
    //   134: invokestatic 36	com/sagar/taxiapp/b/h:g	(Lcom/sagar/taxiapp/b/h;Ljava/lang/String;)Ljava/lang/String;
    //   137: pop
    //   138: goto -98 -> 40
    //   141: astore_1
    //   142: aload_1
    //   143: invokevirtual 90	java/io/IOException:printStackTrace	()V
    //   146: aconst_null
    //   147: areturn
    //   148: astore_1
    //   149: goto -7 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	152	0	this	s
    //   0	152	1	paramVarArgs	String[]
    //   39	11	2	localEnumeration	java.util.Enumeration
    //   58	73	3	localInetAddress	java.net.InetAddress
    // Exception table:
    //   from	to	target	type
    //   0	18	141	java/net/UnknownHostException
    //   18	40	141	java/net/UnknownHostException
    //   40	138	141	java/net/UnknownHostException
    //   0	18	148	java/net/SocketException
    //   18	40	148	java/net/SocketException
    //   40	138	148	java/net/SocketException
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */