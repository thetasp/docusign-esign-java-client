package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** RecipientProofFile. */
public class RecipientProofFile {
  @JsonProperty("hasIdentityAttempts")
  private String hasIdentityAttempts = null;

  @JsonProperty("isInProofFile")
  private String isInProofFile = null;

  /**
   * hasIdentityAttempts.
   *
   * @return RecipientProofFile
   */
  public RecipientProofFile hasIdentityAttempts(String hasIdentityAttempts) {
    this.hasIdentityAttempts = hasIdentityAttempts;
    return this;
  }

  /**
   * .
   *
   * @return hasIdentityAttempts
   */
  @ApiModelProperty(value = "")
  public String getHasIdentityAttempts() {
    return hasIdentityAttempts;
  }

  /** setHasIdentityAttempts. */
  public void setHasIdentityAttempts(String hasIdentityAttempts) {
    this.hasIdentityAttempts = hasIdentityAttempts;
  }

  /**
   * isInProofFile.
   *
   * @return RecipientProofFile
   */
  public RecipientProofFile isInProofFile(String isInProofFile) {
    this.isInProofFile = isInProofFile;
    return this;
  }

  /**
   * .
   *
   * @return isInProofFile
   */
  @ApiModelProperty(value = "")
  public String getIsInProofFile() {
    return isInProofFile;
  }

  /** setIsInProofFile. */
  public void setIsInProofFile(String isInProofFile) {
    this.isInProofFile = isInProofFile;
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
    RecipientProofFile recipientProofFile = (RecipientProofFile) o;
    return Objects.equals(this.hasIdentityAttempts, recipientProofFile.hasIdentityAttempts)
        && Objects.equals(this.isInProofFile, recipientProofFile.isInProofFile);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(hasIdentityAttempts, isInProofFile);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientProofFile {\n");

    sb.append("    hasIdentityAttempts: ")
        .append(toIndentedString(hasIdentityAttempts))
        .append("\n");
    sb.append("    isInProofFile: ").append(toIndentedString(isInProofFile)).append("\n");
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
