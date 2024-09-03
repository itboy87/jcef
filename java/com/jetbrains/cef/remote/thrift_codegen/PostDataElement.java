/**
 * Autogenerated by Thrift Compiler (0.19.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jetbrains.cef.remote.thrift_codegen;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class PostDataElement implements com.jetbrains.cef.remote.thrift.TBase<PostDataElement, PostDataElement._Fields>, java.io.Serializable, Cloneable, Comparable<PostDataElement> {
  private static final com.jetbrains.cef.remote.thrift.protocol.TStruct STRUCT_DESC = new com.jetbrains.cef.remote.thrift.protocol.TStruct("PostDataElement");

  private static final com.jetbrains.cef.remote.thrift.protocol.TField IS_READ_ONLY_FIELD_DESC = new com.jetbrains.cef.remote.thrift.protocol.TField("isReadOnly", com.jetbrains.cef.remote.thrift.protocol.TType.BOOL, (short)1);
  private static final com.jetbrains.cef.remote.thrift.protocol.TField FILE_FIELD_DESC = new com.jetbrains.cef.remote.thrift.protocol.TField("file", com.jetbrains.cef.remote.thrift.protocol.TType.STRING, (short)2);
  private static final com.jetbrains.cef.remote.thrift.protocol.TField BYTES_FIELD_DESC = new com.jetbrains.cef.remote.thrift.protocol.TField("bytes", com.jetbrains.cef.remote.thrift.protocol.TType.STRING, (short)3);

  private static final com.jetbrains.cef.remote.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PostDataElementStandardSchemeFactory();
  private static final com.jetbrains.cef.remote.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PostDataElementTupleSchemeFactory();

  public boolean isReadOnly; // required
  public @com.jetbrains.cef.remote.thrift.annotation.Nullable java.lang.String file; // optional
  public @com.jetbrains.cef.remote.thrift.annotation.Nullable java.nio.ByteBuffer bytes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements com.jetbrains.cef.remote.thrift.TFieldIdEnum {
    IS_READ_ONLY((short)1, "isReadOnly"),
    FILE((short)2, "file"),
    BYTES((short)3, "bytes");

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
        case 1: // IS_READ_ONLY
          return IS_READ_ONLY;
        case 2: // FILE
          return FILE;
        case 3: // BYTES
          return BYTES;
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
  private static final int __ISREADONLY_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.FILE,_Fields.BYTES};
  public static final java.util.Map<_Fields, com.jetbrains.cef.remote.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, com.jetbrains.cef.remote.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, com.jetbrains.cef.remote.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_READ_ONLY, new com.jetbrains.cef.remote.thrift.meta_data.FieldMetaData("isReadOnly", com.jetbrains.cef.remote.thrift.TFieldRequirementType.REQUIRED, 
        new com.jetbrains.cef.remote.thrift.meta_data.FieldValueMetaData(com.jetbrains.cef.remote.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.FILE, new com.jetbrains.cef.remote.thrift.meta_data.FieldMetaData("file", com.jetbrains.cef.remote.thrift.TFieldRequirementType.OPTIONAL, 
        new com.jetbrains.cef.remote.thrift.meta_data.FieldValueMetaData(com.jetbrains.cef.remote.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BYTES, new com.jetbrains.cef.remote.thrift.meta_data.FieldMetaData("bytes", com.jetbrains.cef.remote.thrift.TFieldRequirementType.OPTIONAL, 
        new com.jetbrains.cef.remote.thrift.meta_data.FieldValueMetaData(com.jetbrains.cef.remote.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    com.jetbrains.cef.remote.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PostDataElement.class, metaDataMap);
  }

  public PostDataElement() {
  }

  public PostDataElement(
    boolean isReadOnly)
  {
    this();
    this.isReadOnly = isReadOnly;
    setIsReadOnlyIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PostDataElement(PostDataElement other) {
    __isset_bitfield = other.__isset_bitfield;
    this.isReadOnly = other.isReadOnly;
    if (other.isSetFile()) {
      this.file = other.file;
    }
    if (other.isSetBytes()) {
      this.bytes = com.jetbrains.cef.remote.thrift.TBaseHelper.copyBinary(other.bytes);
    }
  }

  @Override
  public PostDataElement deepCopy() {
    return new PostDataElement(this);
  }

  @Override
  public void clear() {
    setIsReadOnlyIsSet(false);
    this.isReadOnly = false;
    this.file = null;
    this.bytes = null;
  }

  public boolean isIsReadOnly() {
    return this.isReadOnly;
  }

  public PostDataElement setIsReadOnly(boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
    setIsReadOnlyIsSet(true);
    return this;
  }

  public void unsetIsReadOnly() {
    __isset_bitfield = com.jetbrains.cef.remote.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISREADONLY_ISSET_ID);
  }

  /** Returns true if field isReadOnly is set (has been assigned a value) and false otherwise */
  public boolean isSetIsReadOnly() {
    return com.jetbrains.cef.remote.thrift.EncodingUtils.testBit(__isset_bitfield, __ISREADONLY_ISSET_ID);
  }

  public void setIsReadOnlyIsSet(boolean value) {
    __isset_bitfield = com.jetbrains.cef.remote.thrift.EncodingUtils.setBit(__isset_bitfield, __ISREADONLY_ISSET_ID, value);
  }

  @com.jetbrains.cef.remote.thrift.annotation.Nullable
  public java.lang.String getFile() {
    return this.file;
  }

  public PostDataElement setFile(@com.jetbrains.cef.remote.thrift.annotation.Nullable java.lang.String file) {
    this.file = file;
    return this;
  }

  public void unsetFile() {
    this.file = null;
  }

  /** Returns true if field file is set (has been assigned a value) and false otherwise */
  public boolean isSetFile() {
    return this.file != null;
  }

  public void setFileIsSet(boolean value) {
    if (!value) {
      this.file = null;
    }
  }

  public byte[] getBytes() {
    setBytes(com.jetbrains.cef.remote.thrift.TBaseHelper.rightSize(bytes));
    return bytes == null ? null : bytes.array();
  }

  public java.nio.ByteBuffer bufferForBytes() {
    return com.jetbrains.cef.remote.thrift.TBaseHelper.copyBinary(bytes);
  }

  public PostDataElement setBytes(byte[] bytes) {
    this.bytes = bytes == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(bytes.clone());
    return this;
  }

  public PostDataElement setBytes(@com.jetbrains.cef.remote.thrift.annotation.Nullable java.nio.ByteBuffer bytes) {
    this.bytes = com.jetbrains.cef.remote.thrift.TBaseHelper.copyBinary(bytes);
    return this;
  }

  public void unsetBytes() {
    this.bytes = null;
  }

  /** Returns true if field bytes is set (has been assigned a value) and false otherwise */
  public boolean isSetBytes() {
    return this.bytes != null;
  }

  public void setBytesIsSet(boolean value) {
    if (!value) {
      this.bytes = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @com.jetbrains.cef.remote.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case IS_READ_ONLY:
      if (value == null) {
        unsetIsReadOnly();
      } else {
        setIsReadOnly((java.lang.Boolean)value);
      }
      break;

    case FILE:
      if (value == null) {
        unsetFile();
      } else {
        setFile((java.lang.String)value);
      }
      break;

    case BYTES:
      if (value == null) {
        unsetBytes();
      } else {
        if (value instanceof byte[]) {
          setBytes((byte[])value);
        } else {
          setBytes((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  @com.jetbrains.cef.remote.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_READ_ONLY:
      return isIsReadOnly();

    case FILE:
      return getFile();

    case BYTES:
      return getBytes();

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
    case IS_READ_ONLY:
      return isSetIsReadOnly();
    case FILE:
      return isSetFile();
    case BYTES:
      return isSetBytes();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PostDataElement)
      return this.equals((PostDataElement)that);
    return false;
  }

  public boolean equals(PostDataElement that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_isReadOnly = true;
    boolean that_present_isReadOnly = true;
    if (this_present_isReadOnly || that_present_isReadOnly) {
      if (!(this_present_isReadOnly && that_present_isReadOnly))
        return false;
      if (this.isReadOnly != that.isReadOnly)
        return false;
    }

    boolean this_present_file = true && this.isSetFile();
    boolean that_present_file = true && that.isSetFile();
    if (this_present_file || that_present_file) {
      if (!(this_present_file && that_present_file))
        return false;
      if (!this.file.equals(that.file))
        return false;
    }

    boolean this_present_bytes = true && this.isSetBytes();
    boolean that_present_bytes = true && that.isSetBytes();
    if (this_present_bytes || that_present_bytes) {
      if (!(this_present_bytes && that_present_bytes))
        return false;
      if (!this.bytes.equals(that.bytes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isReadOnly) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetFile()) ? 131071 : 524287);
    if (isSetFile())
      hashCode = hashCode * 8191 + file.hashCode();

    hashCode = hashCode * 8191 + ((isSetBytes()) ? 131071 : 524287);
    if (isSetBytes())
      hashCode = hashCode * 8191 + bytes.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PostDataElement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetIsReadOnly(), other.isSetIsReadOnly());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsReadOnly()) {
      lastComparison = com.jetbrains.cef.remote.thrift.TBaseHelper.compareTo(this.isReadOnly, other.isReadOnly);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFile(), other.isSetFile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFile()) {
      lastComparison = com.jetbrains.cef.remote.thrift.TBaseHelper.compareTo(this.file, other.file);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBytes(), other.isSetBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBytes()) {
      lastComparison = com.jetbrains.cef.remote.thrift.TBaseHelper.compareTo(this.bytes, other.bytes);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PostDataElement(");
    boolean first = true;

    sb.append("isReadOnly:");
    sb.append(this.isReadOnly);
    first = false;
    if (isSetFile()) {
      if (!first) sb.append(", ");
      sb.append("file:");
      if (this.file == null) {
        sb.append("null");
      } else {
        sb.append(this.file);
      }
      first = false;
    }
    if (isSetBytes()) {
      if (!first) sb.append(", ");
      sb.append("bytes:");
      if (this.bytes == null) {
        sb.append("null");
      } else {
        com.jetbrains.cef.remote.thrift.TBaseHelper.toString(this.bytes, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws com.jetbrains.cef.remote.thrift.TException {
    // check for required fields
    // alas, we cannot check 'isReadOnly' because it's a primitive and you chose the non-beans generator.
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

  private static class PostDataElementStandardSchemeFactory implements com.jetbrains.cef.remote.thrift.scheme.SchemeFactory {
    @Override
    public PostDataElementStandardScheme getScheme() {
      return new PostDataElementStandardScheme();
    }
  }

  private static class PostDataElementStandardScheme extends com.jetbrains.cef.remote.thrift.scheme.StandardScheme<PostDataElement> {

    @Override
    public void read(com.jetbrains.cef.remote.thrift.protocol.TProtocol iprot, PostDataElement struct) throws com.jetbrains.cef.remote.thrift.TException {
      com.jetbrains.cef.remote.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == com.jetbrains.cef.remote.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_READ_ONLY
            if (schemeField.type == com.jetbrains.cef.remote.thrift.protocol.TType.BOOL) {
              struct.isReadOnly = iprot.readBool();
              struct.setIsReadOnlyIsSet(true);
            } else { 
              com.jetbrains.cef.remote.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FILE
            if (schemeField.type == com.jetbrains.cef.remote.thrift.protocol.TType.STRING) {
              struct.file = iprot.readString();
              struct.setFileIsSet(true);
            } else { 
              com.jetbrains.cef.remote.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BYTES
            if (schemeField.type == com.jetbrains.cef.remote.thrift.protocol.TType.STRING) {
              struct.bytes = iprot.readBinary();
              struct.setBytesIsSet(true);
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
      if (!struct.isSetIsReadOnly()) {
        throw new com.jetbrains.cef.remote.thrift.protocol.TProtocolException("Required field 'isReadOnly' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(com.jetbrains.cef.remote.thrift.protocol.TProtocol oprot, PostDataElement struct) throws com.jetbrains.cef.remote.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_READ_ONLY_FIELD_DESC);
      oprot.writeBool(struct.isReadOnly);
      oprot.writeFieldEnd();
      if (struct.file != null) {
        if (struct.isSetFile()) {
          oprot.writeFieldBegin(FILE_FIELD_DESC);
          oprot.writeString(struct.file);
          oprot.writeFieldEnd();
        }
      }
      if (struct.bytes != null) {
        if (struct.isSetBytes()) {
          oprot.writeFieldBegin(BYTES_FIELD_DESC);
          oprot.writeBinary(struct.bytes);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PostDataElementTupleSchemeFactory implements com.jetbrains.cef.remote.thrift.scheme.SchemeFactory {
    @Override
    public PostDataElementTupleScheme getScheme() {
      return new PostDataElementTupleScheme();
    }
  }

  private static class PostDataElementTupleScheme extends com.jetbrains.cef.remote.thrift.scheme.TupleScheme<PostDataElement> {

    @Override
    public void write(com.jetbrains.cef.remote.thrift.protocol.TProtocol prot, PostDataElement struct) throws com.jetbrains.cef.remote.thrift.TException {
      com.jetbrains.cef.remote.thrift.protocol.TTupleProtocol oprot = (com.jetbrains.cef.remote.thrift.protocol.TTupleProtocol) prot;
      oprot.writeBool(struct.isReadOnly);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetFile()) {
        optionals.set(0);
      }
      if (struct.isSetBytes()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetFile()) {
        oprot.writeString(struct.file);
      }
      if (struct.isSetBytes()) {
        oprot.writeBinary(struct.bytes);
      }
    }

    @Override
    public void read(com.jetbrains.cef.remote.thrift.protocol.TProtocol prot, PostDataElement struct) throws com.jetbrains.cef.remote.thrift.TException {
      com.jetbrains.cef.remote.thrift.protocol.TTupleProtocol iprot = (com.jetbrains.cef.remote.thrift.protocol.TTupleProtocol) prot;
      struct.isReadOnly = iprot.readBool();
      struct.setIsReadOnlyIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.file = iprot.readString();
        struct.setFileIsSet(true);
      }
      if (incoming.get(1)) {
        struct.bytes = iprot.readBinary();
        struct.setBytesIsSet(true);
      }
    }
  }

  private static <S extends com.jetbrains.cef.remote.thrift.scheme.IScheme> S scheme(com.jetbrains.cef.remote.thrift.protocol.TProtocol proto) {
    return (com.jetbrains.cef.remote.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

