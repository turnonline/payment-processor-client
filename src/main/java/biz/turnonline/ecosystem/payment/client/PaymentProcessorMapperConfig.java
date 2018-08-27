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

import biz.turnonline.ecosystem.payment.model.BankAccount;
import biz.turnonline.ecosystem.payment.model.BankCode;
import ma.glasnost.orika.MapperFactory;
import org.ctoolkit.restapi.client.adapter.BeanMapperConfig;

/**
 * The payment processor mapper configuration for orika.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class PaymentProcessorMapperConfig
        implements BeanMapperConfig
{
    @Override
    public void config( MapperFactory factory )
    {
        factory.classMap( BankAccount.class, biz.turnonline.ecosystem.payment.client.model.BankAccount.class )
                .byDefault()
                .register();

        factory.classMap( BankCode.class, biz.turnonline.ecosystem.payment.client.model.BankCode.class )
                .byDefault()
                .register();
    }
}
