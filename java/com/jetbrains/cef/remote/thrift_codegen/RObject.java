/**
 * Autogenerated by Thrift Compiler (0.19.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jetbrains.cef.remote.thrift_codegen;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class RObject implements com.jetbrains.cef.remote.thrift.TBase<RObject, RObject._Fields>, java.io.Serializable, Cloneable, Comparable<RObject> {
  private static final com.jetbrains.cef.remote.thrift.protocol.TStruct STRUCT_DESC = new com.jetbrains.cef.remote.thrift.protocol.TStruct("RObject");

  private static final com.jetbrains.cef.remote.thrift.protocol.TField OBJ_ID_FIELD_DESC = new com.jetbrains.cef.remote.thrift.protocol.TField("objId", com.jetbrains.cef.remote.thrift.protocol.TType.I32, (short)1);
  private static final com.jetbrains.cef.remote.thrift.protocol.TField FLAGS_FIELD_DESC = new com.jetbrains.cef.remote.thrift.protocol.TField("flags", com.jetbrains.cef.remote.thrift.protocol.TType.I32, (short)2);
  private static final com.jetbrains.cef.remote.thrift.protocol.TField OBJ_INFO_FIELD_DESC = new com.jetbrains.cef.remote.thrift.protocol.TField("objInfo", com.jetbrains.cef.remote.thrift.protocol.TType.MAP, (short)3);

  private static final com.jetbrains.cef.remote.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RObjectStandardSchemeFactory();
  private static final com.jetbrains.cef.remote.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RObjectTupleSchemeFactory();

  public int objId; // required
  public int flags; // optional
  public @com.jetbrains.cef.remote.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> objInfo; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements com.jetbrains.cef.remote.thrift.TFieldIdEnum {
    OBJ_ID((short)1, "objId"),
    FLAGS((short)2, "flags"),
    OBJ_INFO((short)3, "objInfo");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @com.jetbrains.cef.remote.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // OBJ_ID
          return OBJ_ID;
        case 2: // FLAGS
          return FLAGS;
        case 3: // OBJ_INFO
          return OBJ_INFO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @com.jetbrains.cef.remote.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __OBJID_ISSET_ID = 0;
  private static final int __FLAGS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.FLAGS,_Fields.OBJ_INFO};
  public static final java.util.Map<_Fields, com.jetbrains.cef.remote.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, com.jetbrains.cef.remote.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, com.jetbrains.cef.remote.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OBJ_ID, new com.jetbrains.cef.remote.thrift.meta_data.FieldMetaData("objId", com.jetbrains.cef.remote.thrift.TFieldRequirementType.REQUIRED, 
        new com.jetbrains.cef.remote.thrift.meta_data.FieldValueMetaData(com.jetbrains.cef.remote.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FLAGS, new com.jetbrains.cef.remote.thrift.meta_data.FieldMetaData("flags", com.jetbrains.cef.remote.thrift.TFieldRequirementType.OPTIONAL, 
        new com.jetbrains.cef.remote.thrift.meta_data.FieldValueMetaData(com.jetbrains.cef.remote.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OBJ_INFO, new com.jetbrains.cef.remote.thrift.meta_data.FieldMetaData("objInfo", com.jetbrains.cef.remote.thrift.TFieldRequirementType.OPTIONAL, 
        new com.jetbrains.cef.remote.thrift.meta_data.MapMetaData(com.jetbrains.cef.remote.thrift.protocol.TType.MAP, 
            new com.jetbrains.cef.remote.thrift.meta_data.FieldValueMetaData(com.jetbrains.cef.remote.thrift.protocol.TType.STRING), 
            new com.jetbrains.cef.remote.thrift.meta_data.FieldValueMetaData(com.jetbrains.cef.remote.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    com.jetbrains.cef.remote.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RObject.class, metaDataMap);
  }

  public RObject() {
  }

  public RObject(
    int objId)
  {
    this();
    this.objId = objId;
    setObjIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RObject(RObject other) {
    __isset_bitfield = other.__isset_bitfield;
    this.objId = other.objId;
    this.flags = other.flags;
    if (other.isSetObjInfo()) {
      java.util.Map<java.lang.String,java.lang.String> __this__objInfo = new java.util.HashMap<java.lang.String,java.lang.String>(other.objInfo);
      this.objInfo = __this__objInfo;
    }
  }

  @Override
  public RObject deepCopy() {
    return new RObject(this);
  }

  @Override
  public void clear() {
    setObjIdIsSet(false);
    this.objId = 0;
    setFlagsIsSet(false);
    this.flags = 0;
    this.objInfo = null;
  }

  public int getObjId() {
    return this.objId;
  }

  public RObject setObjId(int objId) {
    this.objId = objId;
    setObjIdIsSet(true);
    return this;
  }

  public void unsetObjId() {
    __isset_bitfield = com.jetbrains.cef.remote.thrift.EncodingUtils.clearBit(__isset_bitfield, __OBJID_ISSET_ID);
  }

  /** Returns true if field objId is set (has been assigned a value) and false otherwise */
  public boolean isSetObjId() {
    return com.jetbrains.cef.remote.thrift.EncodingUtils.testBit(__isset_bitfield, __OBJID_ISSET_ID);
  }

  public void setObjIdIsSet(boolean value) {
    __isset_bitfield = com.jetbrains.cef.remote.thrift.EncodingUtils.setBit(__isset_bitfield, __OBJID_ISSET_ID, value);
  }

  public int getFlags() {
    return this.flags;
  }

  public RObject setFlags(int flags) {
    this.flags = flags;
    setFlagsIsSet(true);
    return this;
  }

  public void unsetFlags() {
    __isset_bitfield = com.jetbrains.cef.remote.thrift.EncodingUtils.clearBit(__isset_bitfield, __FLAGS_ISSET_ID);
  }

  /** Returns true if field flags is set (has been assigned a value) and false otherwise */
  public boolean isSetFlags() {
    return com.jetbrains.cef.remote.thrift.EncodingUtils.testBit(__isset_bitfield, __FLAGS_ISSET_ID);
  }

  public void setFlagsIsSet(boolean value) {
    __isset_bitfield = com.jetbrains.cef.remote.thrift.EncodingUtils.setBit(__isset_bitfield, __FLAGS_ISSET_ID, value);
  }

  public int getObjInfoSize() {
    return (this.objInfo == null) ? 0 : this.objInfo.size();
  }

  public void putToObjInfo(java.lang.String key, java.lang.String val) {
    if (this.objInfo == null) {
      this.objInfo = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.objInfo.put(key, val);
  }

  @com.jetbrains.cef.remote.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getObjInfo() {
    return this.objInfo;
  }

  public RObject setObjInfo(@com.jetbrains.cef.remote.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> objInfo) {
    this.objInfo = objInfo;
    return this;
  }

  public void unsetObjInfo() {
    this.objInfo = null;
  }

  /** Returns true if field objInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetObjInfo() {
    return this.objInfo != null;
  }

  public void setObjInfoIsSet(boolean value) {
    if (!value) {
      this.objInfo = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @com.jetbrains.cef.remote.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case OBJ_ID:
      if (value == null) {
        unsetObjId();
      } else {
        setObjId((java.lang.Integer)value);
      }
      break;

    case FLAGS:
      if (value == null) {
        unsetFlags();
      } else {
        setFlags((java.lang.Integer)value);
      }
      break;

    case OBJ_INFO:
      if (value == null) {
        unsetObjInfo();
      } else {
        setObjInfo((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  @com.jetbrains.cef.remote.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OBJ_ID:
      return getObjId();

    case FLAGS:
      return getFlags();

    case OBJ_INFO:
      return getObjInfo();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OBJ_ID:
      return isSetObjId();
    case FLAGS:
      return isSetFlags();
    case OBJ_INFO:
      return isSetObjInfo();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof RObject)
      return this.equals((RObject)that);
    return false;
  }

  public boolean equals(RObject that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_objId = true;
    boolean that_present_objId = true;
    if (this_present_objId || that_present_objId) {
      if (!(this_present_objId && that_present_objId))
        return false;
      if (this.objId != that.objId)
        return false;
    }

    boolean this_present_flags = true && this.isSetFlags();
    boolean that_present_flags = true && that.isSetFlags();
    if (this_present_flags || that_present_flags) {
      if (!(this_present_flags && that_present_flags))
        return false;
      if (this.flags != that.flags)
        return false;
    }

    boolean this_present_objInfo = true && this.isSetObjInfo();
    boolean that_present_objInfo = true && that.isSetObjInfo();
    if (this_present_objInfo || that_present_objInfo) {
      if (!(this_present_objInfo && that_present_objInfo))
        return false;
      if (!this.objInfo.equals(that.objInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + objId;

    hashCode = hashCode * 8191 + ((isSetFlags()) ? 131071 : 524287);
    if (isSetFlags())
      hashCode = hashCode * 8191 + flags;

    hashCode = hashCode * 8191 + ((isSetObjInfo()) ? 131071 : 524287);
    if (isSetObjInfo())
      hashCode = hashCode * 8191 + objInfo.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RObject other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetObjId(), other.isSetObjId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObjId()) {
      lastComparison = com.jetbrains.cef.remote.thrift.TBaseHelper.compareTo(this.objId, other.objId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFlags(), other.isSetFlags());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFlags()) {
      lastComparison = com.jetbrains.cef.remote.thrift.TBaseHelper.compareTo(this.flags, other.flags);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetObjInfo(), other.isSetObjInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObjInfo()) {
      lastComparison = com.jetbrains.cef.remote.thrift.TBaseHelper.compareTo(this.objInfo, other.objInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @com.jetbrains.cef.remote.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(com.jetbrains.cef.remote.thrift.protocol.TProtocol iprot) throws com.jetbrains.cef.remote.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(com.jetbrains.cef.remote.thrift.protocol.TProtocol oprot) throws com.jetbrains.cef.remote.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RObject(");
    boolean first = true;

    sb.append("objId:");
    sb.append(this.objId);
    first = false;
    if (isSetFlags()) {
      if (!first) sb.append(", ");
      sb.append("flags:");
      sb.append(this.flags);
      first = false;
    }
    if (isSetObjInfo()) {
      if (!first) sb.append(", ");
      sb.append("objInfo:");
      if (this.objInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.objInfo);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws com.jetbrains.cef.remote.thrift.TException {
    // check for required fields
    // alas, we cannot check 'objId' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new com.jetbrains.cef.remote.thrift.protocol.TCompactProtocol(new com.jetbrains.cef.remote.thrift.transport.TIOStreamTransport(out)));
    } catch (com.jetbrains.cef.remote.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new com.jetbrains.cef.remote.thrift.protocol.TCompactProtocol(new com.jetbrains.cef.remote.thrift.transport.TIOStreamTransport(in)));
    } catch (com.jetbrains.cef.remote.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RObjectStandardSchemeFactory implements com.jetbrains.cef.remote.thrift.scheme.SchemeFactory {
    @Override
    public RObjectStandardScheme getScheme() {
      return new RObjectStandardScheme();
    }
  }

  private static class RObjectStandardScheme extends com.jetbrains.cef.remote.thrift.scheme.StandardScheme<RObject> {

    @Override
    public void read(com.jetbrains.cef.remote.thrift.protocol.TProtocol iprot, RObject struct) throws com.jetbrains.cef.remote.thrift.TException {
      com.jetbrains.cef.remote.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == com.jetbrains.cef.remote.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OBJ_ID
            if (schemeField.type == com.jetbrains.cef.remote.thrift.protocol.TType.I32) {
              struct.objId = iprot.readI32();
              struct.setObjIdIsSet(true);
            } else { 
              com.jetbrains.cef.remote.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FLAGS
            if (schemeField.type == com.jetbrains.cef.remote.thrift.protocol.TType.I32) {
              struct.flags = iprot.readI32();
              struct.setFlagsIsSet(true);
            } else { 
              com.jetbrains.cef.remote.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OBJ_INFO
            if (schemeField.type == com.jetbrains.cef.remote.thrift.protocol.TType.MAP) {
              {
                com.jetbrains.cef.remote.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.objInfo = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map0.size);
                @com.jetbrains.cef.remote.thrift.annotation.Nullable java.lang.String _key1;
                @com.jetbrains.cef.remote.thrift.annotation.Nullable java.lang.String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.objInfo.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setObjInfoIsSet(true);
            } else { 
              com.jetbrains.cef.remote.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            com.jetbrains.cef.remote.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetObjId()) {
        throw new com.jetbrains.cef.remote.thrift.protocol.TProtocolException("Required field 'objId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(com.jetbrains.cef.remote.thrift.protocol.TProtocol oprot, RObject struct) throws com.jetbrains.cef.remote.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(OBJ_ID_FIELD_DESC);
      oprot.writeI32(struct.objId);
      oprot.writeFieldEnd();
      if (struct.isSetFlags()) {
        oprot.writeFieldBegin(FLAGS_FIELD_DESC);
        oprot.writeI32(struct.flags);
        oprot.writeFieldEnd();
      }
      if (struct.objInfo != null) {
        if (struct.isSetObjInfo()) {
          oprot.writeFieldBegin(OBJ_INFO_FIELD_DESC);
          {
            oprot.writeMapBegin(new com.jetbrains.cef.remote.thrift.protocol.TMap(com.jetbrains.cef.remote.thrift.protocol.TType.STRING, com.jetbrains.cef.remote.thrift.protocol.TType.STRING, struct.objInfo.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter4 : struct.objInfo.entrySet())
            {
              oprot.writeString(_iter4.getKey());
              oprot.writeString(_iter4.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RObjectTupleSchemeFactory implements com.jetbrains.cef.remote.thrift.scheme.SchemeFactory {
    @Override
    public RObjectTupleScheme getScheme() {
      return new RObjectTupleScheme();
    }
  }

  private static class RObjectTupleScheme extends com.jetbrains.cef.remote.thrift.scheme.TupleScheme<RObject> {

    @Override
    public void write(com.jetbrains.cef.remote.thrift.protocol.TProtocol prot, RObject struct) throws com.jetbrains.cef.remote.thrift.TException {
      com.jetbrains.cef.remote.thrift.protocol.TTupleProtocol oprot = (com.jetbrains.cef.remote.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.objId);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetFlags()) {
        optionals.set(0);
      }
      if (struct.isSetObjInfo()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetFlags()) {
        oprot.writeI32(struct.flags);
      }
      if (struct.isSetObjInfo()) {
        {
          oprot.writeI32(struct.objInfo.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter5 : struct.objInfo.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(com.jetbrains.cef.remote.thrift.protocol.TProtocol prot, RObject struct) throws com.jetbrains.cef.remote.thrift.TException {
      com.jetbrains.cef.remote.thrift.protocol.TTupleProtocol iprot = (com.jetbrains.cef.remote.thrift.protocol.TTupleProtocol) prot;
      struct.objId = iprot.readI32();
      struct.setObjIdIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.flags = iprot.readI32();
        struct.setFlagsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          com.jetbrains.cef.remote.thrift.protocol.TMap _map6 = iprot.readMapBegin(com.jetbrains.cef.remote.thrift.protocol.TType.STRING, com.jetbrains.cef.remote.thrift.protocol.TType.STRING); 
          struct.objInfo = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map6.size);
          @com.jetbrains.cef.remote.thrift.annotation.Nullable java.lang.String _key7;
          @com.jetbrains.cef.remote.thrift.annotation.Nullable java.lang.String _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readString();
            _val8 = iprot.readString();
            struct.objInfo.put(_key7, _val8);
          }
        }
        struct.setObjInfoIsSet(true);
      }
    }
  }

  private static <S extends com.jetbrains.cef.remote.thrift.scheme.IScheme> S scheme(com.jetbrains.cef.remote.thrift.protocol.TProtocol proto) {
    return (com.jetbrains.cef.remote.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

