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
import Model.Ptsv2paymentsPaymentInformationPaymentTypeMethod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsPaymentInformationPaymentType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-16T17:43:55.224+05:30")
public class Ptsv2paymentsPaymentInformationPaymentType {
  @SerializedName("name")
  private String name = null;

  @SerializedName("subTypeName")
  private String subTypeName = null;

  @SerializedName("method")
  private Ptsv2paymentsPaymentInformationPaymentTypeMethod method = null;

  public Ptsv2paymentsPaymentInformationPaymentType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A Payment Type is an agreed means for a payee to receive legal tender from a payer. The way one pays for a commercial financial transaction. Examples: Card, Bank Transfer, Digital, Direct Debit. Possible values: - &#x60;CARD&#x60; (use this for a PIN debit transaction) 
   * @return name
  **/
  @ApiModelProperty(value = "A Payment Type is an agreed means for a payee to receive legal tender from a payer. The way one pays for a commercial financial transaction. Examples: Card, Bank Transfer, Digital, Direct Debit. Possible values: - `CARD` (use this for a PIN debit transaction) ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ptsv2paymentsPaymentInformationPaymentType subTypeName(String subTypeName) {
    this.subTypeName = subTypeName;
    return this;
  }

   /**
   * SubType Name is detail information about Payment Type. Examples: For Card, if Credit or Debit or PrePaid. For Bank Transfer, if Online Bank Transfer or Wire Transfers. - &#x60;DEBIT&#x60; (use this for a PIN debit transaction) 
   * @return subTypeName
  **/
  @ApiModelProperty(value = "SubType Name is detail information about Payment Type. Examples: For Card, if Credit or Debit or PrePaid. For Bank Transfer, if Online Bank Transfer or Wire Transfers. - `DEBIT` (use this for a PIN debit transaction) ")
  public String getSubTypeName() {
    return subTypeName;
  }

  public void setSubTypeName(String subTypeName) {
    this.subTypeName = subTypeName;
  }

  public Ptsv2paymentsPaymentInformationPaymentType method(Ptsv2paymentsPaymentInformationPaymentTypeMethod method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationPaymentTypeMethod getMethod() {
    return method;
  }

  public void setMethod(Ptsv2paymentsPaymentInformationPaymentTypeMethod method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsPaymentInformationPaymentType ptsv2paymentsPaymentInformationPaymentType = (Ptsv2paymentsPaymentInformationPaymentType) o;
    return Objects.equals(this.name, ptsv2paymentsPaymentInformationPaymentType.name) &&
        Objects.equals(this.subTypeName, ptsv2paymentsPaymentInformationPaymentType.subTypeName) &&
        Objects.equals(this.method, ptsv2paymentsPaymentInformationPaymentType.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subTypeName, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPaymentInformationPaymentType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subTypeName: ").append(toIndentedString(subTypeName)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

