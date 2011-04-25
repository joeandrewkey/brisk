/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.jobtracker.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

/**
 * Job metadata
 */
public class ThriftJobProfile implements TBase<ThriftJobProfile, ThriftJobProfile._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ThriftJobProfile");

  private static final TField USER_FIELD_DESC = new TField("user", TType.STRING, (short)1);
  private static final TField JOB_ID_FIELD_DESC = new TField("jobID", TType.STRUCT, (short)2);
  private static final TField JOB_FILE_FIELD_DESC = new TField("jobFile", TType.STRING, (short)3);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)4);
  private static final TField QUEUE_NAME_FIELD_DESC = new TField("queueName", TType.STRING, (short)5);

  public String user;
  public ThriftJobID jobID;
  public String jobFile;
  public String name;
  public String queueName;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    USER((short)1, "user"),
    JOB_ID((short)2, "jobID"),
    JOB_FILE((short)3, "jobFile"),
    NAME((short)4, "name"),
    QUEUE_NAME((short)5, "queueName");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USER
          return USER;
        case 2: // JOB_ID
          return JOB_ID;
        case 3: // JOB_FILE
          return JOB_FILE;
        case 4: // NAME
          return NAME;
        case 5: // QUEUE_NAME
          return QUEUE_NAME;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER, new FieldMetaData("user", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.JOB_ID, new FieldMetaData("jobID", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, ThriftJobID.class)));
    tmpMap.put(_Fields.JOB_FILE, new FieldMetaData("jobFile", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.QUEUE_NAME, new FieldMetaData("queueName", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ThriftJobProfile.class, metaDataMap);
  }

  public ThriftJobProfile() {
  }

  public ThriftJobProfile(
    String user,
    ThriftJobID jobID,
    String jobFile,
    String name,
    String queueName)
  {
    this();
    this.user = user;
    this.jobID = jobID;
    this.jobFile = jobFile;
    this.name = name;
    this.queueName = queueName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftJobProfile(ThriftJobProfile other) {
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetJobID()) {
      this.jobID = new ThriftJobID(other.jobID);
    }
    if (other.isSetJobFile()) {
      this.jobFile = other.jobFile;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
  }

  public ThriftJobProfile deepCopy() {
    return new ThriftJobProfile(this);
  }

  @Override
  public void clear() {
    this.user = null;
    this.jobID = null;
    this.jobFile = null;
    this.name = null;
    this.queueName = null;
  }

  public String getUser() {
    return this.user;
  }

  public ThriftJobProfile setUser(String user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been asigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  public ThriftJobID getJobID() {
    return this.jobID;
  }

  public ThriftJobProfile setJobID(ThriftJobID jobID) {
    this.jobID = jobID;
    return this;
  }

  public void unsetJobID() {
    this.jobID = null;
  }

  /** Returns true if field jobID is set (has been asigned a value) and false otherwise */
  public boolean isSetJobID() {
    return this.jobID != null;
  }

  public void setJobIDIsSet(boolean value) {
    if (!value) {
      this.jobID = null;
    }
  }

  public String getJobFile() {
    return this.jobFile;
  }

  public ThriftJobProfile setJobFile(String jobFile) {
    this.jobFile = jobFile;
    return this;
  }

  public void unsetJobFile() {
    this.jobFile = null;
  }

  /** Returns true if field jobFile is set (has been asigned a value) and false otherwise */
  public boolean isSetJobFile() {
    return this.jobFile != null;
  }

  public void setJobFileIsSet(boolean value) {
    if (!value) {
      this.jobFile = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public ThriftJobProfile setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getQueueName() {
    return this.queueName;
  }

  public ThriftJobProfile setQueueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  public void unsetQueueName() {
    this.queueName = null;
  }

  /** Returns true if field queueName is set (has been asigned a value) and false otherwise */
  public boolean isSetQueueName() {
    return this.queueName != null;
  }

  public void setQueueNameIsSet(boolean value) {
    if (!value) {
      this.queueName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((String)value);
      }
      break;

    case JOB_ID:
      if (value == null) {
        unsetJobID();
      } else {
        setJobID((ThriftJobID)value);
      }
      break;

    case JOB_FILE:
      if (value == null) {
        unsetJobFile();
      } else {
        setJobFile((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case QUEUE_NAME:
      if (value == null) {
        unsetQueueName();
      } else {
        setQueueName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER:
      return getUser();

    case JOB_ID:
      return getJobID();

    case JOB_FILE:
      return getJobFile();

    case NAME:
      return getName();

    case QUEUE_NAME:
      return getQueueName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER:
      return isSetUser();
    case JOB_ID:
      return isSetJobID();
    case JOB_FILE:
      return isSetJobFile();
    case NAME:
      return isSetName();
    case QUEUE_NAME:
      return isSetQueueName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftJobProfile)
      return this.equals((ThriftJobProfile)that);
    return false;
  }

  public boolean equals(ThriftJobProfile that) {
    if (that == null)
      return false;

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_jobID = true && this.isSetJobID();
    boolean that_present_jobID = true && that.isSetJobID();
    if (this_present_jobID || that_present_jobID) {
      if (!(this_present_jobID && that_present_jobID))
        return false;
      if (!this.jobID.equals(that.jobID))
        return false;
    }

    boolean this_present_jobFile = true && this.isSetJobFile();
    boolean that_present_jobFile = true && that.isSetJobFile();
    if (this_present_jobFile || that_present_jobFile) {
      if (!(this_present_jobFile && that_present_jobFile))
        return false;
      if (!this.jobFile.equals(that.jobFile))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_queueName = true && this.isSetQueueName();
    boolean that_present_queueName = true && that.isSetQueueName();
    if (this_present_queueName || that_present_queueName) {
      if (!(this_present_queueName && that_present_queueName))
        return false;
      if (!this.queueName.equals(that.queueName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_user = true && (isSetUser());
    builder.append(present_user);
    if (present_user)
      builder.append(user);

    boolean present_jobID = true && (isSetJobID());
    builder.append(present_jobID);
    if (present_jobID)
      builder.append(jobID);

    boolean present_jobFile = true && (isSetJobFile());
    builder.append(present_jobFile);
    if (present_jobFile)
      builder.append(jobFile);

    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    boolean present_queueName = true && (isSetQueueName());
    builder.append(present_queueName);
    if (present_queueName)
      builder.append(queueName);

    return builder.toHashCode();
  }

  public int compareTo(ThriftJobProfile other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ThriftJobProfile typedOther = (ThriftJobProfile)other;

    lastComparison = Boolean.valueOf(isSetUser()).compareTo(typedOther.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = TBaseHelper.compareTo(this.user, typedOther.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobID()).compareTo(typedOther.isSetJobID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobID()) {
      lastComparison = TBaseHelper.compareTo(this.jobID, typedOther.jobID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobFile()).compareTo(typedOther.isSetJobFile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobFile()) {
      lastComparison = TBaseHelper.compareTo(this.jobFile, typedOther.jobFile);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueueName()).compareTo(typedOther.isSetQueueName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueName()) {
      lastComparison = TBaseHelper.compareTo(this.queueName, typedOther.queueName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // USER
          if (field.type == TType.STRING) {
            this.user = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // JOB_ID
          if (field.type == TType.STRUCT) {
            this.jobID = new ThriftJobID();
            this.jobID.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // JOB_FILE
          if (field.type == TType.STRING) {
            this.jobFile = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // QUEUE_NAME
          if (field.type == TType.STRING) {
            this.queueName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.user != null) {
      oprot.writeFieldBegin(USER_FIELD_DESC);
      oprot.writeString(this.user);
      oprot.writeFieldEnd();
    }
    if (this.jobID != null) {
      oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
      this.jobID.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.jobFile != null) {
      oprot.writeFieldBegin(JOB_FILE_FIELD_DESC);
      oprot.writeString(this.jobFile);
      oprot.writeFieldEnd();
    }
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.queueName != null) {
      oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
      oprot.writeString(this.queueName);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftJobProfile(");
    boolean first = true;

    sb.append("user:");
    if (this.user == null) {
      sb.append("null");
    } else {
      sb.append(this.user);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobID:");
    if (this.jobID == null) {
      sb.append("null");
    } else {
      sb.append(this.jobID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobFile:");
    if (this.jobFile == null) {
      sb.append("null");
    } else {
      sb.append(this.jobFile);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
