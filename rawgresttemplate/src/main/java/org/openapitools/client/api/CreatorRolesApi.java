package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreatorRolesList200Response;

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
@Component("org.openapitools.client.api.CreatorRolesApi")
public class CreatorRolesApi {
    private ApiClient apiClient;

    public CreatorRolesApi() {
        this(new ApiClient());
    }

    @Autowired
    public CreatorRolesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a list of creator positions (jobs).
     * 
     * <p><b>200</b> - 
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return CreatorRolesList200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreatorRolesList200Response creatorRolesList(Integer page, Integer pageSize) throws RestClientException {
        return creatorRolesListWithHttpInfo(page, pageSize).getBody();
    }

    /**
     * Get a list of creator positions (jobs).
     * 
     * <p><b>200</b> - 
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return ResponseEntity&lt;CreatorRolesList200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreatorRolesList200Response> creatorRolesListWithHttpInfo(Integer page, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<CreatorRolesList200Response> localReturnType = new ParameterizedTypeReference<CreatorRolesList200Response>() {};
        return apiClient.invokeAPI("/creator-roles", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
