
package com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


/**
 * Fluent helper to delete an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
@RequiredArgsConstructor
public class CouponTextsDeleteFluentHelper
    extends FluentHelperDelete<CouponTextsDeleteFluentHelper, CouponTexts>
{

    /**
     * {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity object that will be deleted in the S/4HANA system.
     * 
     */
    @NonNull
    @Getter(AccessLevel.PROTECTED)
    private final CouponTexts entity;

}
