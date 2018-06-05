
package com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv;

import java.util.Map;
import java.util.UUID;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;


/**
 * Fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAsset InteractionDigitalAsset} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class InteractionDigitalAssetByKeyFluentHelper
    extends FluentHelperByKey<InteractionDigitalAssetByKeyFluentHelper, InteractionDigitalAsset, InteractionDigitalAssetSelectable>
{

    final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAsset InteractionDigitalAsset} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param interactionDigitalAssetUUID
     *     UUID for API-Service<p>Constraints: Not nullable</p>
     */
    public InteractionDigitalAssetByKeyFluentHelper(UUID interactionDigitalAssetUUID) {
        key.put("InteractionDigitalAssetUUID", interactionDigitalAssetUUID);
    }

    @Override
    protected Class<InteractionDigitalAsset> getEntityClass() {
        return InteractionDigitalAsset.class;
    }

    @Override
    protected Map<String, Object> getKey() {
        return key;
    }

}
