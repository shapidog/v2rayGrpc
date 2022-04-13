// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/reverse/config.proto

package com.v2ray.core.proxy.reverse;

/**
 * Protobuf type {@code v2ray.core.app.reverse.Control}
 */
public final class Control extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.app.reverse.Control)
    ControlOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Control.newBuilder() to construct.
  private Control(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Control() {
    state_ = 0;
    random_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Control();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Control(
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
            int rawValue = input.readEnum();

            state_ = rawValue;
            break;
          }
          case 794: {

            random_ = input.readBytes();
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
    return com.v2ray.core.proxy.reverse.ConfigOuterClass.internal_static_v2ray_core_app_reverse_Control_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.proxy.reverse.ConfigOuterClass.internal_static_v2ray_core_app_reverse_Control_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.proxy.reverse.Control.class, com.v2ray.core.proxy.reverse.Control.Builder.class);
  }

  /**
   * Protobuf enum {@code v2ray.core.app.reverse.Control.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ACTIVE = 0;</code>
     */
    ACTIVE(0),
    /**
     * <code>DRAIN = 1;</code>
     */
    DRAIN(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ACTIVE = 0;</code>
     */
    public static final int ACTIVE_VALUE = 0;
    /**
     * <code>DRAIN = 1;</code>
     */
    public static final int DRAIN_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0: return ACTIVE;
        case 1: return DRAIN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        State> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<State>() {
            public State findValueByNumber(int number) {
              return State.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.v2ray.core.proxy.reverse.Control.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:v2ray.core.app.reverse.Control.State)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_;
  /**
   * <code>.v2ray.core.app.reverse.Control.State state = 1;</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <code>.v2ray.core.app.reverse.Control.State state = 1;</code>
   * @return The state.
   */
  @java.lang.Override public com.v2ray.core.proxy.reverse.Control.State getState() {
    @SuppressWarnings("deprecation")
    com.v2ray.core.proxy.reverse.Control.State result = com.v2ray.core.proxy.reverse.Control.State.valueOf(state_);
    return result == null ? com.v2ray.core.proxy.reverse.Control.State.UNRECOGNIZED : result;
  }

  public static final int RANDOM_FIELD_NUMBER = 99;
  private com.google.protobuf.ByteString random_;
  /**
   * <code>bytes random = 99;</code>
   * @return The random.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRandom() {
    return random_;
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
    if (state_ != com.v2ray.core.proxy.reverse.Control.State.ACTIVE.getNumber()) {
      output.writeEnum(1, state_);
    }
    if (!random_.isEmpty()) {
      output.writeBytes(99, random_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_ != com.v2ray.core.proxy.reverse.Control.State.ACTIVE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, state_);
    }
    if (!random_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(99, random_);
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
    if (!(obj instanceof com.v2ray.core.proxy.reverse.Control)) {
      return super.equals(obj);
    }
    com.v2ray.core.proxy.reverse.Control other = (com.v2ray.core.proxy.reverse.Control) obj;

    if (state_ != other.state_) return false;
    if (!getRandom()
        .equals(other.getRandom())) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + RANDOM_FIELD_NUMBER;
    hash = (53 * hash) + getRandom().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.proxy.reverse.Control parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.reverse.Control parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.reverse.Control parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.reverse.Control parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.reverse.Control parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.reverse.Control parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.reverse.Control parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.reverse.Control parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.proxy.reverse.Control parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.reverse.Control parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.proxy.reverse.Control parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.reverse.Control parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.proxy.reverse.Control prototype) {
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
   * Protobuf type {@code v2ray.core.app.reverse.Control}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.app.reverse.Control)
      com.v2ray.core.proxy.reverse.ControlOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.proxy.reverse.ConfigOuterClass.internal_static_v2ray_core_app_reverse_Control_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.proxy.reverse.ConfigOuterClass.internal_static_v2ray_core_app_reverse_Control_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.proxy.reverse.Control.class, com.v2ray.core.proxy.reverse.Control.Builder.class);
    }

    // Construct using com.v2ray.core.proxy.reverse.Control.newBuilder()
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
      state_ = 0;

      random_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.proxy.reverse.ConfigOuterClass.internal_static_v2ray_core_app_reverse_Control_descriptor;
    }

    @java.lang.Override
    public com.v2ray.core.proxy.reverse.Control getDefaultInstanceForType() {
      return com.v2ray.core.proxy.reverse.Control.getDefaultInstance();
    }

    @java.lang.Override
    public com.v2ray.core.proxy.reverse.Control build() {
      com.v2ray.core.proxy.reverse.Control result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.v2ray.core.proxy.reverse.Control buildPartial() {
      com.v2ray.core.proxy.reverse.Control result = new com.v2ray.core.proxy.reverse.Control(this);
      result.state_ = state_;
      result.random_ = random_;
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
      if (other instanceof com.v2ray.core.proxy.reverse.Control) {
        return mergeFrom((com.v2ray.core.proxy.reverse.Control)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.proxy.reverse.Control other) {
      if (other == com.v2ray.core.proxy.reverse.Control.getDefaultInstance()) return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.getRandom() != com.google.protobuf.ByteString.EMPTY) {
        setRandom(other.getRandom());
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
      com.v2ray.core.proxy.reverse.Control parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.proxy.reverse.Control) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int state_ = 0;
    /**
     * <code>.v2ray.core.app.reverse.Control.State state = 1;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.v2ray.core.app.reverse.Control.State state = 1;</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.app.reverse.Control.State state = 1;</code>
     * @return The state.
     */
    @java.lang.Override
    public com.v2ray.core.proxy.reverse.Control.State getState() {
      @SuppressWarnings("deprecation")
      com.v2ray.core.proxy.reverse.Control.State result = com.v2ray.core.proxy.reverse.Control.State.valueOf(state_);
      return result == null ? com.v2ray.core.proxy.reverse.Control.State.UNRECOGNIZED : result;
    }
    /**
     * <code>.v2ray.core.app.reverse.Control.State state = 1;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.v2ray.core.proxy.reverse.Control.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.app.reverse.Control.State state = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      
      state_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString random_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes random = 99;</code>
     * @return The random.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRandom() {
      return random_;
    }
    /**
     * <code>bytes random = 99;</code>
     * @param value The random to set.
     * @return This builder for chaining.
     */
    public Builder setRandom(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      random_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes random = 99;</code>
     * @return This builder for chaining.
     */
    public Builder clearRandom() {
      
      random_ = getDefaultInstance().getRandom();
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.app.reverse.Control)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.app.reverse.Control)
  private static final com.v2ray.core.proxy.reverse.Control DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.proxy.reverse.Control();
  }

  public static com.v2ray.core.proxy.reverse.Control getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Control>
      PARSER = new com.google.protobuf.AbstractParser<Control>() {
    @java.lang.Override
    public Control parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Control(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Control> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Control> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.v2ray.core.proxy.reverse.Control getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

