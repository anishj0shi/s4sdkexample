
package com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv;

import java.util.Map;
import java.util.UUID;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;


/**
 * Fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class CouponCodesByKeyFluentHelper
    extends FluentHelperByKey<CouponCodesByKeyFluentHelper, CouponCodes, CouponCodesSelectable>
{

    final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param couponCodeUUID
     *     Coupon Code UUID<p>Constraints: Not nullable</p>
     */
    public CouponCodesByKeyFluentHelper(UUID couponCodeUUID) {
        key.put("CouponCodeUUID", couponCodeUUID);
    }

    @Override
    protected Class<CouponCodes> getEntityClass() {
        return CouponCodes.class;
    }

    @Override
    protected Map<String, Object> getKey() {
        return key;
    }

}
