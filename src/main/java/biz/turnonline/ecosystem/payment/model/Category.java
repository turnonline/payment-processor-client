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
 * Model definition for Category.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Payment Processor. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class Category
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String color;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<CategoryFilter> filters;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean propagate;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getColor()
    {
        return color;
    }

    /**
     * @param color color or {@code null} for none
     */
    public Category setColor( java.lang.String color )
    {
        this.color = color;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<CategoryFilter> getFilters()
    {
        return filters;
    }

    /**
     * @param filters filters or {@code null} for none
     */
    public Category setFilters( java.util.List<CategoryFilter> filters )
    {
        this.filters = filters;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getId()
    {
        return id;
    }

    /**
     * @param id id or {@code null} for none
     */
    public Category setId( java.lang.Long id )
    {
        this.id = id;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getName()
    {
        return name;
    }

    /**
     * @param name name or {@code null} for none
     */
    public Category setName( java.lang.String name )
    {
        this.name = name;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getPropagate()
    {
        return propagate;
    }

    /**
     * @param propagate propagate or {@code null} for none
     */
    public Category setPropagate( java.lang.Boolean propagate )
    {
        this.propagate = propagate;
        return this;
    }

    @Override
    public Category set( String fieldName, Object value )
    {
        return ( Category ) super.set( fieldName, value );
    }

    @Override
    public Category clone()
    {
        return ( Category ) super.clone();
    }

}
