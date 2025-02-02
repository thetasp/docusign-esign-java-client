package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TabGroup. */
public class TabGroup {
  @JsonProperty("anchorAllowWhiteSpaceInCharacters")
  private String anchorAllowWhiteSpaceInCharacters = null;

  @JsonProperty("anchorAllowWhiteSpaceInCharactersMetadata")
  private PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata = null;

  @JsonProperty("anchorCaseSensitive")
  private String anchorCaseSensitive = null;

  @JsonProperty("anchorCaseSensitiveMetadata")
  private PropertyMetadata anchorCaseSensitiveMetadata = null;

  @JsonProperty("anchorHorizontalAlignment")
  private String anchorHorizontalAlignment = null;

  @JsonProperty("anchorHorizontalAlignmentMetadata")
  private PropertyMetadata anchorHorizontalAlignmentMetadata = null;

  @JsonProperty("anchorIgnoreIfNotPresent")
  private String anchorIgnoreIfNotPresent = null;

  @JsonProperty("anchorIgnoreIfNotPresentMetadata")
  private PropertyMetadata anchorIgnoreIfNotPresentMetadata = null;

  @JsonProperty("anchorMatchWholeWord")
  private String anchorMatchWholeWord = null;

  @JsonProperty("anchorMatchWholeWordMetadata")
  private PropertyMetadata anchorMatchWholeWordMetadata = null;

  @JsonProperty("anchorString")
  private String anchorString = null;

  @JsonProperty("anchorStringMetadata")
  private PropertyMetadata anchorStringMetadata = null;

  @JsonProperty("anchorTabProcessorVersion")
  private String anchorTabProcessorVersion = null;

  @JsonProperty("anchorTabProcessorVersionMetadata")
  private PropertyMetadata anchorTabProcessorVersionMetadata = null;

  @JsonProperty("anchorUnits")
  private String anchorUnits = null;

  @JsonProperty("anchorUnitsMetadata")
  private PropertyMetadata anchorUnitsMetadata = null;

  @JsonProperty("anchorXOffset")
  private String anchorXOffset = null;

  @JsonProperty("anchorXOffsetMetadata")
  private PropertyMetadata anchorXOffsetMetadata = null;

  @JsonProperty("anchorYOffset")
  private String anchorYOffset = null;

  @JsonProperty("anchorYOffsetMetadata")
  private PropertyMetadata anchorYOffsetMetadata = null;

  @JsonProperty("caption")
  private String caption = null;

  @JsonProperty("captionMetadata")
  private PropertyMetadata captionMetadata = null;

  @JsonProperty("conditionalParentLabel")
  private String conditionalParentLabel = null;

  @JsonProperty("conditionalParentLabelMetadata")
  private PropertyMetadata conditionalParentLabelMetadata = null;

  @JsonProperty("conditionalParentValue")
  private String conditionalParentValue = null;

  @JsonProperty("conditionalParentValueMetadata")
  private PropertyMetadata conditionalParentValueMetadata = null;

  @JsonProperty("customTabId")
  private String customTabId = null;

  @JsonProperty("customTabIdMetadata")
  private PropertyMetadata customTabIdMetadata = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentIdMetadata")
  private PropertyMetadata documentIdMetadata = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("formOrder")
  private String formOrder = null;

  @JsonProperty("formOrderMetadata")
  private PropertyMetadata formOrderMetadata = null;

  @JsonProperty("formPageLabel")
  private String formPageLabel = null;

  @JsonProperty("formPageLabelMetadata")
  private PropertyMetadata formPageLabelMetadata = null;

  @JsonProperty("formPageNumber")
  private String formPageNumber = null;

  @JsonProperty("formPageNumberMetadata")
  private PropertyMetadata formPageNumberMetadata = null;

  @JsonProperty("groupLabel")
  private String groupLabel = null;

  @JsonProperty("groupLabelMetadata")
  private PropertyMetadata groupLabelMetadata = null;

  @JsonProperty("groupRule")
  private String groupRule = null;

  @JsonProperty("groupRuleMetadata")
  private PropertyMetadata groupRuleMetadata = null;

  @JsonProperty("height")
  private String height = null;

  @JsonProperty("heightMetadata")
  private PropertyMetadata heightMetadata = null;

  @JsonProperty("maximumAllowed")
  private String maximumAllowed = null;

  @JsonProperty("maximumAllowedMetadata")
  private PropertyMetadata maximumAllowedMetadata = null;

  @JsonProperty("mergeField")
  private MergeField mergeField = null;

  @JsonProperty("mergeFieldXml")
  private String mergeFieldXml = null;

  @JsonProperty("minimumRequired")
  private String minimumRequired = null;

  @JsonProperty("minimumRequiredMetadata")
  private PropertyMetadata minimumRequiredMetadata = null;

  @JsonProperty("pageNumber")
  private String pageNumber = null;

  @JsonProperty("pageNumberMetadata")
  private PropertyMetadata pageNumberMetadata = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientIdGuid")
  private String recipientIdGuid = null;

  @JsonProperty("recipientIdGuidMetadata")
  private PropertyMetadata recipientIdGuidMetadata = null;

  @JsonProperty("recipientIdMetadata")
  private PropertyMetadata recipientIdMetadata = null;

  @JsonProperty("smartContractInformation")
  private SmartContractInformation smartContractInformation = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusMetadata")
  private PropertyMetadata statusMetadata = null;

  @JsonProperty("tabGroupLabels")
  private java.util.List<String> tabGroupLabels = null;

  @JsonProperty("tabGroupLabelsMetadata")
  private PropertyMetadata tabGroupLabelsMetadata = null;

  @JsonProperty("tabId")
  private String tabId = null;

  @JsonProperty("tabIdMetadata")
  private PropertyMetadata tabIdMetadata = null;

  @JsonProperty("tabOrder")
  private String tabOrder = null;

  @JsonProperty("tabOrderMetadata")
  private PropertyMetadata tabOrderMetadata = null;

  @JsonProperty("tabScope")
  private String tabScope = null;

  @JsonProperty("tabScopeMetadata")
  private PropertyMetadata tabScopeMetadata = null;

  @JsonProperty("tabType")
  private String tabType = null;

  @JsonProperty("tabTypeMetadata")
  private PropertyMetadata tabTypeMetadata = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateLockedMetadata")
  private PropertyMetadata templateLockedMetadata = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("templateRequiredMetadata")
  private PropertyMetadata templateRequiredMetadata = null;

  @JsonProperty("tooltip")
  private String tooltip = null;

  @JsonProperty("toolTipMetadata")
  private PropertyMetadata toolTipMetadata = null;

  @JsonProperty("validationMessage")
  private String validationMessage = null;

  @JsonProperty("validationMessageMetadata")
  private PropertyMetadata validationMessageMetadata = null;

  @JsonProperty("width")
  private String width = null;

  @JsonProperty("widthMetadata")
  private PropertyMetadata widthMetadata = null;

  @JsonProperty("xPosition")
  private String xPosition = null;

  @JsonProperty("xPositionMetadata")
  private PropertyMetadata xPositionMetadata = null;

  @JsonProperty("yPosition")
  private String yPosition = null;

  @JsonProperty("yPositionMetadata")
  private PropertyMetadata yPositionMetadata = null;

  /**
   * anchorAllowWhiteSpaceInCharacters.
   *
   * @return TabGroup
   */
  public TabGroup anchorAllowWhiteSpaceInCharacters(String anchorAllowWhiteSpaceInCharacters) {
    this.anchorAllowWhiteSpaceInCharacters = anchorAllowWhiteSpaceInCharacters;
    return this;
  }

  /**
   * .
   *
   * @return anchorAllowWhiteSpaceInCharacters
   */
  @ApiModelProperty(value = "")
  public String getAnchorAllowWhiteSpaceInCharacters() {
    return anchorAllowWhiteSpaceInCharacters;
  }

  /** setAnchorAllowWhiteSpaceInCharacters. */
  public void setAnchorAllowWhiteSpaceInCharacters(String anchorAllowWhiteSpaceInCharacters) {
    this.anchorAllowWhiteSpaceInCharacters = anchorAllowWhiteSpaceInCharacters;
  }

  /**
   * anchorAllowWhiteSpaceInCharactersMetadata.
   *
   * @return TabGroup
   */
  public TabGroup anchorAllowWhiteSpaceInCharactersMetadata(
      PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata) {
    this.anchorAllowWhiteSpaceInCharactersMetadata = anchorAllowWhiteSpaceInCharactersMetadata;
    return this;
  }

