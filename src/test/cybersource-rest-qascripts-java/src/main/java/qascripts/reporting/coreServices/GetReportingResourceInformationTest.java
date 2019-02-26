package qascripts.reporting.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.ReportDefinitionsApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.ReportingV3ReportDefinitionsGet200Response;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class GetReportingResourceInformationTest {

	public static void main(String args[]) throws Exception {
		GetReportingResourceInformationTest getReportingResourceInformationTest = new GetReportingResourceInformationTest();
		getReportingResourceInformationTest.process();
	}

	public ReportingV3ReportDefinitionsGet200Response process() throws Exception {
		ReportingV3ReportDefinitionsGet200Response response = null;
		Properties merchantProp;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Reporting\\CoreServices\\GetReportingResourceInformation.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				ReportDefinitionsApi reportDefinitionsApi = new ReportDefinitionsApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = reportDefinitionsApi.getResourceV2Info(columns[1]);
				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_REPORTING_RESOURCE_INFORMATION,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_REPORTING_RESOURCE_INFORMATION,
							ConstantUtility.ASSERTION_PASS, columns[2], null, apiClient.getResponseCode(),
							Boolean.TRUE);
				}
			} catch (ApiException e) {
				String reason = null;
				if (apiClient.getRespBody() == null) {
					reason = e.getMessage();
				} else {
					try {
						JSONObject jsonObject = new JSONObject(apiClient.getRespBody());
						reason = jsonObject.getString("message");
					} catch (JSONException exp) {
						reason = apiClient.getRespBody();
					}
				}
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_REPORTING_RESOURCE_INFORMATION, ConstantUtility.FAIL,
						reason, null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_REPORTING_RESOURCE_INFORMATION, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}