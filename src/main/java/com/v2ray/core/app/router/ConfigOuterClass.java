// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/router/config.proto

package com.v2ray.core.app.router;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_router_Domain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_router_Domain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_router_Domain_Attribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_router_Domain_Attribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_router_CIDR_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_router_CIDR_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_router_GeoIP_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_router_GeoIP_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_router_GeoIPList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_router_GeoIPList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_router_GeoSite_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_router_GeoSite_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_router_GeoSiteList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_router_GeoSiteList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_router_RoutingRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_router_RoutingRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_router_BalancingRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_router_BalancingRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_router_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_router_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027app/router/config.proto\022\025v2ray.core.ap" +
      "p.router\032\025common/net/port.proto\032\030common/" +
      "net/network.proto\"\215\002\n\006Domain\0220\n\004type\030\001 \001" +
      "(\0162\".v2ray.core.app.router.Domain.Type\022\r" +
      "\n\005value\030\002 \001(\t\022:\n\tattribute\030\003 \003(\0132\'.v2ray" +
      ".core.app.router.Domain.Attribute\032R\n\tAtt" +
      "ribute\022\013\n\003key\030\001 \001(\t\022\024\n\nbool_value\030\002 \001(\010H" +
      "\000\022\023\n\tint_value\030\003 \001(\003H\000B\r\n\013typed_value\"2\n" +
      "\004Type\022\t\n\005Plain\020\000\022\t\n\005Regex\020\001\022\n\n\006Domain\020\002\022" +
      "\010\n\004Full\020\003\"\"\n\004CIDR\022\n\n\002ip\030\001 \001(\014\022\016\n\006prefix\030" +
      "\002 \001(\r\"_\n\005GeoIP\022\024\n\014country_code\030\001 \001(\t\022)\n\004" +
      "cidr\030\002 \003(\0132\033.v2ray.core.app.router.CIDR\022" +
      "\025\n\rreverse_match\030\003 \001(\010\"8\n\tGeoIPList\022+\n\005e" +
      "ntry\030\001 \003(\0132\034.v2ray.core.app.router.GeoIP" +
      "\"N\n\007GeoSite\022\024\n\014country_code\030\001 \001(\t\022-\n\006dom" +
      "ain\030\002 \003(\0132\035.v2ray.core.app.router.Domain" +
      "\"<\n\013GeoSiteList\022-\n\005entry\030\001 \003(\0132\036.v2ray.c" +
      "ore.app.router.GeoSite\"\270\005\n\013RoutingRule\022\r" +
      "\n\003tag\030\001 \001(\tH\000\022\027\n\rbalancing_tag\030\014 \001(\tH\000\022-" +
      "\n\006domain\030\002 \003(\0132\035.v2ray.core.app.router.D" +
      "omain\022-\n\004cidr\030\003 \003(\0132\033.v2ray.core.app.rou" +
      "ter.CIDRB\002\030\001\022+\n\005geoip\030\n \003(\0132\034.v2ray.core" +
      ".app.router.GeoIP\0228\n\nport_range\030\004 \001(\0132 ." +
      "v2ray.core.common.net.PortRangeB\002\030\001\0222\n\tp" +
      "ort_list\030\016 \001(\0132\037.v2ray.core.common.net.P" +
      "ortList\022<\n\014network_list\030\005 \001(\0132\".v2ray.co" +
      "re.common.net.NetworkListB\002\030\001\0220\n\010network" +
      "s\030\r \003(\0162\036.v2ray.core.common.net.Network\022" +
      "4\n\013source_cidr\030\006 \003(\0132\033.v2ray.core.app.ro" +
      "uter.CIDRB\002\030\001\0222\n\014source_geoip\030\013 \003(\0132\034.v2" +
      "ray.core.app.router.GeoIP\0229\n\020source_port" +
      "_list\030\020 \001(\0132\037.v2ray.core.common.net.Port" +
      "List\022\022\n\nuser_email\030\007 \003(\t\022\023\n\013inbound_tag\030" +
      "\010 \003(\t\022\020\n\010protocol\030\t \003(\t\022\022\n\nattributes\030\017 " +
      "\001(\t\022\026\n\016domain_matcher\030\021 \001(\tB\014\n\ntarget_ta" +
      "g\"I\n\rBalancingRule\022\013\n\003tag\030\001 \001(\t\022\031\n\021outbo" +
      "und_selector\030\002 \003(\t\022\020\n\010strategy\030\003 \001(\t\"\210\002\n" +
      "\006Config\022E\n\017domain_strategy\030\001 \001(\0162,.v2ray" +
      ".core.app.router.Config.DomainStrategy\0220" +
      "\n\004rule\030\002 \003(\0132\".v2ray.core.app.router.Rou" +
      "tingRule\022<\n\016balancing_rule\030\003 \003(\0132$.v2ray" +
      ".core.app.router.BalancingRule\"G\n\016Domain" +
      "Strategy\022\010\n\004AsIs\020\000\022\t\n\005UseIp\020\001\022\020\n\014IpIfNon" +
      "Match\020\002\022\016\n\nIpOnDemand\020\003B`\n\031com.v2ray.cor" +
      "e.app.routerP\001Z)github.com/v2fly/v2ray-c" +
      "ore/v4/app/router\252\002\025V2Ray.Core.App.Route" +
      "rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.v2ray.core.common.net.Port.getDescriptor(),
          com.v2ray.core.common.net.NetworkOuterClass.getDescriptor(),
        });
    internal_static_v2ray_core_app_router_Domain_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_app_router_Domain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_router_Domain_descriptor,
        new java.lang.String[] { "Type", "Value", "Attribute", });
    internal_static_v2ray_core_app_router_Domain_Attribute_descriptor =
      internal_static_v2ray_core_app_router_Domain_descriptor.getNestedTypes().get(0);
    internal_static_v2ray_core_app_router_Domain_Attribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_router_Domain_Attribute_descriptor,
        new java.lang.String[] { "Key", "BoolValue", "IntValue", "TypedValue", });
    internal_static_v2ray_core_app_router_CIDR_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_v2ray_core_app_router_CIDR_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_router_CIDR_descriptor,
        new java.lang.String[] { "Ip", "Prefix", });
    internal_static_v2ray_core_app_router_GeoIP_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_v2ray_core_app_router_GeoIP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_router_GeoIP_descriptor,
        new java.lang.String[] { "CountryCode", "Cidr", "ReverseMatch", });
    internal_static_v2ray_core_app_router_GeoIPList_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_v2ray_core_app_router_GeoIPList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_router_GeoIPList_descriptor,
        new java.lang.String[] { "Entry", });
    internal_static_v2ray_core_app_router_GeoSite_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_v2ray_core_app_router_GeoSite_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_router_GeoSite_descriptor,
        new java.lang.String[] { "CountryCode", "Domain", });
    internal_static_v2ray_core_app_router_GeoSiteList_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_v2ray_core_app_router_GeoSiteList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_router_GeoSiteList_descriptor,
        new java.lang.String[] { "Entry", });
    internal_static_v2ray_core_app_router_RoutingRule_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_v2ray_core_app_router_RoutingRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_router_RoutingRule_descriptor,
        new java.lang.String[] { "Tag", "BalancingTag", "Domain", "Cidr", "Geoip", "PortRange", "PortList", "NetworkList", "Networks", "SourceCidr", "SourceGeoip", "SourcePortList", "UserEmail", "InboundTag", "Protocol", "Attributes", "DomainMatcher", "TargetTag", });
    internal_static_v2ray_core_app_router_BalancingRule_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_v2ray_core_app_router_BalancingRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_router_BalancingRule_descriptor,
        new java.lang.String[] { "Tag", "OutboundSelector", "Strategy", });
    internal_static_v2ray_core_app_router_Config_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_v2ray_core_app_router_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_router_Config_descriptor,
        new java.lang.String[] { "DomainStrategy", "Rule", "BalancingRule", });
    com.v2ray.core.common.net.Port.getDescriptor();
    com.v2ray.core.common.net.NetworkOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}