// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/dns/config.proto

package com.v2ray.core.proxy.dns;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.proxy.dns.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Server is the DNS server address. If specified, this address overrides the
   * original one.
   * </pre>
   *
   * <code>.v2ray.core.common.net.Endpoint server = 1;</code>
   * @return Whether the server field is set.
   */
  boolean hasServer();
  /**
   * <pre>
   * Server is the DNS server address. If specified, this address overrides the
   * original one.
   * </pre>
   *
   * <code>.v2ray.core.common.net.Endpoint server = 1;</code>
   * @return The server.
   */
  com.v2ray.core.common.net.Endpoint getServer();
  /**
   * <pre>
   * Server is the DNS server address. If specified, this address overrides the
   * original one.
   * </pre>
   *
   * <code>.v2ray.core.common.net.Endpoint server = 1;</code>
   */
  com.v2ray.core.common.net.EndpointOrBuilder getServerOrBuilder();

  /**
   * <code>uint32 user_level = 2;</code>
   * @return The userLevel.
   */
  int getUserLevel();
}