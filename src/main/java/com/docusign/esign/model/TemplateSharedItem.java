package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TemplateSharedItem. */
public class TemplateSharedItem {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("owner")
  private UserInfo owner = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("sharedGroups")
  private java.util.List<MemberGroupSharedItem> sharedGroups = null;

  @JsonProperty("sharedUsers")
  private java.util.List<UserSharedItem> sharedUsers = null;

  @JsonProperty("templateId")
  private String templateId = null;

  @JsonProperty("templateName")
  private String templateName = null;

  /**
   * errorDetails.
   *
   * @return TemplateSharedItem
   */
  public TemplateSharedItem errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   *
   * @return errorDetails
   */
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /** setErrorDetails. */
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  /**
   * owner.
   *
   * @return TemplateSharedItem
   */
  public TemplateSharedItem owner(UserInfo owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner.
   *
   * @return owner
   */
  @ApiModelProperty(value = "")
  public UserInfo getOwner() {
    return owner;
  }

  /** setOwner. */
  public void setOwner(UserInfo owner) {
    this.owner = owner;
  }

  /**
   * password.
   *
   * @return TemplateSharedItem
   */
  public TemplateSharedItem password(String password) {
    this.password = password;
    return this;
  }

  /**
   * .
   *
   * @return password
   */
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  /** setPassword. */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * shared.
   *
   * @return TemplateSharedItem
   */
  public TemplateSharedItem shared(String shared) {
    this.shared = shared;
    return this;
  }

  /**
   * When set to **true**, this custom tab is shared..
   *
   * @return shared
   */
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  /** setShared. */
  public void setShared(String shared) {
    this.shared = shared;
  }

  /**
   * sharedGroups.
   *
   * @return TemplateSharedItem
   */
  public TemplateSharedItem sharedGroups(java.util.List<MemberGroupSharedItem> sharedGroups) {
    this.sharedGroups = sharedGroups;
    return this;
  }

  /**
   * addSharedGroupsItem.
   *
   * @return TemplateSharedItem
   */
  public TemplateSharedItem addSharedGroupsItem(MemberGroupSharedItem sharedGroupsItem) {
    if (this.sharedGroups == null) {
      this.sharedGroups = new java.util.ArrayList<>();
    }
    this.sharedGroups.add(sharedGroupsItem);
    return this;
  }

  /**
   * .
   *
   * @return sharedGroups
   */
  @ApiModelProperty(value = "")
  public java.util.List<MemberGroupSharedItem> getSharedGroups() {
    return sharedGroups;
  }

  /** setSharedGroups. */
  public void setSharedGroups(java.util.List<MemberGroupSharedItem> sharedGroups) {
    this.sharedGroups = sharedGroups;
  }

  /**
   * sharedUsers.
   *
   * @return TemplateSharedItem
   */
  public TemplateSharedItem sharedUsers(java.util.List<UserSharedItem> sharedUsers) {
    this.sharedUsers = sharedUsers;
    return this;
  }

  /**
   * addSharedUsersItem.
   *
   * @return TemplateSharedItem
   */
  public TemplateSharedItem addSharedUsersItem(UserSharedItem sharedUsersItem) {
    if (this.sharedUsers == null) {
      this.sharedUsers = new java.util.ArrayList<>();
    }
    this.sharedUsers.add(sharedUsersItem);
    return this;
  }

  /**
   * .
   *
   * @return sharedUsers
   */
  @ApiModelProperty(value = "")
  public java.util.List<UserSharedItem> getSharedUsers() {
    return sharedUsers;
  }

  /** setSharedUsers. */
  public void setSharedUsers(java.util.List<UserSharedItem> sharedUsers) {
    this.sharedUsers = sharedUsers;
  }

  /**
   * templateId.
   *
   * @return TemplateSharedItem
   */
  public TemplateSharedItem templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
   * .
   *
   * @return templateId
   */
  @ApiModelProperty(
      value =
          "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  /** setTemplateId. */
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  /**
   * templateName.
   *
   * @return TemplateSharedItem
   */
  public TemplateSharedItem templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

  /**
   * .
   *
   * @return templateName
   */
  @ApiModelProperty(value = "")
  public String getTemplateName() {
    return templateName;
  }

  /** setTemplateName. */
  public void setTemplateName(String templateName) {
    this.templateName = templateName;
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
    TemplateSharedItem templateSharedItem = (TemplateSharedItem) o;
    return Objects.equals(this.errorDetails, templateSharedItem.errorDetails)
        && Objects.equals(this.owner, templateSharedItem.owner)
        && Objects.equals(this.password, templateSharedItem.password)
        && Objects.equals(this.shared, templateSharedItem.shared)
        && Objects.equals(this.sharedGroups, templateSharedItem.sharedGroups)
        && Objects.equals(this.sharedUsers, templateSharedItem.sharedUsers)
        && Objects.equals(this.templateId, templateSharedItem.templateId)
        && Objects.equals(this.templateName, templateSharedItem.templateName);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        errorDetails, owner, password, shared, sharedGroups, sharedUsers, templateId, templateName);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateSharedItem {\n");

    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    sharedGroups: ").append(toIndentedString(sharedGroups)).append("\n");
    sb.append("    sharedUsers: ").append(toIndentedString(sharedUsers)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
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
