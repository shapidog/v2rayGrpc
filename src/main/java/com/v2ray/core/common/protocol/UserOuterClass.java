// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/protocol/user.proto

package com.v2ray.core.common.protocol;

public final class UserOuterClass {
  private UserOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_common_protocol_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_common_protocol_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032common/protocol/user.proto\022\032v2ray.core" +
      ".common.protocol\032!common/serial/typed_me" +
      "ssage.proto\"]\n\004User\022\r\n\005level\030\001 \001(\r\022\r\n\005em" +
      "ail\030\002 \001(\t\0227\n\007account\030\003 \001(\0132&.v2ray.core." +
      "common.serial.TypedMessageBo\n\036com.v2ray." +
      "core.common.protocolP\001Z.github.com/v2fly" +
      "/v2ray-core/v4/common/protocol\252\002\032V2Ray.C" +
      "ore.Common.Protocolb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.v2ray.core.common.serial.TypedMessageOuterClass.getDescriptor(),
        });
    internal_static_v2ray_core_common_protocol_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_common_protocol_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_common_protocol_User_descriptor,
        new java.lang.String[] { "Level", "Email", "Account", });
    com.v2ray.core.common.serial.TypedMessageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}