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
import Model.Riskv1authenticationexemptionsMerchantInformationMerchantDescriptor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1authenticationexemptionsMerchantInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-22T15:22:15.661+05:30")
public class Riskv1authenticationexemptionsMerchantInformation {
  @SerializedName("visaMerchantId")
  private String visaMerchantId = null;

  @SerializedName("cardAcceptorId")
  private String cardAcceptorId = null;

  @SerializedName("merchantCategoryCode")
  private String merchantCategoryCode = null;

  @SerializedName("merchantDescriptor")
  private Riskv1authenticationexemptionsMerchantInformationMerchantDescriptor merchantDescriptor = null;

  public Riskv1authenticationexemptionsMerchantInformation visaMerchantId(String visaMerchantId) {
    this.visaMerchantId = visaMerchantId;
    return this;
  }

   /**
   * Network assigned merchant identifier. 
   * @return visaMerchantId
  **/
  @ApiModelProperty(value = "Network assigned merchant identifier. ")
  public String getVisaMerchantId() {
    return visaMerchantId;
  }

  public void setVisaMerchantId(String visaMerchantId) {
    this.visaMerchantId = visaMerchantId;
  }

  public Riskv1authenticationexemptionsMerchantInformation cardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
    return this;
  }

   /**
   * Card Acceptor ID (CAID) for the current transaction. 
   * @return cardAcceptorId
  **/
  @ApiModelProperty(value = "Card Acceptor ID (CAID) for the current transaction. ")
  public String getCardAcceptorId() {
    return cardAcceptorId;
  }

  public void setCardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
  }

  public Riskv1authenticationexemptionsMerchantInformation merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

   /**
   * Merchant Category Code (MCC). 4 digit numeric. 
   * @return merchantCategoryCode
  **/
  @ApiModelProperty(value = "Merchant Category Code (MCC). 4 digit numeric. ")
  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public Riskv1authenticationexemptionsMerchantInformation merchantDescriptor(Riskv1authenticationexemptionsMerchantInformationMerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
    return this;
  }

   /**
   * Get merchantDescriptor
   * @return merchantDescriptor
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationexemptionsMerchantInformationMerchantDescriptor getMerchantDescriptor() {
    return merchantDescriptor;
  }

  public void setMerchantDescriptor(Riskv1authenticationexemptionsMerchantInformationMerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationexemptionsMerchantInformation riskv1authenticationexemptionsMerchantInformation = (Riskv1authenticationexemptionsMerchantInformation) o;
    return Objects.equals(this.visaMerchantId, riskv1authenticationexemptionsMerchantInformation.visaMerchantId) &&
        Objects.equals(this.cardAcceptorId, riskv1authenticationexemptionsMerchantInformation.cardAcceptorId) &&
        Objects.equals(this.merchantCategoryCode, riskv1authenticationexemptionsMerchantInformation.merchantCategoryCode) &&
        Objects.equals(this.merchantDescriptor, riskv1authenticationexemptionsMerchantInformation.merchantDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visaMerchantId, cardAcceptorId, merchantCategoryCode, merchantDescriptor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationexemptionsMerchantInformation {\n");
    
    sb.append("    visaMerchantId: ").append(toIndentedString(visaMerchantId)).append("\n");
    sb.append("    cardAcceptorId: ").append(toIndentedString(cardAcceptorId)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    merchantDescriptor: ").append(toIndentedString(merchantDescriptor)).append("\n");
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

