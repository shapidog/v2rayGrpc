// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/reverse/config.proto

package com.v2ray.core.proxy.reverse;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_reverse_Control_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_reverse_Control_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_reverse_BridgeConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_reverse_BridgeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_reverse_PortalConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_reverse_PortalConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_reverse_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_reverse_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030app/reverse/config.proto\022\026v2ray.core.a" +
      "pp.reverse\"o\n\007Control\0224\n\005state\030\001 \001(\0162%.v" +
      "2ray.core.app.reverse.Control.State\022\016\n\006r" +
      "andom\030c \001(\014\"\036\n\005State\022\n\n\006ACTIVE\020\000\022\t\n\005DRAI" +
      "N\020\001\"+\n\014BridgeConfig\022\013\n\003tag\030\001 \001(\t\022\016\n\006doma" +
      "in\030\002 \001(\t\"+\n\014PortalConfig\022\013\n\003tag\030\001 \001(\t\022\016\n" +
      "\006domain\030\002 \001(\t\"\202\001\n\006Config\022;\n\rbridge_confi" +
      "g\030\001 \003(\0132$.v2ray.core.app.reverse.BridgeC" +
      "onfig\022;\n\rportal_config\030\002 \003(\0132$.v2ray.cor" +
      "e.app.reverse.PortalConfigBg\n\034com.v2ray." +
      "core.proxy.reverseP\001Z*github.com/v2fly/v" +
      "2ray-core/v4/app/reverse\252\002\030V2Ray.Core.Pr" +
      "oxy.Reverseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_v2ray_core_app_reverse_Control_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_app_reverse_Control_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_reverse_Control_descriptor,
        new java.lang.String[] { "State", "Random", });
    internal_static_v2ray_core_app_reverse_BridgeConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_v2ray_core_app_reverse_BridgeConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_reverse_BridgeConfig_descriptor,
        new java.lang.String[] { "Tag", "Domain", });
    internal_static_v2ray_core_app_reverse_PortalConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_v2ray_core_app_reverse_PortalConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_reverse_PortalConfig_descriptor,
        new java.lang.String[] { "Tag", "Domain", });
    internal_static_v2ray_core_app_reverse_Config_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_v2ray_core_app_reverse_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_reverse_Config_descriptor,
        new java.lang.String[] { "BridgeConfig", "PortalConfig", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
