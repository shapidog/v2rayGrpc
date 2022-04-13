// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/observatory/config.proto

package com.v2ray.core.app.observatory;

public interface ProbeResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.observatory.ProbeResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * &#64;Document Whether this outbound is usable
   *&#64;Restriction ReadOnlyForUser
   * </pre>
   *
   * <code>bool alive = 1;</code>
   * @return The alive.
   */
  boolean getAlive();

  /**
   * <pre>
   * &#64;Document The time for probe request to finish.
   *&#64;Type time.ms
   *&#64;Restriction ReadOnlyForUser
   * </pre>
   *
   * <code>int64 delay = 2;</code>
   * @return The delay.
   */
  long getDelay();

  /**
   * <pre>
   * &#64;Document The error caused this outbound failed to relay probe request
   *&#64;Restriction NotMachineReadable
   * </pre>
   *
   * <code>string last_error_reason = 3;</code>
   * @return The lastErrorReason.
   */
  java.lang.String getLastErrorReason();
  /**
   * <pre>
   * &#64;Document The error caused this outbound failed to relay probe request
   *&#64;Restriction NotMachineReadable
   * </pre>
   *
   * <code>string last_error_reason = 3;</code>
   * @return The bytes for lastErrorReason.
   */
  com.google.protobuf.ByteString
      getLastErrorReasonBytes();
}