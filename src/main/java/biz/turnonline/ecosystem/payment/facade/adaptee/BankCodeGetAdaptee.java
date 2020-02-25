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
import biz.turnonline.ecosystem.payment.model.BankCode;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adapter.AbstractGetExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.io.IOException;

/**
 * {@link BankCode} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
@Singleton
public class BankCodeGetAdaptee
        extends AbstractGetExecutorAdaptee<PaymentProcessor, BankCode>
{
    @Inject
    public BankCodeGetAdaptee( Provider<PaymentProcessor> client )
    {
        super( client );
    }

    @Override
    public Object prepareGet( @Nonnull Identifier identifier ) throws IOException
    {
        return client().bankCode().get( identifier.getString() );
    }
}
