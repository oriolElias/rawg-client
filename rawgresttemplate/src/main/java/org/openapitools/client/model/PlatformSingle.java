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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlatformSingle
 */
@JsonPropertyOrder({
  PlatformSingle.JSON_PROPERTY_ID,
  PlatformSingle.JSON_PROPERTY_NAME,
  PlatformSingle.JSON_PROPERTY_SLUG,
  PlatformSingle.JSON_PROPERTY_GAMES_COUNT,
  PlatformSingle.JSON_PROPERTY_IMAGE_BACKGROUND,
  PlatformSingle.JSON_PROPERTY_DESCRIPTION,
  PlatformSingle.JSON_PROPERTY_IMAGE,
  PlatformSingle.JSON_PROPERTY_YEAR_START,
  PlatformSingle.JSON_PROPERTY_YEAR_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T10:31:14.408Z[UTC]")
public class PlatformSingle {
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

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IMAGE = "image";
  private JsonNullable<URI> image = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_YEAR_START = "year_start";
  private JsonNullable<Integer> yearStart = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_YEAR_END = "year_end";
  private JsonNullable<Integer> yearEnd = JsonNullable.<Integer>undefined();

  public PlatformSingle() {
  }

  @JsonCreator
  public PlatformSingle(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_SLUG) String slug, 
    @JsonProperty(JSON_PROPERTY_GAMES_COUNT) Integer gamesCount, 
    @JsonProperty(JSON_PROPERTY_IMAGE_BACKGROUND) URI imageBackground, 
    @JsonProperty(JSON_PROPERTY_IMAGE) URI image
  ) {
    this();
    this.id = id;
    this.slug = slug;
    this.gamesCount = gamesCount;
    this.imageBackground = imageBackground;
    this.image = image == null ? JsonNullable.<URI>undefined() : JsonNullable.of(image);
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




  public PlatformSingle name(String name) {
    
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




  public PlatformSingle description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public URI getImage() {
    
    if (image == null) {
      image = JsonNullable.<URI>undefined();
    }
    return image.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getImage_JsonNullable() {
    return image;
  }
  
  @JsonProperty(JSON_PROPERTY_IMAGE)
  private void setImage_JsonNullable(JsonNullable<URI> image) {
    this.image = image;
  }



  public PlatformSingle yearStart(Integer yearStart) {
    this.yearStart = JsonNullable.<Integer>of(yearStart);
    
    return this;
  }

   /**
   * Get yearStart
   * minimum: 0
   * maximum: 32767
   * @return yearStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getYearStart() {
        return yearStart.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_YEAR_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getYearStart_JsonNullable() {
    return yearStart;
  }
  
  @JsonProperty(JSON_PROPERTY_YEAR_START)
  public void setYearStart_JsonNullable(JsonNullable<Integer> yearStart) {
    this.yearStart = yearStart;
  }

  public void setYearStart(Integer yearStart) {
    this.yearStart = JsonNullable.<Integer>of(yearStart);
  }


  public PlatformSingle yearEnd(Integer yearEnd) {
    this.yearEnd = JsonNullable.<Integer>of(yearEnd);
    
    return this;
  }

   /**
   * Get yearEnd
   * minimum: 0
   * maximum: 32767
   * @return yearEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getYearEnd() {
        return yearEnd.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_YEAR_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getYearEnd_JsonNullable() {
    return yearEnd;
  }
  
  @JsonProperty(JSON_PROPERTY_YEAR_END)
  public void setYearEnd_JsonNullable(JsonNullable<Integer> yearEnd) {
    this.yearEnd = yearEnd;
  }

  public void setYearEnd(Integer yearEnd) {
    this.yearEnd = JsonNullable.<Integer>of(yearEnd);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformSingle platformSingle = (PlatformSingle) o;
    return Objects.equals(this.id, platformSingle.id) &&
        Objects.equals(this.name, platformSingle.name) &&
        Objects.equals(this.slug, platformSingle.slug) &&
        Objects.equals(this.gamesCount, platformSingle.gamesCount) &&
        Objects.equals(this.imageBackground, platformSingle.imageBackground) &&
        Objects.equals(this.description, platformSingle.description) &&
        equalsNullable(this.image, platformSingle.image) &&
        equalsNullable(this.yearStart, platformSingle.yearStart) &&
        equalsNullable(this.yearEnd, platformSingle.yearEnd);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, slug, gamesCount, imageBackground, description, hashCodeNullable(image), hashCodeNullable(yearStart), hashCodeNullable(yearEnd));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformSingle {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    gamesCount: ").append(toIndentedString(gamesCount)).append("\n");
    sb.append("    imageBackground: ").append(toIndentedString(imageBackground)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    yearStart: ").append(toIndentedString(yearStart)).append("\n");
    sb.append("    yearEnd: ").append(toIndentedString(yearEnd)).append("\n");
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

