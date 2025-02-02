package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NewAccountDefinition. */
public class NewAccountDefinition {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("accountSettings")
  private AccountSettingsInformation accountSettings = null;

  @JsonProperty("addressInformation")
  private AccountAddress addressInformation = null;

  @JsonProperty("creditCardInformation")
  private CreditCardInformation creditCardInformation = null;

  @JsonProperty("directDebitProcessorInformation")
  private DirectDebitProcessorInformation directDebitProcessorInformation = null;

  @JsonProperty("distributorCode")
  private String distributorCode = null;

  @JsonProperty("distributorPassword")
  private String distributorPassword = null;

  @JsonProperty("enablePreAuth")
  private String enablePreAuth = null;

  @JsonProperty("envelopePartitionId")
  private String envelopePartitionId = null;

  @JsonProperty("initialUser")
  private UserInformation initialUser = null;

  @JsonProperty("paymentMethod")
  private String paymentMethod = null;

  @JsonProperty("paymentProcessorInformation")
  private PaymentProcessorInformation paymentProcessorInformation = null;

  @JsonProperty("planInformation")
  private PlanInformation planInformation = null;

  @JsonProperty("processPayment")
  private String processPayment = null;

  @JsonProperty("referralInformation")
  private ReferralInformation referralInformation = null;

  @JsonProperty("socialAccountInformation")
  private SocialAccountInformation socialAccountInformation = null;

  @JsonProperty("taxExemptId")
  private String taxExemptId = null;

  /**
   * accountName.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * The account name for the new account..
   *
   * @return accountName
   */
  @ApiModelProperty(value = "The account name for the new account.")
  public String getAccountName() {
    return accountName;
  }

  /** setAccountName. */
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * accountSettings.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition accountSettings(AccountSettingsInformation accountSettings) {
    this.accountSettings = accountSettings;
    return this;
  }

  /**
   * Get accountSettings.
   *
   * @return accountSettings
   */
  @ApiModelProperty(value = "")
  public AccountSettingsInformation getAccountSettings() {
    return accountSettings;
  }

  /** setAccountSettings. */
  public void setAccountSettings(AccountSettingsInformation accountSettings) {
    this.accountSettings = accountSettings;
  }

  /**
   * addressInformation.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition addressInformation(AccountAddress addressInformation) {
    this.addressInformation = addressInformation;
    return this;
  }

  /**
   * Get addressInformation.
   *
   * @return addressInformation
   */
  @ApiModelProperty(value = "")
  public AccountAddress getAddressInformation() {
    return addressInformation;
  }

  /** setAddressInformation. */
  public void setAddressInformation(AccountAddress addressInformation) {
    this.addressInformation = addressInformation;
  }

  /**
   * creditCardInformation.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition creditCardInformation(CreditCardInformation creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
    return this;
  }

  /**
   * Get creditCardInformation.
   *
   * @return creditCardInformation
   */
  @ApiModelProperty(value = "")
  public CreditCardInformation getCreditCardInformation() {
    return creditCardInformation;
  }

