// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/shadowsocks/config.proto

package com.v2ray.core.proxy.shadowsocks;

public final class Config {
  private Config() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_proxy_shadowsocks_Account_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_proxy_shadowsocks_Account_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_proxy_shadowsocks_ServerConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_proxy_shadowsocks_ServerConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_proxy_shadowsocks_ClientConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_proxy_shadowsocks_ClientConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036proxy/shadowsocks/config.proto\022\034v2ray." +
      "core.proxy.shadowsocks\032\030common/net/netwo" +
      "rk.proto\032\032common/protocol/user.proto\032!co" +
      "mmon/protocol/server_spec.proto\"l\n\007Accou" +
      "nt\022\020\n\010password\030\001 \001(\t\022=\n\013cipher_type\030\002 \001(" +
      "\0162(.v2ray.core.proxy.shadowsocks.CipherT" +
      "ype\022\020\n\010iv_check\030\003 \001(\010\"\210\001\n\014ServerConfig\022\027" +
      "\n\013udp_enabled\030\001 \001(\010B\002\030\001\022.\n\004user\030\002 \001(\0132 ." +
      "v2ray.core.common.protocol.User\022/\n\007netwo" +
      "rk\030\003 \003(\0162\036.v2ray.core.common.net.Network" +
      "\"J\n\014ClientConfig\022:\n\006server\030\001 \003(\0132*.v2ray" +
      ".core.common.protocol.ServerEndpoint*\\\n\n" +
      "CipherType\022\013\n\007UNKNOWN\020\000\022\017\n\013AES_128_GCM\020\001" +
      "\022\017\n\013AES_256_GCM\020\002\022\025\n\021CHACHA20_POLY1305\020\003" +
      "\022\010\n\004NONE\020\004Bu\n com.v2ray.core.proxy.shado" +
      "wsocksP\001Z0github.com/v2fly/v2ray-core/v4" +
      "/proxy/shadowsocks\252\002\034V2Ray.Core.Proxy.Sh" +
      "adowsocksb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.v2ray.core.common.net.NetworkOuterClass.getDescriptor(),
          com.v2ray.core.common.protocol.UserOuterClass.getDescriptor(),
          com.v2ray.core.common.protocol.ServerSpec.getDescriptor(),
        });
    internal_static_v2ray_core_proxy_shadowsocks_Account_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_proxy_shadowsocks_Account_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_proxy_shadowsocks_Account_descriptor,
        new java.lang.String[] { "Password", "CipherType", "IvCheck", });
    internal_static_v2ray_core_proxy_shadowsocks_ServerConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_v2ray_core_proxy_shadowsocks_ServerConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_proxy_shadowsocks_ServerConfig_descriptor,
        new java.lang.String[] { "UdpEnabled", "User", "Network", });
    internal_static_v2ray_core_proxy_shadowsocks_ClientConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_v2ray_core_proxy_shadowsocks_ClientConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_proxy_shadowsocks_ClientConfig_descriptor,
        new java.lang.String[] { "Server", });
    com.v2ray.core.common.net.NetworkOuterClass.getDescriptor();
    com.v2ray.core.common.protocol.UserOuterClass.getDescriptor();
    com.v2ray.core.common.protocol.ServerSpec.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
