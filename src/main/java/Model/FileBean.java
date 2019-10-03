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
 * FileBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-01T12:15:30.989+05:30")
public class FileBean {
  @SerializedName("fileId")
  private String fileId = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("method")
  private String method = null;

  public FileBean fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * Unique identifier for each file
   * @return fileId
  **/
  @ApiModelProperty(example = "AC855F9F42C90361EC78202F47CDE98D70BEAA6FB00FB56AE83EE9A9DAEE077B", value = "Unique identifier for each file")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public FileBean href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(example = "/sfs/v1/files/AC855F9F42C90361EC78202F47CDE98D70BEAA6FB00FB56AE83EE9A9DAEE077B", value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public FileBean method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(example = "GET", value = "")
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
    FileBean fileBean = (FileBean) o;
    return Objects.equals(this.fileId, fileBean.fileId) &&
        Objects.equals(this.href, fileBean.href) &&
        Objects.equals(this.method, fileBean.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, href, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileBean {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
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

