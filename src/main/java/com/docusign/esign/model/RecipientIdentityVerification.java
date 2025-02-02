package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** RecipientIdentityVerification. */
public class RecipientIdentityVerification {
  @JsonProperty("inputOptions")
  private java.util.List<RecipientIdentityInputOption> inputOptions = null;

  @JsonProperty("workflowId")
  private String workflowId = null;

  @JsonProperty("workflowIdMetadata")
  private PropertyMetadata workflowIdMetadata = null;

  /**
   * inputOptions.
   *
   * @return RecipientIdentityVerification
   */
  public RecipientIdentityVerification inputOptions(
      java.util.List<RecipientIdentityInputOption> inputOptions) {
    this.inputOptions = inputOptions;
    return this;
  }

  /**
   * addInputOptionsItem.
   *
   * @return RecipientIdentityVerification
   */
  public RecipientIdentityVerification addInputOptionsItem(
      RecipientIdentityInputOption inputOptionsItem) {
    if (this.inputOptions == null) {
      this.inputOptions = new java.util.ArrayList<>();
    }
    this.inputOptions.add(inputOptionsItem);
    return this;
  }

  /**
   * .
   *
   * @return inputOptions
   */
  @ApiModelProperty(value = "")
  public java.util.List<RecipientIdentityInputOption> getInputOptions() {
    return inputOptions;
  }

  /** setInputOptions. */
  public void setInputOptions(java.util.List<RecipientIdentityInputOption> inputOptions) {
    this.inputOptions = inputOptions;
  }

  /**
   * workflowId.
   *
   * @return RecipientIdentityVerification
   */
  public RecipientIdentityVerification workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

  /**
   * .
   *
   * @return workflowId
   */
  @ApiModelProperty(value = "")
  public String getWorkflowId() {
    return workflowId;
  }

  /** setWorkflowId. */
  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }

  /**
   * workflowIdMetadata.
   *
   * @return RecipientIdentityVerification
   */
  public RecipientIdentityVerification workflowIdMetadata(PropertyMetadata workflowIdMetadata) {
    this.workflowIdMetadata = workflowIdMetadata;
    return this;
  }

  /**
   * Get workflowIdMetadata.
   *
   * @return workflowIdMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getWorkflowIdMetadata() {
    return workflowIdMetadata;
  }

  /** setWorkflowIdMetadata. */
  public void setWorkflowIdMetadata(PropertyMetadata workflowIdMetadata) {
    this.workflowIdMetadata = workflowIdMetadata;
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
    RecipientIdentityVerification recipientIdentityVerification = (RecipientIdentityVerification) o;
    return Objects.equals(this.inputOptions, recipientIdentityVerification.inputOptions)
        && Objects.equals(this.workflowId, recipientIdentityVerification.workflowId)
        && Objects.equals(
            this.workflowIdMetadata, recipientIdentityVerification.workflowIdMetadata);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(inputOptions, workflowId, workflowIdMetadata);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientIdentityVerification {\n");

    sb.append("    inputOptions: ").append(toIndentedString(inputOptions)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    workflowIdMetadata: ").append(toIndentedString(workflowIdMetadata)).append("\n");
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
