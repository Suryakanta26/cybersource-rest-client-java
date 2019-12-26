/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsProcessingInformationCaptureOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-16T17:43:55.224+05:30")
public class Ptsv2paymentsProcessingInformationCaptureOptions {
  @SerializedName("captureSequenceNumber")
  private Integer captureSequenceNumber = null;

  @SerializedName("totalCaptureCount")
  private Integer totalCaptureCount = null;

  @SerializedName("dateToCapture")
  private String dateToCapture = null;

  public Ptsv2paymentsProcessingInformationCaptureOptions captureSequenceNumber(Integer captureSequenceNumber) {
    this.captureSequenceNumber = captureSequenceNumber;
    return this;
  }

   /**
   * Capture number when requesting multiple partial captures for one authorization. Used along with &#x60;totalCaptureCount&#x60; to track which capture is being processed.  For example, the second of five captures would be passed to CyberSource as:   - &#x60;captureSequenceNumber_ &#x3D; 2&#x60;, and   - &#x60;totalCaptureCount &#x3D; 5&#x60; 
   * minimum: 1
   * maximum: 99
   * @return captureSequenceNumber
  **/
  @ApiModelProperty(value = "Capture number when requesting multiple partial captures for one authorization. Used along with `totalCaptureCount` to track which capture is being processed.  For example, the second of five captures would be passed to CyberSource as:   - `captureSequenceNumber_ = 2`, and   - `totalCaptureCount = 5` ")
  public Integer getCaptureSequenceNumber() {
    return captureSequenceNumber;
  }

  public void setCaptureSequenceNumber(Integer captureSequenceNumber) {
    this.captureSequenceNumber = captureSequenceNumber;
  }

  public Ptsv2paymentsProcessingInformationCaptureOptions totalCaptureCount(Integer totalCaptureCount) {
    this.totalCaptureCount = totalCaptureCount;
    return this;
  }

   /**
   * Total number of captures when requesting multiple partial captures for one payment. Used along with &#x60;captureSequenceNumber&#x60; field to track which capture is being processed.  For example, the second of five captures would be passed to CyberSource as:   - &#x60;captureSequenceNumber &#x3D; 2&#x60;, and   - &#x60;totalCaptureCount &#x3D; 5&#x60; 
   * minimum: 1
   * maximum: 99
   * @return totalCaptureCount
  **/
  @ApiModelProperty(value = "Total number of captures when requesting multiple partial captures for one payment. Used along with `captureSequenceNumber` field to track which capture is being processed.  For example, the second of five captures would be passed to CyberSource as:   - `captureSequenceNumber = 2`, and   - `totalCaptureCount = 5` ")
  public Integer getTotalCaptureCount() {
    return totalCaptureCount;
  }

  public void setTotalCaptureCount(Integer totalCaptureCount) {
    this.totalCaptureCount = totalCaptureCount;
  }

  public Ptsv2paymentsProcessingInformationCaptureOptions dateToCapture(String dateToCapture) {
    this.dateToCapture = dateToCapture;
    return this;
  }

   /**
   * Date on which you want the capture to occur. This field is supported only for CyberSource through VisaNet.\\ &#x60;Format: MMDD&#x60; 
   * @return dateToCapture
  **/
  @ApiModelProperty(value = "Date on which you want the capture to occur. This field is supported only for CyberSource through VisaNet.\\ `Format: MMDD` ")
  public String getDateToCapture() {
    return dateToCapture;
  }

  public void setDateToCapture(String dateToCapture) {
    this.dateToCapture = dateToCapture;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsProcessingInformationCaptureOptions ptsv2paymentsProcessingInformationCaptureOptions = (Ptsv2paymentsProcessingInformationCaptureOptions) o;
    return Objects.equals(this.captureSequenceNumber, ptsv2paymentsProcessingInformationCaptureOptions.captureSequenceNumber) &&
        Objects.equals(this.totalCaptureCount, ptsv2paymentsProcessingInformationCaptureOptions.totalCaptureCount) &&
        Objects.equals(this.dateToCapture, ptsv2paymentsProcessingInformationCaptureOptions.dateToCapture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(captureSequenceNumber, totalCaptureCount, dateToCapture);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsProcessingInformationCaptureOptions {\n");
    
    sb.append("    captureSequenceNumber: ").append(toIndentedString(captureSequenceNumber)).append("\n");
    sb.append("    totalCaptureCount: ").append(toIndentedString(totalCaptureCount)).append("\n");
    sb.append("    dateToCapture: ").append(toIndentedString(dateToCapture)).append("\n");
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

