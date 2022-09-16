# StoresApi

All URIs are relative to *https://api.rawg.io/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**storesList**](StoresApi.md#storesList) | **GET** /stores | Get a list of video game storefronts. |
| [**storesRead**](StoresApi.md#storesRead) | **GET** /stores/{id} | Get details of the store. |



## storesList

> StoresList200Response storesList(ordering, page, pageSize)

Get a list of video game storefronts.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoresApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        StoresApi apiInstance = new StoresApi(defaultClient);
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        Integer page = 56; // Integer | A page number within the paginated result set.
        Integer pageSize = 56; // Integer | Number of results to return per page.
        try {
            StoresList200Response result = apiInstance.storesList(ordering, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StoresApi#storesList");
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
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |

### Return type

[**StoresList200Response**](StoresList200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## storesRead

> StoreSingle storesRead(id)

Get details of the store.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoresApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        StoresApi apiInstance = new StoresApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this Store.
        try {
            StoreSingle result = apiInstance.storesRead(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StoresApi#storesRead");
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
| **id** | **Integer**| A unique integer value identifying this Store. | |

### Return type

[**StoreSingle**](StoreSingle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

