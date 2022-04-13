// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/kcp/config.proto

package com.v2ray.core.transport.internet.kcp;

/**
 * <pre>
 * Downlink capacity, in MB.
 * </pre>
 *
 * Protobuf type {@code v2ray.core.transport.internet.kcp.DownlinkCapacity}
 */
public final class DownlinkCapacity extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.transport.internet.kcp.DownlinkCapacity)
    DownlinkCapacityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DownlinkCapacity.newBuilder() to construct.
  private DownlinkCapacity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DownlinkCapacity() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DownlinkCapacity();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DownlinkCapacity(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            value_ = input.readUInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.transport.internet.kcp.ConfigOuterClass.internal_static_v2ray_core_transport_internet_kcp_DownlinkCapacity_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.transport.internet.kcp.ConfigOuterClass.internal_static_v2ray_core_transport_internet_kcp_DownlinkCapacity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.transport.internet.kcp.DownlinkCapacity.class, com.v2ray.core.transport.internet.kcp.DownlinkCapacity.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private int value_;
  /**
   * <code>uint32 value = 1;</code>
   * @return The value.
   */
  @java.lang.Override
  public int getValue() {
    return value_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (value_ != 0) {
      output.writeUInt32(1, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, value_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.v2ray.core.transport.internet.kcp.DownlinkCapacity)) {
      return super.equals(obj);
    }
    com.v2ray.core.transport.internet.kcp.DownlinkCapacity other = (com.v2ray.core.transport.internet.kcp.DownlinkCapacity) obj;

    if (getValue()
        != other.getValue()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.transport.internet.kcp.DownlinkCapacity parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.kcp.DownlinkCapacity parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.kcp.DownlinkCapacity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.kcp.DownlinkCapacity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.kcp.DownlinkCapacity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.kcp.DownlinkCapacity parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.kcp.DownlinkCapacity parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.kcp.DownlinkCapacity parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.kcp.DownlinkCapacity parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.kcp.DownlinkCapacity parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.kcp.DownlinkCapacity parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.kcp.DownlinkCapacity parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.v2ray.core.transport.internet.kcp.DownlinkCapacity prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Downlink capacity, in MB.
   * </pre>
   *
   * Protobuf type {@code v2ray.core.transport.internet.kcp.DownlinkCapacity}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.transport.internet.kcp.DownlinkCapacity)
      com.v2ray.core.transport.internet.kcp.DownlinkCapacityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.transport.internet.kcp.ConfigOuterClass.internal_static_v2ray_core_transport_internet_kcp_DownlinkCapacity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.transport.internet.kcp.ConfigOuterClass.internal_static_v2ray_core_transport_internet_kcp_DownlinkCapacity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.transport.internet.kcp.DownlinkCapacity.class, com.v2ray.core.transport.internet.kcp.DownlinkCapacity.Builder.class);
    }

    // Construct using com.v2ray.core.transport.internet.kcp.DownlinkCapacity.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      value_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.transport.internet.kcp.ConfigOuterClass.internal_static_v2ray_core_transport_internet_kcp_DownlinkCapacity_descriptor;
    }

    @java.lang.Override
    public com.v2ray.core.transport.internet.kcp.DownlinkCapacity getDefaultInstanceForType() {
      return com.v2ray.core.transport.internet.kcp.DownlinkCapacity.getDefaultInstance();
    }

    @java.lang.Override
    public com.v2ray.core.transport.internet.kcp.DownlinkCapacity build() {
      com.v2ray.core.transport.internet.kcp.DownlinkCapacity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.v2ray.core.transport.internet.kcp.DownlinkCapacity buildPartial() {
      com.v2ray.core.transport.internet.kcp.DownlinkCapacity result = new com.v2ray.core.transport.internet.kcp.DownlinkCapacity(this);
      result.value_ = value_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.v2ray.core.transport.internet.kcp.DownlinkCapacity) {
        return mergeFrom((com.v2ray.core.transport.internet.kcp.DownlinkCapacity)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.transport.internet.kcp.DownlinkCapacity other) {
      if (other == com.v2ray.core.transport.internet.kcp.DownlinkCapacity.getDefaultInstance()) return this;
      if (other.getValue() != 0) {
        setValue(other.getValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.v2ray.core.transport.internet.kcp.DownlinkCapacity parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.transport.internet.kcp.DownlinkCapacity) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int value_ ;
    /**
     * <code>uint32 value = 1;</code>
     * @return The value.
     */
    @java.lang.Override
    public int getValue() {
      return value_;
    }
    /**
     * <code>uint32 value = 1;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(int value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.transport.internet.kcp.DownlinkCapacity)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.transport.internet.kcp.DownlinkCapacity)
  private static final com.v2ray.core.transport.internet.kcp.DownlinkCapacity DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.transport.internet.kcp.DownlinkCapacity();
  }

  public static com.v2ray.core.transport.internet.kcp.DownlinkCapacity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DownlinkCapacity>
      PARSER = new com.google.protobuf.AbstractParser<DownlinkCapacity>() {
    @java.lang.Override
    public DownlinkCapacity parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DownlinkCapacity(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DownlinkCapacity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DownlinkCapacity> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.v2ray.core.transport.internet.kcp.DownlinkCapacity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

