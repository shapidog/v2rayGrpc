// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/vmess/outbound/config.proto

package com.v2ray.core.proxy.vmess.outbound;

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
    internal_static_v2ray_core_proxy_vmess_outbound_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_proxy_vmess_outbound_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!proxy/vmess/outbound/config.proto\022\037v2r" +
      "ay.core.proxy.vmess.outbound\032!common/pro" +
      "tocol/server_spec.proto\"F\n\006Config\022<\n\010Rec" +
      "eiver\030\001 \003(\0132*.v2ray.core.common.protocol" +
      ".ServerEndpointB~\n#com.v2ray.core.proxy." +
      "vmess.outboundP\001Z3github.com/v2fly/v2ray" +
      "-core/v4/proxy/vmess/outbound\252\002\037V2Ray.Co" +
      "re.Proxy.Vmess.Outboundb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.v2ray.core.common.protocol.ServerSpec.getDescriptor(),
        });
    internal_static_v2ray_core_proxy_vmess_outbound_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_proxy_vmess_outbound_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_proxy_vmess_outbound_Config_descriptor,
        new java.lang.String[] { "Receiver", });
    com.v2ray.core.common.protocol.ServerSpec.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