  /** setCreditCardInformation. */
  public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
  }

  /**
   * directDebitProcessorInformation.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition directDebitProcessorInformation(
      DirectDebitProcessorInformation directDebitProcessorInformation) {
    this.directDebitProcessorInformation = directDebitProcessorInformation;
    return this;
  }

  /**
   * Get directDebitProcessorInformation.
   *
   * @return directDebitProcessorInformation
   */
  @ApiModelProperty(value = "")
  public DirectDebitProcessorInformation getDirectDebitProcessorInformation() {
    return directDebitProcessorInformation;
  }

  /** setDirectDebitProcessorInformation. */
  public void setDirectDebitProcessorInformation(
      DirectDebitProcessorInformation directDebitProcessorInformation) {
    this.directDebitProcessorInformation = directDebitProcessorInformation;
  }

  /**
   * distributorCode.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition distributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
    return this;
  }

  /**
   * The code that identifies the billing plan groups and plans for the new account..
   *
   * @return distributorCode
   */
  @ApiModelProperty(
      value = "The code that identifies the billing plan groups and plans for the new account.")
  public String getDistributorCode() {
    return distributorCode;
  }

  /** setDistributorCode. */
  public void setDistributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
  }

  /**
   * distributorPassword.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition distributorPassword(String distributorPassword) {
    this.distributorPassword = distributorPassword;
    return this;
  }

  /**
   * The password for the distributorCode..
   *
   * @return distributorPassword
   */
  @ApiModelProperty(value = "The password for the distributorCode.")
  public String getDistributorPassword() {
    return distributorPassword;
  }

  /** setDistributorPassword. */
  public void setDistributorPassword(String distributorPassword) {
    this.distributorPassword = distributorPassword;
  }

  /**
   * enablePreAuth.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition enablePreAuth(String enablePreAuth) {
    this.enablePreAuth = enablePreAuth;
    return this;
  }

  /**
   * .
   *
   * @return enablePreAuth
   */
  @ApiModelProperty(value = "")
  public String getEnablePreAuth() {
    return enablePreAuth;
  }

  /** setEnablePreAuth. */
  public void setEnablePreAuth(String enablePreAuth) {
    this.enablePreAuth = enablePreAuth;
  }

  /**
   * envelopePartitionId.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition envelopePartitionId(String envelopePartitionId) {
    this.envelopePartitionId = envelopePartitionId;
    return this;
  }

  /**
   * .
   *
   * @return envelopePartitionId
   */
  @ApiModelProperty(value = "")
  public String getEnvelopePartitionId() {
    return envelopePartitionId;
  }

  /** setEnvelopePartitionId. */
  public void setEnvelopePartitionId(String envelopePartitionId) {
    this.envelopePartitionId = envelopePartitionId;
  }

  /**
   * initialUser.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition initialUser(UserInformation initialUser) {
    this.initialUser = initialUser;
    return this;
  }

  /**
   * Get initialUser.
   *
   * @return initialUser
   */
  @ApiModelProperty(value = "")
  public UserInformation getInitialUser() {
    return initialUser;
  }

  /** setInitialUser. */
  public void setInitialUser(UserInformation initialUser) {
    this.initialUser = initialUser;
  }

  /**
   * paymentMethod.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * .
   *
   * @return paymentMethod
   */
  @ApiModelProperty(value = "")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  /** setPaymentMethod. */
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /**
   * paymentProcessorInformation.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition paymentProcessorInformation(
      PaymentProcessorInformation paymentProcessorInformation) {
    this.paymentProcessorInformation = paymentProcessorInformation;
    return this;
  }

  /**
   * Get paymentProcessorInformation.
   *
   * @return paymentProcessorInformation
   */
  @ApiModelProperty(value = "")
  public PaymentProcessorInformation getPaymentProcessorInformation() {
    return paymentProcessorInformation;
  }

  /** setPaymentProcessorInformation. */
  public void setPaymentProcessorInformation(
      PaymentProcessorInformation paymentProcessorInformation) {
    this.paymentProcessorInformation = paymentProcessorInformation;
  }

  /**
   * planInformation.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition planInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
    return this;
  }

  /**
   * Get planInformation.
   *
   * @return planInformation
   */
  @ApiModelProperty(value = "")
  public PlanInformation getPlanInformation() {
    return planInformation;
  }

  /** setPlanInformation. */
  public void setPlanInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
  }

  /**
   * processPayment.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition processPayment(String processPayment) {
    this.processPayment = processPayment;
    return this;
  }

  /**
   * .
   *
   * @return processPayment
   */
  @ApiModelProperty(value = "")
  public String getProcessPayment() {
    return processPayment;
  }

  /** setProcessPayment. */
  public void setProcessPayment(String processPayment) {
    this.processPayment = processPayment;
  }

  /**
   * referralInformation.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition referralInformation(ReferralInformation referralInformation) {
    this.referralInformation = referralInformation;
    return this;
  }

  /**
   * Get referralInformation.
   *
   * @return referralInformation
   */
  @ApiModelProperty(value = "")
  public ReferralInformation getReferralInformation() {
    return referralInformation;
  }

  /** setReferralInformation. */
  public void setReferralInformation(ReferralInformation referralInformation) {
    this.referralInformation = referralInformation;
  }

  /**
   * socialAccountInformation.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition socialAccountInformation(
      SocialAccountInformation socialAccountInformation) {
    this.socialAccountInformation = socialAccountInformation;
    return this;
  }

  /**
   * Get socialAccountInformation.
   *
   * @return socialAccountInformation
   */
  @ApiModelProperty(value = "")
  public SocialAccountInformation getSocialAccountInformation() {
    return socialAccountInformation;
  }

  /** setSocialAccountInformation. */
  public void setSocialAccountInformation(SocialAccountInformation socialAccountInformation) {
    this.socialAccountInformation = socialAccountInformation;
  }

  /**
   * taxExemptId.
   *
   * @return NewAccountDefinition
   */
  public NewAccountDefinition taxExemptId(String taxExemptId) {
    this.taxExemptId = taxExemptId;
    return this;
  }

  /**
   * .
   *
   * @return taxExemptId
   */
  @ApiModelProperty(value = "")
  public String getTaxExemptId() {
    return taxExemptId;
  }

  /** setTaxExemptId. */
  public void setTaxExemptId(String taxExemptId) {
    this.taxExemptId = taxExemptId;
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
    NewAccountDefinition newAccountDefinition = (NewAccountDefinition) o;
    return Objects.equals(this.accountName, newAccountDefinition.accountName)
        && Objects.equals(this.accountSettings, newAccountDefinition.accountSettings)
        && Objects.equals(this.addressInformation, newAccountDefinition.addressInformation)
        && Objects.equals(this.creditCardInformation, newAccountDefinition.creditCardInformation)
        && Objects.equals(
            this.directDebitProcessorInformation,
            newAccountDefinition.directDebitProcessorInformation)
        && Objects.equals(this.distributorCode, newAccountDefinition.distributorCode)
        && Objects.equals(this.distributorPassword, newAccountDefinition.distributorPassword)
        && Objects.equals(this.enablePreAuth, newAccountDefinition.enablePreAuth)
        && Objects.equals(this.envelopePartitionId, newAccountDefinition.envelopePartitionId)
        && Objects.equals(this.initialUser, newAccountDefinition.initialUser)
        && Objects.equals(this.paymentMethod, newAccountDefinition.paymentMethod)
        && Objects.equals(
            this.paymentProcessorInformation, newAccountDefinition.paymentProcessorInformation)
        && Objects.equals(this.planInformation, newAccountDefinition.planInformation)
        && Objects.equals(this.processPayment, newAccountDefinition.processPayment)
        && Objects.equals(this.referralInformation, newAccountDefinition.referralInformation)
        && Objects.equals(
            this.socialAccountInformation, newAccountDefinition.socialAccountInformation)
        && Objects.equals(this.taxExemptId, newAccountDefinition.taxExemptId);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        accountName,
        accountSettings,
        addressInformation,
        creditCardInformation,
        directDebitProcessorInformation,
        distributorCode,
        distributorPassword,
        enablePreAuth,
        envelopePartitionId,
        initialUser,
        paymentMethod,
        paymentProcessorInformation,
        planInformation,
        processPayment,
        referralInformation,
        socialAccountInformation,
        taxExemptId);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAccountDefinition {\n");

    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountSettings: ").append(toIndentedString(accountSettings)).append("\n");
    sb.append("    addressInformation: ").append(toIndentedString(addressInformation)).append("\n");
    sb.append("    creditCardInformation: ")
        .append(toIndentedString(creditCardInformation))
        .append("\n");
    sb.append("    directDebitProcessorInformation: ")
        .append(toIndentedString(directDebitProcessorInformation))
        .append("\n");
    sb.append("    distributorCode: ").append(toIndentedString(distributorCode)).append("\n");
    sb.append("    distributorPassword: ")
        .append(toIndentedString(distributorPassword))
        .append("\n");
    sb.append("    enablePreAuth: ").append(toIndentedString(enablePreAuth)).append("\n");
    sb.append("    envelopePartitionId: ")
        .append(toIndentedString(envelopePartitionId))
        .append("\n");
    sb.append("    initialUser: ").append(toIndentedString(initialUser)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentProcessorInformation: ")
        .append(toIndentedString(paymentProcessorInformation))
        .append("\n");
    sb.append("    planInformation: ").append(toIndentedString(planInformation)).append("\n");
    sb.append("    processPayment: ").append(toIndentedString(processPayment)).append("\n");
    sb.append("    referralInformation: ")
        .append(toIndentedString(referralInformation))
        .append("\n");
    sb.append("    socialAccountInformation: ")
        .append(toIndentedString(socialAccountInformation))
        .append("\n");
    sb.append("    taxExemptId: ").append(toIndentedString(taxExemptId)).append("\n");
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
