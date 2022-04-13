// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/domainsocket/config.proto

package com.v2ray.core.transport.internet.domainsocket;

/**
 * Protobuf type {@code v2ray.core.transport.internet.domainsocket.Config}
 */
public final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.transport.internet.domainsocket.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    path_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Config();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Config(
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
            java.lang.String s = input.readStringRequireUtf8();

            path_ = s;
            break;
          }
          case 16: {

            abstract_ = input.readBool();
            break;
          }
          case 24: {

            padding_ = input.readBool();
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
    return com.v2ray.core.transport.internet.domainsocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_domainsocket_Config_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.transport.internet.domainsocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_domainsocket_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.transport.internet.domainsocket.Config.class, com.v2ray.core.transport.internet.domainsocket.Config.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object path_;
  /**
   * <pre>
   * Path of the domain socket. This overrides the IP/Port parameter from
   * upstream caller.
   * </pre>
   *
   * <code>string path = 1;</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Path of the domain socket. This overrides the IP/Port parameter from
   * upstream caller.
   * </pre>
   *
   * <code>string path = 1;</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ABSTRACT_FIELD_NUMBER = 2;
  private boolean abstract_;
  /**
   * <pre>
   * Abstract speicifies whether to use abstract namespace or not.
   * Traditionally Unix domain socket is file system based. Abstract domain
   * socket can be used without acquiring file lock.
   * </pre>
   *
   * <code>bool abstract = 2;</code>
   * @return The abstract.
   */
  @java.lang.Override
  public boolean getAbstract() {
    return abstract_;
  }

  public static final int PADDING_FIELD_NUMBER = 3;
  private boolean padding_;
  /**
   * <pre>
   * Some apps, eg. haproxy, use the full length of sockaddr_un.sun_path to
   * connect(2) or bind(2) when using abstract UDS.
   * </pre>
   *
   * <code>bool padding = 3;</code>
   * @return The padding.
   */
  @java.lang.Override
  public boolean getPadding() {
    return padding_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
    }
    if (abstract_ != false) {
      output.writeBool(2, abstract_);
    }
    if (padding_ != false) {
      output.writeBool(3, padding_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
    }
    if (abstract_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, abstract_);
    }
    if (padding_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, padding_);
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
    if (!(obj instanceof com.v2ray.core.transport.internet.domainsocket.Config)) {
      return super.equals(obj);
    }
    com.v2ray.core.transport.internet.domainsocket.Config other = (com.v2ray.core.transport.internet.domainsocket.Config) obj;

    if (!getPath()
        .equals(other.getPath())) return false;
    if (getAbstract()
        != other.getAbstract()) return false;
    if (getPadding()
        != other.getPadding()) return false;
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
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + ABSTRACT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAbstract());
    hash = (37 * hash) + PADDING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPadding());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.transport.internet.domainsocket.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.domainsocket.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.domainsocket.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.domainsocket.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.domainsocket.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.domainsocket.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.domainsocket.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.domainsocket.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.domainsocket.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.domainsocket.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.domainsocket.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.domainsocket.Config parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.transport.internet.domainsocket.Config prototype) {
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
   * Protobuf type {@code v2ray.core.transport.internet.domainsocket.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.transport.internet.domainsocket.Config)
      com.v2ray.core.transport.internet.domainsocket.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.transport.internet.domainsocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_domainsocket_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.transport.internet.domainsocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_domainsocket_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.transport.internet.domainsocket.Config.class, com.v2ray.core.transport.internet.domainsocket.Config.Builder.class);
    }

    // Construct using com.v2ray.core.transport.internet.domainsocket.Config.newBuilder()
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
      path_ = "";

      abstract_ = false;

      padding_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.transport.internet.domainsocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_domainsocket_Config_descriptor;
    }

    @java.lang.Override
    public com.v2ray.core.transport.internet.domainsocket.Config getDefaultInstanceForType() {
      return com.v2ray.core.transport.internet.domainsocket.Config.getDefaultInstance();
    }

    @java.lang.Override
    public com.v2ray.core.transport.internet.domainsocket.Config build() {
      com.v2ray.core.transport.internet.domainsocket.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.v2ray.core.transport.internet.domainsocket.Config buildPartial() {
      com.v2ray.core.transport.internet.domainsocket.Config result = new com.v2ray.core.transport.internet.domainsocket.Config(this);
      result.path_ = path_;
      result.abstract_ = abstract_;
      result.padding_ = padding_;
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
      if (other instanceof com.v2ray.core.transport.internet.domainsocket.Config) {
        return mergeFrom((com.v2ray.core.transport.internet.domainsocket.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.transport.internet.domainsocket.Config other) {
      if (other == com.v2ray.core.transport.internet.domainsocket.Config.getDefaultInstance()) return this;
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (other.getAbstract() != false) {
        setAbstract(other.getAbstract());
      }
      if (other.getPadding() != false) {
        setPadding(other.getPadding());
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
      com.v2ray.core.transport.internet.domainsocket.Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.transport.internet.domainsocket.Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <pre>
     * Path of the domain socket. This overrides the IP/Port parameter from
     * upstream caller.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Path of the domain socket. This overrides the IP/Port parameter from
     * upstream caller.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Path of the domain socket. This overrides the IP/Port parameter from
     * upstream caller.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path of the domain socket. This overrides the IP/Port parameter from
     * upstream caller.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path of the domain socket. This overrides the IP/Port parameter from
     * upstream caller.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
      onChanged();
      return this;
    }

    private boolean abstract_ ;
    /**
     * <pre>
     * Abstract speicifies whether to use abstract namespace or not.
     * Traditionally Unix domain socket is file system based. Abstract domain
     * socket can be used without acquiring file lock.
     * </pre>
     *
     * <code>bool abstract = 2;</code>
     * @return The abstract.
     */
    @java.lang.Override
    public boolean getAbstract() {
      return abstract_;
    }
    /**
     * <pre>
     * Abstract speicifies whether to use abstract namespace or not.
     * Traditionally Unix domain socket is file system based. Abstract domain
     * socket can be used without acquiring file lock.
     * </pre>
     *
     * <code>bool abstract = 2;</code>
     * @param value The abstract to set.
     * @return This builder for chaining.
     */
    public Builder setAbstract(boolean value) {
      
      abstract_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Abstract speicifies whether to use abstract namespace or not.
     * Traditionally Unix domain socket is file system based. Abstract domain
     * socket can be used without acquiring file lock.
     * </pre>
     *
     * <code>bool abstract = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAbstract() {
      
      abstract_ = false;
      onChanged();
      return this;
    }

    private boolean padding_ ;
    /**
     * <pre>
     * Some apps, eg. haproxy, use the full length of sockaddr_un.sun_path to
     * connect(2) or bind(2) when using abstract UDS.
     * </pre>
     *
     * <code>bool padding = 3;</code>
     * @return The padding.
     */
    @java.lang.Override
    public boolean getPadding() {
      return padding_;
    }
    /**
     * <pre>
     * Some apps, eg. haproxy, use the full length of sockaddr_un.sun_path to
     * connect(2) or bind(2) when using abstract UDS.
     * </pre>
     *
     * <code>bool padding = 3;</code>
     * @param value The padding to set.
     * @return This builder for chaining.
     */
    public Builder setPadding(boolean value) {
      
      padding_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Some apps, eg. haproxy, use the full length of sockaddr_un.sun_path to
     * connect(2) or bind(2) when using abstract UDS.
     * </pre>
     *
     * <code>bool padding = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPadding() {
      
      padding_ = false;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.transport.internet.domainsocket.Config)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.transport.internet.domainsocket.Config)
  private static final com.v2ray.core.transport.internet.domainsocket.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.transport.internet.domainsocket.Config();
  }

  public static com.v2ray.core.transport.internet.domainsocket.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    @java.lang.Override
    public Config parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Config(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.v2ray.core.transport.internet.domainsocket.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

