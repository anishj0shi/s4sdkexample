
package com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperRead;


/**
 * Fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterest InteractionInterest} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class InteractionInterestFluentHelper
    extends FluentHelperRead<InteractionInterestFluentHelper, InteractionInterest, InteractionInterestSelectable>
{


    @Override
    protected Class<InteractionInterest> getEntityClass() {
        return InteractionInterest.class;
    }

}
