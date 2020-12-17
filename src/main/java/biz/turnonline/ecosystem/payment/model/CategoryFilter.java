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
 * Model definition for CategoryFilter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Payment Processor. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class CategoryFilter
        extends com.google.api.client.json.GenericJson
{
    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String operation;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String propertyName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String propertyValue;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getOperation()
    {
        return operation;
    }

    /**
     * @param operation operation or {@code null} for none
     */
    public CategoryFilter setOperation( java.lang.String operation )
    {
        this.operation = operation;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPropertyName()
    {
        return propertyName;
    }

    /**
     * @param propertyName propertyName or {@code null} for none
     */
    public CategoryFilter setPropertyName( java.lang.String propertyName )
    {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPropertyValue()
    {
        return propertyValue;
    }

    /**
     * @param propertyValue propertyValue or {@code null} for none
     */
    public CategoryFilter setPropertyValue( java.lang.String propertyValue )
    {
        this.propertyValue = propertyValue;
        return this;
    }

    @Override
    public CategoryFilter set( String fieldName, Object value )
    {
        return ( CategoryFilter ) super.set( fieldName, value );
    }

    @Override
    public CategoryFilter clone()
    {
        return ( CategoryFilter ) super.clone();
    }

}
