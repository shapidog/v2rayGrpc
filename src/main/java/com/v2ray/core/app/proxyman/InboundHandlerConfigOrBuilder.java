// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/proxyman/config.proto

package com.v2ray.core.app.proxyman;

public interface InboundHandlerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.proxyman.InboundHandlerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string tag = 1;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <code>string tag = 1;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
   * @return Whether the receiverSettings field is set.
   */
  boolean hasReceiverSettings();
  /**
   * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
   * @return The receiverSettings.
   */
  com.v2ray.core.common.serial.TypedMessage getReceiverSettings();
  /**
   * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
   */
  com.v2ray.core.common.serial.TypedMessageOrBuilder getReceiverSettingsOrBuilder();

  /**
   * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
   * @return Whether the proxySettings field is set.
   */
  boolean hasProxySettings();
  /**
   * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
   * @return The proxySettings.
   */
  com.v2ray.core.common.serial.TypedMessage getProxySettings();
  /**
   * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
   */
  com.v2ray.core.common.serial.TypedMessageOrBuilder getProxySettingsOrBuilder();
}
