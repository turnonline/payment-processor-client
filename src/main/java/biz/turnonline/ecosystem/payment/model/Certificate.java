/*
 * Copyright (c) 2020 TurnOnline.biz s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package biz.turnonline.ecosystem.payment.model;

/**
 * Model definition for Certificate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Payment Processor. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class Certificate
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean accessAuthorised;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime authorisedOn;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String clientId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String keyName;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getAccessAuthorised()
    {
        return accessAuthorised;
    }

    /**
     * @param accessAuthorised accessAuthorised or {@code null} for none
     */
    public Certificate setAccessAuthorised( java.lang.Boolean accessAuthorised )
    {
        this.accessAuthorised = accessAuthorised;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getAuthorisedOn()
    {
        return authorisedOn;
    }

    /**
     * @param authorisedOn authorisedOn or {@code null} for none
     */
    public Certificate setAuthorisedOn( com.google.api.client.util.DateTime authorisedOn )
    {
        this.authorisedOn = authorisedOn;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getClientId()
    {
        return clientId;
    }

    /**
     * @param clientId clientId or {@code null} for none
     */
    public Certificate setClientId( java.lang.String clientId )
    {
        this.clientId = clientId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getKeyName()
    {
        return keyName;
    }

    /**
     * @param keyName keyName or {@code null} for none
     */
    public Certificate setKeyName( java.lang.String keyName )
    {
        this.keyName = keyName;
        return this;
    }

    @Override
    public Certificate set( String fieldName, Object value )
    {
        return ( Certificate ) super.set( fieldName, value );
    }

    @Override
    public Certificate clone()
    {
        return ( Certificate ) super.clone();
    }

}
