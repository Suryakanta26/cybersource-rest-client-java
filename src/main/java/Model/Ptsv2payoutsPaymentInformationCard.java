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
 * Ptsv2payoutsPaymentInformationCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-01T12:15:30.989+05:30")
public class Ptsv2payoutsPaymentInformationCard {
  @SerializedName("type")
  private String type = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  @SerializedName("sourceAccountType")
  private String sourceAccountType = null;

  public Ptsv2payoutsPaymentInformationCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Three-digit value that indicates the card type.  Type of card to authorize. - 001 Visa - 002 Mastercard - 003 Amex - 004 Discover - 005: Diners Club - 007: JCB - 024: Maestro (UK Domestic) - 039 Encoded account number - 042: Maestro (International)  For the complete list of possible values, see &#x60;card_type&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return type
  **/
  @ApiModelProperty(value = "Three-digit value that indicates the card type.  Type of card to authorize. - 001 Visa - 002 Mastercard - 003 Amex - 004 Discover - 005: Diners Club - 007: JCB - 024: Maestro (UK Domestic) - 039 Encoded account number - 042: Maestro (International)  For the complete list of possible values, see `card_type` field description in the [Credit Card Services Using the SCMP API Guide.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ptsv2payoutsPaymentInformationCard number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The customer’s payment card number, also knows as the Primary Account Nunmber (PAN). You can also use this field for encoded account numbers.  For processor-specific information, see the &#x60;customer_cc_number&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return number
  **/
  @ApiModelProperty(value = "The customer’s payment card number, also knows as the Primary Account Nunmber (PAN). You can also use this field for encoded account numbers.  For processor-specific information, see the `customer_cc_number` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Ptsv2payoutsPaymentInformationCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Two-digit month in which the payment card expires.  Format: &#x60;MM&#x60;.  Valid values: &#x60;01&#x60; through &#x60;12&#x60;.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (&#x60;01&#x60; through &#x60;12&#x60;) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (_type_&#x3D;039), if there is no expiration date on the card, use &#x60;12&#x60;.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  For processor-specific information, see the &#x60;customer_cc_expmo&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "Two-digit month in which the payment card expires.  Format: `MM`.  Valid values: `01` through `12`.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (`01` through `12`) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (_type_=039), if there is no expiration date on the card, use `12`.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  For processor-specific information, see the `customer_cc_expmo` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public Ptsv2payoutsPaymentInformationCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Four-digit year in which the credit card expires.  Format: &#x60;YYYY&#x60;.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (&#x60;1900&#x60; through &#x60;3000&#x60;) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (**_type_**&#x60;&#x3D;039&#x60;), if there is no expiration date on the card, use &#x60;2021&#x60;.  #### FDC Nashville Global and FDMS South You can send in 2 digits or 4 digits. If you send in 2 digits, they must be the last 2 digits of the year.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  For processor-specific information, see the &#x60;customer_cc_expyr&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return expirationYear
  **/
  @ApiModelProperty(value = "Four-digit year in which the credit card expires.  Format: `YYYY`.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (`1900` through `3000`) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (**_type_**`=039`), if there is no expiration date on the card, use `2021`.  #### FDC Nashville Global and FDMS South You can send in 2 digits or 4 digits. If you send in 2 digits, they must be the last 2 digits of the year.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  For processor-specific information, see the `customer_cc_expyr` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public Ptsv2payoutsPaymentInformationCard sourceAccountType(String sourceAccountType) {
    this.sourceAccountType = sourceAccountType;
    return this;
  }

   /**
   * Flag that specifies the type of account associated with the card. The cardholder provides this information during the payment process.  This field is required in the following cases:   - Debit transactions on Cielo and Comercio Latino.   - Transactions with Brazilian-issued cards on CyberSource through VisaNet.   - Applicable only for CyberSource through VisaNet (CtV).      **Note** Combo cards in Brazil contain credit and debit functionality in a single card. Visa systems use a credit bank identification number (BIN) for this type of card. Using the BIN to determine whether a card is debit or credit can cause transactions with these cards to be processed incorrectly. CyberSource strongly recommends that you include this field for combo card transactions.  Possible values include the following.   - &#x60;CHECKING&#x60;: Checking account  - &#x60;CREDIT&#x60;: Credit card account  - &#x60;SAVING&#x60;: Saving account  - &#x60;LINE_OF_CREDIT&#x60;: Line of credit or credit portion of combo card  - &#x60;PREPAID&#x60;: Prepaid card account or prepaid portion of combo card  - &#x60;UNIVERSAL&#x60;: Universal account 
   * @return sourceAccountType
  **/
  @ApiModelProperty(value = "Flag that specifies the type of account associated with the card. The cardholder provides this information during the payment process.  This field is required in the following cases:   - Debit transactions on Cielo and Comercio Latino.   - Transactions with Brazilian-issued cards on CyberSource through VisaNet.   - Applicable only for CyberSource through VisaNet (CtV).      **Note** Combo cards in Brazil contain credit and debit functionality in a single card. Visa systems use a credit bank identification number (BIN) for this type of card. Using the BIN to determine whether a card is debit or credit can cause transactions with these cards to be processed incorrectly. CyberSource strongly recommends that you include this field for combo card transactions.  Possible values include the following.   - `CHECKING`: Checking account  - `CREDIT`: Credit card account  - `SAVING`: Saving account  - `LINE_OF_CREDIT`: Line of credit or credit portion of combo card  - `PREPAID`: Prepaid card account or prepaid portion of combo card  - `UNIVERSAL`: Universal account ")
  public String getSourceAccountType() {
    return sourceAccountType;
  }

  public void setSourceAccountType(String sourceAccountType) {
    this.sourceAccountType = sourceAccountType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2payoutsPaymentInformationCard ptsv2payoutsPaymentInformationCard = (Ptsv2payoutsPaymentInformationCard) o;
    return Objects.equals(this.type, ptsv2payoutsPaymentInformationCard.type) &&
        Objects.equals(this.number, ptsv2payoutsPaymentInformationCard.number) &&
        Objects.equals(this.expirationMonth, ptsv2payoutsPaymentInformationCard.expirationMonth) &&
        Objects.equals(this.expirationYear, ptsv2payoutsPaymentInformationCard.expirationYear) &&
        Objects.equals(this.sourceAccountType, ptsv2payoutsPaymentInformationCard.sourceAccountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, number, expirationMonth, expirationYear, sourceAccountType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2payoutsPaymentInformationCard {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    sourceAccountType: ").append(toIndentedString(sourceAccountType)).append("\n");
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

