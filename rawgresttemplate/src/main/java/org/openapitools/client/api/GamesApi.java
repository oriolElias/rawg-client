package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GameSingle;
import org.openapitools.client.model.GamesDevelopmentTeamList200Response;
import org.openapitools.client.model.GamesList200Response;
import org.openapitools.client.model.GamesScreenshotsList200Response;
import org.openapitools.client.model.GamesStoresList200Response;
import org.openapitools.client.model.Movie;
import org.openapitools.client.model.ParentAchievement;
import org.openapitools.client.model.Reddit;
import org.openapitools.client.model.Twitch;
import org.openapitools.client.model.Youtube;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T10:31:14.408Z[UTC]")
@Component("org.openapitools.client.api.GamesApi")
public class GamesApi {
    private ApiClient apiClient;

    public GamesApi() {
        this(new ApiClient());
    }

    @Autowired
    public GamesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a list of game achievements.
     * 
     * <p><b>200</b> - 
     * @param id An ID or a slug identifying this Game. (required)
     * @return ParentAchievement
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ParentAchievement gamesAchievementsRead(String id) throws RestClientException {
        return gamesAchievementsReadWithHttpInfo(id).getBody();
    }

    /**
     * Get a list of game achievements.
     * 
     * <p><b>200</b> - 
     * @param id An ID or a slug identifying this Game. (required)
     * @return ResponseEntity&lt;ParentAchievement&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ParentAchievement> gamesAchievementsReadWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling gamesAchievementsRead");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ParentAchievement> localReturnType = new ParameterizedTypeReference<ParentAchievement>() {};
        return apiClient.invokeAPI("/games/{id}/achievements", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of DLC&#39;s for the game, GOTY and other editions, companion apps, etc.
     * 
     * <p><b>200</b> - 
     * @param gamePk  (required)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return GamesList200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GamesList200Response gamesAdditionsList(String gamePk, Integer page, Integer pageSize) throws RestClientException {
        return gamesAdditionsListWithHttpInfo(gamePk, page, pageSize).getBody();
    }

    /**
     * Get a list of DLC&#39;s for the game, GOTY and other editions, companion apps, etc.
     * 
     * <p><b>200</b> - 
     * @param gamePk  (required)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return ResponseEntity&lt;GamesList200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GamesList200Response> gamesAdditionsListWithHttpInfo(String gamePk, Integer page, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'gamePk' is set
        if (gamePk == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gamePk' when calling gamesAdditionsList");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("game_pk", gamePk);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GamesList200Response> localReturnType = new ParameterizedTypeReference<GamesList200Response>() {};
        return apiClient.invokeAPI("/games/{game_pk}/additions", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of individual creators that were part of the development team.
     * 
     * <p><b>200</b> - 
     * @param gamePk  (required)
     * @param ordering Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return GamesDevelopmentTeamList200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GamesDevelopmentTeamList200Response gamesDevelopmentTeamList(String gamePk, String ordering, Integer page, Integer pageSize) throws RestClientException {
        return gamesDevelopmentTeamListWithHttpInfo(gamePk, ordering, page, pageSize).getBody();
    }

    /**
     * Get a list of individual creators that were part of the development team.
     * 
     * <p><b>200</b> - 
     * @param gamePk  (required)
     * @param ordering Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return ResponseEntity&lt;GamesDevelopmentTeamList200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GamesDevelopmentTeamList200Response> gamesDevelopmentTeamListWithHttpInfo(String gamePk, String ordering, Integer page, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'gamePk' is set
        if (gamePk == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gamePk' when calling gamesDevelopmentTeamList");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("game_pk", gamePk);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "ordering", ordering));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GamesDevelopmentTeamList200Response> localReturnType = new ParameterizedTypeReference<GamesDevelopmentTeamList200Response>() {};
        return apiClient.invokeAPI("/games/{game_pk}/development-team", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of games that are part of the same series.
     * 
     * <p><b>200</b> - 
     * @param gamePk  (required)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return GamesList200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GamesList200Response gamesGameSeriesList(String gamePk, Integer page, Integer pageSize) throws RestClientException {
        return gamesGameSeriesListWithHttpInfo(gamePk, page, pageSize).getBody();
    }

    /**
     * Get a list of games that are part of the same series.
     * 
     * <p><b>200</b> - 
     * @param gamePk  (required)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return ResponseEntity&lt;GamesList200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GamesList200Response> gamesGameSeriesListWithHttpInfo(String gamePk, Integer page, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'gamePk' is set
        if (gamePk == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gamePk' when calling gamesGameSeriesList");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("game_pk", gamePk);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GamesList200Response> localReturnType = new ParameterizedTypeReference<GamesList200Response>() {};
        return apiClient.invokeAPI("/games/{game_pk}/game-series", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of games.
     * 
     * <p><b>200</b> - 
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param search Search query. (optional)
     * @param searchPrecise Disable fuzziness for the search query. (optional)
     * @param searchExact Mark the search query as exact. (optional)
     * @param parentPlatforms Filter by parent platforms, for example: &#x60;1,2,3&#x60;. (optional)
     * @param platforms Filter by platforms, for example: &#x60;4,5&#x60;. (optional)
     * @param stores Filter by stores, for example: &#x60;5,6&#x60;. (optional)
     * @param developers Filter by developers, for example: &#x60;1612,18893&#x60; or &#x60;valve-software,feral-interactive&#x60;. (optional)
     * @param publishers Filter by publishers, for example: &#x60;354,20987&#x60; or &#x60;electronic-arts,microsoft-studios&#x60;. (optional)
     * @param genres Filter by genres, for example: &#x60;4,51&#x60; or &#x60;action,indie&#x60;. (optional)
     * @param tags Filter by tags, for example: &#x60;31,7&#x60; or &#x60;singleplayer,multiplayer&#x60;. (optional)
     * @param creators Filter by creators, for example: &#x60;78,28&#x60; or &#x60;cris-velasco,mike-morasky&#x60;. (optional)
     * @param dates Filter by a release date, for example: &#x60;2010-01-01,2018-12-31.1960-01-01,1969-12-31&#x60;. (optional)
     * @param updated Filter by an update date, for example: &#x60;2020-12-01,2020-12-31&#x60;. (optional)
     * @param platformsCount Filter by platforms count, for example: &#x60;1&#x60;. (optional)
     * @param metacritic Filter by a metacritic rating, for example: &#x60;80,100&#x60;. (optional)
     * @param excludeCollection Exclude games from a particular collection, for example: &#x60;123&#x60;. (optional)
     * @param excludeAdditions Exclude additions. (optional)
     * @param excludeParents Exclude games which have additions. (optional)
     * @param excludeGameSeries Exclude games which included in a game series. (optional)
     * @param excludeStores Exclude stores, for example: &#x60;5,6&#x60;. (optional)
     * @param ordering Available fields: &#x60;name&#x60;, &#x60;released&#x60;, &#x60;added&#x60;, &#x60;created&#x60;, &#x60;updated&#x60;, &#x60;rating&#x60;, &#x60;metacritic&#x60;. You can reverse the sort order adding a hyphen, for example: &#x60;-released&#x60;. (optional)
     * @return GamesList200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GamesList200Response gamesList(Integer page, Integer pageSize, String search, Boolean searchPrecise, Boolean searchExact, String parentPlatforms, String platforms, String stores, String developers, String publishers, String genres, String tags, String creators, String dates, String updated, Integer platformsCount, String metacritic, Integer excludeCollection, Boolean excludeAdditions, Boolean excludeParents, Boolean excludeGameSeries, String excludeStores, String ordering) throws RestClientException {
        return gamesListWithHttpInfo(page, pageSize, search, searchPrecise, searchExact, parentPlatforms, platforms, stores, developers, publishers, genres, tags, creators, dates, updated, platformsCount, metacritic, excludeCollection, excludeAdditions, excludeParents, excludeGameSeries, excludeStores, ordering).getBody();
    }

    /**
     * Get a list of games.
     * 
     * <p><b>200</b> - 
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param search Search query. (optional)
     * @param searchPrecise Disable fuzziness for the search query. (optional)
     * @param searchExact Mark the search query as exact. (optional)
     * @param parentPlatforms Filter by parent platforms, for example: &#x60;1,2,3&#x60;. (optional)
     * @param platforms Filter by platforms, for example: &#x60;4,5&#x60;. (optional)
     * @param stores Filter by stores, for example: &#x60;5,6&#x60;. (optional)
     * @param developers Filter by developers, for example: &#x60;1612,18893&#x60; or &#x60;valve-software,feral-interactive&#x60;. (optional)
     * @param publishers Filter by publishers, for example: &#x60;354,20987&#x60; or &#x60;electronic-arts,microsoft-studios&#x60;. (optional)
     * @param genres Filter by genres, for example: &#x60;4,51&#x60; or &#x60;action,indie&#x60;. (optional)
     * @param tags Filter by tags, for example: &#x60;31,7&#x60; or &#x60;singleplayer,multiplayer&#x60;. (optional)
     * @param creators Filter by creators, for example: &#x60;78,28&#x60; or &#x60;cris-velasco,mike-morasky&#x60;. (optional)
     * @param dates Filter by a release date, for example: &#x60;2010-01-01,2018-12-31.1960-01-01,1969-12-31&#x60;. (optional)
     * @param updated Filter by an update date, for example: &#x60;2020-12-01,2020-12-31&#x60;. (optional)
     * @param platformsCount Filter by platforms count, for example: &#x60;1&#x60;. (optional)
     * @param metacritic Filter by a metacritic rating, for example: &#x60;80,100&#x60;. (optional)
     * @param excludeCollection Exclude games from a particular collection, for example: &#x60;123&#x60;. (optional)
     * @param excludeAdditions Exclude additions. (optional)
     * @param excludeParents Exclude games which have additions. (optional)
     * @param excludeGameSeries Exclude games which included in a game series. (optional)
     * @param excludeStores Exclude stores, for example: &#x60;5,6&#x60;. (optional)
     * @param ordering Available fields: &#x60;name&#x60;, &#x60;released&#x60;, &#x60;added&#x60;, &#x60;created&#x60;, &#x60;updated&#x60;, &#x60;rating&#x60;, &#x60;metacritic&#x60;. You can reverse the sort order adding a hyphen, for example: &#x60;-released&#x60;. (optional)
     * @return ResponseEntity&lt;GamesList200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GamesList200Response> gamesListWithHttpInfo(Integer page, Integer pageSize, String search, Boolean searchPrecise, Boolean searchExact, String parentPlatforms, String platforms, String stores, String developers, String publishers, String genres, String tags, String creators, String dates, String updated, Integer platformsCount, String metacritic, Integer excludeCollection, Boolean excludeAdditions, Boolean excludeParents, Boolean excludeGameSeries, String excludeStores, String ordering) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "search_precise", searchPrecise));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "search_exact", searchExact));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "parent_platforms", parentPlatforms));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "platforms", platforms));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "stores", stores));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "developers", developers));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "publishers", publishers));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "genres", genres));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "tags", tags));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "creators", creators));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "dates", dates));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "updated", updated));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "platforms_count", platformsCount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "metacritic", metacritic));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "exclude_collection", excludeCollection));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "exclude_additions", excludeAdditions));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "exclude_parents", excludeParents));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "exclude_game_series", excludeGameSeries));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "exclude_stores", excludeStores));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "ordering", ordering));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GamesList200Response> localReturnType = new ParameterizedTypeReference<GamesList200Response>() {};
        return apiClient.invokeAPI("/games", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of game trailers.
     * 
     * <p><b>200</b> - 
     * @param id An ID or a slug identifying this Game. (required)
     * @return Movie
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Movie gamesMoviesRead(String id) throws RestClientException {
        return gamesMoviesReadWithHttpInfo(id).getBody();
    }

    /**
     * Get a list of game trailers.
     * 
     * <p><b>200</b> - 
     * @param id An ID or a slug identifying this Game. (required)
     * @return ResponseEntity&lt;Movie&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Movie> gamesMoviesReadWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling gamesMoviesRead");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Movie> localReturnType = new ParameterizedTypeReference<Movie>() {};
        return apiClient.invokeAPI("/games/{id}/movies", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of parent games for DLC&#39;s and editions.
     * 
     * <p><b>200</b> - 
     * @param gamePk  (required)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return GamesList200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GamesList200Response gamesParentGamesList(String gamePk, Integer page, Integer pageSize) throws RestClientException {
        return gamesParentGamesListWithHttpInfo(gamePk, page, pageSize).getBody();
    }

    /**
     * Get a list of parent games for DLC&#39;s and editions.
     * 
     * <p><b>200</b> - 
     * @param gamePk  (required)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return ResponseEntity&lt;GamesList200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GamesList200Response> gamesParentGamesListWithHttpInfo(String gamePk, Integer page, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'gamePk' is set
        if (gamePk == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gamePk' when calling gamesParentGamesList");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("game_pk", gamePk);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GamesList200Response> localReturnType = new ParameterizedTypeReference<GamesList200Response>() {};
        return apiClient.invokeAPI("/games/{game_pk}/parent-games", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get details of the game.
     * 
     * <p><b>200</b> - 
     * @param id An ID or a slug identifying this Game. (required)
     * @return GameSingle
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GameSingle gamesRead(String id) throws RestClientException {
        return gamesReadWithHttpInfo(id).getBody();
    }

    /**
     * Get details of the game.
     * 
     * <p><b>200</b> - 
     * @param id An ID or a slug identifying this Game. (required)
     * @return ResponseEntity&lt;GameSingle&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GameSingle> gamesReadWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling gamesRead");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GameSingle> localReturnType = new ParameterizedTypeReference<GameSingle>() {};
        return apiClient.invokeAPI("/games/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of most recent posts from the game&#39;s subreddit.
     * 
     * <p><b>200</b> - 
     * @param id An ID or a slug identifying this Game. (required)
     * @return Reddit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Reddit gamesRedditRead(String id) throws RestClientException {
        return gamesRedditReadWithHttpInfo(id).getBody();
    }

    /**
     * Get a list of most recent posts from the game&#39;s subreddit.
     * 
     * <p><b>200</b> - 
     * @param id An ID or a slug identifying this Game. (required)
     * @return ResponseEntity&lt;Reddit&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Reddit> gamesRedditReadWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling gamesRedditRead");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Reddit> localReturnType = new ParameterizedTypeReference<Reddit>() {};
        return apiClient.invokeAPI("/games/{id}/reddit", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get screenshots for the game.
     * 
     * <p><b>200</b> - 
     * @param gamePk  (required)
     * @param ordering Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return GamesScreenshotsList200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GamesScreenshotsList200Response gamesScreenshotsList(String gamePk, String ordering, Integer page, Integer pageSize) throws RestClientException {
        return gamesScreenshotsListWithHttpInfo(gamePk, ordering, page, pageSize).getBody();
    }

    /**
     * Get screenshots for the game.
     * 
     * <p><b>200</b> - 
     * @param gamePk  (required)
     * @param ordering Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return ResponseEntity&lt;GamesScreenshotsList200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GamesScreenshotsList200Response> gamesScreenshotsListWithHttpInfo(String gamePk, String ordering, Integer page, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'gamePk' is set
        if (gamePk == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gamePk' when calling gamesScreenshotsList");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("game_pk", gamePk);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "ordering", ordering));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GamesScreenshotsList200Response> localReturnType = new ParameterizedTypeReference<GamesScreenshotsList200Response>() {};
        return apiClient.invokeAPI("/games/{game_pk}/screenshots", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get links to the stores that sell the game.
     * 
     * <p><b>200</b> - 
     * @param gamePk  (required)
     * @param ordering Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return GamesStoresList200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GamesStoresList200Response gamesStoresList(String gamePk, String ordering, Integer page, Integer pageSize) throws RestClientException {
        return gamesStoresListWithHttpInfo(gamePk, ordering, page, pageSize).getBody();
    }

    /**
     * Get links to the stores that sell the game.
     * 
     * <p><b>200</b> - 
     * @param gamePk  (required)
     * @param ordering Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return ResponseEntity&lt;GamesStoresList200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GamesStoresList200Response> gamesStoresListWithHttpInfo(String gamePk, String ordering, Integer page, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'gamePk' is set
        if (gamePk == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gamePk' when calling gamesStoresList");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("game_pk", gamePk);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "ordering", ordering));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GamesStoresList200Response> localReturnType = new ParameterizedTypeReference<GamesStoresList200Response>() {};
        return apiClient.invokeAPI("/games/{game_pk}/stores", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of visually similar games, available only for business and enterprise API users.
     * 
     * <p><b>200</b> - 
     * @param id An ID or a slug identifying this Game. (required)
     * @return GameSingle
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GameSingle gamesSuggestedRead(String id) throws RestClientException {
        return gamesSuggestedReadWithHttpInfo(id).getBody();
    }

    /**
     * Get a list of visually similar games, available only for business and enterprise API users.
     * 
     * <p><b>200</b> - 
     * @param id An ID or a slug identifying this Game. (required)
     * @return ResponseEntity&lt;GameSingle&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GameSingle> gamesSuggestedReadWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling gamesSuggestedRead");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GameSingle> localReturnType = new ParameterizedTypeReference<GameSingle>() {};
        return apiClient.invokeAPI("/games/{id}/suggested", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get streams on Twitch associated with the game, available only for business and enterprise API users.
     * 
     * <p><b>200</b> - 
     * @param id An ID or a slug identifying this Game. (required)
     * @return Twitch
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Twitch gamesTwitchRead(String id) throws RestClientException {
        return gamesTwitchReadWithHttpInfo(id).getBody();
    }

    /**
     * Get streams on Twitch associated with the game, available only for business and enterprise API users.
     * 
     * <p><b>200</b> - 
     * @param id An ID or a slug identifying this Game. (required)
     * @return ResponseEntity&lt;Twitch&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Twitch> gamesTwitchReadWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling gamesTwitchRead");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Twitch> localReturnType = new ParameterizedTypeReference<Twitch>() {};
        return apiClient.invokeAPI("/games/{id}/twitch", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get videos from YouTube associated with the game, available only for business and enterprise API users.
     * 
     * <p><b>200</b> - 
     * @param id An ID or a slug identifying this Game. (required)
     * @return Youtube
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Youtube gamesYoutubeRead(String id) throws RestClientException {
        return gamesYoutubeReadWithHttpInfo(id).getBody();
    }

    /**
     * Get videos from YouTube associated with the game, available only for business and enterprise API users.
     * 
     * <p><b>200</b> - 
     * @param id An ID or a slug identifying this Game. (required)
     * @return ResponseEntity&lt;Youtube&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Youtube> gamesYoutubeReadWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling gamesYoutubeRead");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Youtube> localReturnType = new ParameterizedTypeReference<Youtube>() {};
        return apiClient.invokeAPI("/games/{id}/youtube", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
