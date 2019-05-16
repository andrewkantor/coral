package com.linkedin.coral.schema.avro.exceptions;

public class SchemaNotFoundException extends RuntimeException {
  public SchemaNotFoundException(Throwable e) {
    super(e);
  }

  public SchemaNotFoundException(String msg, Throwable e) {
    super(msg, e);
  }

  public SchemaNotFoundException(String msg) {
    super(msg);
  }
}