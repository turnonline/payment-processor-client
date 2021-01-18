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

package biz.turnonline.ecosystem.payment;

/**
 * Service definition for PaymentProcessor (v1).
 *
 * <p>
 * TurnOnline.biz Ecosystem Payment Processor
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.turnonline.biz/docs/payment.turnon.cloud/1" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link PaymentProcessorRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @author Google, Inc.
 * @since 1.3
 */
public class PaymentProcessor
        extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient
{

    /**
     * The default encoded root URL of the service. This is determined when the library is generated
     * and normally should not be changed.
     *
     * @since 1.7
     */
    public static final String DEFAULT_ROOT_URL = "https://payment-processor-dot-turn-online-eu.appspot.com/api/";

    /**
     * The default encoded service path of the service. This is determined when the library is
     * generated and normally should not be changed.
     *
     * @since 1.7
     */
    public static final String DEFAULT_SERVICE_PATH = "payment/v1/";

    /**
     * The default encoded batch path of the service. This is determined when the library is
     * generated and normally should not be changed.
     *
     * @since 1.23
     */
    public static final String DEFAULT_BATCH_PATH = "batch";

    /**
     * The default encoded base URL of the service. This is determined when the library is generated
     * and normally should not be changed.
     */
    public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

    // Note: Leave this static initializer at the top of the file.
    static
    {
        com.google.api.client.util.Preconditions.checkState(
                com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
                        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
                "You are currently running with version %s of google-api-client. " +
                        "You need at least version 1.15 of google-api-client to run version " +
                        "1.25.0 of the TurnOnline.biz Payment Processor library.", com.google.api.client.googleapis.GoogleUtils.VERSION );
    }

    /**
     * Constructor.
     *
     * <p>
     * Use {@link Builder} if you need to specify any of the optional parameters.
     * </p>
     *
     * @param transport              HTTP transport, which should normally be:
     *                               <ul>
     *                               <li>Google App Engine:
     *                               {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *                               <li>Android: {@code newCompatibleTransport} from
     *                               {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *                               <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *                               </li>
     *                               </ul>
     * @param jsonFactory            JSON factory, which may be:
     *                               <ul>
     *                               <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *                               <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *                               <li>Android Honeycomb or higher:
     *                               {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *                               </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public PaymentProcessor( com.google.api.client.http.HttpTransport transport,
                             com.google.api.client.json.JsonFactory jsonFactory,
                             com.google.api.client.http.HttpRequestInitializer httpRequestInitializer )
    {
        this( new Builder( transport, jsonFactory, httpRequestInitializer ) );
    }

    /**
     * @param builder builder
     */
    PaymentProcessor( Builder builder )
    {
        super( builder );
    }

    @Override
    protected void initialize( com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest )
            throws java.io.IOException
    {
        super.initialize( httpClientRequest );
    }

    /**
     * An accessor for creating requests from the BankAccounts collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code PaymentProcessor payment = new PaymentProcessor(...);}
     *   {@code PaymentProcessor.BankAccounts.List request = payment.bankAccounts().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public BankAccounts bankAccounts()
    {
        return new BankAccounts();
    }

    /**
     * An accessor for creating requests from the BankCode collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code PaymentProcessor payment = new PaymentProcessor(...);}
     *   {@code PaymentProcessor.BankCode.List request = payment.bankCode().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public BankCode bankCode()
    {
        return new BankCode();
    }

    /**
     * An accessor for creating requests from the Category collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code PaymentProcessor payment = new PaymentProcessor(...);}
     *   {@code PaymentProcessor.Category.List request = payment.category().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Category category()
    {
        return new Category();
    }

    /**
     * An accessor for creating requests from the Transactions collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code PaymentProcessor payment = new PaymentProcessor(...);}
     *   {@code PaymentProcessor.Transactions.List request = payment.transactions().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Transactions transactions()
    {
        return new Transactions();
    }

    /**
     * Builder for {@link PaymentProcessor}.
     *
     * <p>
     * Implementation is not thread-safe.
     * </p>
     *
     * @since 1.3.0
     */
    public static final class Builder
            extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder
    {

        /**
         * Returns an instance of a new builder.
         *
         * @param transport              HTTP transport, which should normally be:
         *                               <ul>
         *                               <li>Google App Engine:
         *                               {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
         *                               <li>Android: {@code newCompatibleTransport} from
         *                               {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
         *                               <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
         *                               </li>
         *                               </ul>
         * @param jsonFactory            JSON factory, which may be:
         *                               <ul>
         *                               <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
         *                               <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
         *                               <li>Android Honeycomb or higher:
         *                               {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
         *                               </ul>
         * @param httpRequestInitializer HTTP request initializer or {@code null} for none
         * @since 1.7
         */
        public Builder( com.google.api.client.http.HttpTransport transport,
                        com.google.api.client.json.JsonFactory jsonFactory,
                        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer )
        {
            super(
                    transport,
                    jsonFactory,
                    DEFAULT_ROOT_URL,
                    DEFAULT_SERVICE_PATH,
                    httpRequestInitializer,
                    false );
            setBatchPath( DEFAULT_BATCH_PATH );
        }

        /**
         * Builds a new instance of {@link PaymentProcessor}.
         */
        @Override
        public PaymentProcessor build()
        {
            return new PaymentProcessor( this );
        }

        @Override
        public Builder setRootUrl( String rootUrl )
        {
            return ( Builder ) super.setRootUrl( rootUrl );
        }

        @Override
        public Builder setServicePath( String servicePath )
        {
            return ( Builder ) super.setServicePath( servicePath );
        }

        @Override
        public Builder setBatchPath( String batchPath )
        {
            return ( Builder ) super.setBatchPath( batchPath );
        }

        @Override
        public Builder setHttpRequestInitializer( com.google.api.client.http.HttpRequestInitializer httpRequestInitializer )
        {
            return ( Builder ) super.setHttpRequestInitializer( httpRequestInitializer );
        }

        @Override
        public Builder setApplicationName( String applicationName )
        {
            return ( Builder ) super.setApplicationName( applicationName );
        }

        @Override
        public Builder setSuppressPatternChecks( boolean suppressPatternChecks )
        {
            return ( Builder ) super.setSuppressPatternChecks( suppressPatternChecks );
        }

        @Override
        public Builder setSuppressRequiredParameterChecks( boolean suppressRequiredParameterChecks )
        {
            return ( Builder ) super.setSuppressRequiredParameterChecks( suppressRequiredParameterChecks );
        }

        @Override
        public Builder setSuppressAllChecks( boolean suppressAllChecks )
        {
            return ( Builder ) super.setSuppressAllChecks( suppressAllChecks );
        }

        /**
         * Set the {@link PaymentProcessorRequestInitializer}.
         *
         * @since 1.12
         */
        public Builder setPaymentProcessorRequestInitializer(
                PaymentProcessorRequestInitializer paymentprocessorRequestInitializer )
        {
            return ( Builder ) super.setGoogleClientRequestInitializer( paymentprocessorRequestInitializer );
        }

        @Override
        public Builder setGoogleClientRequestInitializer(
                com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer )
        {
            return ( Builder ) super.setGoogleClientRequestInitializer( googleClientRequestInitializer );
        }
    }

    /**
     * The "bank_accounts" collection of methods.
     */
    public class BankAccounts
    {

        /**
         * Create a request for the method "bank_accounts.certificates".
         * <p>
         * This request holds the parameters needed by the payment server.  After setting any optional
         * parameters, call the {@link Certificates#execute()} method to invoke the remote operation.
         *
         * @param bankCode
         * @param content  the {@link biz.turnonline.ecosystem.payment.model.Certificate}
         * @return the request
         */
        public Certificates certificates( java.lang.String bankCode,
                                          biz.turnonline.ecosystem.payment.model.Certificate content )
                throws java.io.IOException
        {
            Certificates result = new Certificates( bankCode, content );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "bank_accounts.delete".
         * <p>
         * This request holds the parameters needed by the payment server.  After setting any optional
         * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
         *
         * @param accountId
         * @return the request
         */
        public Delete delete( java.lang.Long accountId ) throws java.io.IOException
        {
            Delete result = new Delete( accountId );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "bank_accounts.get".
         * <p>
         * This request holds the parameters needed by the payment server.  After setting any optional
         * parameters, call the {@link Get#execute()} method to invoke the remote operation.
         *
         * @param accountId
         * @return the request
         */
        public Get get( java.lang.Long accountId ) throws java.io.IOException
        {
            Get result = new Get( accountId );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "bank_accounts.insert".
         * <p>
         * This request holds the parameters needed by the payment server.  After setting any optional
         * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
         *
         * @param content the {@link biz.turnonline.ecosystem.payment.model.BankAccount}
         * @return the request
         */
        public Insert insert( biz.turnonline.ecosystem.payment.model.BankAccount content ) throws java.io.IOException
        {
            Insert result = new Insert( content );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "bank_accounts.list".
         * <p>
         * This request holds the parameters needed by the payment server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException
        {
            List result = new List();
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "bank_accounts.update".
         * <p>
         * This request holds the parameters needed by the payment server.  After setting any optional
         * parameters, call the {@link Update#execute()} method to invoke the remote operation.
         *
         * @param accountId
         * @param content   the {@link biz.turnonline.ecosystem.payment.model.BankAccount}
         * @return the request
         */
        public Update update( java.lang.Long accountId, biz.turnonline.ecosystem.payment.model.BankAccount content )
                throws java.io.IOException
        {
            Update result = new Update( accountId, content );
            initialize( result );
            return result;
        }

        /**
         * An accessor for creating requests from the Primary collection.
         *
         * <p>The typical use is:</p>
         * <pre>
         *   {@code PaymentProcessor payment = new PaymentProcessor(...);}
         *   {@code PaymentProcessor.Primary.List request = payment.primary().list(parameters ...)}
         * </pre>
         *
         * @return the resource collection
         */
        public Primary primary()
        {
            return new Primary();
        }

        public class Certificates
                extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.Certificate>
        {

            private static final String REST_PATH = "bank-accounts/{bank_code}/certificates/actual";

            @com.google.api.client.util.Key( "bank_code" )
            private java.lang.String bankCode;

            /**
             * Create a request for the method "bank_accounts.certificates".
             * <p>
             * This request holds the parameters needed by the the payment server.  After setting any optional
             * parameters, call the {@link Certificates#execute()} method to invoke the remote operation. <p>
             * {@link
             * Certificates#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
             * must be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param bankCode
             * @param content  the {@link biz.turnonline.ecosystem.payment.model.Certificate}
             * @since 1.13
             */
            protected Certificates( java.lang.String bankCode,
                                    biz.turnonline.ecosystem.payment.model.Certificate content )
            {
                super( PaymentProcessor.this, "PUT", REST_PATH, content, biz.turnonline.ecosystem.payment.model.Certificate.class );
                this.bankCode = com.google.api.client.util.Preconditions.checkNotNull( bankCode, "Required parameter bankCode must be specified." );
            }

            @Override
            public Certificates setAlt( java.lang.String alt )
            {
                return ( Certificates ) super.setAlt( alt );
            }

            @Override
            public Certificates setFields( java.lang.String fields )
            {
                return ( Certificates ) super.setFields( fields );
            }

            @Override
            public Certificates setKey( java.lang.String key )
            {
                return ( Certificates ) super.setKey( key );
            }

            @Override
            public Certificates setOauthToken( java.lang.String oauthToken )
            {
                return ( Certificates ) super.setOauthToken( oauthToken );
            }

            @Override
            public Certificates setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Certificates ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Certificates setQuotaUser( java.lang.String quotaUser )
            {
                return ( Certificates ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Certificates setUserIp( java.lang.String userIp )
            {
                return ( Certificates ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.String getBankCode()
            {
                return bankCode;
            }

            public Certificates setBankCode( java.lang.String bankCode )
            {
                this.bankCode = bankCode;
                return this;
            }

            @Override
            public Certificates set( String parameterName, Object value )
            {
                return ( Certificates ) super.set( parameterName, value );
            }
        }

        public class Delete
                extends PaymentProcessorRequest<Void>
        {

            private static final String REST_PATH = "bank-accounts/{account_id}";

            @com.google.api.client.util.Key( "account_id" )
            private java.lang.Long accountId;

            /**
             * Create a request for the method "bank_accounts.delete".
             * <p>
             * This request holds the parameters needed by the the payment server.  After setting any optional
             * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
             * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param accountId
             * @since 1.13
             */
            protected Delete( java.lang.Long accountId )
            {
                super( PaymentProcessor.this, "DELETE", REST_PATH, null, Void.class );
                this.accountId = com.google.api.client.util.Preconditions.checkNotNull( accountId, "Required parameter accountId must be specified." );
            }

            @Override
            public Delete setAlt( java.lang.String alt )
            {
                return ( Delete ) super.setAlt( alt );
            }

            @Override
            public Delete setFields( java.lang.String fields )
            {
                return ( Delete ) super.setFields( fields );
            }

            @Override
            public Delete setKey( java.lang.String key )
            {
                return ( Delete ) super.setKey( key );
            }

            @Override
            public Delete setOauthToken( java.lang.String oauthToken )
            {
                return ( Delete ) super.setOauthToken( oauthToken );
            }

            @Override
            public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Delete ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Delete setQuotaUser( java.lang.String quotaUser )
            {
                return ( Delete ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Delete setUserIp( java.lang.String userIp )
            {
                return ( Delete ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getAccountId()
            {
                return accountId;
            }

            public Delete setAccountId( java.lang.Long accountId )
            {
                this.accountId = accountId;
                return this;
            }

            @Override
            public Delete set( String parameterName, Object value )
            {
                return ( Delete ) super.set( parameterName, value );
            }
        }

        public class Get
                extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.BankAccount>
        {

            private static final String REST_PATH = "bank-accounts/{account_id}";

            @com.google.api.client.util.Key( "account_id" )
            private java.lang.Long accountId;

            /**
             * Create a request for the method "bank_accounts.get".
             * <p>
             * This request holds the parameters needed by the the payment server.  After setting any optional
             * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
             * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param accountId
             * @since 1.13
             */
            protected Get( java.lang.Long accountId )
            {
                super( PaymentProcessor.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.payment.model.BankAccount.class );
                this.accountId = com.google.api.client.util.Preconditions.checkNotNull( accountId, "Required parameter accountId must be specified." );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public Get setAlt( java.lang.String alt )
            {
                return ( Get ) super.setAlt( alt );
            }

            @Override
            public Get setFields( java.lang.String fields )
            {
                return ( Get ) super.setFields( fields );
            }

            @Override
            public Get setKey( java.lang.String key )
            {
                return ( Get ) super.setKey( key );
            }

            @Override
            public Get setOauthToken( java.lang.String oauthToken )
            {
                return ( Get ) super.setOauthToken( oauthToken );
            }

            @Override
            public Get setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Get ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Get setQuotaUser( java.lang.String quotaUser )
            {
                return ( Get ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Get setUserIp( java.lang.String userIp )
            {
                return ( Get ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getAccountId()
            {
                return accountId;
            }

            public Get setAccountId( java.lang.Long accountId )
            {
                this.accountId = accountId;
                return this;
            }

            @Override
            public Get set( String parameterName, Object value )
            {
                return ( Get ) super.set( parameterName, value );
            }
        }

        public class Insert
                extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.BankAccount>
        {

            private static final String REST_PATH = "bank-accounts";

            /**
             * Create a request for the method "bank_accounts.insert".
             * <p>
             * This request holds the parameters needed by the the payment server.  After setting any optional
             * parameters, call the {@link Insert#execute()} method to invoke the remote operation. <p> {@link
             * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param content the {@link biz.turnonline.ecosystem.payment.model.BankAccount}
             * @since 1.13
             */
            protected Insert( biz.turnonline.ecosystem.payment.model.BankAccount content )
            {
                super( PaymentProcessor.this, "POST", REST_PATH, content, biz.turnonline.ecosystem.payment.model.BankAccount.class );
            }

            @Override
            public Insert setAlt( java.lang.String alt )
            {
                return ( Insert ) super.setAlt( alt );
            }

            @Override
            public Insert setFields( java.lang.String fields )
            {
                return ( Insert ) super.setFields( fields );
            }

            @Override
            public Insert setKey( java.lang.String key )
            {
                return ( Insert ) super.setKey( key );
            }

            @Override
            public Insert setOauthToken( java.lang.String oauthToken )
            {
                return ( Insert ) super.setOauthToken( oauthToken );
            }

            @Override
            public Insert setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Insert ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Insert setQuotaUser( java.lang.String quotaUser )
            {
                return ( Insert ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Insert setUserIp( java.lang.String userIp )
            {
                return ( Insert ) super.setUserIp( userIp );
            }

            @Override
            public Insert set( String parameterName, Object value )
            {
                return ( Insert ) super.set( parameterName, value );
            }
        }

        public class List
                extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.BankAccountCollection>
        {

            private static final String REST_PATH = "bank-accounts";

            @com.google.api.client.util.Key
            private java.lang.String bank;

            @com.google.api.client.util.Key
            private java.lang.Integer offset;

            @com.google.api.client.util.Key
            private java.lang.Boolean alternative;

            @com.google.api.client.util.Key
            private java.lang.Integer limit;

            @com.google.api.client.util.Key
            private java.lang.String country;

            /**
             * Create a request for the method "bank_accounts.list".
             * <p>
             * This request holds the parameters needed by the the payment server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
             * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List()
            {
                super( PaymentProcessor.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.payment.model.BankAccountCollection.class );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt( java.lang.String alt )
            {
                return ( List ) super.setAlt( alt );
            }

            @Override
            public List setFields( java.lang.String fields )
            {
                return ( List ) super.setFields( fields );
            }

            @Override
            public List setKey( java.lang.String key )
            {
                return ( List ) super.setKey( key );
            }

            @Override
            public List setOauthToken( java.lang.String oauthToken )
            {
                return ( List ) super.setOauthToken( oauthToken );
            }

            @Override
            public List setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( List ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public List setQuotaUser( java.lang.String quotaUser )
            {
                return ( List ) super.setQuotaUser( quotaUser );
            }

            @Override
            public List setUserIp( java.lang.String userIp )
            {
                return ( List ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.String getBank()
            {
                return bank;
            }

            public List setBank( java.lang.String bank )
            {
                this.bank = bank;
                return this;
            }

            /**
             * [ default: 0]
             * [
             */
            public java.lang.Integer getOffset()
            {
                return offset;
            }

            public List setOffset( java.lang.Integer offset )
            {
                this.offset = offset;
                return this;
            }

            /**
             * [ default: false]
             * [
             */
            public java.lang.Boolean getAlternative()
            {
                return alternative;
            }

            /**
             * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
             *
             * <p>
             * Boolean properties can have four possible values:
             * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
             * or {@link Boolean#FALSE}.
             * </p>
             *
             * <p>
             * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
             * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
             * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
             * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
             * </p>
             *
             * <p>
             *
             * </p>
             */
            public boolean isAlternative()
            {
                if ( alternative == null || alternative == com.google.api.client.util.Data.NULL_BOOLEAN )
                {
                    return false;
                }
                return alternative;
            }

            public List setAlternative( java.lang.Boolean alternative )
            {
                this.alternative = alternative;
                return this;
            }

            /**
             * [ default: 10]
             * [
             */
            public java.lang.Integer getLimit()
            {
                return limit;
            }

            public List setLimit( java.lang.Integer limit )
            {
                this.limit = limit;
                return this;
            }

            /**
             *
             */
            public java.lang.String getCountry()
            {
                return country;
            }

            public List setCountry( java.lang.String country )
            {
                this.country = country;
                return this;
            }

            @Override
            public List set( String parameterName, Object value )
            {
                return ( List ) super.set( parameterName, value );
            }
        }

        public class Update
                extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.BankAccount>
        {

            private static final String REST_PATH = "bank-accounts/{account_id}";

            @com.google.api.client.util.Key( "account_id" )
            private java.lang.Long accountId;

            /**
             * Create a request for the method "bank_accounts.update".
             * <p>
             * This request holds the parameters needed by the the payment server.  After setting any optional
             * parameters, call the {@link Update#execute()} method to invoke the remote operation. <p> {@link
             * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param accountId
             * @param content   the {@link biz.turnonline.ecosystem.payment.model.BankAccount}
             * @since 1.13
             */
            protected Update( java.lang.Long accountId, biz.turnonline.ecosystem.payment.model.BankAccount content )
            {
                super( PaymentProcessor.this, "PUT", REST_PATH, content, biz.turnonline.ecosystem.payment.model.BankAccount.class );
                this.accountId = com.google.api.client.util.Preconditions.checkNotNull( accountId, "Required parameter accountId must be specified." );
            }

            @Override
            public Update setAlt( java.lang.String alt )
            {
                return ( Update ) super.setAlt( alt );
            }

            @Override
            public Update setFields( java.lang.String fields )
            {
                return ( Update ) super.setFields( fields );
            }

            @Override
            public Update setKey( java.lang.String key )
            {
                return ( Update ) super.setKey( key );
            }

            @Override
            public Update setOauthToken( java.lang.String oauthToken )
            {
                return ( Update ) super.setOauthToken( oauthToken );
            }

            @Override
            public Update setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Update ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Update setQuotaUser( java.lang.String quotaUser )
            {
                return ( Update ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Update setUserIp( java.lang.String userIp )
            {
                return ( Update ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getAccountId()
            {
                return accountId;
            }

            public Update setAccountId( java.lang.Long accountId )
            {
                this.accountId = accountId;
                return this;
            }

            @Override
            public Update set( String parameterName, Object value )
            {
                return ( Update ) super.set( parameterName, value );
            }
        }

        /**
         * The "primary" collection of methods.
         */
        public class Primary
        {

            /**
             * Create a request for the method "primary.get".
             * <p>
             * This request holds the parameters needed by the payment server.  After setting any optional
             * parameters, call the {@link Get#execute()} method to invoke the remote operation.
             *
             * @return the request
             */
            public Get get() throws java.io.IOException
            {
                Get result = new Get();
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "primary.update".
             * <p>
             * This request holds the parameters needed by the payment server.  After setting any optional
             * parameters, call the {@link Update#execute()} method to invoke the remote operation.
             *
             * @param accountId
             * @return the request
             */
            public Update update( java.lang.Long accountId ) throws java.io.IOException
            {
                Update result = new Update( accountId );
                initialize( result );
                return result;
            }

            public class Get
                    extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.BankAccount>
            {

                private static final String REST_PATH = "bank-accounts/primary";

                @com.google.api.client.util.Key
                private java.lang.String country;

                /**
                 * Create a request for the method "primary.get".
                 * <p>
                 * This request holds the parameters needed by the the payment server.  After setting any optional
                 * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
                 * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                 * called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @since 1.13
                 */
                protected Get()
                {
                    super( PaymentProcessor.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.payment.model.BankAccount.class );
                }

                @Override
                public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                {
                    return super.executeUsingHead();
                }

                @Override
                public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                {
                    return super.buildHttpRequestUsingHead();
                }

                @Override
                public Get setAlt( java.lang.String alt )
                {
                    return ( Get ) super.setAlt( alt );
                }

                @Override
                public Get setFields( java.lang.String fields )
                {
                    return ( Get ) super.setFields( fields );
                }

                @Override
                public Get setKey( java.lang.String key )
                {
                    return ( Get ) super.setKey( key );
                }

                @Override
                public Get setOauthToken( java.lang.String oauthToken )
                {
                    return ( Get ) super.setOauthToken( oauthToken );
                }

                @Override
                public Get setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Get ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Get setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Get ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Get setUserIp( java.lang.String userIp )
                {
                    return ( Get ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.String getCountry()
                {
                    return country;
                }

                public Get setCountry( java.lang.String country )
                {
                    this.country = country;
                    return this;
                }

                @Override
                public Get set( String parameterName, Object value )
                {
                    return ( Get ) super.set( parameterName, value );
                }
            }

            public class Update
                    extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.BankAccount>
            {

                private static final String REST_PATH = "bank-accounts/{account_id}/primary";

                @com.google.api.client.util.Key( "account_id" )
                private java.lang.Long accountId;

                /**
                 * Create a request for the method "primary.update".
                 * <p>
                 * This request holds the parameters needed by the the payment server.  After setting any optional
                 * parameters, call the {@link Update#execute()} method to invoke the remote operation. <p> {@link
                 * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                 * be called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param accountId
                 * @since 1.13
                 */
                protected Update( java.lang.Long accountId )
                {
                    super( PaymentProcessor.this, "PUT", REST_PATH, null, biz.turnonline.ecosystem.payment.model.BankAccount.class );
                    this.accountId = com.google.api.client.util.Preconditions.checkNotNull( accountId, "Required parameter accountId must be specified." );
                }

                @Override
                public Update setAlt( java.lang.String alt )
                {
                    return ( Update ) super.setAlt( alt );
                }

                @Override
                public Update setFields( java.lang.String fields )
                {
                    return ( Update ) super.setFields( fields );
                }

                @Override
                public Update setKey( java.lang.String key )
                {
                    return ( Update ) super.setKey( key );
                }

                @Override
                public Update setOauthToken( java.lang.String oauthToken )
                {
                    return ( Update ) super.setOauthToken( oauthToken );
                }

                @Override
                public Update setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Update ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Update setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Update ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Update setUserIp( java.lang.String userIp )
                {
                    return ( Update ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getAccountId()
                {
                    return accountId;
                }

                public Update setAccountId( java.lang.Long accountId )
                {
                    this.accountId = accountId;
                    return this;
                }

                @Override
                public Update set( String parameterName, Object value )
                {
                    return ( Update ) super.set( parameterName, value );
                }
            }

        }
    }

    /**
     * The "bank_code" collection of methods.
     */
    public class BankCode
    {

        /**
         * Create a request for the method "bank_code.get".
         * <p>
         * This request holds the parameters needed by the payment server.  After setting any optional
         * parameters, call the {@link Get#execute()} method to invoke the remote operation.
         *
         * @param code
         * @return the request
         */
        public Get get( java.lang.String code ) throws java.io.IOException
        {
            Get result = new Get( code );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "bank_code.list".
         * <p>
         * This request holds the parameters needed by the payment server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException
        {
            List result = new List();
            initialize( result );
            return result;
        }

        public class Get
                extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.BankCode>
        {

            private static final String REST_PATH = "codebook/bank-code/{code}";

            @com.google.api.client.util.Key
            private java.lang.String code;

            @com.google.api.client.util.Key
            private java.lang.String country;

            /**
             * Create a request for the method "bank_code.get".
             * <p>
             * This request holds the parameters needed by the the payment server.  After setting any optional
             * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
             * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param code
             * @since 1.13
             */
            protected Get( java.lang.String code )
            {
                super( PaymentProcessor.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.payment.model.BankCode.class );
                this.code = com.google.api.client.util.Preconditions.checkNotNull( code, "Required parameter code must be specified." );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public Get setAlt( java.lang.String alt )
            {
                return ( Get ) super.setAlt( alt );
            }

            @Override
            public Get setFields( java.lang.String fields )
            {
                return ( Get ) super.setFields( fields );
            }

            @Override
            public Get setKey( java.lang.String key )
            {
                return ( Get ) super.setKey( key );
            }

            @Override
            public Get setOauthToken( java.lang.String oauthToken )
            {
                return ( Get ) super.setOauthToken( oauthToken );
            }

            @Override
            public Get setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Get ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Get setQuotaUser( java.lang.String quotaUser )
            {
                return ( Get ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Get setUserIp( java.lang.String userIp )
            {
                return ( Get ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.String getCode()
            {
                return code;
            }

            public Get setCode( java.lang.String code )
            {
                this.code = code;
                return this;
            }

            /**
             *
             */
            public java.lang.String getCountry()
            {
                return country;
            }

            public Get setCountry( java.lang.String country )
            {
                this.country = country;
                return this;
            }

            @Override
            public Get set( String parameterName, Object value )
            {
                return ( Get ) super.set( parameterName, value );
            }
        }

        public class List
                extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.BankCodeCollection>
        {

            private static final String REST_PATH = "codebook/bank-code";

            @com.google.api.client.util.Key
            private java.lang.String country;

            /**
             * Create a request for the method "bank_code.list".
             * <p>
             * This request holds the parameters needed by the the payment server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
             * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List()
            {
                super( PaymentProcessor.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.payment.model.BankCodeCollection.class );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt( java.lang.String alt )
            {
                return ( List ) super.setAlt( alt );
            }

            @Override
            public List setFields( java.lang.String fields )
            {
                return ( List ) super.setFields( fields );
            }

            @Override
            public List setKey( java.lang.String key )
            {
                return ( List ) super.setKey( key );
            }

            @Override
            public List setOauthToken( java.lang.String oauthToken )
            {
                return ( List ) super.setOauthToken( oauthToken );
            }

            @Override
            public List setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( List ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public List setQuotaUser( java.lang.String quotaUser )
            {
                return ( List ) super.setQuotaUser( quotaUser );
            }

            @Override
            public List setUserIp( java.lang.String userIp )
            {
                return ( List ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.String getCountry()
            {
                return country;
            }

            public List setCountry( java.lang.String country )
            {
                this.country = country;
                return this;
            }

            @Override
            public List set( String parameterName, Object value )
            {
                return ( List ) super.set( parameterName, value );
            }
        }

    }

    /**
     * The "category" collection of methods.
     */
    public class Category
    {

        /**
         * Create a request for the method "category.delete".
         * <p>
         * This request holds the parameters needed by the payment server.  After setting any optional
         * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
         *
         * @param id
         * @return the request
         */
        public Delete delete( java.lang.Long id ) throws java.io.IOException
        {
            Delete result = new Delete( id );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "category.get".
         * <p>
         * This request holds the parameters needed by the payment server.  After setting any optional
         * parameters, call the {@link Get#execute()} method to invoke the remote operation.
         *
         * @param id
         * @return the request
         */
        public Get get( java.lang.Long id ) throws java.io.IOException
        {
            Get result = new Get( id );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "category.insert".
         * <p>
         * This request holds the parameters needed by the payment server.  After setting any optional
         * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
         *
         * @param content the {@link biz.turnonline.ecosystem.payment.model.Category}
         * @return the request
         */
        public Insert insert( biz.turnonline.ecosystem.payment.model.Category content ) throws java.io.IOException
        {
            Insert result = new Insert( content );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "category.list".
         * <p>
         * This request holds the parameters needed by the payment server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException
        {
            List result = new List();
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "category.update".
         * <p>
         * This request holds the parameters needed by the payment server.  After setting any optional
         * parameters, call the {@link Update#execute()} method to invoke the remote operation.
         *
         * @param id
         * @param content the {@link biz.turnonline.ecosystem.payment.model.Category}
         * @return the request
         */
        public Update update( java.lang.Long id, biz.turnonline.ecosystem.payment.model.Category content )
                throws java.io.IOException
        {
            Update result = new Update( id, content );
            initialize( result );
            return result;
        }

        /**
         * An accessor for creating requests from the Transaction collection.
         *
         * <p>The typical use is:</p>
         * <pre>
         *   {@code PaymentProcessor payment = new PaymentProcessor(...);}
         *   {@code PaymentProcessor.Transaction.List request = payment.transaction().list(parameters ...)}
         * </pre>
         *
         * @return the resource collection
         */
        public Transaction transaction()
        {
            return new Transaction();
        }

        public class Delete
                extends PaymentProcessorRequest<Void>
        {

            private static final String REST_PATH = "categories/{id}";

            @com.google.api.client.util.Key
            private java.lang.Long id;

            /**
             * Create a request for the method "category.delete".
             * <p>
             * This request holds the parameters needed by the the payment server.  After setting any optional
             * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
             * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param id
             * @since 1.13
             */
            protected Delete( java.lang.Long id )
            {
                super( PaymentProcessor.this, "DELETE", REST_PATH, null, Void.class );
                this.id = com.google.api.client.util.Preconditions.checkNotNull( id, "Required parameter id must be specified." );
            }

            @Override
            public Delete setAlt( java.lang.String alt )
            {
                return ( Delete ) super.setAlt( alt );
            }

            @Override
            public Delete setFields( java.lang.String fields )
            {
                return ( Delete ) super.setFields( fields );
            }

            @Override
            public Delete setKey( java.lang.String key )
            {
                return ( Delete ) super.setKey( key );
            }

            @Override
            public Delete setOauthToken( java.lang.String oauthToken )
            {
                return ( Delete ) super.setOauthToken( oauthToken );
            }

            @Override
            public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Delete ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Delete setQuotaUser( java.lang.String quotaUser )
            {
                return ( Delete ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Delete setUserIp( java.lang.String userIp )
            {
                return ( Delete ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getId()
            {
                return id;
            }

            public Delete setId( java.lang.Long id )
            {
                this.id = id;
                return this;
            }

            @Override
            public Delete set( String parameterName, Object value )
            {
                return ( Delete ) super.set( parameterName, value );
            }
        }

        public class Get
                extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.Category>
        {

            private static final String REST_PATH = "categories/{id}";

            @com.google.api.client.util.Key
            private java.lang.Long id;

            /**
             * Create a request for the method "category.get".
             * <p>
             * This request holds the parameters needed by the the payment server.  After setting any optional
             * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
             * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param id
             * @since 1.13
             */
            protected Get( java.lang.Long id )
            {
                super( PaymentProcessor.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.payment.model.Category.class );
                this.id = com.google.api.client.util.Preconditions.checkNotNull( id, "Required parameter id must be specified." );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public Get setAlt( java.lang.String alt )
            {
                return ( Get ) super.setAlt( alt );
            }

            @Override
            public Get setFields( java.lang.String fields )
            {
                return ( Get ) super.setFields( fields );
            }

            @Override
            public Get setKey( java.lang.String key )
            {
                return ( Get ) super.setKey( key );
            }

            @Override
            public Get setOauthToken( java.lang.String oauthToken )
            {
                return ( Get ) super.setOauthToken( oauthToken );
            }

            @Override
            public Get setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Get ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Get setQuotaUser( java.lang.String quotaUser )
            {
                return ( Get ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Get setUserIp( java.lang.String userIp )
            {
                return ( Get ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getId()
            {
                return id;
            }

            public Get setId( java.lang.Long id )
            {
                this.id = id;
                return this;
            }

            @Override
            public Get set( String parameterName, Object value )
            {
                return ( Get ) super.set( parameterName, value );
            }
        }

        public class Insert
                extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.Category>
        {

            private static final String REST_PATH = "categories";

            /**
             * Create a request for the method "category.insert".
             * <p>
             * This request holds the parameters needed by the the payment server.  After setting any optional
             * parameters, call the {@link Insert#execute()} method to invoke the remote operation. <p> {@link
             * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param content the {@link biz.turnonline.ecosystem.payment.model.Category}
             * @since 1.13
             */
            protected Insert( biz.turnonline.ecosystem.payment.model.Category content )
            {
                super( PaymentProcessor.this, "POST", REST_PATH, content, biz.turnonline.ecosystem.payment.model.Category.class );
            }

            @Override
            public Insert setAlt( java.lang.String alt )
            {
                return ( Insert ) super.setAlt( alt );
            }

            @Override
            public Insert setFields( java.lang.String fields )
            {
                return ( Insert ) super.setFields( fields );
            }

            @Override
            public Insert setKey( java.lang.String key )
            {
                return ( Insert ) super.setKey( key );
            }

            @Override
            public Insert setOauthToken( java.lang.String oauthToken )
            {
                return ( Insert ) super.setOauthToken( oauthToken );
            }

            @Override
            public Insert setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Insert ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Insert setQuotaUser( java.lang.String quotaUser )
            {
                return ( Insert ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Insert setUserIp( java.lang.String userIp )
            {
                return ( Insert ) super.setUserIp( userIp );
            }

            @Override
            public Insert set( String parameterName, Object value )
            {
                return ( Insert ) super.set( parameterName, value );
            }
        }

        public class List
                extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.CategoryCollection>
        {

            private static final String REST_PATH = "categories";

            /**
             * Create a request for the method "category.list".
             * <p>
             * This request holds the parameters needed by the the payment server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
             * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List()
            {
                super( PaymentProcessor.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.payment.model.CategoryCollection.class );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt( java.lang.String alt )
            {
                return ( List ) super.setAlt( alt );
            }

            @Override
            public List setFields( java.lang.String fields )
            {
                return ( List ) super.setFields( fields );
            }

            @Override
            public List setKey( java.lang.String key )
            {
                return ( List ) super.setKey( key );
            }

            @Override
            public List setOauthToken( java.lang.String oauthToken )
            {
                return ( List ) super.setOauthToken( oauthToken );
            }

            @Override
            public List setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( List ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public List setQuotaUser( java.lang.String quotaUser )
            {
                return ( List ) super.setQuotaUser( quotaUser );
            }

            @Override
            public List setUserIp( java.lang.String userIp )
            {
                return ( List ) super.setUserIp( userIp );
            }

            @Override
            public List set( String parameterName, Object value )
            {
                return ( List ) super.set( parameterName, value );
            }
        }

        public class Update
                extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.Category>
        {

            private static final String REST_PATH = "categories/{id}";

            @com.google.api.client.util.Key
            private java.lang.Long id;

            /**
             * Create a request for the method "category.update".
             * <p>
             * This request holds the parameters needed by the the payment server.  After setting any optional
             * parameters, call the {@link Update#execute()} method to invoke the remote operation. <p> {@link
             * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param id
             * @param content the {@link biz.turnonline.ecosystem.payment.model.Category}
             * @since 1.13
             */
            protected Update( java.lang.Long id, biz.turnonline.ecosystem.payment.model.Category content )
            {
                super( PaymentProcessor.this, "PUT", REST_PATH, content, biz.turnonline.ecosystem.payment.model.Category.class );
                this.id = com.google.api.client.util.Preconditions.checkNotNull( id, "Required parameter id must be specified." );
            }

            @Override
            public Update setAlt( java.lang.String alt )
            {
                return ( Update ) super.setAlt( alt );
            }

            @Override
            public Update setFields( java.lang.String fields )
            {
                return ( Update ) super.setFields( fields );
            }

            @Override
            public Update setKey( java.lang.String key )
            {
                return ( Update ) super.setKey( key );
            }

            @Override
            public Update setOauthToken( java.lang.String oauthToken )
            {
                return ( Update ) super.setOauthToken( oauthToken );
            }

            @Override
            public Update setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Update ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Update setQuotaUser( java.lang.String quotaUser )
            {
                return ( Update ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Update setUserIp( java.lang.String userIp )
            {
                return ( Update ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getId()
            {
                return id;
            }

            public Update setId( java.lang.Long id )
            {
                this.id = id;
                return this;
            }

            @Override
            public Update set( String parameterName, Object value )
            {
                return ( Update ) super.set( parameterName, value );
            }
        }

        /**
         * The "transaction" collection of methods.
         */
        public class Transaction
        {

            /**
             * Create a request for the method "transaction.list".
             * <p>
             * This request holds the parameters needed by the payment server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation.
             *
             * @param transactionId
             * @return the request
             */
            public List list( java.lang.Long transactionId ) throws java.io.IOException
            {
                List result = new List( transactionId );
                initialize( result );
                return result;
            }

            public class List
                    extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.CategoryCollection>
            {

                private static final String REST_PATH = "categories/transactions/{transactionId}";

                @com.google.api.client.util.Key
                private java.lang.Long transactionId;

                /**
                 * Create a request for the method "transaction.list".
                 * <p>
                 * This request holds the parameters needed by the the payment server.  After setting any optional
                 * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
                 * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                 * called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param transactionId
                 * @since 1.13
                 */
                protected List( java.lang.Long transactionId )
                {
                    super( PaymentProcessor.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.payment.model.CategoryCollection.class );
                    this.transactionId = com.google.api.client.util.Preconditions.checkNotNull( transactionId, "Required parameter transactionId must be specified." );
                }

                @Override
                public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                {
                    return super.executeUsingHead();
                }

                @Override
                public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                {
                    return super.buildHttpRequestUsingHead();
                }

                @Override
                public List setAlt( java.lang.String alt )
                {
                    return ( List ) super.setAlt( alt );
                }

                @Override
                public List setFields( java.lang.String fields )
                {
                    return ( List ) super.setFields( fields );
                }

                @Override
                public List setKey( java.lang.String key )
                {
                    return ( List ) super.setKey( key );
                }

                @Override
                public List setOauthToken( java.lang.String oauthToken )
                {
                    return ( List ) super.setOauthToken( oauthToken );
                }

                @Override
                public List setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( List ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public List setQuotaUser( java.lang.String quotaUser )
                {
                    return ( List ) super.setQuotaUser( quotaUser );
                }

                @Override
                public List setUserIp( java.lang.String userIp )
                {
                    return ( List ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getTransactionId()
                {
                    return transactionId;
                }

                public List setTransactionId( java.lang.Long transactionId )
                {
                    this.transactionId = transactionId;
                    return this;
                }

                @Override
                public List set( String parameterName, Object value )
                {
                    return ( List ) super.set( parameterName, value );
                }
            }

        }
    }

    /**
     * The "transactions" collection of methods.
     */
    public class Transactions
    {

        /**
         * Create a request for the method "transactions.list".
         * <p>
         * This request holds the parameters needed by the payment server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException
        {
            List result = new List();
            initialize( result );
            return result;
        }

        public class List
                extends PaymentProcessorRequest<biz.turnonline.ecosystem.payment.model.TransactionCollection>
        {

            private static final String REST_PATH = "transactions";

            @com.google.api.client.util.Key
            private java.lang.Long accountId;

            @com.google.api.client.util.Key
            private java.lang.String status;

            @com.google.api.client.util.Key
            private java.lang.Long invoiceId;

            @com.google.api.client.util.Key
            private com.google.api.client.util.DateTime from;

            @com.google.api.client.util.Key
            private java.lang.Integer limit;

            @com.google.api.client.util.Key
            private java.lang.Integer offset;

            @com.google.api.client.util.Key
            private java.lang.String type;

            @com.google.api.client.util.Key
            private java.lang.String operation;

            @com.google.api.client.util.Key
            private java.lang.Long orderId;

            @com.google.api.client.util.Key
            private com.google.api.client.util.DateTime to;

            /**
             * Create a request for the method "transactions.list".
             * <p>
             * This request holds the parameters needed by the the payment server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
             * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List()
            {
                super( PaymentProcessor.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.payment.model.TransactionCollection.class );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt( java.lang.String alt )
            {
                return ( List ) super.setAlt( alt );
            }

            @Override
            public List setFields( java.lang.String fields )
            {
                return ( List ) super.setFields( fields );
            }

            @Override
            public List setKey( java.lang.String key )
            {
                return ( List ) super.setKey( key );
            }

            @Override
            public List setOauthToken( java.lang.String oauthToken )
            {
                return ( List ) super.setOauthToken( oauthToken );
            }

            @Override
            public List setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( List ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public List setQuotaUser( java.lang.String quotaUser )
            {
                return ( List ) super.setQuotaUser( quotaUser );
            }

            @Override
            public List setUserIp( java.lang.String userIp )
            {
                return ( List ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getAccountId()
            {
                return accountId;
            }

            public List setAccountId( java.lang.Long accountId )
            {
                this.accountId = accountId;
                return this;
            }

            /**
             *
             */
            public java.lang.String getStatus()
            {
                return status;
            }

            public List setStatus( java.lang.String status )
            {
                this.status = status;
                return this;
            }

            /**
             *
             */
            public java.lang.Long getInvoiceId()
            {
                return invoiceId;
            }

            public List setInvoiceId( java.lang.Long invoiceId )
            {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             *
             */
            public com.google.api.client.util.DateTime getFrom()
            {
                return from;
            }

            public List setFrom( com.google.api.client.util.DateTime from )
            {
                this.from = from;
                return this;
            }

            /**
             * [ default: 20]
             * [
             */
            public java.lang.Integer getLimit()
            {
                return limit;
            }

            public List setLimit( java.lang.Integer limit )
            {
                this.limit = limit;
                return this;
            }

            /**
             * [ default: 0]
             * [
             */
            public java.lang.Integer getOffset()
            {
                return offset;
            }

            public List setOffset( java.lang.Integer offset )
            {
                this.offset = offset;
                return this;
            }

            /**
             *
             */
            public java.lang.String getType()
            {
                return type;
            }

            public List setType( java.lang.String type )
            {
                this.type = type;
                return this;
            }

            /**
             * [ default: both]
             * [
             */
            public java.lang.String getOperation()
            {
                return operation;
            }

            public List setOperation( java.lang.String operation )
            {
                this.operation = operation;
                return this;
            }

            /**
             *
             */
            public java.lang.Long getOrderId()
            {
                return orderId;
            }

            public List setOrderId( java.lang.Long orderId )
            {
                this.orderId = orderId;
                return this;
            }

            /**
             *
             */
            public com.google.api.client.util.DateTime getTo()
            {
                return to;
            }

            public List setTo( com.google.api.client.util.DateTime to )
            {
                this.to = to;
                return this;
            }

            @Override
            public List set( String parameterName, Object value )
            {
                return ( List ) super.set( parameterName, value );
            }
        }

    }
}
