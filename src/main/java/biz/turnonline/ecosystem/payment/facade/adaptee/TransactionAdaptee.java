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

package biz.turnonline.ecosystem.payment.facade.adaptee;

import biz.turnonline.ecosystem.payment.PaymentProcessor;
import biz.turnonline.ecosystem.payment.model.Transaction;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.ListExecutorAdaptee;
import org.ctoolkit.restapi.client.adapter.AbstractGoogleClientAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * {@link Transaction} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
@Singleton
public class TransactionAdaptee
        extends AbstractGoogleClientAdaptee<PaymentProcessor>
        implements ListExecutorAdaptee<Transaction>
{
    @Inject
    public TransactionAdaptee( Provider<PaymentProcessor> client )
    {
        super( client );
    }

    @Override
    public Object prepareList( @Nullable Identifier parentKey ) throws IOException
    {
        return client().transactions().list();
    }

    @Override
    public List<Transaction> executeList( @Nonnull Object request,
                                          @Nullable Map<String, Object> parameters,
                                          @Nullable Locale locale,
                                          @Nullable Integer offset,
                                          @Nullable Integer limit,
                                          @Nullable String orderBy,
                                          @Nullable Boolean ascending ) throws IOException
    {
        PaymentProcessor.Transactions.List list = ( PaymentProcessor.Transactions.List ) request;
        fill( request, parameters );
        list.setOffset( offset );
        list.setLimit( limit );

        return list.execute().getItems();
    }
}
