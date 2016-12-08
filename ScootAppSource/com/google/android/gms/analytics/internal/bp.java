package com.google.android.gms.analytics.internal;

public final class bp
{
  public static bq<Integer> A = bq.a("analytics.max_batch_post_length", 8192);
  public static bq<String> B = bq.a("analytics.fallback_responses.k", "404,502");
  public static bq<Integer> C = bq.a("analytics.batch_retry_interval.seconds.k", 3600);
  public static bq<Long> D = bq.a("analytics.service_monitor_interval", 86400000L);
  public static bq<Integer> E = bq.a("analytics.http_connection.connect_timeout_millis", 60000);
  public static bq<Integer> F = bq.a("analytics.http_connection.read_timeout_millis", 61000);
  public static bq<Long> G = bq.a("analytics.campaigns.time_limit", 86400000L);
  public static bq<String> H = bq.a("analytics.first_party_experiment_id", "");
  public static bq<Integer> I = bq.a("analytics.first_party_experiment_variant", 0);
  public static bq<Boolean> J = bq.a("analytics.test.disable_receiver", false);
  public static bq<Long> K = bq.a("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
  public static bq<Long> L = bq.a("analytics.service_client.connect_timeout_millis", 5000L);
  public static bq<Long> M = bq.a("analytics.service_client.second_connect_delay_millis", 5000L);
  public static bq<Long> N = bq.a("analytics.service_client.unexpected_reconnect_millis", 60000L);
  public static bq<Long> O = bq.a("analytics.service_client.reconnect_throttle_millis", 1800000L);
  public static bq<Long> P = bq.a("analytics.monitoring.sample_period_millis", 86400000L);
  public static bq<Long> Q = bq.a("analytics.initialization_warning_threshold", 5000L);
  public static bq<Boolean> a = bq.a("analytics.service_enabled", false);
  public static bq<Boolean> b = bq.a("analytics.service_client_enabled", true);
  public static bq<String> c = bq.a("analytics.log_tag", "GAv4", "GAv4-SVC");
  public static bq<Long> d = bq.a("analytics.max_tokens", 60L);
  public static bq<Float> e = bq.a("analytics.tokens_per_sec", 0.5F);
  public static bq<Integer> f = bq.a("analytics.max_stored_hits", 2000, 20000);
  public static bq<Integer> g = bq.a("analytics.max_stored_hits_per_app", 2000);
  public static bq<Integer> h = bq.a("analytics.max_stored_properties_per_app", 100);
  public static bq<Long> i = bq.a("analytics.local_dispatch_millis", 1800000L, 120000L);
  public static bq<Long> j = bq.a("analytics.initial_local_dispatch_millis", 5000L, 5000L);
  public static bq<Long> k = bq.a("analytics.min_local_dispatch_millis", 120000L);
  public static bq<Long> l = bq.a("analytics.max_local_dispatch_millis", 7200000L);
  public static bq<Long> m = bq.a("analytics.dispatch_alarm_millis", 7200000L);
  public static bq<Long> n = bq.a("analytics.max_dispatch_alarm_millis", 32400000L);
  public static bq<Integer> o = bq.a("analytics.max_hits_per_dispatch", 20);
  public static bq<Integer> p = bq.a("analytics.max_hits_per_batch", 20);
  public static bq<String> q = bq.a("analytics.insecure_host", "http://www.google-analytics.com");
  public static bq<String> r = bq.a("analytics.secure_host", "https://ssl.google-analytics.com");
  public static bq<String> s = bq.a("analytics.simple_endpoint", "/collect");
  public static bq<String> t = bq.a("analytics.batching_endpoint", "/batch");
  public static bq<Integer> u = bq.a("analytics.max_get_length", 2036);
  public static bq<String> v = bq.a("analytics.batching_strategy.k", az.e.name(), az.e.name());
  public static bq<String> w = bq.a("analytics.compression_strategy.k", bd.b.name());
  public static bq<Integer> x = bq.a("analytics.max_hits_per_request.k", 20);
  public static bq<Integer> y = bq.a("analytics.max_hit_length.k", 8192);
  public static bq<Integer> z = bq.a("analytics.max_post_length.k", 8192);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */