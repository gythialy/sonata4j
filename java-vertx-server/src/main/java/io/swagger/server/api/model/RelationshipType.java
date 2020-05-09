package io.swagger.server.api.model;

import java.util.Objects;

/**
 * Relationship type to be used between POQ item or product
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RelationshipType fromValue(String text) {
    for (RelationshipType b : RelationshipType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}