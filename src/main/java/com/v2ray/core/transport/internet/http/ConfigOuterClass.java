// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/http/config.proto

package com.v2ray.core.transport.internet.http;

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
    internal_static_v2ray_core_transport_internet_http_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_http_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$transport/internet/http/config.proto\022\"" +
      "v2ray.core.transport.internet.http\032,tran" +
      "sport/internet/headers/http/config.proto" +
      "\"x\n\006Config\022\014\n\004host\030\001 \003(\t\022\014\n\004path\030\002 \001(\t\022\016" +
      "\n\006method\030\003 \001(\t\022B\n\006header\030\004 \003(\01322.v2ray.c" +
      "ore.transport.internet.headers.http.Head" +
      "erB\207\001\n&com.v2ray.core.transport.internet" +
      ".httpP\001Z6github.com/v2fly/v2ray-core/v4/" +
      "transport/internet/http\252\002\"V2Ray.Core.Tra" +
      "nsport.Internet.Httpb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.v2ray.core.transport.internet.headers.http.ConfigOuterClass.getDescriptor(),
        });
    internal_static_v2ray_core_transport_internet_http_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_transport_internet_http_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_http_Config_descriptor,
        new java.lang.String[] { "Host", "Path", "Method", "Header", });
    com.v2ray.core.transport.internet.headers.http.ConfigOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
