# DevelopersApi

All URIs are relative to *https://api.rawg.io/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**developersList**](DevelopersApi.md#developersList) | **GET** /developers | Get a list of game developers. |
| [**developersRead**](DevelopersApi.md#developersRead) | **GET** /developers/{id} | Get details of the developer. |



## developersList

> DevelopersList200Response developersList(page, pageSize)

Get a list of game developers.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DevelopersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        DevelopersApi apiInstance = new DevelopersApi(defaultClient);
        Integer page = 56; // Integer | A page number within the paginated result set.
        Integer pageSize = 56; // Integer | Number of results to return per page.
        try {
            DevelopersList200Response result = apiInstance.developersList(page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DevelopersApi#developersList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |

### Return type

[**DevelopersList200Response**](DevelopersList200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## developersRead

> DeveloperSingle developersRead(id)

Get details of the developer.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DevelopersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        DevelopersApi apiInstance = new DevelopersApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this Developer.
        try {
            DeveloperSingle result = apiInstance.developersRead(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DevelopersApi#developersRead");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Developer. | |

### Return type

[**DeveloperSingle**](DeveloperSingle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

