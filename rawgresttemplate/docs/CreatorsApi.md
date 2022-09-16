# CreatorsApi

All URIs are relative to *https://api.rawg.io/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**creatorsList**](CreatorsApi.md#creatorsList) | **GET** /creators | Get a list of game creators. |
| [**creatorsRead**](CreatorsApi.md#creatorsRead) | **GET** /creators/{id} | Get details of the creator. |



## creatorsList

> CreatorsList200Response creatorsList(page, pageSize)

Get a list of game creators.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreatorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        CreatorsApi apiInstance = new CreatorsApi(defaultClient);
        Integer page = 56; // Integer | A page number within the paginated result set.
        Integer pageSize = 56; // Integer | Number of results to return per page.
        try {
            CreatorsList200Response result = apiInstance.creatorsList(page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreatorsApi#creatorsList");
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

[**CreatorsList200Response**](CreatorsList200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## creatorsRead

> PersonSingle creatorsRead(id)

Get details of the creator.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreatorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        CreatorsApi apiInstance = new CreatorsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            PersonSingle result = apiInstance.creatorsRead(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreatorsApi#creatorsRead");
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
| **id** | **String**|  | |

### Return type

[**PersonSingle**](PersonSingle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

