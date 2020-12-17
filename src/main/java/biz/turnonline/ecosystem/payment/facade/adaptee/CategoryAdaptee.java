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
import biz.turnonline.ecosystem.payment.model.Category;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adaptee.RestExecutorAdaptee;
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
 * {@link Category} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
@Singleton
public class CategoryAdaptee
        extends AbstractGoogleClientAdaptee<PaymentProcessor>
        implements RestExecutorAdaptee<Category>
{
    @Inject
    public CategoryAdaptee( Provider<PaymentProcessor> client )
    {
        super( client );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier ) throws IOException
    {
        return client().category().delete( identifier.getLong() );
    }

    @Override
    public Object executeDelete( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }

    @Override
    public Object prepareGet( @Nonnull Identifier identifier ) throws IOException
    {
        return client().category().get( identifier.getLong() );
    }

    @Override
    public Category executeGet( @Nonnull Object request,
                                @Nullable Map<String, Object> parameters,
                                @Nullable Locale locale ) throws IOException
    {
        return ( Category ) execute( request, parameters );
    }

    @Override
    public Object prepareInsert( @Nonnull Category resource,
                                 @Nullable Identifier parentKey,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        return client().category().insert( resource );
    }

    @Override
    public Object executeInsert( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }

    @Override
    public Object prepareList( @Nullable Identifier parentKey ) throws IOException
    {
        return client().category().list();
    }

    @Override
    public List<Category> executeList( @Nonnull Object request,
                                       @Nullable Map<String, Object> parameters,
                                       @Nullable Locale locale,
                                       @Nullable Integer offset,
                                       @Nullable Integer limit,
                                       @Nullable String orderBy,
                                       @Nullable Boolean ascending ) throws IOException
    {
        PaymentProcessor.Category.List list = ( PaymentProcessor.Category.List ) request;
        fill( request, parameters );
        return list.execute().getItems();
    }

    @Override
    public Object prepareUpdate( @Nonnull Category resource,
                                 @Nonnull Identifier identifier,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        return client().category().update( identifier.getLong(), resource );
    }

    @Override
    public Object executeUpdate( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }
}
