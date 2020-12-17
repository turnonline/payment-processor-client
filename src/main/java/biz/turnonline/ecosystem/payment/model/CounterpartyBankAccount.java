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
 * Model definition for CounterpartyBankAccount.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Payment Processor. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class CounterpartyBankAccount
        extends com.google.api.client.json.GenericJson
{
    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String bic;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String iban;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getBic()
    {
        return bic;
    }

    /**
     * @param bic bic or {@code null} for none
     */
    public CounterpartyBankAccount setBic( java.lang.String bic )
    {
        this.bic = bic;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getIban()
    {
        return iban;
    }

    /**
     * @param iban iban or {@code null} for none
     */
    public CounterpartyBankAccount setIban( java.lang.String iban )
    {
        this.iban = iban;
        return this;
    }

    @Override
    public CounterpartyBankAccount set( String fieldName, Object value )
    {
        return ( CounterpartyBankAccount ) super.set( fieldName, value );
    }

    @Override
    public CounterpartyBankAccount clone()
    {
        return ( CounterpartyBankAccount ) super.clone();
    }

}
