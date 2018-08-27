/*
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

package biz.turnonline.ecosystem.payment.client;

import biz.turnonline.ecosystem.payment.client.adaptee.BankAccountAdaptee;
import biz.turnonline.ecosystem.payment.client.adaptee.BankCodeGetAdaptee;
import biz.turnonline.ecosystem.payment.client.adaptee.BankCodeListAdaptee;
import biz.turnonline.ecosystem.payment.model.BankAccount;
import biz.turnonline.ecosystem.payment.model.BankCode;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.multibindings.Multibinder;
import org.ctoolkit.restapi.client.adaptee.DeleteExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.GetExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.InsertExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.ListExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.UpdateExecutorAdaptee;
import org.ctoolkit.restapi.client.adapter.BeanMapperConfig;

import javax.inject.Singleton;

/**
 * The payment processor guice default adaptee configuration.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class PaymentProcessorAdapteeModule
        extends AbstractModule
{
    @Override
    protected void configure()
    {
        // Bank code
        bind( new TypeLiteral<ListExecutorAdaptee<BankCode>>()
        {
        } ).to( BankCodeListAdaptee.class );

        bind( new TypeLiteral<GetExecutorAdaptee<BankCode>>()
        {
        } ).to( BankCodeGetAdaptee.class );

        // Bank account
        bind( new TypeLiteral<GetExecutorAdaptee<BankAccount>>()
        {
        } ).to( BankAccountAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<BankAccount>>()
        {
        } ).to( BankAccountAdaptee.class );

        bind( new TypeLiteral<InsertExecutorAdaptee<BankAccount>>()
        {
        } ).to( BankAccountAdaptee.class );

        bind( new TypeLiteral<UpdateExecutorAdaptee<BankAccount>>()
        {
        } ).to( BankAccountAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<BankAccount>>()
        {
        } ).to( BankAccountAdaptee.class );

        Multibinder<BeanMapperConfig> multibinder = Multibinder.newSetBinder( binder(), BeanMapperConfig.class );
        multibinder.addBinding().to( PaymentProcessorMapperConfig.class ).in( Singleton.class );
    }
}
