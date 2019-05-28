/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.avaya;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** This Schema describes about session base message */
@org.apache.avro.specific.AvroGenerated
public class MatchRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3446452911806809953L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MatchRequest\",\"namespace\":\"com.avro\",\"doc\":\"This Schema describes about session base message\",\"fields\":[{\"name\":\"interaction_id\",\"type\":\"string\"},{\"name\":\"customer_id\",\"type\":\"string\"},{\"name\":\"context_id\",\"type\":\"string\"},{\"name\":\"work_id\",\"type\":\"string\"},{\"name\":\"work_request_id\",\"type\":\"string\"},{\"name\":\"task_type\",\"type\":\"string\"},{\"name\":\"match_type\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MatchRequest> ENCODER =
      new BinaryMessageEncoder<MatchRequest>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MatchRequest> DECODER =
      new BinaryMessageDecoder<MatchRequest>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<MatchRequest> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<MatchRequest> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MatchRequest>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this MatchRequest to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a MatchRequest from a ByteBuffer. */
  public static MatchRequest fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence interaction_id;
  @Deprecated public java.lang.CharSequence customer_id;
  @Deprecated public java.lang.CharSequence context_id;
  @Deprecated public java.lang.CharSequence work_id;
  @Deprecated public java.lang.CharSequence work_request_id;
  @Deprecated public java.lang.CharSequence task_type;
  @Deprecated public java.lang.CharSequence match_type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MatchRequest() {}

  /**
   * All-args constructor.
   * @param interaction_id The new value for interaction_id
   * @param customer_id The new value for customer_id
   * @param context_id The new value for context_id
   * @param work_id The new value for work_id
   * @param work_request_id The new value for work_request_id
   * @param task_type The new value for task_type
   * @param match_type The new value for match_type
   */
  public MatchRequest(java.lang.CharSequence interaction_id, java.lang.CharSequence customer_id, java.lang.CharSequence context_id, java.lang.CharSequence work_id, java.lang.CharSequence work_request_id, java.lang.CharSequence task_type, java.lang.CharSequence match_type) {
    this.interaction_id = interaction_id;
    this.customer_id = customer_id;
    this.context_id = context_id;
    this.work_id = work_id;
    this.work_request_id = work_request_id;
    this.task_type = task_type;
    this.match_type = match_type;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return interaction_id;
    case 1: return customer_id;
    case 2: return context_id;
    case 3: return work_id;
    case 4: return work_request_id;
    case 5: return task_type;
    case 6: return match_type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: interaction_id = (java.lang.CharSequence)value$; break;
    case 1: customer_id = (java.lang.CharSequence)value$; break;
    case 2: context_id = (java.lang.CharSequence)value$; break;
    case 3: work_id = (java.lang.CharSequence)value$; break;
    case 4: work_request_id = (java.lang.CharSequence)value$; break;
    case 5: task_type = (java.lang.CharSequence)value$; break;
    case 6: match_type = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'interaction_id' field.
   * @return The value of the 'interaction_id' field.
   */
  public java.lang.CharSequence getInteractionId() {
    return interaction_id;
  }

  /**
   * Sets the value of the 'interaction_id' field.
   * @param value the value to set.
   */
  public void setInteractionId(java.lang.CharSequence value) {
    this.interaction_id = value;
  }

  /**
   * Gets the value of the 'customer_id' field.
   * @return The value of the 'customer_id' field.
   */
  public java.lang.CharSequence getCustomerId() {
    return customer_id;
  }

  /**
   * Sets the value of the 'customer_id' field.
   * @param value the value to set.
   */
  public void setCustomerId(java.lang.CharSequence value) {
    this.customer_id = value;
  }

  /**
   * Gets the value of the 'context_id' field.
   * @return The value of the 'context_id' field.
   */
  public java.lang.CharSequence getContextId() {
    return context_id;
  }

  /**
   * Sets the value of the 'context_id' field.
   * @param value the value to set.
   */
  public void setContextId(java.lang.CharSequence value) {
    this.context_id = value;
  }

  /**
   * Gets the value of the 'work_id' field.
   * @return The value of the 'work_id' field.
   */
  public java.lang.CharSequence getWorkId() {
    return work_id;
  }

  /**
   * Sets the value of the 'work_id' field.
   * @param value the value to set.
   */
  public void setWorkId(java.lang.CharSequence value) {
    this.work_id = value;
  }

  /**
   * Gets the value of the 'work_request_id' field.
   * @return The value of the 'work_request_id' field.
   */
  public java.lang.CharSequence getWorkRequestId() {
    return work_request_id;
  }

  /**
   * Sets the value of the 'work_request_id' field.
   * @param value the value to set.
   */
  public void setWorkRequestId(java.lang.CharSequence value) {
    this.work_request_id = value;
  }

  /**
   * Gets the value of the 'task_type' field.
   * @return The value of the 'task_type' field.
   */
  public java.lang.CharSequence getTaskType() {
    return task_type;
  }

  /**
   * Sets the value of the 'task_type' field.
   * @param value the value to set.
   */
  public void setTaskType(java.lang.CharSequence value) {
    this.task_type = value;
  }

  /**
   * Gets the value of the 'match_type' field.
   * @return The value of the 'match_type' field.
   */
  public java.lang.CharSequence getMatchType() {
    return match_type;
  }

  /**
   * Sets the value of the 'match_type' field.
   * @param value the value to set.
   */
  public void setMatchType(java.lang.CharSequence value) {
    this.match_type = value;
  }

  /**
   * Creates a new MatchRequest RecordBuilder.
   * @return A new MatchRequest RecordBuilder
   */
  public static com.avaya.MatchRequest.Builder newBuilder() {
    return new com.avaya.MatchRequest.Builder();
  }

  /**
   * Creates a new MatchRequest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MatchRequest RecordBuilder
   */
  public static com.avaya.MatchRequest.Builder newBuilder(com.avaya.MatchRequest.Builder other) {
    return new com.avaya.MatchRequest.Builder(other);
  }

  /**
   * Creates a new MatchRequest RecordBuilder by copying an existing MatchRequest instance.
   * @param other The existing instance to copy.
   * @return A new MatchRequest RecordBuilder
   */
  public static com.avaya.MatchRequest.Builder newBuilder(com.avaya.MatchRequest other) {
    return new com.avaya.MatchRequest.Builder(other);
  }

  /**
   * RecordBuilder for MatchRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MatchRequest>
    implements org.apache.avro.data.RecordBuilder<MatchRequest> {

    private java.lang.CharSequence interaction_id;
    private java.lang.CharSequence customer_id;
    private java.lang.CharSequence context_id;
    private java.lang.CharSequence work_id;
    private java.lang.CharSequence work_request_id;
    private java.lang.CharSequence task_type;
    private java.lang.CharSequence match_type;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.avaya.MatchRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.interaction_id)) {
        this.interaction_id = data().deepCopy(fields()[0].schema(), other.interaction_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.customer_id)) {
        this.customer_id = data().deepCopy(fields()[1].schema(), other.customer_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.context_id)) {
        this.context_id = data().deepCopy(fields()[2].schema(), other.context_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.work_id)) {
        this.work_id = data().deepCopy(fields()[3].schema(), other.work_id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.work_request_id)) {
        this.work_request_id = data().deepCopy(fields()[4].schema(), other.work_request_id);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.task_type)) {
        this.task_type = data().deepCopy(fields()[5].schema(), other.task_type);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.match_type)) {
        this.match_type = data().deepCopy(fields()[6].schema(), other.match_type);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing MatchRequest instance
     * @param other The existing instance to copy.
     */
    private Builder(com.avaya.MatchRequest other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.interaction_id)) {
        this.interaction_id = data().deepCopy(fields()[0].schema(), other.interaction_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.customer_id)) {
        this.customer_id = data().deepCopy(fields()[1].schema(), other.customer_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.context_id)) {
        this.context_id = data().deepCopy(fields()[2].schema(), other.context_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.work_id)) {
        this.work_id = data().deepCopy(fields()[3].schema(), other.work_id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.work_request_id)) {
        this.work_request_id = data().deepCopy(fields()[4].schema(), other.work_request_id);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.task_type)) {
        this.task_type = data().deepCopy(fields()[5].schema(), other.task_type);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.match_type)) {
        this.match_type = data().deepCopy(fields()[6].schema(), other.match_type);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'interaction_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getInteractionId() {
      return interaction_id;
    }

    /**
      * Sets the value of the 'interaction_id' field.
      * @param value The value of 'interaction_id'.
      * @return This builder.
      */
    public com.avaya.MatchRequest.Builder setInteractionId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.interaction_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'interaction_id' field has been set.
      * @return True if the 'interaction_id' field has been set, false otherwise.
      */
    public boolean hasInteractionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'interaction_id' field.
      * @return This builder.
      */
    public com.avaya.MatchRequest.Builder clearInteractionId() {
      interaction_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'customer_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getCustomerId() {
      return customer_id;
    }

    /**
      * Sets the value of the 'customer_id' field.
      * @param value The value of 'customer_id'.
      * @return This builder.
      */
    public com.avaya.MatchRequest.Builder setCustomerId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.customer_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'customer_id' field has been set.
      * @return True if the 'customer_id' field has been set, false otherwise.
      */
    public boolean hasCustomerId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'customer_id' field.
      * @return This builder.
      */
    public com.avaya.MatchRequest.Builder clearCustomerId() {
      customer_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'context_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getContextId() {
      return context_id;
    }

    /**
      * Sets the value of the 'context_id' field.
      * @param value The value of 'context_id'.
      * @return This builder.
      */
    public com.avaya.MatchRequest.Builder setContextId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.context_id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'context_id' field has been set.
      * @return True if the 'context_id' field has been set, false otherwise.
      */
    public boolean hasContextId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'context_id' field.
      * @return This builder.
      */
    public com.avaya.MatchRequest.Builder clearContextId() {
      context_id = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'work_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getWorkId() {
      return work_id;
    }

    /**
      * Sets the value of the 'work_id' field.
      * @param value The value of 'work_id'.
      * @return This builder.
      */
    public com.avaya.MatchRequest.Builder setWorkId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.work_id = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'work_id' field has been set.
      * @return True if the 'work_id' field has been set, false otherwise.
      */
    public boolean hasWorkId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'work_id' field.
      * @return This builder.
      */
    public com.avaya.MatchRequest.Builder clearWorkId() {
      work_id = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'work_request_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getWorkRequestId() {
      return work_request_id;
    }

    /**
      * Sets the value of the 'work_request_id' field.
      * @param value The value of 'work_request_id'.
      * @return This builder.
      */
    public com.avaya.MatchRequest.Builder setWorkRequestId(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.work_request_id = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'work_request_id' field has been set.
      * @return True if the 'work_request_id' field has been set, false otherwise.
      */
    public boolean hasWorkRequestId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'work_request_id' field.
      * @return This builder.
      */
    public com.avaya.MatchRequest.Builder clearWorkRequestId() {
      work_request_id = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'task_type' field.
      * @return The value.
      */
    public java.lang.CharSequence getTaskType() {
      return task_type;
    }

    /**
      * Sets the value of the 'task_type' field.
      * @param value The value of 'task_type'.
      * @return This builder.
      */
    public com.avaya.MatchRequest.Builder setTaskType(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.task_type = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'task_type' field has been set.
      * @return True if the 'task_type' field has been set, false otherwise.
      */
    public boolean hasTaskType() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'task_type' field.
      * @return This builder.
      */
    public com.avaya.MatchRequest.Builder clearTaskType() {
      task_type = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'match_type' field.
      * @return The value.
      */
    public java.lang.CharSequence getMatchType() {
      return match_type;
    }

    /**
      * Sets the value of the 'match_type' field.
      * @param value The value of 'match_type'.
      * @return This builder.
      */
    public com.avaya.MatchRequest.Builder setMatchType(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.match_type = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'match_type' field has been set.
      * @return True if the 'match_type' field has been set, false otherwise.
      */
    public boolean hasMatchType() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'match_type' field.
      * @return This builder.
      */
    public com.avaya.MatchRequest.Builder clearMatchType() {
      match_type = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MatchRequest build() {
      try {
        MatchRequest record = new MatchRequest();
        record.interaction_id = fieldSetFlags()[0] ? this.interaction_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.customer_id = fieldSetFlags()[1] ? this.customer_id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.context_id = fieldSetFlags()[2] ? this.context_id : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.work_id = fieldSetFlags()[3] ? this.work_id : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.work_request_id = fieldSetFlags()[4] ? this.work_request_id : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.task_type = fieldSetFlags()[5] ? this.task_type : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.match_type = fieldSetFlags()[6] ? this.match_type : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MatchRequest>
    WRITER$ = (org.apache.avro.io.DatumWriter<MatchRequest>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MatchRequest>
    READER$ = (org.apache.avro.io.DatumReader<MatchRequest>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
