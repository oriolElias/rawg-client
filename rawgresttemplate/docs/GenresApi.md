# GenresApi

All URIs are relative to *https://api.rawg.io/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**genresList**](GenresApi.md#genresList) | **GET** /genres | Get a list of video game genres. |
| [**genresRead**](GenresApi.md#genresRead) | **GET** /genres/{id} | Get details of the genre. |



## genresList

> GenresList200Response genresList(ordering, page, pageSize)

Get a list of video game genres.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GenresApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GenresApi apiInstance = new GenresApi(defaultClient);
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        Integer page = 56; // Integer | A page number within the paginated result set.
        Integer pageSize = 56; // Integer | Number of results to return per page.
        try {
            GenresList200Response result = apiInstance.genresList(ordering, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenresApi#genresList");
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

[**GenresList200Response**](GenresList200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## genresRead

> GenreSingle genresRead(id)

Get details of the genre.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GenresApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GenresApi apiInstance = new GenresApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this Genre.
        try {
            GenreSingle result = apiInstance.genresRead(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenresApi#genresRead");
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
| **id** | **Integer**| A unique integer value identifying this Genre. | |

### Return type

[**GenreSingle**](GenreSingle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

