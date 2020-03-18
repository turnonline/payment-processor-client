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
 * Model definition for BankAccountCollection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Payment Processor. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class BankAccountCollection
        extends com.google.api.client.json.GenericJson
{

    static
    {
        // hack to force ProGuard to consider BankAccount used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf( BankAccount.class );
    }

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<BankAccount> items;

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<BankAccount> getItems()
    {
        return items;
    }

    /**
     * @param items items or {@code null} for none
     */
    public BankAccountCollection setItems( java.util.List<BankAccount> items )
    {
        this.items = items;
        return this;
    }

    @Override
    public BankAccountCollection set( String fieldName, Object value )
    {
        return ( BankAccountCollection ) super.set( fieldName, value );
    }

    @Override
    public BankAccountCollection clone()
    {
        return ( BankAccountCollection ) super.clone();
    }

}
