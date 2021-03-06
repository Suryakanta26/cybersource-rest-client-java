# TokenizationApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tokenize**](TokenizationApi.md#tokenize) | **POST** /flex/v1/tokens | Tokenize card


<a name="tokenize"></a>
# **tokenize**
> FlexV1TokensPost200Response tokenize(tokenizeRequest)

Tokenize card

Returns a token representing the supplied card details. The token replaces card data and can be used as the Subscription ID in the CyberSource Simple Order API or SCMP API. This is an unauthenticated call that you should initiate from your customer’s device or browser.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TokenizationApi;


TokenizationApi apiInstance = new TokenizationApi();
TokenizeRequest tokenizeRequest = new TokenizeRequest(); // TokenizeRequest | 
try {
    FlexV1TokensPost200Response result = apiInstance.tokenize(tokenizeRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenizationApi#tokenize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenizeRequest** | [**TokenizeRequest**](TokenizeRequest.md)|  |

### Return type

[**FlexV1TokensPost200Response**](FlexV1TokensPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json

