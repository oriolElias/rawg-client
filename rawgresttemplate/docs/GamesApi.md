# GamesApi

All URIs are relative to *https://api.rawg.io/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gamesAchievementsRead**](GamesApi.md#gamesAchievementsRead) | **GET** /games/{id}/achievements | Get a list of game achievements. |
| [**gamesAdditionsList**](GamesApi.md#gamesAdditionsList) | **GET** /games/{game_pk}/additions | Get a list of DLC&#39;s for the game, GOTY and other editions, companion apps, etc. |
| [**gamesDevelopmentTeamList**](GamesApi.md#gamesDevelopmentTeamList) | **GET** /games/{game_pk}/development-team | Get a list of individual creators that were part of the development team. |
| [**gamesGameSeriesList**](GamesApi.md#gamesGameSeriesList) | **GET** /games/{game_pk}/game-series | Get a list of games that are part of the same series. |
| [**gamesList**](GamesApi.md#gamesList) | **GET** /games | Get a list of games. |
| [**gamesMoviesRead**](GamesApi.md#gamesMoviesRead) | **GET** /games/{id}/movies | Get a list of game trailers. |
| [**gamesParentGamesList**](GamesApi.md#gamesParentGamesList) | **GET** /games/{game_pk}/parent-games | Get a list of parent games for DLC&#39;s and editions. |
| [**gamesRead**](GamesApi.md#gamesRead) | **GET** /games/{id} | Get details of the game. |
| [**gamesRedditRead**](GamesApi.md#gamesRedditRead) | **GET** /games/{id}/reddit | Get a list of most recent posts from the game&#39;s subreddit. |
| [**gamesScreenshotsList**](GamesApi.md#gamesScreenshotsList) | **GET** /games/{game_pk}/screenshots | Get screenshots for the game. |
| [**gamesStoresList**](GamesApi.md#gamesStoresList) | **GET** /games/{game_pk}/stores | Get links to the stores that sell the game. |
| [**gamesSuggestedRead**](GamesApi.md#gamesSuggestedRead) | **GET** /games/{id}/suggested | Get a list of visually similar games, available only for business and enterprise API users. |
| [**gamesTwitchRead**](GamesApi.md#gamesTwitchRead) | **GET** /games/{id}/twitch | Get streams on Twitch associated with the game, available only for business and enterprise API users. |
| [**gamesYoutubeRead**](GamesApi.md#gamesYoutubeRead) | **GET** /games/{id}/youtube | Get videos from YouTube associated with the game, available only for business and enterprise API users. |



## gamesAchievementsRead

> ParentAchievement gamesAchievementsRead(id)

Get a list of game achievements.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GamesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GamesApi apiInstance = new GamesApi(defaultClient);
        String id = "id_example"; // String | An ID or a slug identifying this Game.
        try {
            ParentAchievement result = apiInstance.gamesAchievementsRead(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GamesApi#gamesAchievementsRead");
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
| **id** | **String**| An ID or a slug identifying this Game. | |

### Return type

[**ParentAchievement**](ParentAchievement.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gamesAdditionsList

> GamesList200Response gamesAdditionsList(gamePk, page, pageSize)

Get a list of DLC&#39;s for the game, GOTY and other editions, companion apps, etc.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GamesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GamesApi apiInstance = new GamesApi(defaultClient);
        String gamePk = "gamePk_example"; // String | 
        Integer page = 56; // Integer | A page number within the paginated result set.
        Integer pageSize = 56; // Integer | Number of results to return per page.
        try {
            GamesList200Response result = apiInstance.gamesAdditionsList(gamePk, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GamesApi#gamesAdditionsList");
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
| **gamePk** | **String**|  | |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |

### Return type

[**GamesList200Response**](GamesList200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gamesDevelopmentTeamList

> GamesDevelopmentTeamList200Response gamesDevelopmentTeamList(gamePk, ordering, page, pageSize)

Get a list of individual creators that were part of the development team.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GamesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GamesApi apiInstance = new GamesApi(defaultClient);
        String gamePk = "gamePk_example"; // String | 
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        Integer page = 56; // Integer | A page number within the paginated result set.
        Integer pageSize = 56; // Integer | Number of results to return per page.
        try {
            GamesDevelopmentTeamList200Response result = apiInstance.gamesDevelopmentTeamList(gamePk, ordering, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GamesApi#gamesDevelopmentTeamList");
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
| **gamePk** | **String**|  | |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |

### Return type

[**GamesDevelopmentTeamList200Response**](GamesDevelopmentTeamList200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gamesGameSeriesList

> GamesList200Response gamesGameSeriesList(gamePk, page, pageSize)

Get a list of games that are part of the same series.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GamesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GamesApi apiInstance = new GamesApi(defaultClient);
        String gamePk = "gamePk_example"; // String | 
        Integer page = 56; // Integer | A page number within the paginated result set.
        Integer pageSize = 56; // Integer | Number of results to return per page.
        try {
            GamesList200Response result = apiInstance.gamesGameSeriesList(gamePk, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GamesApi#gamesGameSeriesList");
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
| **gamePk** | **String**|  | |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |

### Return type

[**GamesList200Response**](GamesList200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gamesList

> GamesList200Response gamesList(page, pageSize, search, searchPrecise, searchExact, parentPlatforms, platforms, stores, developers, publishers, genres, tags, creators, dates, updated, platformsCount, metacritic, excludeCollection, excludeAdditions, excludeParents, excludeGameSeries, excludeStores, ordering)

Get a list of games.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GamesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GamesApi apiInstance = new GamesApi(defaultClient);
        Integer page = 56; // Integer | A page number within the paginated result set.
        Integer pageSize = 56; // Integer | Number of results to return per page.
        String search = "search_example"; // String | Search query.
        Boolean searchPrecise = true; // Boolean | Disable fuzziness for the search query.
        Boolean searchExact = true; // Boolean | Mark the search query as exact.
        String parentPlatforms = "parentPlatforms_example"; // String | Filter by parent platforms, for example: `1,2,3`.
        String platforms = "platforms_example"; // String | Filter by platforms, for example: `4,5`.
        String stores = "stores_example"; // String | Filter by stores, for example: `5,6`.
        String developers = "developers_example"; // String | Filter by developers, for example: `1612,18893` or `valve-software,feral-interactive`.
        String publishers = "publishers_example"; // String | Filter by publishers, for example: `354,20987` or `electronic-arts,microsoft-studios`.
        String genres = "genres_example"; // String | Filter by genres, for example: `4,51` or `action,indie`.
        String tags = "tags_example"; // String | Filter by tags, for example: `31,7` or `singleplayer,multiplayer`.
        String creators = "creators_example"; // String | Filter by creators, for example: `78,28` or `cris-velasco,mike-morasky`.
        String dates = "dates_example"; // String | Filter by a release date, for example: `2010-01-01,2018-12-31.1960-01-01,1969-12-31`.
        String updated = "updated_example"; // String | Filter by an update date, for example: `2020-12-01,2020-12-31`.
        Integer platformsCount = 56; // Integer | Filter by platforms count, for example: `1`.
        String metacritic = "metacritic_example"; // String | Filter by a metacritic rating, for example: `80,100`.
        Integer excludeCollection = 56; // Integer | Exclude games from a particular collection, for example: `123`.
        Boolean excludeAdditions = true; // Boolean | Exclude additions.
        Boolean excludeParents = true; // Boolean | Exclude games which have additions.
        Boolean excludeGameSeries = true; // Boolean | Exclude games which included in a game series.
        String excludeStores = "excludeStores_example"; // String | Exclude stores, for example: `5,6`.
        String ordering = "ordering_example"; // String | Available fields: `name`, `released`, `added`, `created`, `updated`, `rating`, `metacritic`. You can reverse the sort order adding a hyphen, for example: `-released`.
        try {
            GamesList200Response result = apiInstance.gamesList(page, pageSize, search, searchPrecise, searchExact, parentPlatforms, platforms, stores, developers, publishers, genres, tags, creators, dates, updated, platformsCount, metacritic, excludeCollection, excludeAdditions, excludeParents, excludeGameSeries, excludeStores, ordering);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GamesApi#gamesList");
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
| **search** | **String**| Search query. | [optional] |
| **searchPrecise** | **Boolean**| Disable fuzziness for the search query. | [optional] |
| **searchExact** | **Boolean**| Mark the search query as exact. | [optional] |
| **parentPlatforms** | **String**| Filter by parent platforms, for example: &#x60;1,2,3&#x60;. | [optional] |
| **platforms** | **String**| Filter by platforms, for example: &#x60;4,5&#x60;. | [optional] |
| **stores** | **String**| Filter by stores, for example: &#x60;5,6&#x60;. | [optional] |
| **developers** | **String**| Filter by developers, for example: &#x60;1612,18893&#x60; or &#x60;valve-software,feral-interactive&#x60;. | [optional] |
| **publishers** | **String**| Filter by publishers, for example: &#x60;354,20987&#x60; or &#x60;electronic-arts,microsoft-studios&#x60;. | [optional] |
| **genres** | **String**| Filter by genres, for example: &#x60;4,51&#x60; or &#x60;action,indie&#x60;. | [optional] |
| **tags** | **String**| Filter by tags, for example: &#x60;31,7&#x60; or &#x60;singleplayer,multiplayer&#x60;. | [optional] |
| **creators** | **String**| Filter by creators, for example: &#x60;78,28&#x60; or &#x60;cris-velasco,mike-morasky&#x60;. | [optional] |
| **dates** | **String**| Filter by a release date, for example: &#x60;2010-01-01,2018-12-31.1960-01-01,1969-12-31&#x60;. | [optional] |
| **updated** | **String**| Filter by an update date, for example: &#x60;2020-12-01,2020-12-31&#x60;. | [optional] |
| **platformsCount** | **Integer**| Filter by platforms count, for example: &#x60;1&#x60;. | [optional] |
| **metacritic** | **String**| Filter by a metacritic rating, for example: &#x60;80,100&#x60;. | [optional] |
| **excludeCollection** | **Integer**| Exclude games from a particular collection, for example: &#x60;123&#x60;. | [optional] |
| **excludeAdditions** | **Boolean**| Exclude additions. | [optional] |
| **excludeParents** | **Boolean**| Exclude games which have additions. | [optional] |
| **excludeGameSeries** | **Boolean**| Exclude games which included in a game series. | [optional] |
| **excludeStores** | **String**| Exclude stores, for example: &#x60;5,6&#x60;. | [optional] |
| **ordering** | **String**| Available fields: &#x60;name&#x60;, &#x60;released&#x60;, &#x60;added&#x60;, &#x60;created&#x60;, &#x60;updated&#x60;, &#x60;rating&#x60;, &#x60;metacritic&#x60;. You can reverse the sort order adding a hyphen, for example: &#x60;-released&#x60;. | [optional] |

### Return type

[**GamesList200Response**](GamesList200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gamesMoviesRead

> Movie gamesMoviesRead(id)

Get a list of game trailers.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GamesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GamesApi apiInstance = new GamesApi(defaultClient);
        String id = "id_example"; // String | An ID or a slug identifying this Game.
        try {
            Movie result = apiInstance.gamesMoviesRead(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GamesApi#gamesMoviesRead");
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
| **id** | **String**| An ID or a slug identifying this Game. | |

### Return type

[**Movie**](Movie.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gamesParentGamesList

> GamesList200Response gamesParentGamesList(gamePk, page, pageSize)

Get a list of parent games for DLC&#39;s and editions.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GamesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GamesApi apiInstance = new GamesApi(defaultClient);
        String gamePk = "gamePk_example"; // String | 
        Integer page = 56; // Integer | A page number within the paginated result set.
        Integer pageSize = 56; // Integer | Number of results to return per page.
        try {
            GamesList200Response result = apiInstance.gamesParentGamesList(gamePk, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GamesApi#gamesParentGamesList");
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
| **gamePk** | **String**|  | |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |

### Return type

[**GamesList200Response**](GamesList200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gamesRead

> GameSingle gamesRead(id)

Get details of the game.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GamesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GamesApi apiInstance = new GamesApi(defaultClient);
        String id = "id_example"; // String | An ID or a slug identifying this Game.
        try {
            GameSingle result = apiInstance.gamesRead(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GamesApi#gamesRead");
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
| **id** | **String**| An ID or a slug identifying this Game. | |

### Return type

[**GameSingle**](GameSingle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gamesRedditRead

> Reddit gamesRedditRead(id)

Get a list of most recent posts from the game&#39;s subreddit.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GamesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GamesApi apiInstance = new GamesApi(defaultClient);
        String id = "id_example"; // String | An ID or a slug identifying this Game.
        try {
            Reddit result = apiInstance.gamesRedditRead(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GamesApi#gamesRedditRead");
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
| **id** | **String**| An ID or a slug identifying this Game. | |

### Return type

[**Reddit**](Reddit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gamesScreenshotsList

> GamesScreenshotsList200Response gamesScreenshotsList(gamePk, ordering, page, pageSize)

Get screenshots for the game.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GamesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GamesApi apiInstance = new GamesApi(defaultClient);
        String gamePk = "gamePk_example"; // String | 
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        Integer page = 56; // Integer | A page number within the paginated result set.
        Integer pageSize = 56; // Integer | Number of results to return per page.
        try {
            GamesScreenshotsList200Response result = apiInstance.gamesScreenshotsList(gamePk, ordering, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GamesApi#gamesScreenshotsList");
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
| **gamePk** | **String**|  | |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |

### Return type

[**GamesScreenshotsList200Response**](GamesScreenshotsList200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gamesStoresList

> GamesStoresList200Response gamesStoresList(gamePk, ordering, page, pageSize)

Get links to the stores that sell the game.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GamesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GamesApi apiInstance = new GamesApi(defaultClient);
        String gamePk = "gamePk_example"; // String | 
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        Integer page = 56; // Integer | A page number within the paginated result set.
        Integer pageSize = 56; // Integer | Number of results to return per page.
        try {
            GamesStoresList200Response result = apiInstance.gamesStoresList(gamePk, ordering, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GamesApi#gamesStoresList");
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
| **gamePk** | **String**|  | |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |

### Return type

[**GamesStoresList200Response**](GamesStoresList200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gamesSuggestedRead

> GameSingle gamesSuggestedRead(id)

Get a list of visually similar games, available only for business and enterprise API users.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GamesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GamesApi apiInstance = new GamesApi(defaultClient);
        String id = "id_example"; // String | An ID or a slug identifying this Game.
        try {
            GameSingle result = apiInstance.gamesSuggestedRead(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GamesApi#gamesSuggestedRead");
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
| **id** | **String**| An ID or a slug identifying this Game. | |

### Return type

[**GameSingle**](GameSingle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gamesTwitchRead

> Twitch gamesTwitchRead(id)

Get streams on Twitch associated with the game, available only for business and enterprise API users.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GamesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GamesApi apiInstance = new GamesApi(defaultClient);
        String id = "id_example"; // String | An ID or a slug identifying this Game.
        try {
            Twitch result = apiInstance.gamesTwitchRead(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GamesApi#gamesTwitchRead");
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
| **id** | **String**| An ID or a slug identifying this Game. | |

### Return type

[**Twitch**](Twitch.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gamesYoutubeRead

> Youtube gamesYoutubeRead(id)

Get videos from YouTube associated with the game, available only for business and enterprise API users.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GamesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rawg.io/api");

        GamesApi apiInstance = new GamesApi(defaultClient);
        String id = "id_example"; // String | An ID or a slug identifying this Game.
        try {
            Youtube result = apiInstance.gamesYoutubeRead(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GamesApi#gamesYoutubeRead");
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
| **id** | **String**| An ID or a slug identifying this Game. | |

### Return type

[**Youtube**](Youtube.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

