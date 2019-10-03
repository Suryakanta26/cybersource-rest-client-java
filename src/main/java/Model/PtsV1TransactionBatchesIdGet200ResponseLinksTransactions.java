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
 * PtsV1TransactionBatchesIdGet200ResponseLinksTransactions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-01T12:15:30.989+05:30")
public class PtsV1TransactionBatchesIdGet200ResponseLinksTransactions {
  @SerializedName("href")
  private String href = null;

  @SerializedName("method")
  private String method = null;

  public PtsV1TransactionBatchesIdGet200ResponseLinksTransactions href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Self link for this request
   * @return href
  **/
  @ApiModelProperty(example = "/tss/v2/transactions/5289798134206292501013", value = "Self link for this request")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PtsV1TransactionBatchesIdGet200ResponseLinksTransactions method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
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
    PtsV1TransactionBatchesIdGet200ResponseLinksTransactions ptsV1TransactionBatchesIdGet200ResponseLinksTransactions = (PtsV1TransactionBatchesIdGet200ResponseLinksTransactions) o;
    return Objects.equals(this.href, ptsV1TransactionBatchesIdGet200ResponseLinksTransactions.href) &&
        Objects.equals(this.method, ptsV1TransactionBatchesIdGet200ResponseLinksTransactions.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV1TransactionBatchesIdGet200ResponseLinksTransactions {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

