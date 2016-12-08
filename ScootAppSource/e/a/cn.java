package e.a;

import java.nio.ByteBuffer;

public final class cn
{
  public boolean A;
  public int B;
  public int C;
  public int D;
  public int E;
  public int[] F;
  public dm G;
  public cl H;
  public int I;
  public int a;
  public boolean b;
  public boolean c;
  public boolean d;
  public boolean e;
  public z f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k;
  public int l;
  public boolean m;
  public int n;
  public boolean o;
  public boolean p;
  public boolean q;
  public boolean r;
  public int s;
  public int t;
  public boolean u;
  public int v;
  public int w;
  public int x;
  public boolean y;
  public boolean z;
  
  public static int a(z paramz)
  {
    switch (co.a[paramz.ordinal()])
    {
    default: 
      throw new RuntimeException("Colorspace not supported");
    case 1: 
      return 0;
    case 2: 
      return 1;
    case 3: 
      return 2;
    }
    return 3;
  }
  
  public static cn a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer = new j(paramByteBuffer);
    cn localcn = new cn();
    localcn.n = o.a(paramByteBuffer, 8, "SPS: profile_idc");
    localcn.o = o.c(paramByteBuffer, "SPS: constraint_set_0_flag");
    localcn.p = o.c(paramByteBuffer, "SPS: constraint_set_1_flag");
    localcn.q = o.c(paramByteBuffer, "SPS: constraint_set_2_flag");
    localcn.r = o.c(paramByteBuffer, "SPS: constraint_set_3_flag");
    o.a(paramByteBuffer, 4, "SPS: reserved_zero_4bits");
    localcn.s = o.a(paramByteBuffer, 8, "SPS: level_idc");
    localcn.t = o.a(paramByteBuffer, "SPS: seq_parameter_set_id");
    if ((localcn.n == 100) || (localcn.n == 110) || (localcn.n == 122) || (localcn.n == 144))
    {
      localcn.f = a(o.a(paramByteBuffer, "SPS: chroma_format_idc"));
      if (localcn.f == z.c) {
        localcn.u = o.c(paramByteBuffer, "SPS: residual_color_transform_flag");
      }
      localcn.k = o.a(paramByteBuffer, "SPS: bit_depth_luma_minus8");
      localcn.l = o.a(paramByteBuffer, "SPS: bit_depth_chroma_minus8");
      localcn.m = o.c(paramByteBuffer, "SPS: qpprime_y_zero_transform_bypass_flag");
      if (o.c(paramByteBuffer, "SPS: seq_scaling_matrix_present_lag")) {
        a(paramByteBuffer, localcn);
      }
      localcn.g = o.a(paramByteBuffer, "SPS: log2_max_frame_num_minus4");
      localcn.a = o.a(paramByteBuffer, "SPS: pic_order_cnt_type");
      if (localcn.a != 0) {
        break label413;
      }
      localcn.h = o.a(paramByteBuffer, "SPS: log2_max_pic_order_cnt_lsb_minus4");
    }
    for (;;)
    {
      localcn.x = o.a(paramByteBuffer, "SPS: num_ref_frames");
      localcn.y = o.c(paramByteBuffer, "SPS: gaps_in_frame_num_value_allowed_flag");
      localcn.j = o.a(paramByteBuffer, "SPS: pic_width_in_mbs_minus1");
      localcn.i = o.a(paramByteBuffer, "SPS: pic_height_in_map_units_minus1");
      localcn.z = o.c(paramByteBuffer, "SPS: frame_mbs_only_flag");
      if (!localcn.z) {
        localcn.d = o.c(paramByteBuffer, "SPS: mb_adaptive_frame_field_flag");
      }
      localcn.e = o.c(paramByteBuffer, "SPS: direct_8x8_inference_flag");
      localcn.A = o.c(paramByteBuffer, "SPS: frame_cropping_flag");
      if (localcn.A)
      {
        localcn.B = o.a(paramByteBuffer, "SPS: frame_crop_left_offset");
        localcn.C = o.a(paramByteBuffer, "SPS: frame_crop_right_offset");
        localcn.D = o.a(paramByteBuffer, "SPS: frame_crop_top_offset");
        localcn.E = o.a(paramByteBuffer, "SPS: frame_crop_bottom_offset");
      }
      if (o.c(paramByteBuffer, "SPS: vui_parameters_present_flag")) {
        localcn.G = a(paramByteBuffer);
      }
      return localcn;
      localcn.f = z.a;
      break;
      label413:
      if (localcn.a == 1)
      {
        localcn.c = o.c(paramByteBuffer, "SPS: delta_pic_order_always_zero_flag");
        localcn.v = o.b(paramByteBuffer, "SPS: offset_for_non_ref_pic");
        localcn.w = o.b(paramByteBuffer, "SPS: offset_for_top_to_bottom_field");
        localcn.I = o.a(paramByteBuffer, "SPS: num_ref_frames_in_pic_order_cnt_cycle");
        localcn.F = new int[localcn.I];
        int i1 = 0;
        while (i1 < localcn.I)
        {
          localcn.F[i1] = o.b(paramByteBuffer, "SPS: offsetForRefFrame [" + i1 + "]");
          i1 += 1;
        }
      }
    }
  }
  
  private static dm a(j paramj)
  {
    dm localdm = new dm();
    localdm.a = o.c(paramj, "VUI: aspect_ratio_info_present_flag");
    if (localdm.a)
    {
      localdm.y = f.a(o.a(paramj, 8, "VUI: aspect_ratio"));
      if (localdm.y == f.a)
      {
        localdm.b = o.a(paramj, 16, "VUI: sar_width");
        localdm.c = o.a(paramj, 16, "VUI: sar_height");
      }
    }
    localdm.d = o.c(paramj, "VUI: overscan_info_present_flag");
    if (localdm.d) {
      localdm.e = o.c(paramj, "VUI: overscan_appropriate_flag");
    }
    localdm.f = o.c(paramj, "VUI: video_signal_type_present_flag");
    if (localdm.f)
    {
      localdm.g = o.a(paramj, 3, "VUI: video_format");
      localdm.h = o.c(paramj, "VUI: video_full_range_flag");
      localdm.i = o.c(paramj, "VUI: colour_description_present_flag");
      if (localdm.i)
      {
        localdm.j = o.a(paramj, 8, "VUI: colour_primaries");
        localdm.k = o.a(paramj, 8, "VUI: transfer_characteristics");
        localdm.l = o.a(paramj, 8, "VUI: matrix_coefficients");
      }
    }
    localdm.m = o.c(paramj, "VUI: chroma_loc_info_present_flag");
    if (localdm.m)
    {
      localdm.n = o.a(paramj, "VUI chroma_sample_loc_type_top_field");
      localdm.o = o.a(paramj, "VUI chroma_sample_loc_type_bottom_field");
    }
    localdm.p = o.c(paramj, "VUI: timing_info_present_flag");
    if (localdm.p)
    {
      localdm.q = o.a(paramj, 32, "VUI: num_units_in_tick");
      localdm.r = o.a(paramj, 32, "VUI: time_scale");
      localdm.s = o.c(paramj, "VUI: fixed_frame_rate_flag");
    }
    boolean bool1 = o.c(paramj, "VUI: nal_hrd_parameters_present_flag");
    if (bool1) {
      localdm.v = b(paramj);
    }
    boolean bool2 = o.c(paramj, "VUI: vcl_hrd_parameters_present_flag");
    if (bool2) {
      localdm.w = b(paramj);
    }
    if ((bool1) || (bool2)) {
      localdm.t = o.c(paramj, "VUI: low_delay_hrd_flag");
    }
    localdm.u = o.c(paramj, "VUI: pic_struct_present_flag");
    if (o.c(paramj, "VUI: bitstream_restriction_flag"))
    {
      localdm.x = new dn();
      localdm.x.a = o.c(paramj, "VUI: motion_vectors_over_pic_boundaries_flag");
      localdm.x.b = o.a(paramj, "VUI max_bytes_per_pic_denom");
      localdm.x.c = o.a(paramj, "VUI max_bits_per_mb_denom");
      localdm.x.d = o.a(paramj, "VUI log2_max_mv_length_horizontal");
      localdm.x.e = o.a(paramj, "VUI log2_max_mv_length_vertical");
      localdm.x.f = o.a(paramj, "VUI num_reorder_frames");
      localdm.x.g = o.a(paramj, "VUI max_dec_frame_buffering");
    }
    return localdm;
  }
  
  public static z a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new RuntimeException("Colorspace not supported");
    case 0: 
      return z.d;
    case 1: 
      return z.a;
    case 2: 
      return z.b;
    }
    return z.c;
  }
  
  private void a(au paramau, k paramk)
  {
    p.a(paramk, paramau.a, "HRD: cpb_cnt_minus1");
    p.a(paramk, paramau.b, 4, "HRD: bit_rate_scale");
    p.a(paramk, paramau.c, 4, "HRD: cpb_size_scale");
    int i1 = 0;
    while (i1 <= paramau.a)
    {
      p.a(paramk, paramau.d[i1], "HRD: ");
      p.a(paramk, paramau.e[i1], "HRD: ");
      p.a(paramk, paramau.f[i1], "HRD: ");
      i1 += 1;
    }
    p.a(paramk, paramau.g, 5, "HRD: initial_cpb_removal_delay_length_minus1");
    p.a(paramk, paramau.h, 5, "HRD: cpb_removal_delay_length_minus1");
    p.a(paramk, paramau.i, 5, "HRD: dpb_output_delay_length_minus1");
    p.a(paramk, paramau.j, 5, "HRD: time_offset_length");
  }
  
  private void a(dm paramdm, k paramk)
  {
    boolean bool2 = true;
    p.a(paramk, paramdm.a, "VUI: aspect_ratio_info_present_flag");
    if (paramdm.a)
    {
      p.a(paramk, paramdm.y.a(), 8, "VUI: aspect_ratio");
      if (paramdm.y == f.a)
      {
        p.a(paramk, paramdm.b, 16, "VUI: sar_width");
        p.a(paramk, paramdm.c, 16, "VUI: sar_height");
      }
    }
    p.a(paramk, paramdm.d, "VUI: overscan_info_present_flag");
    if (paramdm.d) {
      p.a(paramk, paramdm.e, "VUI: overscan_appropriate_flag");
    }
    p.a(paramk, paramdm.f, "VUI: video_signal_type_present_flag");
    if (paramdm.f)
    {
      p.a(paramk, paramdm.g, 3, "VUI: video_format");
      p.a(paramk, paramdm.h, "VUI: video_full_range_flag");
      p.a(paramk, paramdm.i, "VUI: colour_description_present_flag");
      if (paramdm.i)
      {
        p.a(paramk, paramdm.j, 8, "VUI: colour_primaries");
        p.a(paramk, paramdm.k, 8, "VUI: transfer_characteristics");
        p.a(paramk, paramdm.l, 8, "VUI: matrix_coefficients");
      }
    }
    p.a(paramk, paramdm.m, "VUI: chroma_loc_info_present_flag");
    if (paramdm.m)
    {
      p.a(paramk, paramdm.n, "VUI: chroma_sample_loc_type_top_field");
      p.a(paramk, paramdm.o, "VUI: chroma_sample_loc_type_bottom_field");
    }
    p.a(paramk, paramdm.p, "VUI: timing_info_present_flag");
    if (paramdm.p)
    {
      p.a(paramk, paramdm.q, 32, "VUI: num_units_in_tick");
      p.a(paramk, paramdm.r, 32, "VUI: time_scale");
      p.a(paramk, paramdm.s, "VUI: fixed_frame_rate_flag");
    }
    if (paramdm.v != null)
    {
      bool1 = true;
      p.a(paramk, bool1, "VUI: ");
      if (paramdm.v != null) {
        a(paramdm.v, paramk);
      }
      if (paramdm.w == null) {
        break label535;
      }
      bool1 = true;
      label346:
      p.a(paramk, bool1, "VUI: ");
      if (paramdm.w != null) {
        a(paramdm.w, paramk);
      }
      if ((paramdm.v != null) || (paramdm.w != null)) {
        p.a(paramk, paramdm.t, "VUI: low_delay_hrd_flag");
      }
      p.a(paramk, paramdm.u, "VUI: pic_struct_present_flag");
      if (paramdm.x == null) {
        break label540;
      }
    }
    label535:
    label540:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      p.a(paramk, bool1, "VUI: ");
      if (paramdm.x != null)
      {
        p.a(paramk, paramdm.x.a, "VUI: motion_vectors_over_pic_boundaries_flag");
        p.a(paramk, paramdm.x.b, "VUI: max_bytes_per_pic_denom");
        p.a(paramk, paramdm.x.c, "VUI: max_bits_per_mb_denom");
        p.a(paramk, paramdm.x.d, "VUI: log2_max_mv_length_horizontal");
        p.a(paramk, paramdm.x.e, "VUI: log2_max_mv_length_vertical");
        p.a(paramk, paramdm.x.f, "VUI: num_reorder_frames");
        p.a(paramk, paramdm.x.g, "VUI: max_dec_frame_buffering");
      }
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label346;
    }
  }
  
  private static void a(j paramj, cn paramcn)
  {
    paramcn.H = new cl();
    int i1 = 0;
    if (i1 < 8)
    {
      if (o.c(paramj, "SPS: seqScalingListPresentFlag"))
      {
        paramcn.H.a = new ck[8];
        paramcn.H.b = new ck[8];
        if (i1 >= 6) {
          break label81;
        }
        paramcn.H.a[i1] = ck.a(paramj, 16);
      }
      for (;;)
      {
        i1 += 1;
        break;
        label81:
        paramcn.H.b[(i1 - 6)] = ck.a(paramj, 64);
      }
    }
  }
  
  private static au b(j paramj)
  {
    au localau = new au();
    localau.a = o.a(paramj, "SPS: cpb_cnt_minus1");
    localau.b = o.a(paramj, 4, "HRD: bit_rate_scale");
    localau.c = o.a(paramj, 4, "HRD: cpb_size_scale");
    localau.d = new int[localau.a + 1];
    localau.e = new int[localau.a + 1];
    localau.f = new boolean[localau.a + 1];
    int i1 = 0;
    while (i1 <= localau.a)
    {
      localau.d[i1] = o.a(paramj, "HRD: bit_rate_value_minus1");
      localau.e[i1] = o.a(paramj, "HRD: cpb_size_value_minus1");
      localau.f[i1] = o.c(paramj, "HRD: cbr_flag");
      i1 += 1;
    }
    localau.g = o.a(paramj, 5, "HRD: initial_cpb_removal_delay_length_minus1");
    localau.h = o.a(paramj, 5, "HRD: cpb_removal_delay_length_minus1");
    localau.i = o.a(paramj, 5, "HRD: dpb_output_delay_length_minus1");
    localau.j = o.a(paramj, 5, "HRD: time_offset_length");
    return localau;
  }
  
  public void b(ByteBuffer paramByteBuffer)
  {
    boolean bool2 = true;
    paramByteBuffer = new k(paramByteBuffer);
    p.a(paramByteBuffer, this.n, 8, "SPS: profile_idc");
    p.a(paramByteBuffer, this.o, "SPS: constraint_set_0_flag");
    p.a(paramByteBuffer, this.p, "SPS: constraint_set_1_flag");
    p.a(paramByteBuffer, this.q, "SPS: constraint_set_2_flag");
    p.a(paramByteBuffer, this.r, "SPS: constraint_set_3_flag");
    p.a(paramByteBuffer, 0L, 4, "SPS: reserved");
    p.a(paramByteBuffer, this.s, 8, "SPS: level_idc");
    p.a(paramByteBuffer, this.t, "SPS: seq_parameter_set_id");
    int i1;
    if ((this.n == 100) || (this.n == 110) || (this.n == 122) || (this.n == 144))
    {
      p.a(paramByteBuffer, a(this.f), "SPS: chroma_format_idc");
      if (this.f == z.c) {
        p.a(paramByteBuffer, this.u, "SPS: residual_color_transform_flag");
      }
      p.a(paramByteBuffer, this.k, "SPS: ");
      p.a(paramByteBuffer, this.l, "SPS: ");
      p.a(paramByteBuffer, this.m, "SPS: qpprime_y_zero_transform_bypass_flag");
      if (this.H != null)
      {
        bool1 = true;
        p.a(paramByteBuffer, bool1, "SPS: ");
        if (this.H == null) {
          break label365;
        }
        i1 = 0;
        label225:
        if (i1 >= 8) {
          break label365;
        }
        if (i1 >= 6) {
          break label301;
        }
        if (this.H.a[i1] == null) {
          break label296;
        }
      }
      label296:
      for (bool1 = true;; bool1 = false)
      {
        p.a(paramByteBuffer, bool1, "SPS: ");
        if (this.H.a[i1] != null) {
          this.H.a[i1].a(paramByteBuffer);
        }
        i1 += 1;
        break label225;
        bool1 = false;
        break;
      }
      label301:
      if (this.H.b[(i1 - 6)] != null) {}
      for (bool1 = true;; bool1 = false)
      {
        p.a(paramByteBuffer, bool1, "SPS: ");
        if (this.H.b[(i1 - 6)] == null) {
          break;
        }
        this.H.b[(i1 - 6)].a(paramByteBuffer);
        break;
      }
    }
    label365:
    p.a(paramByteBuffer, this.g, "SPS: log2_max_frame_num_minus4");
    p.a(paramByteBuffer, this.a, "SPS: pic_order_cnt_type");
    if (this.a == 0)
    {
      p.a(paramByteBuffer, this.h, "SPS: log2_max_pic_order_cnt_lsb_minus4");
      p.a(paramByteBuffer, this.x, "SPS: num_ref_frames");
      p.a(paramByteBuffer, this.y, "SPS: gaps_in_frame_num_value_allowed_flag");
      p.a(paramByteBuffer, this.j, "SPS: pic_width_in_mbs_minus1");
      p.a(paramByteBuffer, this.i, "SPS: pic_height_in_map_units_minus1");
      p.a(paramByteBuffer, this.z, "SPS: frame_mbs_only_flag");
      if (!this.z) {
        p.a(paramByteBuffer, this.d, "SPS: mb_adaptive_frame_field_flag");
      }
      p.a(paramByteBuffer, this.e, "SPS: direct_8x8_inference_flag");
      p.a(paramByteBuffer, this.A, "SPS: frame_cropping_flag");
      if (this.A)
      {
        p.a(paramByteBuffer, this.B, "SPS: frame_crop_left_offset");
        p.a(paramByteBuffer, this.C, "SPS: frame_crop_right_offset");
        p.a(paramByteBuffer, this.D, "SPS: frame_crop_top_offset");
        p.a(paramByteBuffer, this.E, "SPS: frame_crop_bottom_offset");
      }
      if (this.G == null) {
        break label656;
      }
    }
    label656:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      p.a(paramByteBuffer, bool1, "SPS: ");
      if (this.G != null) {
        a(this.G, paramByteBuffer);
      }
      p.a(paramByteBuffer);
      return;
      if (this.a != 1) {
        break;
      }
      p.a(paramByteBuffer, this.c, "SPS: delta_pic_order_always_zero_flag");
      p.b(paramByteBuffer, this.v, "SPS: offset_for_non_ref_pic");
      p.b(paramByteBuffer, this.w, "SPS: offset_for_top_to_bottom_field");
      p.a(paramByteBuffer, this.F.length, "SPS: ");
      i1 = 0;
      while (i1 < this.F.length)
      {
        p.b(paramByteBuffer, this.F[i1], "SPS: ");
        i1 += 1;
      }
      break;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */