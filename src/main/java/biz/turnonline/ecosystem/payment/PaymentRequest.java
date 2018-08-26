/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2018-05-04 17:28:03 UTC)
 * on 2018-08-26 at 12:21:49 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.payment;

/**
 * Payment request.
 *
 * @since 1.3
 */
@SuppressWarnings( "javadoc" )
public abstract class PaymentRequest<T>
        extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest<T>
{

    /**
     * Data format for the response.
     */
    @com.google.api.client.util.Key
    private java.lang.String alt;

    /**
     * Selector specifying which fields to include in a partial response.
     */
    @com.google.api.client.util.Key
    private java.lang.String fields;

    /**
     * API key. Your API key identifies your project and provides you with API access, quota, and
     * reports. Required unless you provide an OAuth 2.0 token.
     */
    @com.google.api.client.util.Key
    private java.lang.String key;

    /**
     * OAuth 2.0 token for the current user.
     */
    @com.google.api.client.util.Key( "oauth_token" )
    private java.lang.String oauthToken;

    /**
     * Returns response with indentations and line breaks.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean prettyPrint;

    /**
     * Available to use for quota purposes for server-side applications. Can be any arbitrary string
     * assigned to a user, but should not exceed 40 characters. Overrides userIp if both are provided.
     */
    @com.google.api.client.util.Key
    private java.lang.String quotaUser;

    /**
     * IP address of the site where the request originates. Use this if you want to enforce per-user
     * limits.
     */
    @com.google.api.client.util.Key
    private java.lang.String userIp;

    /**
     * @param client        Google client
     * @param method        HTTP Method
     * @param uriTemplate   URI template for the path relative to the base URL. If it starts with a "/"
     *                      the base path from the base URL will be stripped out. The URI template can also be a
     *                      full URL. URI template expansion is done using
     *                      {@link com.google.api.client.http.UriTemplate#expand(String, String, Object, boolean)}
     * @param content       A POJO that can be serialized into JSON or {@code null} for none
     * @param responseClass response class to parse into
     */
    public PaymentRequest(
            Payment client, String method, String uriTemplate, Object content, Class<T> responseClass )
    {
        super(
                client,
                method,
                uriTemplate,
                content,
                responseClass );
    }

    /**
     * Data format for the response. [default: json]
     */
    public java.lang.String getAlt()
    {
        return alt;
    }

    /**
     * Data format for the response.
     */
    public PaymentRequest<T> setAlt( java.lang.String alt )
    {
        this.alt = alt;
        return this;
    }

    /**
     * Selector specifying which fields to include in a partial response.
     */
    public java.lang.String getFields()
    {
        return fields;
    }

    /**
     * Selector specifying which fields to include in a partial response.
     */
    public PaymentRequest<T> setFields( java.lang.String fields )
    {
        this.fields = fields;
        return this;
    }

    /**
     * API key. Your API key identifies your project and provides you with API access, quota, and
     * reports. Required unless you provide an OAuth 2.0 token.
     */
    public java.lang.String getKey()
    {
        return key;
    }

    /**
     * API key. Your API key identifies your project and provides you with API access, quota, and
     * reports. Required unless you provide an OAuth 2.0 token.
     */
    public PaymentRequest<T> setKey( java.lang.String key )
    {
        this.key = key;
        return this;
    }

    /**
     * OAuth 2.0 token for the current user.
     */
    public java.lang.String getOauthToken()
    {
        return oauthToken;
    }

    /**
     * OAuth 2.0 token for the current user.
     */
    public PaymentRequest<T> setOauthToken( java.lang.String oauthToken )
    {
        this.oauthToken = oauthToken;
        return this;
    }

    /**
     * Returns response with indentations and line breaks. [default: true]
     */
    public java.lang.Boolean getPrettyPrint()
    {
        return prettyPrint;
    }

    /**
     * Returns response with indentations and line breaks.
     */
    public PaymentRequest<T> setPrettyPrint( java.lang.Boolean prettyPrint )
    {
        this.prettyPrint = prettyPrint;
        return this;
    }

    /**
     * Available to use for quota purposes for server-side applications. Can be any arbitrary string
     * assigned to a user, but should not exceed 40 characters. Overrides userIp if both are provided.
     */
    public java.lang.String getQuotaUser()
    {
        return quotaUser;
    }

    /**
     * Available to use for quota purposes for server-side applications. Can be any arbitrary string
     * assigned to a user, but should not exceed 40 characters. Overrides userIp if both are provided.
     */
    public PaymentRequest<T> setQuotaUser( java.lang.String quotaUser )
    {
        this.quotaUser = quotaUser;
        return this;
    }

    /**
     * IP address of the site where the request originates. Use this if you want to enforce per-user
     * limits.
     */
    public java.lang.String getUserIp()
    {
        return userIp;
    }

    /**
     * IP address of the site where the request originates. Use this if you want to enforce per-user
     * limits.
     */
    public PaymentRequest<T> setUserIp( java.lang.String userIp )
    {
        this.userIp = userIp;
        return this;
    }

    @Override
    public final Payment getAbstractGoogleClient()
    {
        return ( Payment ) super.getAbstractGoogleClient();
    }

    @Override
    public PaymentRequest<T> setDisableGZipContent( boolean disableGZipContent )
    {
        return ( PaymentRequest<T> ) super.setDisableGZipContent( disableGZipContent );
    }

    @Override
    public PaymentRequest<T> setRequestHeaders( com.google.api.client.http.HttpHeaders headers )
    {
        return ( PaymentRequest<T> ) super.setRequestHeaders( headers );
    }

    @Override
    public PaymentRequest<T> set( String parameterName, Object value )
    {
        return ( PaymentRequest<T> ) super.set( parameterName, value );
    }
}
