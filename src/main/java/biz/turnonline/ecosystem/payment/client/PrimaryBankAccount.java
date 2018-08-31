package biz.turnonline.ecosystem.payment.client;

import org.ctoolkit.restapi.client.Identifier;

/**
 * The dedicated identifier to work with primary bank account.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class PrimaryBankAccount
        extends Identifier
{
    /**
     * Constructs primary bank account identifier for get operation.
     */
    public PrimaryBankAccount()
    {
        super( -1L );
        controller( "primary" );
    }

    /**
     * Constructs identifier to mark specified bank account as a primary.
     */
    public PrimaryBankAccount( Long primaryId )
    {
        super( primaryId );
        controller( "primary" );
    }
}
