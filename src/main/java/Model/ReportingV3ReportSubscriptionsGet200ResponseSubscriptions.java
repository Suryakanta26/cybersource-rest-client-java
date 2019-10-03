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
import Model.Reportingv3reportsReportPreferences;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Subscription Details
 */
@ApiModel(description = "Subscription Details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-01T12:15:30.989+05:30")
public class ReportingV3ReportSubscriptionsGet200ResponseSubscriptions {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("reportDefinitionId")
  private String reportDefinitionId = null;

  @SerializedName("reportDefinitionName")
  private String reportDefinitionName = null;

  @SerializedName("reportMimeType")
  private String reportMimeType = null;

  @SerializedName("reportFrequency")
  private String reportFrequency = null;

  @SerializedName("reportName")
  private String reportName = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("startDay")
  private Integer startDay = null;

  @SerializedName("reportFields")
  private List<String> reportFields = null;

  @SerializedName("reportFilters")
  private Map<String, List<String>> reportFilters = null;

  @SerializedName("reportPreferences")
  private Reportingv3reportsReportPreferences reportPreferences = null;

  @SerializedName("groupId")
  private String groupId = null;

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Selected Organization Id
   * @return organizationId
  **/
  @ApiModelProperty(example = "Merchant 1", value = "Selected Organization Id")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions reportDefinitionId(String reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
    return this;
  }

   /**
   * Report Definition Id
   * @return reportDefinitionId
  **/
  @ApiModelProperty(example = "210", value = "Report Definition Id")
  public String getReportDefinitionId() {
    return reportDefinitionId;
  }

  public void setReportDefinitionId(String reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
  }

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions reportDefinitionName(String reportDefinitionName) {
    this.reportDefinitionName = reportDefinitionName;
    return this;
  }

   /**
   * Report Definition Class
   * @return reportDefinitionName
  **/
  @ApiModelProperty(example = "TransactionRequestDetailClass", value = "Report Definition Class")
  public String getReportDefinitionName() {
    return reportDefinitionName;
  }