  /**
   * Get anchorAllowWhiteSpaceInCharactersMetadata.
   *
   * @return anchorAllowWhiteSpaceInCharactersMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorAllowWhiteSpaceInCharactersMetadata() {
    return anchorAllowWhiteSpaceInCharactersMetadata;
  }

  /** setAnchorAllowWhiteSpaceInCharactersMetadata. */
  public void setAnchorAllowWhiteSpaceInCharactersMetadata(
      PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata) {
    this.anchorAllowWhiteSpaceInCharactersMetadata = anchorAllowWhiteSpaceInCharactersMetadata;
  }

  /**
   * anchorCaseSensitive.
   *
   * @return TabGroup
   */
  public TabGroup anchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
    return this;
  }

  /**
   * When set to **true**, the anchor string does not consider case when matching strings in the
   * document. The default value is **true**..
   *
   * @return anchorCaseSensitive
   */
  @ApiModelProperty(
      value =
          "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
  public String getAnchorCaseSensitive() {
    return anchorCaseSensitive;
  }

  /** setAnchorCaseSensitive. */
  public void setAnchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
  }

  /**
   * anchorCaseSensitiveMetadata.
   *
   * @return TabGroup
   */
  public TabGroup anchorCaseSensitiveMetadata(PropertyMetadata anchorCaseSensitiveMetadata) {
    this.anchorCaseSensitiveMetadata = anchorCaseSensitiveMetadata;
    return this;
  }

  /**
   * Get anchorCaseSensitiveMetadata.
   *
   * @return anchorCaseSensitiveMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorCaseSensitiveMetadata() {
    return anchorCaseSensitiveMetadata;
  }

  /** setAnchorCaseSensitiveMetadata. */
  public void setAnchorCaseSensitiveMetadata(PropertyMetadata anchorCaseSensitiveMetadata) {
    this.anchorCaseSensitiveMetadata = anchorCaseSensitiveMetadata;
  }

  /**
   * anchorHorizontalAlignment.
   *
   * @return TabGroup
   */
  public TabGroup anchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
    return this;
  }

  /**
   * Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or
   * **right**. The default value is **left**..
   *
   * @return anchorHorizontalAlignment
   */
  @ApiModelProperty(
      value =
          "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
  public String getAnchorHorizontalAlignment() {
    return anchorHorizontalAlignment;
  }

  /** setAnchorHorizontalAlignment. */
  public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
  }

  /**
   * anchorHorizontalAlignmentMetadata.
   *
   * @return TabGroup
   */
  public TabGroup anchorHorizontalAlignmentMetadata(
      PropertyMetadata anchorHorizontalAlignmentMetadata) {
    this.anchorHorizontalAlignmentMetadata = anchorHorizontalAlignmentMetadata;
    return this;
  }

  /**
   * Get anchorHorizontalAlignmentMetadata.
   *
   * @return anchorHorizontalAlignmentMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorHorizontalAlignmentMetadata() {
    return anchorHorizontalAlignmentMetadata;
  }

  /** setAnchorHorizontalAlignmentMetadata. */
  public void setAnchorHorizontalAlignmentMetadata(
      PropertyMetadata anchorHorizontalAlignmentMetadata) {
    this.anchorHorizontalAlignmentMetadata = anchorHorizontalAlignmentMetadata;
  }

  /**
   * anchorIgnoreIfNotPresent.
   *
   * @return TabGroup
   */
  public TabGroup anchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    return this;
  }

  /**
   * When set to **true**, this tab is ignored if anchorString is not found in the document..
   *
   * @return anchorIgnoreIfNotPresent
   */
  @ApiModelProperty(
      value =
          "When set to **true**, this tab is ignored if anchorString is not found in the document.")
  public String getAnchorIgnoreIfNotPresent() {
    return anchorIgnoreIfNotPresent;
  }

  /** setAnchorIgnoreIfNotPresent. */
  public void setAnchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
  }

  /**
   * anchorIgnoreIfNotPresentMetadata.
   *
   * @return TabGroup
   */
  public TabGroup anchorIgnoreIfNotPresentMetadata(
      PropertyMetadata anchorIgnoreIfNotPresentMetadata) {
    this.anchorIgnoreIfNotPresentMetadata = anchorIgnoreIfNotPresentMetadata;
    return this;
  }

  /**
   * Get anchorIgnoreIfNotPresentMetadata.
   *
   * @return anchorIgnoreIfNotPresentMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorIgnoreIfNotPresentMetadata() {
    return anchorIgnoreIfNotPresentMetadata;
  }

  /** setAnchorIgnoreIfNotPresentMetadata. */
  public void setAnchorIgnoreIfNotPresentMetadata(
      PropertyMetadata anchorIgnoreIfNotPresentMetadata) {
    this.anchorIgnoreIfNotPresentMetadata = anchorIgnoreIfNotPresentMetadata;
  }

  /**
   * anchorMatchWholeWord.
   *
   * @return TabGroup
   */
  public TabGroup anchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
    return this;
  }

  /**
   * When set to **true**, the anchor string in this tab matches whole words only (strings embedded
   * in other strings are ignored.) The default value is **true**..
   *
   * @return anchorMatchWholeWord
   */
  @ApiModelProperty(
      value =
          "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
  public String getAnchorMatchWholeWord() {
    return anchorMatchWholeWord;
  }

  /** setAnchorMatchWholeWord. */
  public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
  }

  /**
   * anchorMatchWholeWordMetadata.
   *
   * @return TabGroup
   */
  public TabGroup anchorMatchWholeWordMetadata(PropertyMetadata anchorMatchWholeWordMetadata) {
    this.anchorMatchWholeWordMetadata = anchorMatchWholeWordMetadata;
    return this;
  }

  /**
   * Get anchorMatchWholeWordMetadata.
   *
   * @return anchorMatchWholeWordMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorMatchWholeWordMetadata() {
    return anchorMatchWholeWordMetadata;
  }

  /** setAnchorMatchWholeWordMetadata. */
  public void setAnchorMatchWholeWordMetadata(PropertyMetadata anchorMatchWholeWordMetadata) {
    this.anchorMatchWholeWordMetadata = anchorMatchWholeWordMetadata;
  }

  /**
   * anchorString.
   *
   * @return TabGroup
   */
  public TabGroup anchorString(String anchorString) {
    this.anchorString = anchorString;
    return this;
  }

  /**
   * Anchor text information for a radio button..
   *
   * @return anchorString
   */
  @ApiModelProperty(value = "Anchor text information for a radio button.")
  public String getAnchorString() {
    return anchorString;
  }

  /** setAnchorString. */
  public void setAnchorString(String anchorString) {
    this.anchorString = anchorString;
  }

  /**
   * anchorStringMetadata.
   *
   * @return TabGroup
   */
  public TabGroup anchorStringMetadata(PropertyMetadata anchorStringMetadata) {
    this.anchorStringMetadata = anchorStringMetadata;
    return this;
  }

  /**
   * Get anchorStringMetadata.
   *
   * @return anchorStringMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorStringMetadata() {
    return anchorStringMetadata;
  }

  /** setAnchorStringMetadata. */
  public void setAnchorStringMetadata(PropertyMetadata anchorStringMetadata) {
    this.anchorStringMetadata = anchorStringMetadata;
  }

  /**
   * anchorTabProcessorVersion.
   *
   * @return TabGroup
   */
  public TabGroup anchorTabProcessorVersion(String anchorTabProcessorVersion) {
    this.anchorTabProcessorVersion = anchorTabProcessorVersion;
    return this;
  }

  /**
   * .
   *
   * @return anchorTabProcessorVersion
   */
  @ApiModelProperty(value = "")
  public String getAnchorTabProcessorVersion() {
    return anchorTabProcessorVersion;
  }

  /** setAnchorTabProcessorVersion. */
  public void setAnchorTabProcessorVersion(String anchorTabProcessorVersion) {
    this.anchorTabProcessorVersion = anchorTabProcessorVersion;
  }

  /**
   * anchorTabProcessorVersionMetadata.
   *
   * @return TabGroup
   */
  public TabGroup anchorTabProcessorVersionMetadata(
      PropertyMetadata anchorTabProcessorVersionMetadata) {
    this.anchorTabProcessorVersionMetadata = anchorTabProcessorVersionMetadata;
    return this;
  }

  /**
   * Get anchorTabProcessorVersionMetadata.
   *
   * @return anchorTabProcessorVersionMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorTabProcessorVersionMetadata() {
    return anchorTabProcessorVersionMetadata;
  }

  /** setAnchorTabProcessorVersionMetadata. */
  public void setAnchorTabProcessorVersionMetadata(
      PropertyMetadata anchorTabProcessorVersionMetadata) {
    this.anchorTabProcessorVersionMetadata = anchorTabProcessorVersionMetadata;
  }

  /**
   * anchorUnits.
   *
   * @return TabGroup
   */
  public TabGroup anchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
    return this;
  }

  /**
   * Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or
   * inches..
   *
   * @return anchorUnits
   */
  @ApiModelProperty(
      value =
          "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
  public String getAnchorUnits() {
    return anchorUnits;
  }

  /** setAnchorUnits. */
  public void setAnchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
  }

  /**
   * anchorUnitsMetadata.
   *
   * @return TabGroup
   */
  public TabGroup anchorUnitsMetadata(PropertyMetadata anchorUnitsMetadata) {
    this.anchorUnitsMetadata = anchorUnitsMetadata;
    return this;
  }

  /**
   * Get anchorUnitsMetadata.
   *
   * @return anchorUnitsMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorUnitsMetadata() {
    return anchorUnitsMetadata;
  }

  /** setAnchorUnitsMetadata. */
  public void setAnchorUnitsMetadata(PropertyMetadata anchorUnitsMetadata) {
    this.anchorUnitsMetadata = anchorUnitsMetadata;
  }

  /**
   * anchorXOffset.
   *
   * @return TabGroup
   */
  public TabGroup anchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
    return this;
  }

  /**
   * Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString..
   *
   * @return anchorXOffset
   */
  @ApiModelProperty(
      value =
          "Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorXOffset() {
    return anchorXOffset;
  }

  /** setAnchorXOffset. */
  public void setAnchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
  }

  /**
   * anchorXOffsetMetadata.
   *
   * @return TabGroup
   */
  public TabGroup anchorXOffsetMetadata(PropertyMetadata anchorXOffsetMetadata) {
    this.anchorXOffsetMetadata = anchorXOffsetMetadata;
    return this;
  }

  /**
   * Get anchorXOffsetMetadata.
   *
   * @return anchorXOffsetMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorXOffsetMetadata() {
    return anchorXOffsetMetadata;
  }

  /** setAnchorXOffsetMetadata. */
  public void setAnchorXOffsetMetadata(PropertyMetadata anchorXOffsetMetadata) {
    this.anchorXOffsetMetadata = anchorXOffsetMetadata;
  }

  /**
   * anchorYOffset.
   *
   * @return TabGroup
   */
  public TabGroup anchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
    return this;
  }

  /**
   * Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString..
   *
   * @return anchorYOffset
   */
  @ApiModelProperty(
      value =
          "Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorYOffset() {
    return anchorYOffset;
  }

  /** setAnchorYOffset. */
  public void setAnchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
  }

  /**
   * anchorYOffsetMetadata.
   *
   * @return TabGroup
   */
  public TabGroup anchorYOffsetMetadata(PropertyMetadata anchorYOffsetMetadata) {
    this.anchorYOffsetMetadata = anchorYOffsetMetadata;
    return this;
  }

  /**
   * Get anchorYOffsetMetadata.
   *
   * @return anchorYOffsetMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorYOffsetMetadata() {
    return anchorYOffsetMetadata;
  }

  /** setAnchorYOffsetMetadata. */
  public void setAnchorYOffsetMetadata(PropertyMetadata anchorYOffsetMetadata) {
    this.anchorYOffsetMetadata = anchorYOffsetMetadata;
  }

  /**
   * caption.
   *
   * @return TabGroup
   */
  public TabGroup caption(String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * .
   *
   * @return caption
   */
  @ApiModelProperty(value = "")
  public String getCaption() {
    return caption;
  }

  /** setCaption. */
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * captionMetadata.
   *
   * @return TabGroup
   */
  public TabGroup captionMetadata(PropertyMetadata captionMetadata) {
    this.captionMetadata = captionMetadata;
    return this;
  }

  /**
   * Get captionMetadata.
   *
   * @return captionMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getCaptionMetadata() {
    return captionMetadata;
  }

  /** setCaptionMetadata. */
  public void setCaptionMetadata(PropertyMetadata captionMetadata) {
    this.captionMetadata = captionMetadata;
  }

  /**
   * conditionalParentLabel.
   *
   * @return TabGroup
   */
  public TabGroup conditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
    return this;
  }

  /**
   * For conditional fields this is the TabLabel of the parent tab that controls this tab's
   * visibility..
   *
   * @return conditionalParentLabel
   */
  @ApiModelProperty(
      value =
          "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
  public String getConditionalParentLabel() {
    return conditionalParentLabel;
  }

  /** setConditionalParentLabel. */
  public void setConditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
  }

  /**
   * conditionalParentLabelMetadata.
   *
   * @return TabGroup
   */
  public TabGroup conditionalParentLabelMetadata(PropertyMetadata conditionalParentLabelMetadata) {
    this.conditionalParentLabelMetadata = conditionalParentLabelMetadata;
    return this;
  }

  /**
   * Get conditionalParentLabelMetadata.
   *
   * @return conditionalParentLabelMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getConditionalParentLabelMetadata() {
    return conditionalParentLabelMetadata;
  }

  /** setConditionalParentLabelMetadata. */
  public void setConditionalParentLabelMetadata(PropertyMetadata conditionalParentLabelMetadata) {
    this.conditionalParentLabelMetadata = conditionalParentLabelMetadata;
  }

  /**
   * conditionalParentValue.
   *
   * @return TabGroup
   */
  public TabGroup conditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
    return this;
  }

  /**
   * For conditional fields, this is the value of the parent tab that controls the tab's visibility.
   * If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use
   * \"on\" as the value to show that the parent tab is active. .
   *
   * @return conditionalParentValue
   */
  @ApiModelProperty(
      value =
          "For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. ")
  public String getConditionalParentValue() {
    return conditionalParentValue;
  }

  /** setConditionalParentValue. */
  public void setConditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
  }

  /**
   * conditionalParentValueMetadata.
   *
   * @return TabGroup
   */
  public TabGroup conditionalParentValueMetadata(PropertyMetadata conditionalParentValueMetadata) {
    this.conditionalParentValueMetadata = conditionalParentValueMetadata;
    return this;
  }

  /**
   * Get conditionalParentValueMetadata.
   *
   * @return conditionalParentValueMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getConditionalParentValueMetadata() {
    return conditionalParentValueMetadata;
  }

  /** setConditionalParentValueMetadata. */
  public void setConditionalParentValueMetadata(PropertyMetadata conditionalParentValueMetadata) {
    this.conditionalParentValueMetadata = conditionalParentValueMetadata;
  }

  /**
   * customTabId.
   *
   * @return TabGroup
   */
  public TabGroup customTabId(String customTabId) {
    this.customTabId = customTabId;
    return this;
  }

  /**
   * The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used
   * when adding new tabs for a recipient. When used, the new tab inherits all the custom tab
   * properties..
   *
   * @return customTabId
   */
  @ApiModelProperty(
      value =
          "The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.")
  public String getCustomTabId() {
    return customTabId;
  }

  /** setCustomTabId. */
  public void setCustomTabId(String customTabId) {
    this.customTabId = customTabId;
  }

  /**
   * customTabIdMetadata.
   *
   * @return TabGroup
   */
  public TabGroup customTabIdMetadata(PropertyMetadata customTabIdMetadata) {
    this.customTabIdMetadata = customTabIdMetadata;
    return this;
  }

  /**
   * Get customTabIdMetadata.
   *
   * @return customTabIdMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getCustomTabIdMetadata() {
    return customTabIdMetadata;
  }

  /** setCustomTabIdMetadata. */
  public void setCustomTabIdMetadata(PropertyMetadata customTabIdMetadata) {
    this.customTabIdMetadata = customTabIdMetadata;
  }

  /**
   * documentId.
   *
   * @return TabGroup
   */
  public TabGroup documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing
   * Document's ID attribute..
   *
   * @return documentId
   */
  @ApiModelProperty(
      value =
          "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  /** setDocumentId. */
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  /**
   * documentIdMetadata.
   *
   * @return TabGroup
   */
  public TabGroup documentIdMetadata(PropertyMetadata documentIdMetadata) {
    this.documentIdMetadata = documentIdMetadata;
    return this;
  }

  /**
   * Get documentIdMetadata.
   *
   * @return documentIdMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getDocumentIdMetadata() {
    return documentIdMetadata;
  }

  /** setDocumentIdMetadata. */
  public void setDocumentIdMetadata(PropertyMetadata documentIdMetadata) {
    this.documentIdMetadata = documentIdMetadata;
  }

  /**
   * errorDetails.
   *
   * @return TabGroup
   */
  public TabGroup errorDetails(ErrorDetails errorDetails) {
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
   * formOrder.
   *
   * @return TabGroup
   */
  public TabGroup formOrder(String formOrder) {
    this.formOrder = formOrder;
    return this;
  }

  /**
   * .
   *
   * @return formOrder
   */
  @ApiModelProperty(value = "")
  public String getFormOrder() {
    return formOrder;
  }

  /** setFormOrder. */
  public void setFormOrder(String formOrder) {
    this.formOrder = formOrder;
  }

  /**
   * formOrderMetadata.
   *
   * @return TabGroup
   */
  public TabGroup formOrderMetadata(PropertyMetadata formOrderMetadata) {
    this.formOrderMetadata = formOrderMetadata;
    return this;
  }

  /**
   * Get formOrderMetadata.
   *
   * @return formOrderMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getFormOrderMetadata() {
    return formOrderMetadata;
  }

  /** setFormOrderMetadata. */
  public void setFormOrderMetadata(PropertyMetadata formOrderMetadata) {
    this.formOrderMetadata = formOrderMetadata;
  }

  /**
   * formPageLabel.
   *
   * @return TabGroup
   */
  public TabGroup formPageLabel(String formPageLabel) {
    this.formPageLabel = formPageLabel;
    return this;
  }

  /**
   * .
   *
   * @return formPageLabel
   */
  @ApiModelProperty(value = "")
  public String getFormPageLabel() {
    return formPageLabel;
  }

  /** setFormPageLabel. */
  public void setFormPageLabel(String formPageLabel) {
    this.formPageLabel = formPageLabel;
  }

  /**
   * formPageLabelMetadata.
   *
   * @return TabGroup
   */
  public TabGroup formPageLabelMetadata(PropertyMetadata formPageLabelMetadata) {
    this.formPageLabelMetadata = formPageLabelMetadata;
    return this;
  }

  /**
   * Get formPageLabelMetadata.
   *
   * @return formPageLabelMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getFormPageLabelMetadata() {
    return formPageLabelMetadata;
  }

  /** setFormPageLabelMetadata. */
  public void setFormPageLabelMetadata(PropertyMetadata formPageLabelMetadata) {
    this.formPageLabelMetadata = formPageLabelMetadata;
  }

  /**
   * formPageNumber.
   *
   * @return TabGroup
   */
  public TabGroup formPageNumber(String formPageNumber) {
    this.formPageNumber = formPageNumber;
    return this;
  }

  /**
   * .
   *
   * @return formPageNumber
   */
  @ApiModelProperty(value = "")
  public String getFormPageNumber() {
    return formPageNumber;
  }

  /** setFormPageNumber. */
  public void setFormPageNumber(String formPageNumber) {
    this.formPageNumber = formPageNumber;
  }

  /**
   * formPageNumberMetadata.
   *
   * @return TabGroup
   */
  public TabGroup formPageNumberMetadata(PropertyMetadata formPageNumberMetadata) {
    this.formPageNumberMetadata = formPageNumberMetadata;
    return this;
  }

  /**
   * Get formPageNumberMetadata.
   *
   * @return formPageNumberMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getFormPageNumberMetadata() {
    return formPageNumberMetadata;
  }

  /** setFormPageNumberMetadata. */
  public void setFormPageNumberMetadata(PropertyMetadata formPageNumberMetadata) {
    this.formPageNumberMetadata = formPageNumberMetadata;
  }

  /**
   * groupLabel.
   *
   * @return TabGroup
   */
  public TabGroup groupLabel(String groupLabel) {
    this.groupLabel = groupLabel;
    return this;
  }

  /**
   * .
   *
   * @return groupLabel
   */
  @ApiModelProperty(value = "")
  public String getGroupLabel() {
    return groupLabel;
  }

  /** setGroupLabel. */
  public void setGroupLabel(String groupLabel) {
    this.groupLabel = groupLabel;
  }

  /**
   * groupLabelMetadata.
   *
   * @return TabGroup
   */
  public TabGroup groupLabelMetadata(PropertyMetadata groupLabelMetadata) {
    this.groupLabelMetadata = groupLabelMetadata;
    return this;
  }

  /**
   * Get groupLabelMetadata.
   *
   * @return groupLabelMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getGroupLabelMetadata() {
    return groupLabelMetadata;
  }

  /** setGroupLabelMetadata. */
  public void setGroupLabelMetadata(PropertyMetadata groupLabelMetadata) {
    this.groupLabelMetadata = groupLabelMetadata;
  }

  /**
   * groupRule.
   *
   * @return TabGroup
   */
  public TabGroup groupRule(String groupRule) {
    this.groupRule = groupRule;
    return this;
  }

  /**
   * .
   *
   * @return groupRule
   */
  @ApiModelProperty(value = "")
  public String getGroupRule() {
    return groupRule;
  }

  /** setGroupRule. */
  public void setGroupRule(String groupRule) {
    this.groupRule = groupRule;
  }

  /**
   * groupRuleMetadata.
   *
   * @return TabGroup
   */
  public TabGroup groupRuleMetadata(PropertyMetadata groupRuleMetadata) {
    this.groupRuleMetadata = groupRuleMetadata;
    return this;
  }

  /**
   * Get groupRuleMetadata.
   *
   * @return groupRuleMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getGroupRuleMetadata() {
    return groupRuleMetadata;
  }

  /** setGroupRuleMetadata. */
  public void setGroupRuleMetadata(PropertyMetadata groupRuleMetadata) {
    this.groupRuleMetadata = groupRuleMetadata;
  }

  /**
   * height.
   *
   * @return TabGroup
   */
  public TabGroup height(String height) {
    this.height = height;
    return this;
  }

  /**
   * Height of the tab in pixels..
   *
   * @return height
   */
  @ApiModelProperty(value = "Height of the tab in pixels.")
  public String getHeight() {
    return height;
  }

  /** setHeight. */
  public void setHeight(String height) {
    this.height = height;
  }

  /**
   * heightMetadata.
   *
   * @return TabGroup
   */
  public TabGroup heightMetadata(PropertyMetadata heightMetadata) {
    this.heightMetadata = heightMetadata;
    return this;
  }

  /**
   * Get heightMetadata.
   *
   * @return heightMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getHeightMetadata() {
    return heightMetadata;
  }

  /** setHeightMetadata. */
  public void setHeightMetadata(PropertyMetadata heightMetadata) {
    this.heightMetadata = heightMetadata;
  }

  /**
   * maximumAllowed.
   *
   * @return TabGroup
   */
  public TabGroup maximumAllowed(String maximumAllowed) {
    this.maximumAllowed = maximumAllowed;
    return this;
  }

  /**
   * .
   *
   * @return maximumAllowed
   */
  @ApiModelProperty(value = "")
  public String getMaximumAllowed() {
    return maximumAllowed;
  }

  /** setMaximumAllowed. */
  public void setMaximumAllowed(String maximumAllowed) {
    this.maximumAllowed = maximumAllowed;
  }

  /**
   * maximumAllowedMetadata.
   *
   * @return TabGroup
   */
  public TabGroup maximumAllowedMetadata(PropertyMetadata maximumAllowedMetadata) {
    this.maximumAllowedMetadata = maximumAllowedMetadata;
    return this;
  }

  /**
   * Get maximumAllowedMetadata.
   *
   * @return maximumAllowedMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getMaximumAllowedMetadata() {
    return maximumAllowedMetadata;
  }

  /** setMaximumAllowedMetadata. */
  public void setMaximumAllowedMetadata(PropertyMetadata maximumAllowedMetadata) {
    this.maximumAllowedMetadata = maximumAllowedMetadata;
  }

  /**
   * mergeField.
   *
   * @return TabGroup
   */
  public TabGroup mergeField(MergeField mergeField) {
    this.mergeField = mergeField;
    return this;
  }

  /**
   * Get mergeField.
   *
   * @return mergeField
   */
  @ApiModelProperty(value = "")
  public MergeField getMergeField() {
    return mergeField;
  }

  /** setMergeField. */
  public void setMergeField(MergeField mergeField) {
    this.mergeField = mergeField;
  }

  /**
   * mergeFieldXml.
   *
   * @return TabGroup
   */
  public TabGroup mergeFieldXml(String mergeFieldXml) {
    this.mergeFieldXml = mergeFieldXml;
    return this;
  }

  /**
   * .
   *
   * @return mergeFieldXml
   */
  @ApiModelProperty(value = "")
  public String getMergeFieldXml() {
    return mergeFieldXml;
  }

  /** setMergeFieldXml. */
  public void setMergeFieldXml(String mergeFieldXml) {
    this.mergeFieldXml = mergeFieldXml;
  }

  /**
   * minimumRequired.
   *
   * @return TabGroup
   */
  public TabGroup minimumRequired(String minimumRequired) {
    this.minimumRequired = minimumRequired;
    return this;
  }

  /**
   * .
   *
   * @return minimumRequired
   */
  @ApiModelProperty(value = "")
  public String getMinimumRequired() {
    return minimumRequired;
  }

  /** setMinimumRequired. */
  public void setMinimumRequired(String minimumRequired) {
    this.minimumRequired = minimumRequired;
  }

  /**
   * minimumRequiredMetadata.
   *
   * @return TabGroup
   */
  public TabGroup minimumRequiredMetadata(PropertyMetadata minimumRequiredMetadata) {
    this.minimumRequiredMetadata = minimumRequiredMetadata;
    return this;
  }

  /**
   * Get minimumRequiredMetadata.
   *
   * @return minimumRequiredMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getMinimumRequiredMetadata() {
    return minimumRequiredMetadata;
  }

  /** setMinimumRequiredMetadata. */
  public void setMinimumRequiredMetadata(PropertyMetadata minimumRequiredMetadata) {
    this.minimumRequiredMetadata = minimumRequiredMetadata;
  }

  /**
   * pageNumber.
   *
   * @return TabGroup
   */
  public TabGroup pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Specifies the page number on which the tab is located..
   *
   * @return pageNumber
   */
  @ApiModelProperty(value = "Specifies the page number on which the tab is located.")
  public String getPageNumber() {
    return pageNumber;
  }

  /** setPageNumber. */
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  /**
   * pageNumberMetadata.
   *
   * @return TabGroup
   */
  public TabGroup pageNumberMetadata(PropertyMetadata pageNumberMetadata) {
    this.pageNumberMetadata = pageNumberMetadata;
    return this;
  }

  /**
   * Get pageNumberMetadata.
   *
   * @return pageNumberMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getPageNumberMetadata() {
    return pageNumberMetadata;
  }

  /** setPageNumberMetadata. */
  public void setPageNumberMetadata(PropertyMetadata pageNumberMetadata) {
    this.pageNumberMetadata = pageNumberMetadata;
  }

  /**
   * recipientId.
   *
   * @return TabGroup
   */
  public TabGroup recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign
   * the Document..
   *
   * @return recipientId
   */
  @ApiModelProperty(
      value =
          "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  /** setRecipientId. */
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  /**
   * recipientIdGuid.
   *
   * @return TabGroup
   */
  public TabGroup recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

  /**
   * .
   *
   * @return recipientIdGuid
   */
  @ApiModelProperty(value = "")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }

  /** setRecipientIdGuid. */
  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }

  /**
   * recipientIdGuidMetadata.
   *
   * @return TabGroup
   */
  public TabGroup recipientIdGuidMetadata(PropertyMetadata recipientIdGuidMetadata) {
    this.recipientIdGuidMetadata = recipientIdGuidMetadata;
    return this;
  }

  /**
   * Get recipientIdGuidMetadata.
   *
   * @return recipientIdGuidMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getRecipientIdGuidMetadata() {
    return recipientIdGuidMetadata;
  }

  /** setRecipientIdGuidMetadata. */
  public void setRecipientIdGuidMetadata(PropertyMetadata recipientIdGuidMetadata) {
    this.recipientIdGuidMetadata = recipientIdGuidMetadata;
  }

  /**
   * recipientIdMetadata.
   *
   * @return TabGroup
   */
  public TabGroup recipientIdMetadata(PropertyMetadata recipientIdMetadata) {
    this.recipientIdMetadata = recipientIdMetadata;
    return this;
  }

  /**
   * Get recipientIdMetadata.
   *
   * @return recipientIdMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getRecipientIdMetadata() {
    return recipientIdMetadata;
  }

  /** setRecipientIdMetadata. */
  public void setRecipientIdMetadata(PropertyMetadata recipientIdMetadata) {
    this.recipientIdMetadata = recipientIdMetadata;
  }

  /**
   * smartContractInformation.
   *
   * @return TabGroup
   */
  public TabGroup smartContractInformation(SmartContractInformation smartContractInformation) {
    this.smartContractInformation = smartContractInformation;
    return this;
  }

  /**
   * Get smartContractInformation.
   *
   * @return smartContractInformation
   */
  @ApiModelProperty(value = "")
  public SmartContractInformation getSmartContractInformation() {
    return smartContractInformation;
  }

  /** setSmartContractInformation. */
  public void setSmartContractInformation(SmartContractInformation smartContractInformation) {
    this.smartContractInformation = smartContractInformation;
  }

  /**
   * source.
   *
   * @return TabGroup
   */
  public TabGroup source(String source) {
    this.source = source;
    return this;
  }

  /**
   * .
   *
   * @return source
   */
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  /** setSource. */
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * status.
   *
   * @return TabGroup
   */
  public TabGroup status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are: * sent - The envelope is sent to the
   * recipients. * created - The envelope is saved as a draft and can be modified and sent later..
   *
   * @return status
   */
  @ApiModelProperty(
      value =
          "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /** setStatus. */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * statusMetadata.
   *
   * @return TabGroup
   */
  public TabGroup statusMetadata(PropertyMetadata statusMetadata) {
    this.statusMetadata = statusMetadata;
    return this;
  }

  /**
   * Get statusMetadata.
   *
   * @return statusMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getStatusMetadata() {
    return statusMetadata;
  }

  /** setStatusMetadata. */
  public void setStatusMetadata(PropertyMetadata statusMetadata) {
    this.statusMetadata = statusMetadata;
  }

  /**
   * tabGroupLabels.
   *
   * @return TabGroup
   */
  public TabGroup tabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
    return this;
  }

  /**
   * addTabGroupLabelsItem.
   *
   * @return TabGroup
   */
  public TabGroup addTabGroupLabelsItem(String tabGroupLabelsItem) {
    if (this.tabGroupLabels == null) {
      this.tabGroupLabels = new java.util.ArrayList<>();
    }
    this.tabGroupLabels.add(tabGroupLabelsItem);
    return this;
  }

  /**
   * .
   *
   * @return tabGroupLabels
   */
  @ApiModelProperty(value = "")
  public java.util.List<String> getTabGroupLabels() {
    return tabGroupLabels;
  }

  /** setTabGroupLabels. */
  public void setTabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
  }

  /**
   * tabGroupLabelsMetadata.
   *
   * @return TabGroup
   */
  public TabGroup tabGroupLabelsMetadata(PropertyMetadata tabGroupLabelsMetadata) {
    this.tabGroupLabelsMetadata = tabGroupLabelsMetadata;
    return this;
  }

  /**
   * Get tabGroupLabelsMetadata.
   *
   * @return tabGroupLabelsMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabGroupLabelsMetadata() {
    return tabGroupLabelsMetadata;
  }

  /** setTabGroupLabelsMetadata. */
  public void setTabGroupLabelsMetadata(PropertyMetadata tabGroupLabelsMetadata) {
    this.tabGroupLabelsMetadata = tabGroupLabelsMetadata;
  }

  /**
   * tabId.
   *
   * @return TabGroup
   */
  public TabGroup tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

  /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call]. .
   *
   * @return tabId
   */
  @ApiModelProperty(
      value =
          "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     ")
  public String getTabId() {
    return tabId;
  }

  /** setTabId. */
  public void setTabId(String tabId) {
    this.tabId = tabId;
  }

  /**
   * tabIdMetadata.
   *
   * @return TabGroup
   */
  public TabGroup tabIdMetadata(PropertyMetadata tabIdMetadata) {
    this.tabIdMetadata = tabIdMetadata;
    return this;
  }

  /**
   * Get tabIdMetadata.
   *
   * @return tabIdMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabIdMetadata() {
    return tabIdMetadata;
  }

  /** setTabIdMetadata. */
  public void setTabIdMetadata(PropertyMetadata tabIdMetadata) {
    this.tabIdMetadata = tabIdMetadata;
  }

  /**
   * tabOrder.
   *
   * @return TabGroup
   */
  public TabGroup tabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
    return this;
  }

  /**
   * .
   *
   * @return tabOrder
   */
  @ApiModelProperty(value = "")
  public String getTabOrder() {
    return tabOrder;
  }

  /** setTabOrder. */
  public void setTabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
  }

  /**
   * tabOrderMetadata.
   *
   * @return TabGroup
   */
  public TabGroup tabOrderMetadata(PropertyMetadata tabOrderMetadata) {
    this.tabOrderMetadata = tabOrderMetadata;
    return this;
  }

  /**
   * Get tabOrderMetadata.
   *
   * @return tabOrderMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabOrderMetadata() {
    return tabOrderMetadata;
  }

  /** setTabOrderMetadata. */
  public void setTabOrderMetadata(PropertyMetadata tabOrderMetadata) {
    this.tabOrderMetadata = tabOrderMetadata;
  }

  /**
   * tabScope.
   *
   * @return TabGroup
   */
  public TabGroup tabScope(String tabScope) {
    this.tabScope = tabScope;
    return this;
  }

  /**
   * .
   *
   * @return tabScope
   */
  @ApiModelProperty(value = "")
  public String getTabScope() {
    return tabScope;
  }

  /** setTabScope. */
  public void setTabScope(String tabScope) {
    this.tabScope = tabScope;
  }

  /**
   * tabScopeMetadata.
   *
   * @return TabGroup
   */
  public TabGroup tabScopeMetadata(PropertyMetadata tabScopeMetadata) {
    this.tabScopeMetadata = tabScopeMetadata;
    return this;
  }

  /**
   * Get tabScopeMetadata.
   *
   * @return tabScopeMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabScopeMetadata() {
    return tabScopeMetadata;
  }

  /** setTabScopeMetadata. */
  public void setTabScopeMetadata(PropertyMetadata tabScopeMetadata) {
    this.tabScopeMetadata = tabScopeMetadata;
  }

  /**
   * tabType.
   *
   * @return TabGroup
   */
  public TabGroup tabType(String tabType) {
    this.tabType = tabType;
    return this;
  }

  /**
   * .
   *
   * @return tabType
   */
  @ApiModelProperty(value = "")
  public String getTabType() {
    return tabType;
  }

  /** setTabType. */
  public void setTabType(String tabType) {
    this.tabType = tabType;
  }

  /**
   * tabTypeMetadata.
   *
   * @return TabGroup
   */
  public TabGroup tabTypeMetadata(PropertyMetadata tabTypeMetadata) {
    this.tabTypeMetadata = tabTypeMetadata;
    return this;
  }

  /**
   * Get tabTypeMetadata.
   *
   * @return tabTypeMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabTypeMetadata() {
    return tabTypeMetadata;
  }

  /** setTabTypeMetadata. */
  public void setTabTypeMetadata(PropertyMetadata tabTypeMetadata) {
    this.tabTypeMetadata = tabTypeMetadata;
  }

  /**
   * templateLocked.
   *
   * @return TabGroup
   */
  public TabGroup templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when
   * working with template recipients. .
   *
   * @return templateLocked
   */
  @ApiModelProperty(
      value =
          "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  /** setTemplateLocked. */
  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  /**
   * templateLockedMetadata.
   *
   * @return TabGroup
   */
  public TabGroup templateLockedMetadata(PropertyMetadata templateLockedMetadata) {
    this.templateLockedMetadata = templateLockedMetadata;
    return this;
  }

  /**
   * Get templateLockedMetadata.
   *
   * @return templateLockedMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getTemplateLockedMetadata() {
    return templateLockedMetadata;
  }

  /** setTemplateLockedMetadata. */
  public void setTemplateLockedMetadata(PropertyMetadata templateLockedMetadata) {
    this.templateLockedMetadata = templateLockedMetadata;
  }

  /**
   * templateRequired.
   *
   * @return TabGroup
   */
  public TabGroup templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

  /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with
   * template recipients..
   *
   * @return templateRequired
   */
  @ApiModelProperty(
      value =
          "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  /** setTemplateRequired. */
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  /**
   * templateRequiredMetadata.
   *
   * @return TabGroup
   */
  public TabGroup templateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
    this.templateRequiredMetadata = templateRequiredMetadata;
    return this;
  }

  /**
   * Get templateRequiredMetadata.
   *
   * @return templateRequiredMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getTemplateRequiredMetadata() {
    return templateRequiredMetadata;
  }

  /** setTemplateRequiredMetadata. */
  public void setTemplateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
    this.templateRequiredMetadata = templateRequiredMetadata;
  }

  /**
   * tooltip.
   *
   * @return TabGroup
   */
  public TabGroup tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  /**
   * .
   *
   * @return tooltip
   */
  @ApiModelProperty(value = "")
  public String getTooltip() {
    return tooltip;
  }

  /** setTooltip. */
  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  /**
   * toolTipMetadata.
   *
   * @return TabGroup
   */
  public TabGroup toolTipMetadata(PropertyMetadata toolTipMetadata) {
    this.toolTipMetadata = toolTipMetadata;
    return this;
  }

  /**
   * Get toolTipMetadata.
   *
   * @return toolTipMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getToolTipMetadata() {
    return toolTipMetadata;
  }

  /** setToolTipMetadata. */
  public void setToolTipMetadata(PropertyMetadata toolTipMetadata) {
    this.toolTipMetadata = toolTipMetadata;
  }

  /**
   * validationMessage.
   *
   * @return TabGroup
   */
  public TabGroup validationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
    return this;
  }

  /**
   * The message displayed if the custom tab fails input validation (either custom of embedded)..
   *
   * @return validationMessage
   */
  @ApiModelProperty(
      value =
          "The message displayed if the custom tab fails input validation (either custom of embedded).")
  public String getValidationMessage() {
    return validationMessage;
  }

  /** setValidationMessage. */
  public void setValidationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
  }

  /**
   * validationMessageMetadata.
   *
   * @return TabGroup
   */
  public TabGroup validationMessageMetadata(PropertyMetadata validationMessageMetadata) {
    this.validationMessageMetadata = validationMessageMetadata;
    return this;
  }

  /**
   * Get validationMessageMetadata.
   *
   * @return validationMessageMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getValidationMessageMetadata() {
    return validationMessageMetadata;
  }

  /** setValidationMessageMetadata. */
  public void setValidationMessageMetadata(PropertyMetadata validationMessageMetadata) {
    this.validationMessageMetadata = validationMessageMetadata;
  }

  /**
   * width.
   *
   * @return TabGroup
   */
  public TabGroup width(String width) {
    this.width = width;
    return this;
  }

  /**
   * Width of the tab in pixels..
   *
   * @return width
   */
  @ApiModelProperty(value = "Width of the tab in pixels.")
  public String getWidth() {
    return width;
  }

  /** setWidth. */
  public void setWidth(String width) {
    this.width = width;
  }

  /**
   * widthMetadata.
   *
   * @return TabGroup
   */
  public TabGroup widthMetadata(PropertyMetadata widthMetadata) {
    this.widthMetadata = widthMetadata;
    return this;
  }

  /**
   * Get widthMetadata.
   *
   * @return widthMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getWidthMetadata() {
    return widthMetadata;
  }

  /** setWidthMetadata. */
  public void setWidthMetadata(PropertyMetadata widthMetadata) {
    this.widthMetadata = widthMetadata;
  }

  /**
   * xPosition.
   *
   * @return TabGroup
   */
  public TabGroup xPosition(String xPosition) {
    this.xPosition = xPosition;
    return this;
  }

  /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when
   * determining position..
   *
   * @return xPosition
   */
  @ApiModelProperty(
      value =
          "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getXPosition() {
    return xPosition;
  }

  /** setXPosition. */
  public void setXPosition(String xPosition) {
    this.xPosition = xPosition;
  }

  /**
   * xPositionMetadata.
   *
   * @return TabGroup
   */
  public TabGroup xPositionMetadata(PropertyMetadata xPositionMetadata) {
    this.xPositionMetadata = xPositionMetadata;
    return this;
  }

  /**
   * Get xPositionMetadata.
   *
   * @return xPositionMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getXPositionMetadata() {
    return xPositionMetadata;
  }

  /** setXPositionMetadata. */
  public void setXPositionMetadata(PropertyMetadata xPositionMetadata) {
    this.xPositionMetadata = xPositionMetadata;
  }

  /**
   * yPosition.
   *
   * @return TabGroup
   */
  public TabGroup yPosition(String yPosition) {
    this.yPosition = yPosition;
    return this;
  }

  /**
   * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when
   * determining position..
   *
   * @return yPosition
   */
  @ApiModelProperty(
      value =
          "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getYPosition() {
    return yPosition;
  }

  /** setYPosition. */
  public void setYPosition(String yPosition) {
    this.yPosition = yPosition;
  }

  /**
   * yPositionMetadata.
   *
   * @return TabGroup
   */
  public TabGroup yPositionMetadata(PropertyMetadata yPositionMetadata) {
    this.yPositionMetadata = yPositionMetadata;
    return this;
  }

  /**
   * Get yPositionMetadata.
   *
   * @return yPositionMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getYPositionMetadata() {
    return yPositionMetadata;
  }

  /** setYPositionMetadata. */
  public void setYPositionMetadata(PropertyMetadata yPositionMetadata) {
    this.yPositionMetadata = yPositionMetadata;
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
    TabGroup tabGroup = (TabGroup) o;
    return Objects.equals(
            this.anchorAllowWhiteSpaceInCharacters, tabGroup.anchorAllowWhiteSpaceInCharacters)
        && Objects.equals(
            this.anchorAllowWhiteSpaceInCharactersMetadata,
            tabGroup.anchorAllowWhiteSpaceInCharactersMetadata)
        && Objects.equals(this.anchorCaseSensitive, tabGroup.anchorCaseSensitive)
        && Objects.equals(this.anchorCaseSensitiveMetadata, tabGroup.anchorCaseSensitiveMetadata)
        && Objects.equals(this.anchorHorizontalAlignment, tabGroup.anchorHorizontalAlignment)
        && Objects.equals(
            this.anchorHorizontalAlignmentMetadata, tabGroup.anchorHorizontalAlignmentMetadata)
        && Objects.equals(this.anchorIgnoreIfNotPresent, tabGroup.anchorIgnoreIfNotPresent)
        && Objects.equals(
            this.anchorIgnoreIfNotPresentMetadata, tabGroup.anchorIgnoreIfNotPresentMetadata)
        && Objects.equals(this.anchorMatchWholeWord, tabGroup.anchorMatchWholeWord)
        && Objects.equals(this.anchorMatchWholeWordMetadata, tabGroup.anchorMatchWholeWordMetadata)
        && Objects.equals(this.anchorString, tabGroup.anchorString)
        && Objects.equals(this.anchorStringMetadata, tabGroup.anchorStringMetadata)
        && Objects.equals(this.anchorTabProcessorVersion, tabGroup.anchorTabProcessorVersion)
        && Objects.equals(
            this.anchorTabProcessorVersionMetadata, tabGroup.anchorTabProcessorVersionMetadata)
        && Objects.equals(this.anchorUnits, tabGroup.anchorUnits)
        && Objects.equals(this.anchorUnitsMetadata, tabGroup.anchorUnitsMetadata)
        && Objects.equals(this.anchorXOffset, tabGroup.anchorXOffset)
        && Objects.equals(this.anchorXOffsetMetadata, tabGroup.anchorXOffsetMetadata)
        && Objects.equals(this.anchorYOffset, tabGroup.anchorYOffset)
        && Objects.equals(this.anchorYOffsetMetadata, tabGroup.anchorYOffsetMetadata)
        && Objects.equals(this.caption, tabGroup.caption)
        && Objects.equals(this.captionMetadata, tabGroup.captionMetadata)
        && Objects.equals(this.conditionalParentLabel, tabGroup.conditionalParentLabel)
        && Objects.equals(
            this.conditionalParentLabelMetadata, tabGroup.conditionalParentLabelMetadata)
        && Objects.equals(this.conditionalParentValue, tabGroup.conditionalParentValue)
        && Objects.equals(
            this.conditionalParentValueMetadata, tabGroup.conditionalParentValueMetadata)
        && Objects.equals(this.customTabId, tabGroup.customTabId)
        && Objects.equals(this.customTabIdMetadata, tabGroup.customTabIdMetadata)
        && Objects.equals(this.documentId, tabGroup.documentId)
        && Objects.equals(this.documentIdMetadata, tabGroup.documentIdMetadata)
        && Objects.equals(this.errorDetails, tabGroup.errorDetails)
        && Objects.equals(this.formOrder, tabGroup.formOrder)
        && Objects.equals(this.formOrderMetadata, tabGroup.formOrderMetadata)
        && Objects.equals(this.formPageLabel, tabGroup.formPageLabel)
        && Objects.equals(this.formPageLabelMetadata, tabGroup.formPageLabelMetadata)
        && Objects.equals(this.formPageNumber, tabGroup.formPageNumber)
        && Objects.equals(this.formPageNumberMetadata, tabGroup.formPageNumberMetadata)
        && Objects.equals(this.groupLabel, tabGroup.groupLabel)
        && Objects.equals(this.groupLabelMetadata, tabGroup.groupLabelMetadata)
        && Objects.equals(this.groupRule, tabGroup.groupRule)
        && Objects.equals(this.groupRuleMetadata, tabGroup.groupRuleMetadata)
        && Objects.equals(this.height, tabGroup.height)
        && Objects.equals(this.heightMetadata, tabGroup.heightMetadata)
        && Objects.equals(this.maximumAllowed, tabGroup.maximumAllowed)
        && Objects.equals(this.maximumAllowedMetadata, tabGroup.maximumAllowedMetadata)
        && Objects.equals(this.mergeField, tabGroup.mergeField)
        && Objects.equals(this.mergeFieldXml, tabGroup.mergeFieldXml)
        && Objects.equals(this.minimumRequired, tabGroup.minimumRequired)
        && Objects.equals(this.minimumRequiredMetadata, tabGroup.minimumRequiredMetadata)
        && Objects.equals(this.pageNumber, tabGroup.pageNumber)
        && Objects.equals(this.pageNumberMetadata, tabGroup.pageNumberMetadata)
        && Objects.equals(this.recipientId, tabGroup.recipientId)
        && Objects.equals(this.recipientIdGuid, tabGroup.recipientIdGuid)
        && Objects.equals(this.recipientIdGuidMetadata, tabGroup.recipientIdGuidMetadata)
        && Objects.equals(this.recipientIdMetadata, tabGroup.recipientIdMetadata)
        && Objects.equals(this.smartContractInformation, tabGroup.smartContractInformation)
        && Objects.equals(this.source, tabGroup.source)
        && Objects.equals(this.status, tabGroup.status)
        && Objects.equals(this.statusMetadata, tabGroup.statusMetadata)
        && Objects.equals(this.tabGroupLabels, tabGroup.tabGroupLabels)
        && Objects.equals(this.tabGroupLabelsMetadata, tabGroup.tabGroupLabelsMetadata)
        && Objects.equals(this.tabId, tabGroup.tabId)
        && Objects.equals(this.tabIdMetadata, tabGroup.tabIdMetadata)
        && Objects.equals(this.tabOrder, tabGroup.tabOrder)
        && Objects.equals(this.tabOrderMetadata, tabGroup.tabOrderMetadata)
        && Objects.equals(this.tabScope, tabGroup.tabScope)
        && Objects.equals(this.tabScopeMetadata, tabGroup.tabScopeMetadata)
        && Objects.equals(this.tabType, tabGroup.tabType)
        && Objects.equals(this.tabTypeMetadata, tabGroup.tabTypeMetadata)
        && Objects.equals(this.templateLocked, tabGroup.templateLocked)
        && Objects.equals(this.templateLockedMetadata, tabGroup.templateLockedMetadata)
        && Objects.equals(this.templateRequired, tabGroup.templateRequired)
        && Objects.equals(this.templateRequiredMetadata, tabGroup.templateRequiredMetadata)
        && Objects.equals(this.tooltip, tabGroup.tooltip)
        && Objects.equals(this.toolTipMetadata, tabGroup.toolTipMetadata)
        && Objects.equals(this.validationMessage, tabGroup.validationMessage)
        && Objects.equals(this.validationMessageMetadata, tabGroup.validationMessageMetadata)
        && Objects.equals(this.width, tabGroup.width)
        && Objects.equals(this.widthMetadata, tabGroup.widthMetadata)
        && Objects.equals(this.xPosition, tabGroup.xPosition)
        && Objects.equals(this.xPositionMetadata, tabGroup.xPositionMetadata)
        && Objects.equals(this.yPosition, tabGroup.yPosition)
        && Objects.equals(this.yPositionMetadata, tabGroup.yPositionMetadata);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        anchorAllowWhiteSpaceInCharacters,
        anchorAllowWhiteSpaceInCharactersMetadata,
        anchorCaseSensitive,
        anchorCaseSensitiveMetadata,
        anchorHorizontalAlignment,
        anchorHorizontalAlignmentMetadata,
        anchorIgnoreIfNotPresent,
        anchorIgnoreIfNotPresentMetadata,
        anchorMatchWholeWord,
        anchorMatchWholeWordMetadata,
        anchorString,
        anchorStringMetadata,
        anchorTabProcessorVersion,
        anchorTabProcessorVersionMetadata,
        anchorUnits,
        anchorUnitsMetadata,
        anchorXOffset,
        anchorXOffsetMetadata,
        anchorYOffset,
        anchorYOffsetMetadata,
        caption,
        captionMetadata,
        conditionalParentLabel,
        conditionalParentLabelMetadata,
        conditionalParentValue,
        conditionalParentValueMetadata,
        customTabId,
        customTabIdMetadata,
        documentId,
        documentIdMetadata,
        errorDetails,
        formOrder,
        formOrderMetadata,
        formPageLabel,
        formPageLabelMetadata,
        formPageNumber,
        formPageNumberMetadata,
        groupLabel,
        groupLabelMetadata,
        groupRule,
        groupRuleMetadata,
        height,
        heightMetadata,
        maximumAllowed,
        maximumAllowedMetadata,
        mergeField,
        mergeFieldXml,
        minimumRequired,
        minimumRequiredMetadata,
        pageNumber,
        pageNumberMetadata,
        recipientId,
        recipientIdGuid,
        recipientIdGuidMetadata,
        recipientIdMetadata,
        smartContractInformation,
        source,
        status,
        statusMetadata,
        tabGroupLabels,
        tabGroupLabelsMetadata,
        tabId,
        tabIdMetadata,
        tabOrder,
        tabOrderMetadata,
        tabScope,
        tabScopeMetadata,
        tabType,
        tabTypeMetadata,
        templateLocked,
        templateLockedMetadata,
        templateRequired,
        templateRequiredMetadata,
        tooltip,
        toolTipMetadata,
        validationMessage,
        validationMessageMetadata,
        width,
        widthMetadata,
        xPosition,
        xPositionMetadata,
        yPosition,
        yPositionMetadata);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabGroup {\n");

    sb.append("    anchorAllowWhiteSpaceInCharacters: ")
        .append(toIndentedString(anchorAllowWhiteSpaceInCharacters))
        .append("\n");
    sb.append("    anchorAllowWhiteSpaceInCharactersMetadata: ")
        .append(toIndentedString(anchorAllowWhiteSpaceInCharactersMetadata))
        .append("\n");
    sb.append("    anchorCaseSensitive: ")
        .append(toIndentedString(anchorCaseSensitive))
        .append("\n");
    sb.append("    anchorCaseSensitiveMetadata: ")
        .append(toIndentedString(anchorCaseSensitiveMetadata))
        .append("\n");
    sb.append("    anchorHorizontalAlignment: ")
        .append(toIndentedString(anchorHorizontalAlignment))
        .append("\n");
    sb.append("    anchorHorizontalAlignmentMetadata: ")
        .append(toIndentedString(anchorHorizontalAlignmentMetadata))
        .append("\n");
    sb.append("    anchorIgnoreIfNotPresent: ")
        .append(toIndentedString(anchorIgnoreIfNotPresent))
        .append("\n");
    sb.append("    anchorIgnoreIfNotPresentMetadata: ")
        .append(toIndentedString(anchorIgnoreIfNotPresentMetadata))
        .append("\n");
    sb.append("    anchorMatchWholeWord: ")
        .append(toIndentedString(anchorMatchWholeWord))
        .append("\n");
    sb.append("    anchorMatchWholeWordMetadata: ")
        .append(toIndentedString(anchorMatchWholeWordMetadata))
        .append("\n");
    sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
    sb.append("    anchorStringMetadata: ")
        .append(toIndentedString(anchorStringMetadata))
        .append("\n");
    sb.append("    anchorTabProcessorVersion: ")
        .append(toIndentedString(anchorTabProcessorVersion))
        .append("\n");
    sb.append("    anchorTabProcessorVersionMetadata: ")
        .append(toIndentedString(anchorTabProcessorVersionMetadata))
        .append("\n");
    sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    sb.append("    anchorUnitsMetadata: ")
        .append(toIndentedString(anchorUnitsMetadata))
        .append("\n");
    sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    sb.append("    anchorXOffsetMetadata: ")
        .append(toIndentedString(anchorXOffsetMetadata))
        .append("\n");
    sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    sb.append("    anchorYOffsetMetadata: ")
        .append(toIndentedString(anchorYOffsetMetadata))
        .append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    captionMetadata: ").append(toIndentedString(captionMetadata)).append("\n");
    sb.append("    conditionalParentLabel: ")
        .append(toIndentedString(conditionalParentLabel))
        .append("\n");
    sb.append("    conditionalParentLabelMetadata: ")
        .append(toIndentedString(conditionalParentLabelMetadata))
        .append("\n");
    sb.append("    conditionalParentValue: ")
        .append(toIndentedString(conditionalParentValue))
        .append("\n");
    sb.append("    conditionalParentValueMetadata: ")
        .append(toIndentedString(conditionalParentValueMetadata))
        .append("\n");
    sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    sb.append("    customTabIdMetadata: ")
        .append(toIndentedString(customTabIdMetadata))
        .append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentIdMetadata: ").append(toIndentedString(documentIdMetadata)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    formOrder: ").append(toIndentedString(formOrder)).append("\n");
    sb.append("    formOrderMetadata: ").append(toIndentedString(formOrderMetadata)).append("\n");
    sb.append("    formPageLabel: ").append(toIndentedString(formPageLabel)).append("\n");
    sb.append("    formPageLabelMetadata: ")
        .append(toIndentedString(formPageLabelMetadata))
        .append("\n");
    sb.append("    formPageNumber: ").append(toIndentedString(formPageNumber)).append("\n");
    sb.append("    formPageNumberMetadata: ")
        .append(toIndentedString(formPageNumberMetadata))
        .append("\n");
    sb.append("    groupLabel: ").append(toIndentedString(groupLabel)).append("\n");
    sb.append("    groupLabelMetadata: ").append(toIndentedString(groupLabelMetadata)).append("\n");
    sb.append("    groupRule: ").append(toIndentedString(groupRule)).append("\n");
    sb.append("    groupRuleMetadata: ").append(toIndentedString(groupRuleMetadata)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    heightMetadata: ").append(toIndentedString(heightMetadata)).append("\n");
    sb.append("    maximumAllowed: ").append(toIndentedString(maximumAllowed)).append("\n");
    sb.append("    maximumAllowedMetadata: ")
        .append(toIndentedString(maximumAllowedMetadata))
        .append("\n");
    sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    sb.append("    mergeFieldXml: ").append(toIndentedString(mergeFieldXml)).append("\n");
    sb.append("    minimumRequired: ").append(toIndentedString(minimumRequired)).append("\n");
    sb.append("    minimumRequiredMetadata: ")
        .append(toIndentedString(minimumRequiredMetadata))
        .append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageNumberMetadata: ").append(toIndentedString(pageNumberMetadata)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    recipientIdGuidMetadata: ")
        .append(toIndentedString(recipientIdGuidMetadata))
        .append("\n");
    sb.append("    recipientIdMetadata: ")
        .append(toIndentedString(recipientIdMetadata))
        .append("\n");
    sb.append("    smartContractInformation: ")
        .append(toIndentedString(smartContractInformation))
        .append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMetadata: ").append(toIndentedString(statusMetadata)).append("\n");
    sb.append("    tabGroupLabels: ").append(toIndentedString(tabGroupLabels)).append("\n");
    sb.append("    tabGroupLabelsMetadata: ")
        .append(toIndentedString(tabGroupLabelsMetadata))
        .append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    tabIdMetadata: ").append(toIndentedString(tabIdMetadata)).append("\n");
    sb.append("    tabOrder: ").append(toIndentedString(tabOrder)).append("\n");
    sb.append("    tabOrderMetadata: ").append(toIndentedString(tabOrderMetadata)).append("\n");
    sb.append("    tabScope: ").append(toIndentedString(tabScope)).append("\n");
    sb.append("    tabScopeMetadata: ").append(toIndentedString(tabScopeMetadata)).append("\n");
    sb.append("    tabType: ").append(toIndentedString(tabType)).append("\n");
    sb.append("    tabTypeMetadata: ").append(toIndentedString(tabTypeMetadata)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateLockedMetadata: ")
        .append(toIndentedString(templateLockedMetadata))
        .append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    templateRequiredMetadata: ")
        .append(toIndentedString(templateRequiredMetadata))
        .append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    toolTipMetadata: ").append(toIndentedString(toolTipMetadata)).append("\n");
    sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    sb.append("    validationMessageMetadata: ")
        .append(toIndentedString(validationMessageMetadata))
        .append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    widthMetadata: ").append(toIndentedString(widthMetadata)).append("\n");
    sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
    sb.append("    xPositionMetadata: ").append(toIndentedString(xPositionMetadata)).append("\n");
    sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
    sb.append("    yPositionMetadata: ").append(toIndentedString(yPositionMetadata)).append("\n");
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
