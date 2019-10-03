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
 * RiskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-01T12:15:30.989+05:30")
public class RiskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination {
  @SerializedName("country")
  private String country = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("latitude")
  private String latitude = null;

  @SerializedName("longitude")
  private String longitude = null;

  public RiskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of actual final destination on the route.
   * @return country
  **/
  @ApiModelProperty(value = "Country of actual final destination on the route.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City of actual final destination on the route.
   * @return locality
  **/
  @ApiModelProperty(value = "City of actual final destination on the route.")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude of actual final destination on the route.
   * @return latitude
  **/
  @ApiModelProperty(value = "Latitude of actual final destination on the route.")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude of actual final destination on the route.
   * @return longitude
  **/
  @ApiModelProperty(value = "Longitude of actual final destination on the route.")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination riskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination = (RiskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination) o;
    return Objects.equals(this.country, riskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination.country) &&
        Objects.equals(this.locality, riskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination.locality) &&
        Objects.equals(this.latitude, riskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination.latitude) &&
        Objects.equals(this.longitude, riskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, locality, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

