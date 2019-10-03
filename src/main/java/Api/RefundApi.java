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


package Api;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import Model.PtsV2PaymentsPost502Response;
import Model.PtsV2PaymentsRefundPost201Response;
import Model.PtsV2PaymentsRefundPost400Response;
import Model.RefundCaptureRequest;
import Model.RefundPaymentRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RefundApi {
    private ApiClient apiClient;

    public RefundApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RefundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for refundCapture
     * @param refundCaptureRequest  (required)
     * @param id The capture ID. This ID is returned from a previous capture request. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call refundCaptureCall(RefundCaptureRequest refundCaptureRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = refundCaptureRequest;
        
        // create path and map variables
        String localVarPath = "/pts/v2/captures/{id}/refunds"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call refundCaptureValidateBeforeCall(RefundCaptureRequest refundCaptureRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'refundCaptureRequest' is set
        if (refundCaptureRequest == null) {
            throw new ApiException("Missing the required parameter 'refundCaptureRequest' when calling refundCapture(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling refundCapture(Async)");
        }
        
        
        com.squareup.okhttp.Call call = refundCaptureCall(refundCaptureRequest, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Refund a Capture
     * Include the capture ID in the POST request to refund the captured amount. 
     * @param refundCaptureRequest  (required)
     * @param id The capture ID. This ID is returned from a previous capture request. (required)
     * @return PtsV2PaymentsRefundPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2PaymentsRefundPost201Response refundCapture(RefundCaptureRequest refundCaptureRequest, String id) throws ApiException {
        ApiResponse<PtsV2PaymentsRefundPost201Response> resp = refundCaptureWithHttpInfo(refundCaptureRequest, id);
        return resp.getData();
    }

    /**
     * Refund a Capture
     * Include the capture ID in the POST request to refund the captured amount. 
     * @param refundCaptureRequest  (required)
     * @param id The capture ID. This ID is returned from a previous capture request. (required)
     * @return ApiResponse&lt;PtsV2PaymentsRefundPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2PaymentsRefundPost201Response> refundCaptureWithHttpInfo(RefundCaptureRequest refundCaptureRequest, String id) throws ApiException {
        com.squareup.okhttp.Call call = refundCaptureValidateBeforeCall(refundCaptureRequest, id, null, null);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsRefundPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Refund a Capture (asynchronously)
     * Include the capture ID in the POST request to refund the captured amount. 
     * @param refundCaptureRequest  (required)
     * @param id The capture ID. This ID is returned from a previous capture request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call refundCaptureAsync(RefundCaptureRequest refundCaptureRequest, String id, final ApiCallback<PtsV2PaymentsRefundPost201Response> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = refundCaptureValidateBeforeCall(refundCaptureRequest, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsRefundPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for refundPayment
     * @param refundPaymentRequest  (required)
     * @param id The payment ID. This ID is returned from a previous payment request. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call refundPaymentCall(RefundPaymentRequest refundPaymentRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = refundPaymentRequest;
        
        // create path and map variables
        String localVarPath = "/pts/v2/payments/{id}/refunds"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call refundPaymentValidateBeforeCall(RefundPaymentRequest refundPaymentRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'refundPaymentRequest' is set
        if (refundPaymentRequest == null) {
            throw new ApiException("Missing the required parameter 'refundPaymentRequest' when calling refundPayment(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling refundPayment(Async)");
        }
        
        
        com.squareup.okhttp.Call call = refundPaymentCall(refundPaymentRequest, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Refund a Payment
     * Include the payment ID in the POST request to refund the payment amount. 
     * @param refundPaymentRequest  (required)
     * @param id The payment ID. This ID is returned from a previous payment request. (required)
     * @return PtsV2PaymentsRefundPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2PaymentsRefundPost201Response refundPayment(RefundPaymentRequest refundPaymentRequest, String id) throws ApiException {
        ApiResponse<PtsV2PaymentsRefundPost201Response> resp = refundPaymentWithHttpInfo(refundPaymentRequest, id);
        return resp.getData();
    }

    /**
     * Refund a Payment
     * Include the payment ID in the POST request to refund the payment amount. 
     * @param refundPaymentRequest  (required)
     * @param id The payment ID. This ID is returned from a previous payment request. (required)
     * @return ApiResponse&lt;PtsV2PaymentsRefundPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2PaymentsRefundPost201Response> refundPaymentWithHttpInfo(RefundPaymentRequest refundPaymentRequest, String id) throws ApiException {
        com.squareup.okhttp.Call call = refundPaymentValidateBeforeCall(refundPaymentRequest, id, null, null);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsRefundPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Refund a Payment (asynchronously)
     * Include the payment ID in the POST request to refund the payment amount. 
     * @param refundPaymentRequest  (required)
     * @param id The payment ID. This ID is returned from a previous payment request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call refundPaymentAsync(RefundPaymentRequest refundPaymentRequest, String id, final ApiCallback<PtsV2PaymentsRefundPost201Response> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = refundPaymentValidateBeforeCall(refundPaymentRequest, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsRefundPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
