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

public class Error
        implements Serializable
{
    private static final long serialVersionUID = 6003697206603949995L;

    private Integer code;

    private String message;

    /**
     * The HTTP status code.
     **/
    public Error code( Integer code )
    {
        this.code = code;
        return this;
    }

    public Integer getCode()
    {
        return code;
    }

    public void setCode( Integer code )
    {
        this.code = code;
    }

    /**
     * The error message.
     **/
    public Error message( String message )
    {
        this.message = message;
        return this;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage( String message )
    {
        this.message = message;
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
        Error error = ( Error ) o;
        return Objects.equals( code, error.code ) &&
                Objects.equals( message, error.message );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( code, message );
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append( "class Error {\n" );

        sb.append( "    code: " ).append( toIndentedString( code ) ).append( "\n" );
        sb.append( "    message: " ).append( toIndentedString( message ) ).append( "\n" );
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

