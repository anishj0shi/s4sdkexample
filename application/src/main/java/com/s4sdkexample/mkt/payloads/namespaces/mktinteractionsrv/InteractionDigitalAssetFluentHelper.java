
package com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperRead;


/**
 * Fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAsset InteractionDigitalAsset} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class InteractionDigitalAssetFluentHelper
    extends FluentHelperRead<InteractionDigitalAssetFluentHelper, InteractionDigitalAsset, InteractionDigitalAssetSelectable>
{


    @Override
    protected Class<InteractionDigitalAsset> getEntityClass() {
        return InteractionDigitalAsset.class;
    }

}
