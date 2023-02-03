// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/ids/v1/ids.proto

package com.google.cloud.ids.v1;

public final class IdsProto {
  private IdsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_ids_v1_Endpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_ids_v1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_ids_v1_Endpoint_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_ids_v1_Endpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_ids_v1_ListEndpointsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_ids_v1_ListEndpointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_ids_v1_ListEndpointsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_ids_v1_ListEndpointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_ids_v1_GetEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_ids_v1_GetEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_ids_v1_CreateEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_ids_v1_CreateEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_ids_v1_DeleteEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_ids_v1_DeleteEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_ids_v1_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_ids_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035google/cloud/ids/v1/ids.proto\022\023google." +
      "cloud.ids.v1\032\034google/api/annotations.pro" +
      "to\032\027google/api/client.proto\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\032#google/longrunning/operations.p" +
      "roto\032\037google/protobuf/timestamp.proto\"\372\005" +
      "\n\010Endpoint\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013create_" +
      "time\030\002 \001(\0132\032.google.protobuf.TimestampB\003" +
      "\340A\003\0224\n\013update_time\030\003 \001(\0132\032.google.protob" +
      "uf.TimestampB\003\340A\003\0229\n\006labels\030\004 \003(\0132).goog" +
      "le.cloud.ids.v1.Endpoint.LabelsEntry\022\024\n\007" +
      "network\030\005 \001(\tB\003\340A\002\022%\n\030endpoint_forwardin" +
      "g_rule\030\006 \001(\tB\003\340A\003\022\030\n\013endpoint_ip\030\007 \001(\tB\003" +
      "\340A\003\022\023\n\013description\030\010 \001(\t\022=\n\010severity\030\t \001" +
      "(\0162&.google.cloud.ids.v1.Endpoint.Severi" +
      "tyB\003\340A\002\0227\n\005state\030\014 \001(\0162#.google.cloud.id" +
      "s.v1.Endpoint.StateB\003\340A\003\022\024\n\014traffic_logs" +
      "\030\r \001(\010\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va" +
      "lue\030\002 \001(\t:\0028\001\"d\n\010Severity\022\030\n\024SEVERITY_UN" +
      "SPECIFIED\020\000\022\021\n\rINFORMATIONAL\020\001\022\007\n\003LOW\020\002\022" +
      "\n\n\006MEDIUM\020\003\022\010\n\004HIGH\020\004\022\014\n\010CRITICAL\020\005\"E\n\005S" +
      "tate\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREATING\020" +
      "\001\022\t\n\005READY\020\002\022\014\n\010DELETING\020\003:^\352A[\n\033ids.goo" +
      "gleapis.com/Endpoint\022<projects/{project}" +
      "/locations/{location}/endpoints/{endpoin" +
      "t}\"\250\001\n\024ListEndpointsRequest\0223\n\006parent\030\001 " +
      "\001(\tB#\340A\002\372A\035\022\033ids.googleapis.com/Endpoint" +
      "\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003" +
      " \001(\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010order_" +
      "by\030\005 \001(\tB\003\340A\001\"w\n\025ListEndpointsResponse\0220" +
      "\n\tendpoints\030\001 \003(\0132\035.google.cloud.ids.v1." +
      "Endpoint\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unr" +
      "eachable\030\003 \003(\t\"G\n\022GetEndpointRequest\0221\n\004" +
      "name\030\001 \001(\tB#\340A\002\372A\035\n\033ids.googleapis.com/E" +
      "ndpoint\"\260\001\n\025CreateEndpointRequest\0223\n\006par" +
      "ent\030\001 \001(\tB#\340A\002\372A\035\022\033ids.googleapis.com/En" +
      "dpoint\022\030\n\013endpoint_id\030\002 \001(\tB\003\340A\002\0224\n\010endp" +
      "oint\030\003 \001(\0132\035.google.cloud.ids.v1.Endpoin" +
      "tB\003\340A\002\022\022\n\nrequest_id\030\004 \001(\t\"^\n\025DeleteEndp" +
      "ointRequest\0221\n\004name\030\001 \001(\tB#\340A\002\372A\035\n\033ids.g" +
      "oogleapis.com/Endpoint\022\022\n\nrequest_id\030\002 \001" +
      "(\t\"\200\002\n\021OperationMetadata\0224\n\013create_time\030" +
      "\001 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221" +
      "\n\010end_time\030\002 \001(\0132\032.google.protobuf.Times" +
      "tampB\003\340A\003\022\023\n\006target\030\003 \001(\tB\003\340A\003\022\021\n\004verb\030\004" +
      " \001(\tB\003\340A\003\022\033\n\016status_message\030\005 \001(\tB\003\340A\003\022#" +
      "\n\026requested_cancellation\030\006 \001(\010B\003\340A\003\022\030\n\013a" +
      "pi_version\030\007 \001(\tB\003\340A\0032\262\006\n\003IDS\022\246\001\n\rListEn" +
      "dpoints\022).google.cloud.ids.v1.ListEndpoi" +
      "ntsRequest\032*.google.cloud.ids.v1.ListEnd" +
      "pointsResponse\">\202\323\344\223\002/\022-/v1/{parent=proj" +
      "ects/*/locations/*}/endpoints\332A\006parent\022\223" +
      "\001\n\013GetEndpoint\022\'.google.cloud.ids.v1.Get" +
      "EndpointRequest\032\035.google.cloud.ids.v1.En" +
      "dpoint\"<\202\323\344\223\002/\022-/v1/{name=projects/*/loc" +
      "ations/*/endpoints/*}\332A\004name\022\332\001\n\016CreateE" +
      "ndpoint\022*.google.cloud.ids.v1.CreateEndp" +
      "ointRequest\032\035.google.longrunning.Operati" +
      "on\"}\202\323\344\223\0029\"-/v1/{parent=projects/*/locat" +
      "ions/*}/endpoints:\010endpoint\332A\033parent,end" +
      "point,endpoint_id\312A\035\n\010Endpoint\022\021Operatio" +
      "nMetadata\022\306\001\n\016DeleteEndpoint\022*.google.cl" +
      "oud.ids.v1.DeleteEndpointRequest\032\035.googl" +
      "e.longrunning.Operation\"i\202\323\344\223\002/*-/v1/{na" +
      "me=projects/*/locations/*/endpoints/*}\332A" +
      "\004name\312A*\n\025google.protobuf.Empty\022\021Operati" +
      "onMetadata\032F\312A\022ids.googleapis.com\322A.http" +
      "s://www.googleapis.com/auth/cloud-platfo" +
      "rmBi\n\027com.google.cloud.ids.v1B\010IdsProtoP" +
      "\001Z)cloud.google.com/go/ids/apiv1/idspb;i" +
      "dspb\352\002\026Google::Cloud::IDS::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_ids_v1_Endpoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_ids_v1_Endpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_ids_v1_Endpoint_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "UpdateTime", "Labels", "Network", "EndpointForwardingRule", "EndpointIp", "Description", "Severity", "State", "TrafficLogs", });
    internal_static_google_cloud_ids_v1_Endpoint_LabelsEntry_descriptor =
      internal_static_google_cloud_ids_v1_Endpoint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_ids_v1_Endpoint_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_ids_v1_Endpoint_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_ids_v1_ListEndpointsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_ids_v1_ListEndpointsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_ids_v1_ListEndpointsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_google_cloud_ids_v1_ListEndpointsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_ids_v1_ListEndpointsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_ids_v1_ListEndpointsResponse_descriptor,
        new java.lang.String[] { "Endpoints", "NextPageToken", "Unreachable", });
    internal_static_google_cloud_ids_v1_GetEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_ids_v1_GetEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_ids_v1_GetEndpointRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_ids_v1_CreateEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_ids_v1_CreateEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_ids_v1_CreateEndpointRequest_descriptor,
        new java.lang.String[] { "Parent", "EndpointId", "Endpoint", "RequestId", });
    internal_static_google_cloud_ids_v1_DeleteEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_ids_v1_DeleteEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_ids_v1_DeleteEndpointRequest_descriptor,
        new java.lang.String[] { "Name", "RequestId", });
    internal_static_google_cloud_ids_v1_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_ids_v1_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_ids_v1_OperationMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "EndTime", "Target", "Verb", "StatusMessage", "RequestedCancellation", "ApiVersion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
