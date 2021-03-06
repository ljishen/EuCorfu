// automatically generated by the FlatBuffers compiler, do not modify

package edu.ucsc.soe.sys;

import java.nio.*;
import java.lang.*;

import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Extent extends Table {
  public static Extent getRootAsExtent(ByteBuffer _bb) { return getRootAsExtent(_bb, new Extent()); }
  public static Extent getRootAsExtent(ByteBuffer _bb, Extent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Extent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long from() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public long to() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public String replicas(int j) { int o = __offset(8); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int replicasLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }

  public static int createExtent(FlatBufferBuilder builder,
      long from,
      long to,
      int replicasOffset) {
    builder.startObject(3);
    Extent.addTo(builder, to);
    Extent.addFrom(builder, from);
    Extent.addReplicas(builder, replicasOffset);
    return Extent.endExtent(builder);
  }

  public static void startExtent(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addFrom(FlatBufferBuilder builder, long from) { builder.addLong(0, from, 0L); }
  public static void addTo(FlatBufferBuilder builder, long to) { builder.addLong(1, to, 0L); }
  public static void addReplicas(FlatBufferBuilder builder, int replicasOffset) { builder.addOffset(2, replicasOffset, 0); }
  public static int createReplicasVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startReplicasVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endExtent(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

