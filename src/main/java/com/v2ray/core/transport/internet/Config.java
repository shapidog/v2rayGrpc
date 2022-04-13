// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/config.proto

package com.v2ray.core.transport.internet;

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
    internal_static_v2ray_core_transport_internet_TransportConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_TransportConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_StreamConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_StreamConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_ProxyConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_ProxyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_SocketConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_SocketConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037transport/internet/config.proto\022\035v2ray" +
      ".core.transport.internet\032!common/serial/" +
      "typed_message.proto\"\252\001\n\017TransportConfig\022" +
      "F\n\010protocol\030\001 \001(\01620.v2ray.core.transport" +
      ".internet.TransportProtocolB\002\030\001\022\025\n\rproto" +
      "col_name\030\003 \001(\t\0228\n\010settings\030\002 \001(\0132&.v2ray" +
      ".core.common.serial.TypedMessage\"\331\002\n\014Str" +
      "eamConfig\022F\n\010protocol\030\001 \001(\01620.v2ray.core" +
      ".transport.internet.TransportProtocolB\002\030" +
      "\001\022\025\n\rprotocol_name\030\005 \001(\t\022J\n\022transport_se" +
      "ttings\030\002 \003(\0132..v2ray.core.transport.inte" +
      "rnet.TransportConfig\022\025\n\rsecurity_type\030\003 " +
      "\001(\t\022A\n\021security_settings\030\004 \003(\0132&.v2ray.c" +
      "ore.common.serial.TypedMessage\022D\n\017socket" +
      "_settings\030\006 \001(\0132+.v2ray.core.transport.i" +
      "nternet.SocketConfig\"7\n\013ProxyConfig\022\013\n\003t" +
      "ag\030\001 \001(\t\022\033\n\023transportLayerProxy\030\002 \001(\010\"\301\003" +
      "\n\014SocketConfig\022\014\n\004mark\030\001 \001(\r\022I\n\003tfo\030\002 \001(" +
      "\0162<.v2ray.core.transport.internet.Socket" +
      "Config.TCPFastOpenState\022F\n\006tproxy\030\003 \001(\0162" +
      "6.v2ray.core.transport.internet.SocketCo" +
      "nfig.TProxyMode\022%\n\035receive_original_dest" +
      "_address\030\004 \001(\010\022\024\n\014bind_address\030\005 \001(\014\022\021\n\t" +
      "bind_port\030\006 \001(\r\022\035\n\025accept_proxy_protocol" +
      "\030\007 \001(\010\022\037\n\027tcp_keep_alive_interval\030\010 \001(\005\022" +
      "\030\n\020tfo_queue_length\030\t \001(\r\"5\n\020TCPFastOpen" +
      "State\022\010\n\004AsIs\020\000\022\n\n\006Enable\020\001\022\013\n\007Disable\020\002" +
      "\"/\n\nTProxyMode\022\007\n\003Off\020\000\022\n\n\006TProxy\020\001\022\014\n\010R" +
      "edirect\020\002*Z\n\021TransportProtocol\022\007\n\003TCP\020\000\022" +
      "\007\n\003UDP\020\001\022\010\n\004MKCP\020\002\022\r\n\tWebSocket\020\003\022\010\n\004HTT" +
      "P\020\004\022\020\n\014DomainSocket\020\005Bx\n!com.v2ray.core." +
      "transport.internetP\001Z1github.com/v2fly/v" +
      "2ray-core/v4/transport/internet\252\002\035V2Ray." +
      "Core.Transport.Internetb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.v2ray.core.common.serial.TypedMessageOuterClass.getDescriptor(),
        });
    internal_static_v2ray_core_transport_internet_TransportConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_transport_internet_TransportConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_TransportConfig_descriptor,
        new java.lang.String[] { "Protocol", "ProtocolName", "Settings", });
    internal_static_v2ray_core_transport_internet_StreamConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_v2ray_core_transport_internet_StreamConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_StreamConfig_descriptor,
        new java.lang.String[] { "Protocol", "ProtocolName", "TransportSettings", "SecurityType", "SecuritySettings", "SocketSettings", });
    internal_static_v2ray_core_transport_internet_ProxyConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_v2ray_core_transport_internet_ProxyConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_ProxyConfig_descriptor,
        new java.lang.String[] { "Tag", "TransportLayerProxy", });
    internal_static_v2ray_core_transport_internet_SocketConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_v2ray_core_transport_internet_SocketConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_SocketConfig_descriptor,
        new java.lang.String[] { "Mark", "Tfo", "Tproxy", "ReceiveOriginalDestAddress", "BindAddress", "BindPort", "AcceptProxyProtocol", "TcpKeepAliveInterval", "TfoQueueLength", });
    com.v2ray.core.common.serial.TypedMessageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
