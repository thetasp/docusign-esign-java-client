package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AccountNotification. */
public class AccountNotification {
  @JsonProperty("expirations")
  private Expirations expirations = null;

  @JsonProperty("reminders")
  private Reminders reminders = null;

  @JsonProperty("userOverrideEnabled")
  private String userOverrideEnabled = null;

  /**
   * expirations.
   *
   * @return AccountNotification
   */
  public AccountNotification expirations(Expirations expirations) {
    this.expirations = expirations;
    return this;
  }

  /**
   * Get expirations.
   *
   * @return expirations
   */
  @ApiModelProperty(value = "")
  public Expirations getExpirations() {
    return expirations;
  }

  /** setExpirations. */
  public void setExpirations(Expirations expirations) {
    this.expirations = expirations;
  }

  /**
   * reminders.
   *
   * @return AccountNotification
   */
  public AccountNotification reminders(Reminders reminders) {
    this.reminders = reminders;
    return this;
  }

  /**
   * Get reminders.
   *
   * @return reminders
   */
  @ApiModelProperty(value = "")
  public Reminders getReminders() {
    return reminders;
  }

  /** setReminders. */
  public void setReminders(Reminders reminders) {
    this.reminders = reminders;
  }

  /**
   * userOverrideEnabled.
   *
   * @return AccountNotification
   */
  public AccountNotification userOverrideEnabled(String userOverrideEnabled) {
    this.userOverrideEnabled = userOverrideEnabled;
    return this;
  }

  /**
   * .
   *
   * @return userOverrideEnabled
   */
  @ApiModelProperty(value = "")
  public String getUserOverrideEnabled() {
    return userOverrideEnabled;
  }

  /** setUserOverrideEnabled. */
  public void setUserOverrideEnabled(String userOverrideEnabled) {
    this.userOverrideEnabled = userOverrideEnabled;
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
    AccountNotification accountNotification = (AccountNotification) o;
    return Objects.equals(this.expirations, accountNotification.expirations)
        && Objects.equals(this.reminders, accountNotification.reminders)
        && Objects.equals(this.userOverrideEnabled, accountNotification.userOverrideEnabled);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(expirations, reminders, userOverrideEnabled);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountNotification {\n");

    sb.append("    expirations: ").append(toIndentedString(expirations)).append("\n");
    sb.append("    reminders: ").append(toIndentedString(reminders)).append("\n");
    sb.append("    userOverrideEnabled: ")
        .append(toIndentedString(userOverrideEnabled))
        .append("\n");
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
