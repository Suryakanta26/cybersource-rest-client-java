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
import Model.PtsV2PaymentsPost201ResponsePointOfSaleInformationEmv;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201ResponsePointOfSaleInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-01T12:15:30.989+05:30")
public class PtsV2PaymentsPost201ResponsePointOfSaleInformation {
  @SerializedName("emv")
  private PtsV2PaymentsPost201ResponsePointOfSaleInformationEmv emv = null;

  @SerializedName("amexCapnData")
  private String amexCapnData = null;

  public PtsV2PaymentsPost201ResponsePointOfSaleInformation emv(PtsV2PaymentsPost201ResponsePointOfSaleInformationEmv emv) {
    this.emv = emv;
    return this;
  }

   /**
   * Get emv
   * @return emv
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePointOfSaleInformationEmv getEmv() {
    return emv;
  }

  public void setEmv(PtsV2PaymentsPost201ResponsePointOfSaleInformationEmv emv) {
    this.emv = emv;
  }

  public PtsV2PaymentsPost201ResponsePointOfSaleInformation amexCapnData(String amexCapnData) {
    this.amexCapnData = amexCapnData;
    return this;
  }

   /**
   * Point-of-sale details for the transaction. This value is returned only for **American Express Direct**. CyberSource generates this value, which consists of a series of codes that identify terminal capability, security data, and specific conditions present at the time the transaction occurred. To comply with the CAPN requirements, this value must be included in all subsequent follow-on requests, such as captures and follow-on credits.  When you perform authorizations, captures, and credits through CyberSource, CyberSource passes this value from the authorization service to the subsequent services for you. However, when you perform authorizations through CyberSource and perform subsequent services through other financial institutions, you must ensure that your requests for captures and credits include this value.  For details, see &#x60;auth_pos_data&#x60; field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return amexCapnData
  **/
  @ApiModelProperty(value = "Point-of-sale details for the transaction. This value is returned only for **American Express Direct**. CyberSource generates this value, which consists of a series of codes that identify terminal capability, security data, and specific conditions present at the time the transaction occurred. To comply with the CAPN requirements, this value must be included in all subsequent follow-on requests, such as captures and follow-on credits.  When you perform authorizations, captures, and credits through CyberSource, CyberSource passes this value from the authorization service to the subsequent services for you. However, when you perform authorizations through CyberSource and perform subsequent services through other financial institutions, you must ensure that your requests for captures and credits include this value.  For details, see `auth_pos_data` field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getAmexCapnData() {
    return amexCapnData;
  }

  public void setAmexCapnData(String amexCapnData) {
    this.amexCapnData = amexCapnData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePointOfSaleInformation ptsV2PaymentsPost201ResponsePointOfSaleInformation = (PtsV2PaymentsPost201ResponsePointOfSaleInformation) o;
    return Objects.equals(this.emv, ptsV2PaymentsPost201ResponsePointOfSaleInformation.emv) &&
        Objects.equals(this.amexCapnData, ptsV2PaymentsPost201ResponsePointOfSaleInformation.amexCapnData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emv, amexCapnData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePointOfSaleInformation {\n");
    
    sb.append("    emv: ").append(toIndentedString(emv)).append("\n");
    sb.append("    amexCapnData: ").append(toIndentedString(amexCapnData)).append("\n");
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

