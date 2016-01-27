package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.SenderEmailNotifications;
import com.docusign.esign.model.SignerEmailNotifications;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-18T16:25:36.433-08:00")
public class UserSettingsInformation   {
  
  private java.util.List<NameValue> userSettings = new java.util.ArrayList<NameValue>();
  private SignerEmailNotifications signerEmailNotifications = null;
  private SenderEmailNotifications senderEmailNotifications = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userSettings")
  public java.util.List<NameValue> getUserSettings() {
    return userSettings;
  }
  public void setUserSettings(java.util.List<NameValue> userSettings) {
    this.userSettings = userSettings;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signerEmailNotifications")
  public SignerEmailNotifications getSignerEmailNotifications() {
    return signerEmailNotifications;
  }
  public void setSignerEmailNotifications(SignerEmailNotifications signerEmailNotifications) {
    this.signerEmailNotifications = signerEmailNotifications;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("senderEmailNotifications")
  public SenderEmailNotifications getSenderEmailNotifications() {
    return senderEmailNotifications;
  }
  public void setSenderEmailNotifications(SenderEmailNotifications senderEmailNotifications) {
    this.senderEmailNotifications = senderEmailNotifications;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSettingsInformation userSettingsInformation = (UserSettingsInformation) o;

    return true && Objects.equals(userSettings, userSettingsInformation.userSettings) &&
        Objects.equals(signerEmailNotifications, userSettingsInformation.signerEmailNotifications) &&
        Objects.equals(senderEmailNotifications, userSettingsInformation.senderEmailNotifications)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(userSettings, signerEmailNotifications, senderEmailNotifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSettingsInformation {\n");
    
    sb.append("    userSettings: ").append(toIndentedString(userSettings)).append("\n");
    sb.append("    signerEmailNotifications: ").append(toIndentedString(signerEmailNotifications)).append("\n");
    sb.append("    senderEmailNotifications: ").append(toIndentedString(senderEmailNotifications)).append("\n");
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

