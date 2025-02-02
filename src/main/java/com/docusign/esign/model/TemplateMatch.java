package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TemplateMatch. */
public class TemplateMatch {
  @JsonProperty("documentEndPage")
  private String documentEndPage = null;

  @JsonProperty("documentStartPage")
  private String documentStartPage = null;

  @JsonProperty("matchPercentage")
  private String matchPercentage = null;

  /**
   * documentEndPage.
   *
   * @return TemplateMatch
   */
  public TemplateMatch documentEndPage(String documentEndPage) {
    this.documentEndPage = documentEndPage;
    return this;
  }

  /**
   * .
   *
   * @return documentEndPage
   */
  @ApiModelProperty(value = "")
  public String getDocumentEndPage() {
    return documentEndPage;
  }

  /** setDocumentEndPage. */
  public void setDocumentEndPage(String documentEndPage) {
    this.documentEndPage = documentEndPage;
  }

  /**
   * documentStartPage.
   *
   * @return TemplateMatch
   */
  public TemplateMatch documentStartPage(String documentStartPage) {
    this.documentStartPage = documentStartPage;
    return this;
  }

  /**
   * .
   *
   * @return documentStartPage
   */
  @ApiModelProperty(value = "")
  public String getDocumentStartPage() {
    return documentStartPage;
  }

  /** setDocumentStartPage. */
  public void setDocumentStartPage(String documentStartPage) {
    this.documentStartPage = documentStartPage;
  }

  /**
   * matchPercentage.
   *
   * @return TemplateMatch
   */
  public TemplateMatch matchPercentage(String matchPercentage) {
    this.matchPercentage = matchPercentage;
    return this;
  }

  /**
   * .
   *
   * @return matchPercentage
   */
  @ApiModelProperty(value = "")
  public String getMatchPercentage() {
    return matchPercentage;
  }

  /** setMatchPercentage. */
  public void setMatchPercentage(String matchPercentage) {
    this.matchPercentage = matchPercentage;
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
    TemplateMatch templateMatch = (TemplateMatch) o;
    return Objects.equals(this.documentEndPage, templateMatch.documentEndPage)
        && Objects.equals(this.documentStartPage, templateMatch.documentStartPage)
        && Objects.equals(this.matchPercentage, templateMatch.matchPercentage);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(documentEndPage, documentStartPage, matchPercentage);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateMatch {\n");

    sb.append("    documentEndPage: ").append(toIndentedString(documentEndPage)).append("\n");
    sb.append("    documentStartPage: ").append(toIndentedString(documentStartPage)).append("\n");
    sb.append("    matchPercentage: ").append(toIndentedString(matchPercentage)).append("\n");
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
