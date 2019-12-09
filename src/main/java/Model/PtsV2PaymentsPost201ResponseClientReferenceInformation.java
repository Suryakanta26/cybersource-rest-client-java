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
 * PtsV2PaymentsPost201ResponseClientReferenceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-09T15:49:19.042+05:30")
public class PtsV2PaymentsPost201ResponseClientReferenceInformation {
  @SerializedName("code")
  private String code = null;

  @SerializedName("submitLocalDateTime")
  private String submitLocalDateTime = null;

  @SerializedName("ownerMerchantId")
  private String ownerMerchantId = null;

  public PtsV2PaymentsPost201ResponseClientReferenceInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Client-generated order reference or tracking number. CyberSource recommends that you send a unique value for each transaction so that you can perform meaningful searches for the transaction.  For information about tracking orders, see \&quot;Tracking and Reconciling Your Orders\&quot; in [Getting Started with CyberSource Advanced for the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Getting_Started_SCMP/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  #### FDC Nashville Global Certain circumstances can cause the processor to truncate this value to 15 or 17 characters for Level II and Level III processing, which can cause a discrepancy between the value you submit and the value included in some processor reports. 
   * @return code
  **/
  @ApiModelProperty(value = "Client-generated order reference or tracking number. CyberSource recommends that you send a unique value for each transaction so that you can perform meaningful searches for the transaction.  For information about tracking orders, see \"Tracking and Reconciling Your Orders\" in [Getting Started with CyberSource Advanced for the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Getting_Started_SCMP/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  #### FDC Nashville Global Certain circumstances can cause the processor to truncate this value to 15 or 17 characters for Level II and Level III processing, which can cause a discrepancy between the value you submit and the value included in some processor reports. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PtsV2PaymentsPost201ResponseClientReferenceInformation submitLocalDateTime(String submitLocalDateTime) {
    this.submitLocalDateTime = submitLocalDateTime;
    return this;
  }

   /**
   * Date and time at your physical location.  Format: &#x60;YYYYMMDDhhmmss&#x60;, where YYYY &#x3D; year, MM &#x3D; month, DD &#x3D; day, hh &#x3D; hour, mm &#x3D; minutes ss &#x3D; seconds 
   * @return submitLocalDateTime
  **/
  @ApiModelProperty(value = "Date and time at your physical location.  Format: `YYYYMMDDhhmmss`, where YYYY = year, MM = month, DD = day, hh = hour, mm = minutes ss = seconds ")
  public String getSubmitLocalDateTime() {
    return submitLocalDateTime;
  }

  public void setSubmitLocalDateTime(String submitLocalDateTime) {
    this.submitLocalDateTime = submitLocalDateTime;
  }

  public PtsV2PaymentsPost201ResponseClientReferenceInformation ownerMerchantId(String ownerMerchantId) {
    this.ownerMerchantId = ownerMerchantId;
    return this;
  }

   /**
   * Merchant ID that was used to create the subscription or customer profile for which the service was requested.  If your CyberSource account is enabled for Recurring Billing, this field is returned only if you are using subscription sharing and if your merchant ID is in the same merchant ID pool as the owner merchant ID.  If your CyberSource account is enabled for Payment Tokenization, this field is returned only if you are using profile sharing and if your merchant ID is in the same merchant ID pool as the owner merchant ID.  For details about how this field is used for Recurring Billing or Payment Tokenization, see the &#x60;ecp_debit_owner_merchant_id&#x60; field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return ownerMerchantId
  **/
  @ApiModelProperty(value = "Merchant ID that was used to create the subscription or customer profile for which the service was requested.  If your CyberSource account is enabled for Recurring Billing, this field is returned only if you are using subscription sharing and if your merchant ID is in the same merchant ID pool as the owner merchant ID.  If your CyberSource account is enabled for Payment Tokenization, this field is returned only if you are using profile sharing and if your merchant ID is in the same merchant ID pool as the owner merchant ID.  For details about how this field is used for Recurring Billing or Payment Tokenization, see the `ecp_debit_owner_merchant_id` field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getOwnerMerchantId() {
    return ownerMerchantId;
  }

  public void setOwnerMerchantId(String ownerMerchantId) {
    this.ownerMerchantId = ownerMerchantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseClientReferenceInformation ptsV2PaymentsPost201ResponseClientReferenceInformation = (PtsV2PaymentsPost201ResponseClientReferenceInformation) o;
    return Objects.equals(this.code, ptsV2PaymentsPost201ResponseClientReferenceInformation.code) &&
        Objects.equals(this.submitLocalDateTime, ptsV2PaymentsPost201ResponseClientReferenceInformation.submitLocalDateTime) &&
        Objects.equals(this.ownerMerchantId, ptsV2PaymentsPost201ResponseClientReferenceInformation.ownerMerchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, submitLocalDateTime, ownerMerchantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseClientReferenceInformation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    submitLocalDateTime: ").append(toIndentedString(submitLocalDateTime)).append("\n");
    sb.append("    ownerMerchantId: ").append(toIndentedString(ownerMerchantId)).append("\n");
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

