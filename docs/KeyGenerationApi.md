# KeyGenerationApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generatePublicKey**](KeyGenerationApi.md#generatePublicKey) | **POST** /flex/v1/keys | Generate Key


<a name="generatePublicKey"></a>
# **generatePublicKey**
> FlexV1KeysPost200Response generatePublicKey(generatePublicKeyRequest)

Generate Key

Generate a one-time use public key and key ID to encrypt the card number in the follow-on Tokenize Card request. The key used to encrypt the card number on the cardholder’s device or browser is valid for 15 minutes and must be used to verify the signature in the response message. CyberSource recommends creating a new key for each order. Generating a key is an authenticated request initiated from your servers, prior to requesting to tokenize the card data from your customer’s device or browser.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.KeyGenerationApi;


KeyGenerationApi apiInstance = new KeyGenerationApi();
GeneratePublicKeyRequest generatePublicKeyRequest = new GeneratePublicKeyRequest(); // GeneratePublicKeyRequest | 
try {
    FlexV1KeysPost200Response result = apiInstance.generatePublicKey(generatePublicKeyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyGenerationApi#generatePublicKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generatePublicKeyRequest** | [**GeneratePublicKeyRequest**](GeneratePublicKeyRequest.md)|  |

### Return type

[**FlexV1KeysPost200Response**](FlexV1KeysPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json

