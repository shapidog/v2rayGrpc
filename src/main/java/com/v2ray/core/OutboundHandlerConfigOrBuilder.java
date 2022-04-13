// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: config.proto

package com.v2ray.core;

public interface OutboundHandlerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.OutboundHandlerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Tag of this outbound handler.
   * </pre>
   *
   * <code>string tag = 1;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * Tag of this outbound handler.
   * </pre>
   *
   * <code>string tag = 1;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <pre>
   * Settings for how to dial connection for this outbound handler.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage sender_settings = 2;</code>
   * @return Whether the senderSettings field is set.
   */
  boolean hasSenderSettings();
  /**
   * <pre>
   * Settings for how to dial connection for this outbound handler.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage sender_settings = 2;</code>
   * @return The senderSettings.
   */
  com.v2ray.core.common.serial.TypedMessage getSenderSettings();
  /**
   * <pre>
   * Settings for how to dial connection for this outbound handler.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage sender_settings = 2;</code>
   */
  com.v2ray.core.common.serial.TypedMessageOrBuilder getSenderSettingsOrBuilder();

  /**
   * <pre>
   * Settings for this outbound proxy. Must be one of the outbound proxies.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
   * @return Whether the proxySettings field is set.
   */
  boolean hasProxySettings();
  /**
   * <pre>
   * Settings for this outbound proxy. Must be one of the outbound proxies.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
   * @return The proxySettings.
   */
  com.v2ray.core.common.serial.TypedMessage getProxySettings();
  /**
   * <pre>
   * Settings for this outbound proxy. Must be one of the outbound proxies.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
   */
  com.v2ray.core.common.serial.TypedMessageOrBuilder getProxySettingsOrBuilder();

  /**
   * <pre>
   * If not zero, this outbound will be expired in seconds. Not used for now.
   * </pre>
   *
   * <code>int64 expire = 4;</code>
   * @return The expire.
   */
  long getExpire();

  /**
   * <pre>
   * Comment of this outbound handler. Not used for now.
   * </pre>
   *
   * <code>string comment = 5;</code>
   * @return The comment.
   */
  java.lang.String getComment();
  /**
   * <pre>
   * Comment of this outbound handler. Not used for now.
   * </pre>
   *
   * <code>string comment = 5;</code>
   * @return The bytes for comment.
   */
  com.google.protobuf.ByteString
      getCommentBytes();
}