  public void setReportDefinitionName(String reportDefinitionName) {
    this.reportDefinitionName = reportDefinitionName;
  }

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions reportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
    return this;
  }

   /**
   * Report Format                          Valid values: - application/xml - text/csv 
   * @return reportMimeType
  **/
  @ApiModelProperty(example = "application/xml", value = "Report Format                          Valid values: - application/xml - text/csv ")
  public String getReportMimeType() {
    return reportMimeType;
  }

  public void setReportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
  }

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions reportFrequency(String reportFrequency) {
    this.reportFrequency = reportFrequency;
    return this;
  }

   /**
   * &#39;Report Frequency&#39;  Valid values: - DAILY - WEEKLY - MONTHLY - ADHOC 
   * @return reportFrequency
  **/
  @ApiModelProperty(example = "DAILY", value = "'Report Frequency'  Valid values: - DAILY - WEEKLY - MONTHLY - ADHOC ")
  public String getReportFrequency() {
    return reportFrequency;
  }

  public void setReportFrequency(String reportFrequency) {
    this.reportFrequency = reportFrequency;
  }

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Report Name
   * @return reportName
  **/
  @ApiModelProperty(example = "My Transaction Request Detail Report", value = "Report Name")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Time Zone
   * @return timezone
  **/
  @ApiModelProperty(example = "America/Chicago", value = "Time Zone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Start Time
   * @return startTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Start Time")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions startDay(Integer startDay) {
    this.startDay = startDay;
    return this;
  }

   /**
   * Start Day
   * @return startDay
  **/
  @ApiModelProperty(example = "1", value = "Start Day")
  public Integer getStartDay() {
    return startDay;
  }

  public void setStartDay(Integer startDay) {
    this.startDay = startDay;
  }

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions reportFields(List<String> reportFields) {
    this.reportFields = reportFields;
    return this;
  }

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions addReportFieldsItem(String reportFieldsItem) {
    if (this.reportFields == null) {
      this.reportFields = new ArrayList<String>();
    }
    this.reportFields.add(reportFieldsItem);
    return this;
  }

   /**
   * List of all fields String values
   * @return reportFields
  **/
  @ApiModelProperty(example = "[\"Request.RequestID\",\"Request.TransactionDate\",\"Request.MerchantID\"]", value = "List of all fields String values")
  public List<String> getReportFields() {
    return reportFields;
  }

  public void setReportFields(List<String> reportFields) {
    this.reportFields = reportFields;
  }

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions reportFilters(Map<String, List<String>> reportFilters) {
    this.reportFilters = reportFilters;
    return this;
  }

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions putReportFiltersItem(String key, List<String> reportFiltersItem) {
    if (this.reportFilters == null) {
      this.reportFilters = new HashMap<String, List<String>>();
    }
    this.reportFilters.put(key, reportFiltersItem);
    return this;
  }

   /**
   * List of filters to apply
   * @return reportFilters
  **/
  @ApiModelProperty(example = "{\"Application.Name\":[\"ics_auth\",\"ics_bill\"]}", value = "List of filters to apply")
  public Map<String, List<String>> getReportFilters() {
    return reportFilters;
  }

  public void setReportFilters(Map<String, List<String>> reportFilters) {
    this.reportFilters = reportFilters;
  }

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions reportPreferences(Reportingv3reportsReportPreferences reportPreferences) {
    this.reportPreferences = reportPreferences;
    return this;
  }

   /**
   * Get reportPreferences
   * @return reportPreferences
  **/
  @ApiModelProperty(value = "")
  public Reportingv3reportsReportPreferences getReportPreferences() {
    return reportPreferences;
  }

  public void setReportPreferences(Reportingv3reportsReportPreferences reportPreferences) {
    this.reportPreferences = reportPreferences;
  }

  public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Id for the selected group.
   * @return groupId
  **/
  @ApiModelProperty(example = "12345", value = "Id for the selected group.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ReportSubscriptionsGet200ResponseSubscriptions reportingV3ReportSubscriptionsGet200ResponseSubscriptions = (ReportingV3ReportSubscriptionsGet200ResponseSubscriptions) o;
    return Objects.equals(this.organizationId, reportingV3ReportSubscriptionsGet200ResponseSubscriptions.organizationId) &&
        Objects.equals(this.reportDefinitionId, reportingV3ReportSubscriptionsGet200ResponseSubscriptions.reportDefinitionId) &&
        Objects.equals(this.reportDefinitionName, reportingV3ReportSubscriptionsGet200ResponseSubscriptions.reportDefinitionName) &&
        Objects.equals(this.reportMimeType, reportingV3ReportSubscriptionsGet200ResponseSubscriptions.reportMimeType) &&
        Objects.equals(this.reportFrequency, reportingV3ReportSubscriptionsGet200ResponseSubscriptions.reportFrequency) &&
        Objects.equals(this.reportName, reportingV3ReportSubscriptionsGet200ResponseSubscriptions.reportName) &&
        Objects.equals(this.timezone, reportingV3ReportSubscriptionsGet200ResponseSubscriptions.timezone) &&
        Objects.equals(this.startTime, reportingV3ReportSubscriptionsGet200ResponseSubscriptions.startTime) &&
        Objects.equals(this.startDay, reportingV3ReportSubscriptionsGet200ResponseSubscriptions.startDay) &&
        Objects.equals(this.reportFields, reportingV3ReportSubscriptionsGet200ResponseSubscriptions.reportFields) &&
        Objects.equals(this.reportFilters, reportingV3ReportSubscriptionsGet200ResponseSubscriptions.reportFilters) &&
        Objects.equals(this.reportPreferences, reportingV3ReportSubscriptionsGet200ResponseSubscriptions.reportPreferences) &&
        Objects.equals(this.groupId, reportingV3ReportSubscriptionsGet200ResponseSubscriptions.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, reportDefinitionId, reportDefinitionName, reportMimeType, reportFrequency, reportName, timezone, startTime, startDay, reportFields, reportFilters, reportPreferences, groupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ReportSubscriptionsGet200ResponseSubscriptions {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    reportDefinitionId: ").append(toIndentedString(reportDefinitionId)).append("\n");
    sb.append("    reportDefinitionName: ").append(toIndentedString(reportDefinitionName)).append("\n");
    sb.append("    reportMimeType: ").append(toIndentedString(reportMimeType)).append("\n");
    sb.append("    reportFrequency: ").append(toIndentedString(reportFrequency)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    startDay: ").append(toIndentedString(startDay)).append("\n");
    sb.append("    reportFields: ").append(toIndentedString(reportFields)).append("\n");
    sb.append("    reportFilters: ").append(toIndentedString(reportFilters)).append("\n");
    sb.append("    reportPreferences: ").append(toIndentedString(reportPreferences)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

