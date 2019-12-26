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
 * TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksNext
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-16T17:43:55.224+05:30")
public class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksNext {
  @SerializedName("href")
  private String href = null;

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksNext href(String href) {
    this.href = href;
    return this;
  }

   /**
   * A link to the next collection starting at the supplied offset plus the supplied limit.
   * @return href
  **/
  @ApiModelProperty(example = "https://api.cybersource.com/tms/v1/instrumentidentifiers/5B32CE6167B09343E05333B9D30A53E1/paymentinstruments?offset=25&limit=5", value = "A link to the next collection starting at the supplied offset plus the supplied limit.")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksNext tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksNext = (TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksNext) o;
    return Objects.equals(this.href, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksNext.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksNext {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

