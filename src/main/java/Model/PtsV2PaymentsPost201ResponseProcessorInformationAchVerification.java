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
 * PtsV2PaymentsPost201ResponseProcessorInformationAchVerification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-01T12:15:30.989+05:30")
public class PtsV2PaymentsPost201ResponseProcessorInformationAchVerification {
  @SerializedName("resultCode")
  private String resultCode = null;

  @SerializedName("resultCodeRaw")
  private String resultCodeRaw = null;

  public PtsV2PaymentsPost201ResponseProcessorInformationAchVerification resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * Results from the ACH verification service. For details about this service and the possible values for the results, see \&quot;ACH Verification\&quot; and \&quot;Verification Codes\&quot; in the [Electronic Check Services Using the SCMP API](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm). 
   * @return resultCode
  **/
  @ApiModelProperty(value = "Results from the ACH verification service. For details about this service and the possible values for the results, see \"ACH Verification\" and \"Verification Codes\" in the [Electronic Check Services Using the SCMP API](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm). ")
  public String getResultCode() {
    return resultCode;
  }

  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationAchVerification resultCodeRaw(String resultCodeRaw) {
    this.resultCodeRaw = resultCodeRaw;
    return this;
  }

   /**
   * Raw results from the ACH verification service. For details about this service and the possible values for the raw results, see \&quot;ACH Verification\&quot; and \&quot;Verification Codes\&quot; in the [Electronic Check Services Using the SCMP API](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm). 
   * @return resultCodeRaw
  **/
  @ApiModelProperty(value = "Raw results from the ACH verification service. For details about this service and the possible values for the raw results, see \"ACH Verification\" and \"Verification Codes\" in the [Electronic Check Services Using the SCMP API](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm). ")
  public String getResultCodeRaw() {
    return resultCodeRaw;
  }

  public void setResultCodeRaw(String resultCodeRaw) {
    this.resultCodeRaw = resultCodeRaw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseProcessorInformationAchVerification ptsV2PaymentsPost201ResponseProcessorInformationAchVerification = (PtsV2PaymentsPost201ResponseProcessorInformationAchVerification) o;
    return Objects.equals(this.resultCode, ptsV2PaymentsPost201ResponseProcessorInformationAchVerification.resultCode) &&
        Objects.equals(this.resultCodeRaw, ptsV2PaymentsPost201ResponseProcessorInformationAchVerification.resultCodeRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultCode, resultCodeRaw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseProcessorInformationAchVerification {\n");
    
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultCodeRaw: ").append(toIndentedString(resultCodeRaw)).append("\n");
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

