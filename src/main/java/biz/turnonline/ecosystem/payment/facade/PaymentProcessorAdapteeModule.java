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

package biz.turnonline.ecosystem.payment.facade;

import biz.turnonline.ecosystem.payment.facade.adaptee.BankAccountAdaptee;
import biz.turnonline.ecosystem.payment.facade.adaptee.BankCodeGetAdaptee;
import biz.turnonline.ecosystem.payment.facade.adaptee.BankCodeListAdaptee;
import biz.turnonline.ecosystem.payment.facade.adaptee.CategoryAdaptee;
import biz.turnonline.ecosystem.payment.facade.adaptee.TransactionAdaptee;
import biz.turnonline.ecosystem.payment.model.BankAccount;
import biz.turnonline.ecosystem.payment.model.BankCode;
import biz.turnonline.ecosystem.payment.model.Category;
import biz.turnonline.ecosystem.payment.model.Transaction;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import org.ctoolkit.restapi.client.adaptee.DeleteExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.GetExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.InsertExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.ListExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.UpdateExecutorAdaptee;

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

        // Transaction
        bind( new TypeLiteral<ListExecutorAdaptee<Transaction>>()
        {
        } ).to( TransactionAdaptee.class );

        bind( new TypeLiteral<GetExecutorAdaptee<Category>>()
        {
        } ).to( CategoryAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<Category>>()
        {
        } ).to( CategoryAdaptee.class );

        bind( new TypeLiteral<InsertExecutorAdaptee<Category>>()
        {
        } ).to( CategoryAdaptee.class );

        bind( new TypeLiteral<UpdateExecutorAdaptee<Category>>()
        {
        } ).to( CategoryAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<Category>>()
        {
        } ).to( CategoryAdaptee.class );
    }
}
