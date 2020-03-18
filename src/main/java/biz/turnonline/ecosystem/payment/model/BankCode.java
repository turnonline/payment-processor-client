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
 * Model definition for BankCode.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Payment Processor. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class BankCode
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String code;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String country;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String label;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String locale;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCode()
    {
        return code;
    }

    /**
     * @param code code or {@code null} for none
     */
    public BankCode setCode( java.lang.String code )
    {
        this.code = code;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCountry()
    {
        return country;
    }

    /**
     * @param country country or {@code null} for none
     */
    public BankCode setCountry( java.lang.String country )
    {
        this.country = country;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLabel()
    {
        return label;
    }

    /**
     * @param label label or {@code null} for none
     */
    public BankCode setLabel( java.lang.String label )
    {
        this.label = label;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLocale()
    {
        return locale;
    }

    /**
     * @param locale locale or {@code null} for none
     */
    public BankCode setLocale( java.lang.String locale )
    {
        this.locale = locale;
        return this;
    }

    @Override
    public BankCode set( String fieldName, Object value )
    {
        return ( BankCode ) super.set( fieldName, value );
    }

    @Override
    public BankCode clone()
    {
        return ( BankCode ) super.clone();
    }

}
