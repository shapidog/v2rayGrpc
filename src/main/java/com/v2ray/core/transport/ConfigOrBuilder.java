// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/config.proto

package com.v2ray.core.transport;

@java.lang.Deprecated public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.transport.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  java.util.List<com.v2ray.core.transport.internet.TransportConfig> 
      getTransportSettingsList();
  /**
   * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  com.v2ray.core.transport.internet.TransportConfig getTransportSettings(int index);
  /**
   * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  int getTransportSettingsCount();
  /**
   * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  java.util.List<? extends com.v2ray.core.transport.internet.TransportConfigOrBuilder> 
      getTransportSettingsOrBuilderList();
  /**
   * <code>repeated .v2ray.core.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  com.v2ray.core.transport.internet.TransportConfigOrBuilder getTransportSettingsOrBuilder(
      int index);
}
