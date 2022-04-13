package com.v2ray.core.app.router.command;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: app/router/command/command.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RoutingServiceGrpc {

  private RoutingServiceGrpc() {}

  public static final String SERVICE_NAME = "v2ray.core.app.router.command.RoutingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.v2ray.core.app.router.command.SubscribeRoutingStatsRequest,
      com.v2ray.core.app.router.command.RoutingContext> getSubscribeRoutingStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeRoutingStats",
      requestType = com.v2ray.core.app.router.command.SubscribeRoutingStatsRequest.class,
      responseType = com.v2ray.core.app.router.command.RoutingContext.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.v2ray.core.app.router.command.SubscribeRoutingStatsRequest,
      com.v2ray.core.app.router.command.RoutingContext> getSubscribeRoutingStatsMethod() {
    io.grpc.MethodDescriptor<com.v2ray.core.app.router.command.SubscribeRoutingStatsRequest, com.v2ray.core.app.router.command.RoutingContext> getSubscribeRoutingStatsMethod;
    if ((getSubscribeRoutingStatsMethod = RoutingServiceGrpc.getSubscribeRoutingStatsMethod) == null) {
      synchronized (RoutingServiceGrpc.class) {
        if ((getSubscribeRoutingStatsMethod = RoutingServiceGrpc.getSubscribeRoutingStatsMethod) == null) {
          RoutingServiceGrpc.getSubscribeRoutingStatsMethod = getSubscribeRoutingStatsMethod =
              io.grpc.MethodDescriptor.<com.v2ray.core.app.router.command.SubscribeRoutingStatsRequest, com.v2ray.core.app.router.command.RoutingContext>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeRoutingStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.v2ray.core.app.router.command.SubscribeRoutingStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.v2ray.core.app.router.command.RoutingContext.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingServiceMethodDescriptorSupplier("SubscribeRoutingStats"))
              .build();
        }
      }
    }
    return getSubscribeRoutingStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.v2ray.core.app.router.command.TestRouteRequest,
      com.v2ray.core.app.router.command.RoutingContext> getTestRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestRoute",
      requestType = com.v2ray.core.app.router.command.TestRouteRequest.class,
      responseType = com.v2ray.core.app.router.command.RoutingContext.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.v2ray.core.app.router.command.TestRouteRequest,
      com.v2ray.core.app.router.command.RoutingContext> getTestRouteMethod() {
    io.grpc.MethodDescriptor<com.v2ray.core.app.router.command.TestRouteRequest, com.v2ray.core.app.router.command.RoutingContext> getTestRouteMethod;
    if ((getTestRouteMethod = RoutingServiceGrpc.getTestRouteMethod) == null) {
      synchronized (RoutingServiceGrpc.class) {
        if ((getTestRouteMethod = RoutingServiceGrpc.getTestRouteMethod) == null) {
          RoutingServiceGrpc.getTestRouteMethod = getTestRouteMethod =
              io.grpc.MethodDescriptor.<com.v2ray.core.app.router.command.TestRouteRequest, com.v2ray.core.app.router.command.RoutingContext>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.v2ray.core.app.router.command.TestRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.v2ray.core.app.router.command.RoutingContext.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingServiceMethodDescriptorSupplier("TestRoute"))
              .build();
        }
      }
    }
    return getTestRouteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoutingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoutingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoutingServiceStub>() {
        @java.lang.Override
        public RoutingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoutingServiceStub(channel, callOptions);
        }
      };
    return RoutingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoutingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoutingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoutingServiceBlockingStub>() {
        @java.lang.Override
        public RoutingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoutingServiceBlockingStub(channel, callOptions);
        }
      };
    return RoutingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoutingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoutingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoutingServiceFutureStub>() {
        @java.lang.Override
        public RoutingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoutingServiceFutureStub(channel, callOptions);
        }
      };
    return RoutingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RoutingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void subscribeRoutingStats(com.v2ray.core.app.router.command.SubscribeRoutingStatsRequest request,
        io.grpc.stub.StreamObserver<com.v2ray.core.app.router.command.RoutingContext> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeRoutingStatsMethod(), responseObserver);
    }

    /**
     */
    public void testRoute(com.v2ray.core.app.router.command.TestRouteRequest request,
        io.grpc.stub.StreamObserver<com.v2ray.core.app.router.command.RoutingContext> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestRouteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubscribeRoutingStatsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.v2ray.core.app.router.command.SubscribeRoutingStatsRequest,
                com.v2ray.core.app.router.command.RoutingContext>(
                  this, METHODID_SUBSCRIBE_ROUTING_STATS)))
          .addMethod(
            getTestRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.v2ray.core.app.router.command.TestRouteRequest,
                com.v2ray.core.app.router.command.RoutingContext>(
                  this, METHODID_TEST_ROUTE)))
          .build();
    }
  }

  /**
   */
  public static final class RoutingServiceStub extends io.grpc.stub.AbstractAsyncStub<RoutingServiceStub> {
    private RoutingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoutingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoutingServiceStub(channel, callOptions);
    }

    /**
     */
    public void subscribeRoutingStats(com.v2ray.core.app.router.command.SubscribeRoutingStatsRequest request,
        io.grpc.stub.StreamObserver<com.v2ray.core.app.router.command.RoutingContext> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeRoutingStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testRoute(com.v2ray.core.app.router.command.TestRouteRequest request,
        io.grpc.stub.StreamObserver<com.v2ray.core.app.router.command.RoutingContext> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestRouteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RoutingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RoutingServiceBlockingStub> {
    private RoutingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoutingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoutingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.v2ray.core.app.router.command.RoutingContext> subscribeRoutingStats(
        com.v2ray.core.app.router.command.SubscribeRoutingStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeRoutingStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.v2ray.core.app.router.command.RoutingContext testRoute(com.v2ray.core.app.router.command.TestRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestRouteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RoutingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RoutingServiceFutureStub> {
    private RoutingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoutingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoutingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.v2ray.core.app.router.command.RoutingContext> testRoute(
        com.v2ray.core.app.router.command.TestRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestRouteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE_ROUTING_STATS = 0;
  private static final int METHODID_TEST_ROUTE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoutingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoutingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE_ROUTING_STATS:
          serviceImpl.subscribeRoutingStats((com.v2ray.core.app.router.command.SubscribeRoutingStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.v2ray.core.app.router.command.RoutingContext>) responseObserver);
          break;
        case METHODID_TEST_ROUTE:
          serviceImpl.testRoute((com.v2ray.core.app.router.command.TestRouteRequest) request,
              (io.grpc.stub.StreamObserver<com.v2ray.core.app.router.command.RoutingContext>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RoutingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoutingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.v2ray.core.app.router.command.Command.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoutingService");
    }
  }

  private static final class RoutingServiceFileDescriptorSupplier
      extends RoutingServiceBaseDescriptorSupplier {
    RoutingServiceFileDescriptorSupplier() {}
  }

  private static final class RoutingServiceMethodDescriptorSupplier
      extends RoutingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoutingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoutingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoutingServiceFileDescriptorSupplier())
              .addMethod(getSubscribeRoutingStatsMethod())
              .addMethod(getTestRouteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
