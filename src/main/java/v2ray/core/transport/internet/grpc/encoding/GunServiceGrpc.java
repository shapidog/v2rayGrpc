package v2ray.core.transport.internet.grpc.encoding;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: transport/internet/grpc/encoding/stream.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GunServiceGrpc {

  private GunServiceGrpc() {}

  public static final String SERVICE_NAME = "v2ray.core.transport.internet.grpc.encoding.GunService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<v2ray.core.transport.internet.grpc.encoding.Stream.Hunk,
      v2ray.core.transport.internet.grpc.encoding.Stream.Hunk> getTunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Tun",
      requestType = v2ray.core.transport.internet.grpc.encoding.Stream.Hunk.class,
      responseType = v2ray.core.transport.internet.grpc.encoding.Stream.Hunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<v2ray.core.transport.internet.grpc.encoding.Stream.Hunk,
      v2ray.core.transport.internet.grpc.encoding.Stream.Hunk> getTunMethod() {
    io.grpc.MethodDescriptor<v2ray.core.transport.internet.grpc.encoding.Stream.Hunk, v2ray.core.transport.internet.grpc.encoding.Stream.Hunk> getTunMethod;
    if ((getTunMethod = GunServiceGrpc.getTunMethod) == null) {
      synchronized (GunServiceGrpc.class) {
        if ((getTunMethod = GunServiceGrpc.getTunMethod) == null) {
          GunServiceGrpc.getTunMethod = getTunMethod =
              io.grpc.MethodDescriptor.<v2ray.core.transport.internet.grpc.encoding.Stream.Hunk, v2ray.core.transport.internet.grpc.encoding.Stream.Hunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Tun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v2ray.core.transport.internet.grpc.encoding.Stream.Hunk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v2ray.core.transport.internet.grpc.encoding.Stream.Hunk.getDefaultInstance()))
              .setSchemaDescriptor(new GunServiceMethodDescriptorSupplier("Tun"))
              .build();
        }
      }
    }
    return getTunMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GunServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GunServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GunServiceStub>() {
        @java.lang.Override
        public GunServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GunServiceStub(channel, callOptions);
        }
      };
    return GunServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GunServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GunServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GunServiceBlockingStub>() {
        @java.lang.Override
        public GunServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GunServiceBlockingStub(channel, callOptions);
        }
      };
    return GunServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GunServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GunServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GunServiceFutureStub>() {
        @java.lang.Override
        public GunServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GunServiceFutureStub(channel, callOptions);
        }
      };
    return GunServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GunServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<v2ray.core.transport.internet.grpc.encoding.Stream.Hunk> tun(
        io.grpc.stub.StreamObserver<v2ray.core.transport.internet.grpc.encoding.Stream.Hunk> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getTunMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTunMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                v2ray.core.transport.internet.grpc.encoding.Stream.Hunk,
                v2ray.core.transport.internet.grpc.encoding.Stream.Hunk>(
                  this, METHODID_TUN)))
          .build();
    }
  }

  /**
   */
  public static final class GunServiceStub extends io.grpc.stub.AbstractAsyncStub<GunServiceStub> {
    private GunServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GunServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GunServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<v2ray.core.transport.internet.grpc.encoding.Stream.Hunk> tun(
        io.grpc.stub.StreamObserver<v2ray.core.transport.internet.grpc.encoding.Stream.Hunk> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getTunMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GunServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GunServiceBlockingStub> {
    private GunServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GunServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GunServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class GunServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GunServiceFutureStub> {
    private GunServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GunServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GunServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_TUN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GunServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GunServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TUN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.tun(
              (io.grpc.stub.StreamObserver<v2ray.core.transport.internet.grpc.encoding.Stream.Hunk>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GunServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GunServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return v2ray.core.transport.internet.grpc.encoding.Stream.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GunService");
    }
  }

  private static final class GunServiceFileDescriptorSupplier
      extends GunServiceBaseDescriptorSupplier {
    GunServiceFileDescriptorSupplier() {}
  }

  private static final class GunServiceMethodDescriptorSupplier
      extends GunServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GunServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GunServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GunServiceFileDescriptorSupplier())
              .addMethod(getTunMethod())
              .build();
        }
      }
    }
    return result;
  }
}
