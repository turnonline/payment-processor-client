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
 * The bank account resource.
 **/
public class BankAccount
        implements Serializable
{
    private static final long serialVersionUID = -1908854288886488256L;

    private Long id;

    private String name;

    private String prefix;

    private String accountNumber;

    private String formatted;

    private String iban;

    private String bic;

    private Boolean primary = false;

    private BankAccountBank bank;

    /**
     * The bank account identification.
     **/
    public BankAccount id( Long id )
    {
        this.id = id;
        return this;
    }

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    /**
     * The user defined name of the bank account.
     **/
    public BankAccount name( String name )
    {
        this.name = name;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    /**
     * The optional bank account number prefix.
     **/
    public BankAccount prefix( String prefix )
    {
        this.prefix = prefix;
        return this;
    }

    public String getPrefix()
    {
        return prefix;
    }

    public void setPrefix( String prefix )
    {
        this.prefix = prefix;
    }

    /**
     * The bank account number.
     **/
    public BankAccount accountNumber( String accountNumber )
    {
        this.accountNumber = accountNumber;
        return this;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber( String accountNumber )
    {
        this.accountNumber = accountNumber;
    }

    /**
     * The formatted full bank account number.
     **/
    public BankAccount formatted( String formatted )
    {
        this.formatted = formatted;
        return this;
    }

    public String getFormatted()
    {
        return formatted;
    }

    public void setFormatted( String formatted )
    {
        this.formatted = formatted;
    }

    /**
     * The international bank account number.
     **/
    public BankAccount iban( String iban )
    {
        this.iban = iban;
        return this;
    }

    public String getIban()
    {
        return iban;
    }

    public void setIban( String iban )
    {
        this.iban = iban;
    }

    /**
     * The international Bank Identifier Code (BIC/ISO 9362, a normalized code - also known as Business Identifier Code, Bank International Code and SWIFT code).
     **/
    public BankAccount bic( String bic )
    {
        this.bic = bic;
        return this;
    }

    public String getBic()
    {
        return bic;
    }

    public void setBic( String bic )
    {
        this.bic = bic;
    }

    /**
     * Boolean identification, whether this bank account is being marked by the user as a primary account. If yes, this bank account will be used as a default account unless specified another one. There might be only max single or none primary bank account per country.
     **/
    public BankAccount primary( Boolean primary )
    {
        this.primary = primary;
        return this;
    }

    public Boolean getPrimary()
    {
        return primary;
    }

    public void setPrimary( Boolean primary )
    {
        this.primary = primary;
    }

    /**
     * The bank defined as a codebook.
     **/
    public BankAccount bank( BankAccountBank bank )
    {
        this.bank = bank;
        return this;
    }

    public BankAccountBank getBank()
    {
        return bank;
    }

    public void setBank( BankAccountBank bank )
    {
        this.bank = bank;
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
        BankAccount bankAccount = ( BankAccount ) o;
        return Objects.equals( id, bankAccount.id ) &&
                Objects.equals( name, bankAccount.name ) &&
                Objects.equals( prefix, bankAccount.prefix ) &&
                Objects.equals( accountNumber, bankAccount.accountNumber ) &&
                Objects.equals( formatted, bankAccount.formatted ) &&
                Objects.equals( iban, bankAccount.iban ) &&
                Objects.equals( bic, bankAccount.bic ) &&
                Objects.equals( primary, bankAccount.primary ) &&
                Objects.equals( bank, bankAccount.bank );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( id, name, prefix, accountNumber, formatted, iban, bic, primary, bank );
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append( "class BankAccount {\n" );

        sb.append( "    id: " ).append( toIndentedString( id ) ).append( "\n" );
        sb.append( "    name: " ).append( toIndentedString( name ) ).append( "\n" );
        sb.append( "    prefix: " ).append( toIndentedString( prefix ) ).append( "\n" );
        sb.append( "    accountNumber: " ).append( toIndentedString( accountNumber ) ).append( "\n" );
        sb.append( "    formatted: " ).append( toIndentedString( formatted ) ).append( "\n" );
        sb.append( "    iban: " ).append( toIndentedString( iban ) ).append( "\n" );
        sb.append( "    bic: " ).append( toIndentedString( bic ) ).append( "\n" );
        sb.append( "    primary: " ).append( toIndentedString( primary ) ).append( "\n" );
        sb.append( "    bank: " ).append( toIndentedString( bank ) ).append( "\n" );
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

