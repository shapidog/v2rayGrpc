// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/stats/command/command.proto

package com.v2ray.core.app.stats.command;

/**
 * Protobuf type {@code v2ray.core.app.stats.command.GetStatsResponse}
 */
public final class GetStatsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.app.stats.command.GetStatsResponse)
    GetStatsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetStatsResponse.newBuilder() to construct.
  private GetStatsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetStatsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetStatsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetStatsResponse(
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
          case 10: {
            com.v2ray.core.app.stats.command.Stat.Builder subBuilder = null;
            if (stat_ != null) {
              subBuilder = stat_.toBuilder();
            }
            stat_ = input.readMessage(com.v2ray.core.app.stats.command.Stat.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(stat_);
              stat_ = subBuilder.buildPartial();
            }

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
    return com.v2ray.core.app.stats.command.Command.internal_static_v2ray_core_app_stats_command_GetStatsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.app.stats.command.Command.internal_static_v2ray_core_app_stats_command_GetStatsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.app.stats.command.GetStatsResponse.class, com.v2ray.core.app.stats.command.GetStatsResponse.Builder.class);
  }

  public static final int STAT_FIELD_NUMBER = 1;
  private com.v2ray.core.app.stats.command.Stat stat_;
  /**
   * <code>.v2ray.core.app.stats.command.Stat stat = 1;</code>
   * @return Whether the stat field is set.
   */
  @java.lang.Override
  public boolean hasStat() {
    return stat_ != null;
  }
  /**
   * <code>.v2ray.core.app.stats.command.Stat stat = 1;</code>
   * @return The stat.
   */
  @java.lang.Override
  public com.v2ray.core.app.stats.command.Stat getStat() {
    return stat_ == null ? com.v2ray.core.app.stats.command.Stat.getDefaultInstance() : stat_;
  }
  /**
   * <code>.v2ray.core.app.stats.command.Stat stat = 1;</code>
   */
  @java.lang.Override
  public com.v2ray.core.app.stats.command.StatOrBuilder getStatOrBuilder() {
    return getStat();
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
    if (stat_ != null) {
      output.writeMessage(1, getStat());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stat_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStat());
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
    if (!(obj instanceof com.v2ray.core.app.stats.command.GetStatsResponse)) {
      return super.equals(obj);
    }
    com.v2ray.core.app.stats.command.GetStatsResponse other = (com.v2ray.core.app.stats.command.GetStatsResponse) obj;

    if (hasStat() != other.hasStat()) return false;
    if (hasStat()) {
      if (!getStat()
          .equals(other.getStat())) return false;
    }
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
    if (hasStat()) {
      hash = (37 * hash) + STAT_FIELD_NUMBER;
      hash = (53 * hash) + getStat().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.app.stats.command.GetStatsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.stats.command.GetStatsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.stats.command.GetStatsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.stats.command.GetStatsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.stats.command.GetStatsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.stats.command.GetStatsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.stats.command.GetStatsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.stats.command.GetStatsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.stats.command.GetStatsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.stats.command.GetStatsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.stats.command.GetStatsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.stats.command.GetStatsResponse parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.app.stats.command.GetStatsResponse prototype) {
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
   * Protobuf type {@code v2ray.core.app.stats.command.GetStatsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.app.stats.command.GetStatsResponse)
      com.v2ray.core.app.stats.command.GetStatsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.app.stats.command.Command.internal_static_v2ray_core_app_stats_command_GetStatsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.app.stats.command.Command.internal_static_v2ray_core_app_stats_command_GetStatsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.app.stats.command.GetStatsResponse.class, com.v2ray.core.app.stats.command.GetStatsResponse.Builder.class);
    }

    // Construct using com.v2ray.core.app.stats.command.GetStatsResponse.newBuilder()
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
      if (statBuilder_ == null) {
        stat_ = null;
      } else {
        stat_ = null;
        statBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.app.stats.command.Command.internal_static_v2ray_core_app_stats_command_GetStatsResponse_descriptor;
    }

    @java.lang.Override
    public com.v2ray.core.app.stats.command.GetStatsResponse getDefaultInstanceForType() {
      return com.v2ray.core.app.stats.command.GetStatsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.v2ray.core.app.stats.command.GetStatsResponse build() {
      com.v2ray.core.app.stats.command.GetStatsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.v2ray.core.app.stats.command.GetStatsResponse buildPartial() {
      com.v2ray.core.app.stats.command.GetStatsResponse result = new com.v2ray.core.app.stats.command.GetStatsResponse(this);
      if (statBuilder_ == null) {
        result.stat_ = stat_;
      } else {
        result.stat_ = statBuilder_.build();
      }
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
      if (other instanceof com.v2ray.core.app.stats.command.GetStatsResponse) {
        return mergeFrom((com.v2ray.core.app.stats.command.GetStatsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.app.stats.command.GetStatsResponse other) {
      if (other == com.v2ray.core.app.stats.command.GetStatsResponse.getDefaultInstance()) return this;
      if (other.hasStat()) {
        mergeStat(other.getStat());
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
      com.v2ray.core.app.stats.command.GetStatsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.app.stats.command.GetStatsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.v2ray.core.app.stats.command.Stat stat_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.app.stats.command.Stat, com.v2ray.core.app.stats.command.Stat.Builder, com.v2ray.core.app.stats.command.StatOrBuilder> statBuilder_;
    /**
     * <code>.v2ray.core.app.stats.command.Stat stat = 1;</code>
     * @return Whether the stat field is set.
     */
    public boolean hasStat() {
      return statBuilder_ != null || stat_ != null;
    }
    /**
     * <code>.v2ray.core.app.stats.command.Stat stat = 1;</code>
     * @return The stat.
     */
    public com.v2ray.core.app.stats.command.Stat getStat() {
      if (statBuilder_ == null) {
        return stat_ == null ? com.v2ray.core.app.stats.command.Stat.getDefaultInstance() : stat_;
      } else {
        return statBuilder_.getMessage();
      }
    }
    /**
     * <code>.v2ray.core.app.stats.command.Stat stat = 1;</code>
     */
    public Builder setStat(com.v2ray.core.app.stats.command.Stat value) {
      if (statBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stat_ = value;
        onChanged();
      } else {
        statBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.app.stats.command.Stat stat = 1;</code>
     */
    public Builder setStat(
        com.v2ray.core.app.stats.command.Stat.Builder builderForValue) {
      if (statBuilder_ == null) {
        stat_ = builderForValue.build();
        onChanged();
      } else {
        statBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.v2ray.core.app.stats.command.Stat stat = 1;</code>
     */
    public Builder mergeStat(com.v2ray.core.app.stats.command.Stat value) {
      if (statBuilder_ == null) {
        if (stat_ != null) {
          stat_ =
            com.v2ray.core.app.stats.command.Stat.newBuilder(stat_).mergeFrom(value).buildPartial();
        } else {
          stat_ = value;
        }
        onChanged();
      } else {
        statBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.app.stats.command.Stat stat = 1;</code>
     */
    public Builder clearStat() {
      if (statBuilder_ == null) {
        stat_ = null;
        onChanged();
      } else {
        stat_ = null;
        statBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.v2ray.core.app.stats.command.Stat stat = 1;</code>
     */
    public com.v2ray.core.app.stats.command.Stat.Builder getStatBuilder() {
      
      onChanged();
      return getStatFieldBuilder().getBuilder();
    }
    /**
     * <code>.v2ray.core.app.stats.command.Stat stat = 1;</code>
     */
    public com.v2ray.core.app.stats.command.StatOrBuilder getStatOrBuilder() {
      if (statBuilder_ != null) {
        return statBuilder_.getMessageOrBuilder();
      } else {
        return stat_ == null ?
            com.v2ray.core.app.stats.command.Stat.getDefaultInstance() : stat_;
      }
    }
    /**
     * <code>.v2ray.core.app.stats.command.Stat stat = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.app.stats.command.Stat, com.v2ray.core.app.stats.command.Stat.Builder, com.v2ray.core.app.stats.command.StatOrBuilder> 
        getStatFieldBuilder() {
      if (statBuilder_ == null) {
        statBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.app.stats.command.Stat, com.v2ray.core.app.stats.command.Stat.Builder, com.v2ray.core.app.stats.command.StatOrBuilder>(
                getStat(),
                getParentForChildren(),
                isClean());
        stat_ = null;
      }
      return statBuilder_;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.app.stats.command.GetStatsResponse)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.app.stats.command.GetStatsResponse)
  private static final com.v2ray.core.app.stats.command.GetStatsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.app.stats.command.GetStatsResponse();
  }

  public static com.v2ray.core.app.stats.command.GetStatsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetStatsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetStatsResponse>() {
    @java.lang.Override
    public GetStatsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetStatsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetStatsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetStatsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.v2ray.core.app.stats.command.GetStatsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

