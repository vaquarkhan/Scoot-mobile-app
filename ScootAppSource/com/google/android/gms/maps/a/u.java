package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;

final class u
  implements s
{
  private IBinder a;
  
  u(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public com.google.android.gms.a.j a(com.google.android.gms.maps.model.StreetViewPanoramaOrientation paramStreetViewPanoramaOrientation)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +51 -> 66
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 39	com/google/android/gms/maps/model/StreetViewPanoramaOrientation:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/a/u:a	Landroid/os/IBinder;
    //   33: bipush 19
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 45 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 48	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 52	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   52: invokestatic 57	com/google/android/gms/a/k:a	(Landroid/os/IBinder;)Lcom/google/android/gms/a/j;
    //   55: astore_1
    //   56: aload_3
    //   57: invokevirtual 60	android/os/Parcel:recycle	()V
    //   60: aload_2
    //   61: invokevirtual 60	android/os/Parcel:recycle	()V
    //   64: aload_1
    //   65: areturn
    //   66: aload_2
    //   67: iconst_0
    //   68: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   71: goto -42 -> 29
    //   74: astore_1
    //   75: aload_3
    //   76: invokevirtual 60	android/os/Parcel:recycle	()V
    //   79: aload_2
    //   80: invokevirtual 60	android/os/Parcel:recycle	()V
    //   83: aload_1
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	u
    //   0	85	1	paramStreetViewPanoramaOrientation	com.google.android.gms.maps.model.StreetViewPanoramaOrientation
    //   3	77	2	localParcel1	Parcel
    //   7	69	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	74	finally
    //   18	29	74	finally
    //   29	56	74	finally
    //   66	71	74	finally
  }
  
  /* Error */
  public com.google.android.gms.maps.model.StreetViewPanoramaOrientation a(com.google.android.gms.a.j paramj)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_3
    //   6: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 4
    //   11: aload_3
    //   12: ldc 25
    //   14: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +69 -> 87
    //   21: aload_1
    //   22: invokeinterface 66 1 0
    //   27: astore_1
    //   28: aload_3
    //   29: aload_1
    //   30: invokevirtual 69	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   33: aload_0
    //   34: getfield 15	com/google/android/gms/maps/a/u:a	Landroid/os/IBinder;
    //   37: bipush 18
    //   39: aload_3
    //   40: aload 4
    //   42: iconst_0
    //   43: invokeinterface 45 5 0
    //   48: pop
    //   49: aload 4
    //   51: invokevirtual 48	android/os/Parcel:readException	()V
    //   54: aload_2
    //   55: astore_1
    //   56: aload 4
    //   58: invokevirtual 73	android/os/Parcel:readInt	()I
    //   61: ifeq +15 -> 76
    //   64: getstatic 77	com/google/android/gms/maps/model/StreetViewPanoramaOrientation:CREATOR	Lcom/google/android/gms/maps/model/w;
    //   67: aload 4
    //   69: invokevirtual 83	com/google/android/gms/maps/model/w:createFromParcel	(Landroid/os/Parcel;)Ljava/lang/Object;
    //   72: checkcast 35	com/google/android/gms/maps/model/StreetViewPanoramaOrientation
    //   75: astore_1
    //   76: aload 4
    //   78: invokevirtual 60	android/os/Parcel:recycle	()V
    //   81: aload_3
    //   82: invokevirtual 60	android/os/Parcel:recycle	()V
    //   85: aload_1
    //   86: areturn
    //   87: aconst_null
    //   88: astore_1
    //   89: goto -61 -> 28
    //   92: astore_1
    //   93: aload 4
    //   95: invokevirtual 60	android/os/Parcel:recycle	()V
    //   98: aload_3
    //   99: invokevirtual 60	android/os/Parcel:recycle	()V
    //   102: aload_1
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	u
    //   0	104	1	paramj	com.google.android.gms.a.j
    //   1	54	2	localObject	Object
    //   5	94	3	localParcel1	Parcel
    //   9	85	4	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   11	17	92	finally
    //   21	28	92	finally
    //   28	54	92	finally
    //   56	76	92	finally
  }
  
  /* Error */
  public void a(cz paramcz)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +43 -> 58
    //   18: aload_1
    //   19: invokeinterface 87 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 69	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/maps/a/u:a	Landroid/os/IBinder;
    //   34: bipush 16
    //   36: aload_2
    //   37: aload_3
    //   38: iconst_0
    //   39: invokeinterface 45 5 0
    //   44: pop
    //   45: aload_3
    //   46: invokevirtual 48	android/os/Parcel:readException	()V
    //   49: aload_3
    //   50: invokevirtual 60	android/os/Parcel:recycle	()V
    //   53: aload_2
    //   54: invokevirtual 60	android/os/Parcel:recycle	()V
    //   57: return
    //   58: aconst_null
    //   59: astore_1
    //   60: goto -35 -> 25
    //   63: astore_1
    //   64: aload_3
    //   65: invokevirtual 60	android/os/Parcel:recycle	()V
    //   68: aload_2
    //   69: invokevirtual 60	android/os/Parcel:recycle	()V
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	u
    //   0	74	1	paramcz	cz
    //   3	66	2	localParcel1	Parcel
    //   7	58	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	63	finally
    //   18	25	63	finally
    //   25	49	63	finally
  }
  
  /* Error */
  public void a(dc paramdc)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +43 -> 58
    //   18: aload_1
    //   19: invokeinterface 91 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 69	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/maps/a/u:a	Landroid/os/IBinder;
    //   34: bipush 15
    //   36: aload_2
    //   37: aload_3
    //   38: iconst_0
    //   39: invokeinterface 45 5 0
    //   44: pop
    //   45: aload_3
    //   46: invokevirtual 48	android/os/Parcel:readException	()V
    //   49: aload_3
    //   50: invokevirtual 60	android/os/Parcel:recycle	()V
    //   53: aload_2
    //   54: invokevirtual 60	android/os/Parcel:recycle	()V
    //   57: return
    //   58: aconst_null
    //   59: astore_1
    //   60: goto -35 -> 25
    //   63: astore_1
    //   64: aload_3
    //   65: invokevirtual 60	android/os/Parcel:recycle	()V
    //   68: aload_2
    //   69: invokevirtual 60	android/os/Parcel:recycle	()V
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	u
    //   0	74	1	paramdc	dc
    //   3	66	2	localParcel1	Parcel
    //   7	58	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	63	finally
    //   18	25	63	finally
    //   25	49	63	finally
  }
  
  /* Error */
  public void a(df paramdf)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +43 -> 58
    //   18: aload_1
    //   19: invokeinterface 95 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 69	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/maps/a/u:a	Landroid/os/IBinder;
    //   34: bipush 17
    //   36: aload_2
    //   37: aload_3
    //   38: iconst_0
    //   39: invokeinterface 45 5 0
    //   44: pop
    //   45: aload_3
    //   46: invokevirtual 48	android/os/Parcel:readException	()V
    //   49: aload_3
    //   50: invokevirtual 60	android/os/Parcel:recycle	()V
    //   53: aload_2
    //   54: invokevirtual 60	android/os/Parcel:recycle	()V
    //   57: return
    //   58: aconst_null
    //   59: astore_1
    //   60: goto -35 -> 25
    //   63: astore_1
    //   64: aload_3
    //   65: invokevirtual 60	android/os/Parcel:recycle	()V
    //   68: aload_2
    //   69: invokevirtual 60	android/os/Parcel:recycle	()V
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	u
    //   0	74	1	paramdf	df
    //   3	66	2	localParcel1	Parcel
    //   7	58	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	63	finally
    //   18	25	63	finally
    //   25	49	63	finally
  }
  
  /* Error */
  public void a(di paramdi)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +43 -> 58
    //   18: aload_1
    //   19: invokeinterface 99 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 69	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/maps/a/u:a	Landroid/os/IBinder;
    //   34: bipush 20
    //   36: aload_2
    //   37: aload_3
    //   38: iconst_0
    //   39: invokeinterface 45 5 0
    //   44: pop
    //   45: aload_3
    //   46: invokevirtual 48	android/os/Parcel:readException	()V
    //   49: aload_3
    //   50: invokevirtual 60	android/os/Parcel:recycle	()V
    //   53: aload_2
    //   54: invokevirtual 60	android/os/Parcel:recycle	()V
    //   57: return
    //   58: aconst_null
    //   59: astore_1
    //   60: goto -35 -> 25
    //   63: astore_1
    //   64: aload_3
    //   65: invokevirtual 60	android/os/Parcel:recycle	()V
    //   68: aload_2
    //   69: invokevirtual 60	android/os/Parcel:recycle	()V
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	u
    //   0	74	1	paramdi	di
    //   3	66	2	localParcel1	Parcel
    //   7	58	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	63	finally
    //   18	25	63	finally
    //   25	49	63	finally
  }
  
  /* Error */
  public void a(com.google.android.gms.maps.model.LatLng paramLatLng)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +42 -> 57
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 103	com/google/android/gms/maps/model/LatLng:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/a/u:a	Landroid/os/IBinder;
    //   33: bipush 12
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 45 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 48	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 60	android/os/Parcel:recycle	()V
    //   52: aload_2
    //   53: invokevirtual 60	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aload_2
    //   58: iconst_0
    //   59: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   62: goto -33 -> 29
    //   65: astore_1
    //   66: aload_3
    //   67: invokevirtual 60	android/os/Parcel:recycle	()V
    //   70: aload_2
    //   71: invokevirtual 60	android/os/Parcel:recycle	()V
    //   74: aload_1
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	u
    //   0	76	1	paramLatLng	com.google.android.gms.maps.model.LatLng
    //   3	68	2	localParcel1	Parcel
    //   7	60	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	65	finally
    //   18	29	65	finally
    //   29	48	65	finally
    //   57	62	65	finally
  }
  
  /* Error */
  public void a(com.google.android.gms.maps.model.LatLng paramLatLng, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 25
    //   12: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: ifnull +50 -> 66
    //   19: aload_3
    //   20: iconst_1
    //   21: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   24: aload_1
    //   25: aload_3
    //   26: iconst_0
    //   27: invokevirtual 103	com/google/android/gms/maps/model/LatLng:writeToParcel	(Landroid/os/Parcel;I)V
    //   30: aload_3
    //   31: iload_2
    //   32: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   35: aload_0
    //   36: getfield 15	com/google/android/gms/maps/a/u:a	Landroid/os/IBinder;
    //   39: bipush 13
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 45 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 48	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 60	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 60	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   71: goto -41 -> 30
    //   74: astore_1
    //   75: aload 4
    //   77: invokevirtual 60	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: invokevirtual 60	android/os/Parcel:recycle	()V
    //   84: aload_1
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	u
    //   0	86	1	paramLatLng	com.google.android.gms.maps.model.LatLng
    //   0	86	2	paramInt	int
    //   3	78	3	localParcel1	Parcel
    //   7	69	4	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   9	15	74	finally
    //   19	30	74	finally
    //   30	56	74	finally
    //   66	71	74	finally
  }
  
  /* Error */
  public void a(com.google.android.gms.maps.model.StreetViewPanoramaCamera paramStreetViewPanoramaCamera, long paramLong)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: aload 4
    //   12: ldc 25
    //   14: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +55 -> 73
    //   21: aload 4
    //   23: iconst_1
    //   24: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   27: aload_1
    //   28: aload 4
    //   30: iconst_0
    //   31: invokevirtual 108	com/google/android/gms/maps/model/StreetViewPanoramaCamera:writeToParcel	(Landroid/os/Parcel;I)V
    //   34: aload 4
    //   36: lload_2
    //   37: invokevirtual 112	android/os/Parcel:writeLong	(J)V
    //   40: aload_0
    //   41: getfield 15	com/google/android/gms/maps/a/u:a	Landroid/os/IBinder;
    //   44: bipush 9
    //   46: aload 4
    //   48: aload 5
    //   50: iconst_0
    //   51: invokeinterface 45 5 0
    //   56: pop
    //   57: aload 5
    //   59: invokevirtual 48	android/os/Parcel:readException	()V
    //   62: aload 5
    //   64: invokevirtual 60	android/os/Parcel:recycle	()V
    //   67: aload 4
    //   69: invokevirtual 60	android/os/Parcel:recycle	()V
    //   72: return
    //   73: aload 4
    //   75: iconst_0
    //   76: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   79: goto -45 -> 34
    //   82: astore_1
    //   83: aload 5
    //   85: invokevirtual 60	android/os/Parcel:recycle	()V
    //   88: aload 4
    //   90: invokevirtual 60	android/os/Parcel:recycle	()V
    //   93: aload_1
    //   94: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	u
    //   0	95	1	paramStreetViewPanoramaCamera	com.google.android.gms.maps.model.StreetViewPanoramaCamera
    //   0	95	2	paramLong	long
    //   3	86	4	localParcel1	Parcel
    //   8	76	5	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   10	17	82	finally
    //   21	34	82	finally
    //   34	62	82	finally
    //   73	79	82	finally
  }
  
  public void a(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      localParcel1.writeString(paramString);
      this.a.transact(11, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_3
    //   6: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 4
    //   11: aload_3
    //   12: ldc 25
    //   14: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: iload_1
    //   18: ifeq +38 -> 56
    //   21: aload_3
    //   22: iload_2
    //   23: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   26: aload_0
    //   27: getfield 15	com/google/android/gms/maps/a/u:a	Landroid/os/IBinder;
    //   30: iconst_1
    //   31: aload_3
    //   32: aload 4
    //   34: iconst_0
    //   35: invokeinterface 45 5 0
    //   40: pop
    //   41: aload 4
    //   43: invokevirtual 48	android/os/Parcel:readException	()V
    //   46: aload 4
    //   48: invokevirtual 60	android/os/Parcel:recycle	()V
    //   51: aload_3
    //   52: invokevirtual 60	android/os/Parcel:recycle	()V
    //   55: return
    //   56: iconst_0
    //   57: istore_2
    //   58: goto -37 -> 21
    //   61: astore 5
    //   63: aload 4
    //   65: invokevirtual 60	android/os/Parcel:recycle	()V
    //   68: aload_3
    //   69: invokevirtual 60	android/os/Parcel:recycle	()V
    //   72: aload 5
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	u
    //   0	75	1	paramBoolean	boolean
    //   1	57	2	i	int
    //   5	64	3	localParcel1	Parcel
    //   9	55	4	localParcel2	Parcel
    //   61	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   11	17	61	finally
    //   21	46	61	finally
  }
  
  public boolean a()
  {
    boolean bool = false;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      this.a.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  public void b(boolean paramBoolean)
  {
    int i = 0;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      this.a.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean b()
  {
    boolean bool = false;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      this.a.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void c(boolean paramBoolean)
  {
    int i = 0;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      this.a.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean c()
  {
    boolean bool = false;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      this.a.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void d(boolean paramBoolean)
  {
    int i = 0;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      this.a.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean d()
  {
    boolean bool = false;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      this.a.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public com.google.android.gms.maps.model.StreetViewPanoramaCamera e()
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	com/google/android/gms/maps/a/u:a	Landroid/os/IBinder;
    //   18: bipush 10
    //   20: aload_2
    //   21: aload_3
    //   22: iconst_0
    //   23: invokeinterface 45 5 0
    //   28: pop
    //   29: aload_3
    //   30: invokevirtual 48	android/os/Parcel:readException	()V
    //   33: aload_3
    //   34: invokevirtual 73	android/os/Parcel:readInt	()I
    //   37: ifeq +24 -> 61
    //   40: getstatic 125	com/google/android/gms/maps/model/StreetViewPanoramaCamera:CREATOR	Lcom/google/android/gms/maps/model/t;
    //   43: aload_3
    //   44: invokevirtual 128	com/google/android/gms/maps/model/t:createFromParcel	(Landroid/os/Parcel;)Ljava/lang/Object;
    //   47: checkcast 107	com/google/android/gms/maps/model/StreetViewPanoramaCamera
    //   50: astore_1
    //   51: aload_3
    //   52: invokevirtual 60	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 60	android/os/Parcel:recycle	()V
    //   59: aload_1
    //   60: areturn
    //   61: aconst_null
    //   62: astore_1
    //   63: goto -12 -> 51
    //   66: astore_1
    //   67: aload_3
    //   68: invokevirtual 60	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 60	android/os/Parcel:recycle	()V
    //   75: aload_1
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	u
    //   50	13	1	localStreetViewPanoramaCamera	com.google.android.gms.maps.model.StreetViewPanoramaCamera
    //   66	10	1	localObject	Object
    //   3	69	2	localParcel1	Parcel
    //   7	61	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	51	66	finally
  }
  
  /* Error */
  public com.google.android.gms.maps.model.StreetViewPanoramaLocation f()
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	com/google/android/gms/maps/a/u:a	Landroid/os/IBinder;
    //   18: bipush 14
    //   20: aload_2
    //   21: aload_3
    //   22: iconst_0
    //   23: invokeinterface 45 5 0
    //   28: pop
    //   29: aload_3
    //   30: invokevirtual 48	android/os/Parcel:readException	()V
    //   33: aload_3
    //   34: invokevirtual 73	android/os/Parcel:readInt	()I
    //   37: ifeq +24 -> 61
    //   40: getstatic 135	com/google/android/gms/maps/model/StreetViewPanoramaLocation:CREATOR	Lcom/google/android/gms/maps/model/v;
    //   43: aload_3
    //   44: invokevirtual 138	com/google/android/gms/maps/model/v:createFromParcel	(Landroid/os/Parcel;)Ljava/lang/Object;
    //   47: checkcast 132	com/google/android/gms/maps/model/StreetViewPanoramaLocation
    //   50: astore_1
    //   51: aload_3
    //   52: invokevirtual 60	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 60	android/os/Parcel:recycle	()V
    //   59: aload_1
    //   60: areturn
    //   61: aconst_null
    //   62: astore_1
    //   63: goto -12 -> 51
    //   66: astore_1
    //   67: aload_3
    //   68: invokevirtual 60	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 60	android/os/Parcel:recycle	()V
    //   75: aload_1
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	u
    //   50	13	1	localStreetViewPanoramaLocation	com.google.android.gms.maps.model.StreetViewPanoramaLocation
    //   66	10	1	localObject	Object
    //   3	69	2	localParcel1	Parcel
    //   7	61	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	51	66	finally
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */