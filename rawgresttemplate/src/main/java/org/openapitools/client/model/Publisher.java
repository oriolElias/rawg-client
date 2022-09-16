/*
 * RAWG Video Games Database API
 *  The largest open video games database.  ### Why build on RAWG - More than 350,000 games for 50 platforms including mobiles. - Rich metadata: tags, genres, developers, publishers, individual creators, official websites, release dates, Metacritic ratings. - Where to buy: links to digital distribution services - Similar games based on visual similarity. - Player activity data: Steam average playtime and RAWG player counts and ratings. - Actively developing and constantly getting better by user contribution and our algorithms.  ### Terms of Use - Free for personal use as long as you attribute RAWG as the source of the data and/or images and add an active hyperlink from every page where the data of RAWG is used. - Free for commercial use for startups and hobby projects with not more than 100,000 monthly active users or 500,000 page views per month. If your project is larger than that, email us at [api@rawg.io](mailto:api@rawg.io) for commercial terms. - No cloning. It would not be cool if you used our API to launch a clone of RAWG. We know it is not always easy to say what is a duplicate and what isn't. Drop us a line at [api@rawg.io](mailto:api@rawg.io) if you are in doubt, and we will talk it through. - You must include an API key with every request. The key can be obtained at https://rawg.io/apidocs. If you don’t provide it, we may ban your requests.  __[Read more](https://rawg.io/apidocs)__. 
 *
 * The version of the OpenAPI document: v1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Publisher
 */
@JsonPropertyOrder({
  Publisher.JSON_PROPERTY_ID,
  Publisher.JSON_PROPERTY_NAME,
  Publisher.JSON_PROPERTY_SLUG,
  Publisher.JSON_PROPERTY_GAMES_COUNT,
  Publisher.JSON_PROPERTY_IMAGE_BACKGROUND
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T10:31:14.408Z[UTC]")
public class Publisher {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_GAMES_COUNT = "games_count";
  private Integer gamesCount;

  public static final String JSON_PROPERTY_IMAGE_BACKGROUND = "image_background";
  private URI imageBackground;

  public Publisher() {
  }

  @JsonCreator
  public Publisher(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_SLUG) String slug, 
    @JsonProperty(JSON_PROPERTY_GAMES_COUNT) Integer gamesCount, 
    @JsonProperty(JSON_PROPERTY_IMAGE_BACKGROUND) URI imageBackground
  ) {
    this();
    this.id = id;
    this.slug = slug;
    this.gamesCount = gamesCount;
    this.imageBackground = imageBackground;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }




  public Publisher name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSlug() {
    return slug;
  }




   /**
   * Get gamesCount
   * @return gamesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GAMES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGamesCount() {
    return gamesCount;
  }




   /**
   * Get imageBackground
   * @return imageBackground
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_BACKGROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getImageBackground() {
    return imageBackground;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Publisher publisher = (Publisher) o;
    return Objects.equals(this.id, publisher.id) &&
        Objects.equals(this.name, publisher.name) &&
        Objects.equals(this.slug, publisher.slug) &&
        Objects.equals(this.gamesCount, publisher.gamesCount) &&
        Objects.equals(this.imageBackground, publisher.imageBackground);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, slug, gamesCount, imageBackground);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Publisher {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    gamesCount: ").append(toIndentedString(gamesCount)).append("\n");
    sb.append("    imageBackground: ").append(toIndentedString(imageBackground)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

