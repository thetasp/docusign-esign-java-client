package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** BulkRecipientTabLabel. */
public class BulkRecipientTabLabel {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  /**
   * name.
   *
   * @return BulkRecipientTabLabel
   */
  public BulkRecipientTabLabel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /** setName. */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * value.
   *
   * @return BulkRecipientTabLabel
   */
  public BulkRecipientTabLabel value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Specifies the value of the tab. .
   *
   * @return value
   */
  @ApiModelProperty(value = "Specifies the value of the tab. ")
  public String getValue() {
    return value;
  }

  /** setValue. */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkRecipientTabLabel bulkRecipientTabLabel = (BulkRecipientTabLabel) o;
    return Objects.equals(this.name, bulkRecipientTabLabel.name)
        && Objects.equals(this.value, bulkRecipientTabLabel.value);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRecipientTabLabel {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
