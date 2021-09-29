package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PrefillFormData.
 *
 */

public class PrefillFormData {
  @JsonProperty("formData")
  private java.util.List<NameValue> formData = null;

  @JsonProperty("senderEmail")
  private String senderEmail = null;

  @JsonProperty("senderName")
  private String senderName = null;

  @JsonProperty("senderUserId")
  private String senderUserId = null;


  /**
   * formData.
   *
   * @return PrefillFormData
   **/
  public PrefillFormData formData(java.util.List<NameValue> formData) {
    this.formData = formData;
    return this;
  }
  
  /**
   * addFormDataItem.
   *
   * @return PrefillFormData
   **/
  public PrefillFormData addFormDataItem(NameValue formDataItem) {
    if (this.formData == null) {
      this.formData = new java.util.ArrayList<NameValue>();
    }
    this.formData.add(formDataItem);
    return this;
  }

  /**
   * .
   * @return formData
   **/
  @ApiModelProperty(value = "")
  public java.util.List<NameValue> getFormData() {
    return formData;
  }

  /**
   * setFormData.
   **/
  public void setFormData(java.util.List<NameValue> formData) {
    this.formData = formData;
  }


  /**
   * senderEmail.
   *
   * @return PrefillFormData
   **/
  public PrefillFormData senderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

  /**
   * .
   * @return senderEmail
   **/
  @ApiModelProperty(value = "")
  public String getSenderEmail() {
    return senderEmail;
  }

  /**
   * setSenderEmail.
   **/
  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }


  /**
   * senderName.
   *
   * @return PrefillFormData
   **/
  public PrefillFormData senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

  /**
   * .
   * @return senderName
   **/
  @ApiModelProperty(value = "")
  public String getSenderName() {
    return senderName;
  }

  /**
   * setSenderName.
   **/
  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }


  /**
   * senderUserId.
   *
   * @return PrefillFormData
   **/
  public PrefillFormData senderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
    return this;
  }

  /**
   * .
   * @return senderUserId
   **/
  @ApiModelProperty(value = "")
  public String getSenderUserId() {
    return senderUserId;
  }

  /**
   * setSenderUserId.
   **/
  public void setSenderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
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
    PrefillFormData prefillFormData = (PrefillFormData) o;
    return Objects.equals(this.formData, prefillFormData.formData) &&
        Objects.equals(this.senderEmail, prefillFormData.senderEmail) &&
        Objects.equals(this.senderName, prefillFormData.senderName) &&
        Objects.equals(this.senderUserId, prefillFormData.senderUserId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(formData, senderEmail, senderName, senderUserId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefillFormData {\n");
    
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    senderUserId: ").append(toIndentedString(senderUserId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
