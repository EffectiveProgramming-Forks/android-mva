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
 * @param type The canonical type of the text object (e.g. solicit text, preview text, etc.).
 * @param language The IETF language tag denoting the language the text object is written in.
 * @param text The text.
 */
data class TextObject (
    /* The canonical type of the text object (e.g. solicit text, preview text, etc.). */
    val type: kotlin.String? = null,
    /* The IETF language tag denoting the language the text object is written in. */
    val language: kotlin.String? = null,
    /* The text. */
    val text: kotlin.String? = null
) {

}
