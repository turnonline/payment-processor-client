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

/**
 * The brief description of the bank for concrete bank code.
 **/
public class BankCode
        implements Serializable
{
    private static final long serialVersionUID = -5526245244736311050L;

    private String code;

    private String label;

    private String locale;

    private String country;

    /**
     * The bank code is a numeric code assigned by a central bank to concrete bank.
     **/
    public BankCode code( String code )
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
     * The localized name of the bank.
     **/
    public BankCode label( String label )
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
     * The label language. ISO 639 alpha-2 or alpha-3 language code.
     **/
    public BankCode locale( String locale )
    {
        this.locale = locale;
        return this;
    }

    public String getLocale()
    {
        return locale;
    }

    public void setLocale( String locale )
    {
        this.locale = locale;
    }

    /**
     * The ISO 3166 alpha-2 country code. The country of the bank code that belongs to.
     **/
    public BankCode country( String country )
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
        BankCode bankCode = ( BankCode ) o;
        return Objects.equals( code, bankCode.code ) &&
                Objects.equals( label, bankCode.label ) &&
                Objects.equals( locale, bankCode.locale ) &&
                Objects.equals( country, bankCode.country );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( code, label, locale, country );
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append( "class BankCode {\n" );

        sb.append( "    code: " ).append( toIndentedString( code ) ).append( "\n" );
        sb.append( "    label: " ).append( toIndentedString( label ) ).append( "\n" );
        sb.append( "    locale: " ).append( toIndentedString( locale ) ).append( "\n" );
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

