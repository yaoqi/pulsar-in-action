/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.gottaeat.domain.payment;
@org.apache.avro.specific.AvroGenerated
public enum CardType implements org.apache.avro.generic.GenericEnumSymbol<CardType> {
  MASTERCARD, AMEX, VISA, DISCOVER  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"CardType\",\"namespace\":\"com.gottaeat.domain.payment\",\"symbols\":[\"MASTERCARD\",\"AMEX\",\"VISA\",\"DISCOVER\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
