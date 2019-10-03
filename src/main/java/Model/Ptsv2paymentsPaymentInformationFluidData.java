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
 * Ptsv2paymentsPaymentInformationFluidData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-01T12:15:30.989+05:30")
public class Ptsv2paymentsPaymentInformationFluidData {
  @SerializedName("keySerialNumber")
  private String keySerialNumber = null;

  @SerializedName("descriptor")
  private String descriptor = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("encoding")
  private String encoding = null;

  public Ptsv2paymentsPaymentInformationFluidData keySerialNumber(String keySerialNumber) {
    this.keySerialNumber = keySerialNumber;
    return this;
  }

   /**
   * The encoded or encrypted value that a payment solution returns for an authorization request. For details about the valid values for a key, see [Creating an Online Authorization](https://developer.cybersource.com/api/developer-guides/dita-payments/CreatingOnlineAuth.html) 
   * @return keySerialNumber
  **/
  @ApiModelProperty(value = "The encoded or encrypted value that a payment solution returns for an authorization request. For details about the valid values for a key, see [Creating an Online Authorization](https://developer.cybersource.com/api/developer-guides/dita-payments/CreatingOnlineAuth.html) ")
  public String getKeySerialNumber() {
    return keySerialNumber;
  }

  public void setKeySerialNumber(String keySerialNumber) {
    this.keySerialNumber = keySerialNumber;
  }

  public Ptsv2paymentsPaymentInformationFluidData descriptor(String descriptor) {
    this.descriptor = descriptor;
    return this;
  }

   /**
   * The identifier for a payment solution, which is sending the encrypted payment data to CyberSource for decryption. Valid values: - Samsung Pay: &#x60;RklEPUNPTU1PTi5TQU1TVU5HLklOQVBQLlBBWU1FTlQ&#x3D;&#x60; **NOTE**: For other payment solutions, the value may be specific to the customer&#39;s mobile device. For example, the descriptor for a Bluefin payment encryption would be a device-generated descriptor.  For details about the list of payment solution identifiers, see [Creating an Online Authorization](https://developer.cybersource.com/api/developer-guides/dita-payments/CreatingOnlineAuth.html).  For details about the encrypted payment data, see the &#x60;encrypted_payment_descriptor&#x60; field description in the [Card-Present Processing Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm). 
   * @return descriptor
  **/
  @ApiModelProperty(value = "The identifier for a payment solution, which is sending the encrypted payment data to CyberSource for decryption. Valid values: - Samsung Pay: `RklEPUNPTU1PTi5TQU1TVU5HLklOQVBQLlBBWU1FTlQ=` **NOTE**: For other payment solutions, the value may be specific to the customer's mobile device. For example, the descriptor for a Bluefin payment encryption would be a device-generated descriptor.  For details about the list of payment solution identifiers, see [Creating an Online Authorization](https://developer.cybersource.com/api/developer-guides/dita-payments/CreatingOnlineAuth.html).  For details about the encrypted payment data, see the `encrypted_payment_descriptor` field description in the [Card-Present Processing Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm). ")
  public String getDescriptor() {
    return descriptor;
  }

  public void setDescriptor(String descriptor) {
    this.descriptor = descriptor;
  }

  public Ptsv2paymentsPaymentInformationFluidData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Represents the encrypted payment data BLOB. The entry for this field is dependent on the payment solution a merchant uses.  For details, see [Creating an Online Authorization](https://developer.cybersource.com/api/developer-guides/dita-payments/CreatingOnlineAuth.html) for the specific payment- solution entry. 
   * @return value
  **/
  @ApiModelProperty(value = "Represents the encrypted payment data BLOB. The entry for this field is dependent on the payment solution a merchant uses.  For details, see [Creating an Online Authorization](https://developer.cybersource.com/api/developer-guides/dita-payments/CreatingOnlineAuth.html) for the specific payment- solution entry. ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Ptsv2paymentsPaymentInformationFluidData encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Encoding method used to encrypt the payment data.  Valid value: Base64 
   * @return encoding
  **/
  @ApiModelProperty(value = "Encoding method used to encrypt the payment data.  Valid value: Base64 ")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsPaymentInformationFluidData ptsv2paymentsPaymentInformationFluidData = (Ptsv2paymentsPaymentInformationFluidData) o;
    return Objects.equals(this.keySerialNumber, ptsv2paymentsPaymentInformationFluidData.keySerialNumber) &&
        Objects.equals(this.descriptor, ptsv2paymentsPaymentInformationFluidData.descriptor) &&
        Objects.equals(this.value, ptsv2paymentsPaymentInformationFluidData.value) &&
        Objects.equals(this.encoding, ptsv2paymentsPaymentInformationFluidData.encoding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keySerialNumber, descriptor, value, encoding);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPaymentInformationFluidData {\n");
    
    sb.append("    keySerialNumber: ").append(toIndentedString(keySerialNumber)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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

