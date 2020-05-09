package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Relationship type to be used between POQ item or product
 */
public enum RelationshipType {
  
  RELIESON("reliesOn"),
  
  BUNDLED("bundled"),
  
  COMESFROM("comesFrom");

  private String value;

  RelationshipType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RelationshipType fromValue(String text) {
    for (RelationshipType b : RelationshipType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

