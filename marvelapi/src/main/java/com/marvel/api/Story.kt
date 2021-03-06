/**
* 
* No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
*
* OpenAPI spec version: Cable
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package com.marvel.api

/**
 * 
 * @param id The unique ID of the story resource.
 * @param title The story title.
 * @param description A short description of the story.
 * @param resourceURI The canonical URL identifier for this resource. 
 * @param type The story type e.g. interior story, cover, text story.
 * @param modified The date the resource was most recently modified.
 * @param thumbnail The representative image for this story.
 * @param comics A resource list containing comics in which this story takes place.
 * @param series A resource list containing series in which this story appears.
 * @param events A resource list of the events in which this story appears.
 * @param characters A resource list of characters which appear in this story.
 * @param creators A resource list of creators who worked on this story.
 * @param originalissue A summary representation of the issue in which this story was originally published.
 */
data class Story (
    /* The unique ID of the story resource. */
    val id: Int? = null,
    /* The story title. */
    val title: kotlin.String? = null,
    /* A short description of the story. */
    val description: kotlin.String? = null,
    /* The canonical URL identifier for this resource.  */
    val resourceURI: kotlin.String? = null,
    /* The story type e.g. interior story, cover, text story. */
    val type: kotlin.String? = null,
    /* The date the resource was most recently modified. */
    val modified: java.util.Date? = null,
    /* The representative image for this story. */
    val thumbnail: Image? = null,
    /* A resource list containing comics in which this story takes place. */
    val comics: ComicList? = null,
    /* A resource list containing series in which this story appears. */
    val series: SeriesList? = null,
    /* A resource list of the events in which this story appears. */
    val events: EventList? = null,
    /* A resource list of characters which appear in this story. */
    val characters: CharacterList? = null,
    /* A resource list of creators who worked on this story. */
    val creators: CreatorList? = null,
    /* A summary representation of the issue in which this story was originally published. */
    val originalissue: ComicSummary? = null
) {

}
