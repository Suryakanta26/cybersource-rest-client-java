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
 * Ptsv2paymentsOrderInformationAmountDetailsSurcharge
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-01T12:15:30.989+05:30")
public class Ptsv2paymentsOrderInformationAmountDetailsSurcharge {
  @SerializedName("amount")
  private String amount = null;

  @SerializedName("description")
  private String description = null;

  public Ptsv2paymentsOrderInformationAmountDetailsSurcharge amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The surcharge amount is included in the total transaction amount but is passed in a separate field to the issuer and acquirer for tracking. The issuer can provide information about the surcharge amount to the customer.  If the amount is positive, then it is a debit for the customer.\\ If the amount is negative, then it is a credit for the customer.  **NOTE**: This field is supported only for CyberSource through VisaNet (CtV) for Payouts. For CtV, the maximum string length is 8.  For processor-specific information, see the surcharge_amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return amount
  **/
  @ApiModelProperty(value = "The surcharge amount is included in the total transaction amount but is passed in a separate field to the issuer and acquirer for tracking. The issuer can provide information about the surcharge amount to the customer.  If the amount is positive, then it is a debit for the customer.\\ If the amount is negative, then it is a credit for the customer.  **NOTE**: This field is supported only for CyberSource through VisaNet (CtV) for Payouts. For CtV, the maximum string length is 8.  For processor-specific information, see the surcharge_amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsSurcharge description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Merchant-defined field for describing the surcharge amount.
   * @return description
  **/
  @ApiModelProperty(value = "Merchant-defined field for describing the surcharge amount.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsOrderInformationAmountDetailsSurcharge ptsv2paymentsOrderInformationAmountDetailsSurcharge = (Ptsv2paymentsOrderInformationAmountDetailsSurcharge) o;
    return Objects.equals(this.amount, ptsv2paymentsOrderInformationAmountDetailsSurcharge.amount) &&
        Objects.equals(this.description, ptsv2paymentsOrderInformationAmountDetailsSurcharge.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsOrderInformationAmountDetailsSurcharge {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

