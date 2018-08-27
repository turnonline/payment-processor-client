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

package biz.turnonline.ecosystem.payment.client.model;

import java.io.Serializable;
import java.util.Objects;

public class BankAccountBank
        implements Serializable
{
    private static final long serialVersionUID = 806828272510807162L;

    private String code;

    private String label;

    private String country;

    /**
     * The country specific numeric bank code, taken from the code-book.
     **/
    public BankAccountBank code( String code )
    {
        this.code = code;
        return this;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode( String code )
    {
        this.code = code;
    }

    /**
     * The localized name of the bank, taken from the code-book and based on either default or specified language.   The value will be managed by the service once Accept-Language header will be provided while bank account getting.
     **/
    public BankAccountBank label( String label )
    {
        this.label = label;
        return this;
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel( String label )
    {
        this.label = label;
    }

    /**
     * The country of the bank where bank account has been opened. The missing value will be taken from the codebook if that combination is being found. The ISO 3166 alpha-2 country code. It’s case insensitive.  Note: Currently supported only SK and CZ.
     **/
    public BankAccountBank country( String country )
    {
        this.country = country;
        return this;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry( String country )
    {
        this.country = country;
    }


    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }
        BankAccountBank bankAccountBank = ( BankAccountBank ) o;
        return Objects.equals( code, bankAccountBank.code ) &&
                Objects.equals( label, bankAccountBank.label ) &&
                Objects.equals( country, bankAccountBank.country );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( code, label, country );
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append( "class BankAccountBank {\n" );

        sb.append( "    code: " ).append( toIndentedString( code ) ).append( "\n" );
        sb.append( "    label: " ).append( toIndentedString( label ) ).append( "\n" );
        sb.append( "    country: " ).append( toIndentedString( country ) ).append( "\n" );
        sb.append( "}" );
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString( Object o )
    {
        if ( o == null )
        {
            return "null";
        }
        return o.toString().replace( "\n", "\n    " );
    }
}

