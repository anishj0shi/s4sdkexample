
package com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperRead;


/**
 * Fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategory InteractionProductCategory} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class InteractionProductCategoryFluentHelper
    extends FluentHelperRead<InteractionProductCategoryFluentHelper, InteractionProductCategory, InteractionProductCategorySelectable>
{


    @Override
    protected Class<InteractionProductCategory> getEntityClass() {
        return InteractionProductCategory.class;
    }

}
