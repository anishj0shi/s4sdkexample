
package com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperCreate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


/**
 * Fluent helper to create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAsset InteractionDigitalAsset} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
@RequiredArgsConstructor
public class InteractionDigitalAssetCreateFluentHelper
    extends FluentHelperCreate<InteractionDigitalAssetCreateFluentHelper, InteractionDigitalAsset>
{

    /**
     * {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAsset InteractionDigitalAsset} entity object that will be created in the S/4HANA system.
     * 
     */
    @Getter(AccessLevel.PROTECTED)
    private final InteractionDigitalAsset entity;

}
