// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/protocol/server_spec.proto

package com.v2ray.core.common.protocol;

public final class ServerSpec {
  private ServerSpec() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_common_protocol_ServerEndpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_common_protocol_ServerEndpoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!common/protocol/server_spec.proto\022\032v2r" +
      "ay.core.common.protocol\032\030common/net/addr" +
      "ess.proto\032\032common/protocol/user.proto\"\202\001" +
      "\n\016ServerEndpoint\0222\n\007address\030\001 \001(\0132!.v2ra" +
      "y.core.common.net.IPOrDomain\022\014\n\004port\030\002 \001" +
      "(\r\022.\n\004user\030\003 \003(\0132 .v2ray.core.common.pro" +
      "tocol.UserBo\n\036com.v2ray.core.common.prot" +
      "ocolP\001Z.github.com/v2fly/v2ray-core/v4/c" +
      "ommon/protocol\252\002\032V2Ray.Core.Common.Proto" +
      "colb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.v2ray.core.common.net.Address.getDescriptor(),
          com.v2ray.core.common.protocol.UserOuterClass.getDescriptor(),
        });
    internal_static_v2ray_core_common_protocol_ServerEndpoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_common_protocol_ServerEndpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_common_protocol_ServerEndpoint_descriptor,
        new java.lang.String[] { "Address", "Port", "User", });
    com.v2ray.core.common.net.Address.getDescriptor();
    com.v2ray.core.common.protocol.UserOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
