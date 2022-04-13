package com.v2ray.api;


import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.v2ray.core.InboundHandlerConfig;
import com.v2ray.core.OutboundHandlerConfig;
import com.v2ray.core.app.proxyman.MultiplexingConfig;
import com.v2ray.core.app.proxyman.ReceiverConfig;
import com.v2ray.core.app.proxyman.SenderConfig;
import com.v2ray.core.app.proxyman.command.*;
import com.v2ray.core.app.router.command.RoutingContext;
import com.v2ray.core.app.router.command.RoutingServiceGrpc;
import com.v2ray.core.app.router.command.TestRouteRequest;
import com.v2ray.core.common.net.IPOrDomain;
import com.v2ray.core.common.net.PortRange;
import com.v2ray.core.common.protocol.ServerEndpoint;
import com.v2ray.core.common.protocol.User;
import com.v2ray.core.common.serial.TypedMessage;
import com.v2ray.core.proxy.http.ServerConfig;
import com.v2ray.core.proxy.shadowsocks.Account;
import com.v2ray.core.proxy.shadowsocks.CipherType;
import com.v2ray.core.proxy.shadowsocks.ClientConfig;
import com.v2ray.core.transport.internet.StreamConfig;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;

public class ApiClient {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        ManagedChannel managedChannel = NettyChannelBuilder.forAddress("127.0.0.1", 10085).usePlaintext().build();
        HandlerServiceGrpc.HandlerServiceBlockingStub handlerService = HandlerServiceGrpc.newBlockingStub(managedChannel);
        addInbound(handlerService);
        //addOutbound(handlerService);
        //RoutingServiceGrpc.RoutingServiceBlockingStub routingService = RoutingServiceGrpc.newBlockingStub(managedChannel);
        //addRoute(routingService);
    }

    private static void addInbound(HandlerServiceGrpc.HandlerServiceBlockingStub handlerService) {
        IPOrDomain ipOrDomain = IPOrDomain.newBuilder().setIp(ByteString.copyFromUtf8("0.0.0.0")).build();
        PortRange portRange = PortRange.newBuilder().setFrom(10806).setTo(10806).build();

        ServerConfig serverConfig = ServerConfig.newBuilder()
                .setUserLevel(0)
                .build();

        ReceiverConfig receiverConfig = ReceiverConfig.newBuilder()
                .setPortRange(portRange)
                .setListen(ipOrDomain)
                .build();

        InboundHandlerConfig inboundHandlerConfig = InboundHandlerConfig.newBuilder()
                .setReceiverSettings(toTypedMessage(receiverConfig, "v2ray.core.app.proxyman.ReceiverConfig"))
                .setProxySettings(toTypedMessage(serverConfig, "v2ray.core.proxy.http.ServerConfig"))
                .setTag("IN88")
                .build();
        AddInboundRequest request = AddInboundRequest.newBuilder()
                .setInbound(inboundHandlerConfig)
                .build();
        AddInboundResponse addInboundResponse = handlerService.addInbound(request);
    }


    private void removeInbound(HandlerServiceGrpc.HandlerServiceBlockingStub handlerService) {
        RemoveInboundRequest removeInboundRequest = RemoveInboundRequest.newBuilder()
                .setTag("S1")
                .build();
        RemoveInboundResponse removeInboundResponse = handlerService.removeInbound(removeInboundRequest);
    }


    private static void addOutbound(HandlerServiceGrpc.HandlerServiceBlockingStub handlerService) {
        MultiplexingConfig multiplexingConfig = MultiplexingConfig.newBuilder()
                .setConcurrency(8)
                .setEnabled(true)
                .build();
        StreamConfig streamConfig = StreamConfig.newBuilder()
                .setProtocolName("tcp")
                .build();
        SenderConfig senderConfig = SenderConfig.newBuilder()
                .setMultiplexSettings(multiplexingConfig)
                .setStreamSettings(streamConfig)
                .build();

        ClientConfig.Builder clientConfigBuilder = ClientConfig.newBuilder();

        IPOrDomain ipOrDomain = IPOrDomain.newBuilder().setDomain("xxxx").build();
        Account account = Account.newBuilder()
                .setCipherType(CipherType.AES_256_GCM)
                .setPassword("password")
                .build();
        User user = User.newBuilder()
                .setAccount(toTypedMessage(account, "v2ray.core.proxy.shadowsocks.Account"))
                .setLevel(0)
                .build();
        ServerEndpoint serverEndpoint = ServerEndpoint.newBuilder()
                .setAddress(ipOrDomain)
                .setPort(2222)
                .addUser(user)
                .build();
        clientConfigBuilder.addServer(serverEndpoint);
        ClientConfig clientConfig = clientConfigBuilder.build();

        OutboundHandlerConfig outboundHandlerConfig = OutboundHandlerConfig.newBuilder()
                .setSenderSettings(toTypedMessage(senderConfig, "v2ray.core.app.proxyman.SenderConfig"))
                .setProxySettings(toTypedMessage(clientConfig, "v2ray.core.proxy.shadowsocks.ClientConfig"))
                .setTag("O88")
                .build();
        AddOutboundRequest addOutboundRequest = AddOutboundRequest.newBuilder()
                .setOutbound(outboundHandlerConfig)
                .build();

        AddOutboundResponse addOutboundResponse = handlerService.addOutbound(addOutboundRequest);
    }


    private void removeOutbound(HandlerServiceGrpc.HandlerServiceBlockingStub handlerService) {
        RemoveOutboundRequest removeInboundRequest = RemoveOutboundRequest.newBuilder()
                .setTag("S1")
                .build();
        RemoveOutboundResponse removeOutboundResponse = handlerService.removeOutbound(removeInboundRequest);
    }

    private static void addRoute(RoutingServiceGrpc.RoutingServiceBlockingStub routingService) {
        RoutingContext routingContext = RoutingContext.newBuilder()
                .setOutboundTag("O88")
                .setInboundTag("IN88")
                .build();
        TestRouteRequest request = TestRouteRequest.newBuilder()
                .setRoutingContext(routingContext)
                .build();
        RoutingContext route = routingService.testRoute(request);
    }


    private static TypedMessage toTypedMessage(Message message, String type) {
        if (message == null) {
            return null;
        }
        return TypedMessage.newBuilder()
                .setType(type)
                .setValue(message.toByteString())
                .build();
    }

}

