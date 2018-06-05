
package com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv;

import java.util.Map;
import java.util.UUID;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;


/**
 * Fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodeUsages CouponCodeUsages} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class CouponCodeUsagesByKeyFluentHelper
    extends FluentHelperByKey<CouponCodeUsagesByKeyFluentHelper, CouponCodeUsages, CouponCodeUsagesSelectable>
{

    final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodeUsages CouponCodeUsages} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param couponCodeUsageUUID
     *     Coupon Code Usage UUID<p>Constraints: Not nullable</p>
     */
    public CouponCodeUsagesByKeyFluentHelper(UUID couponCodeUsageUUID) {
        key.put("CouponCodeUsageUUID", couponCodeUsageUUID);
    }

    @Override
    protected Class<CouponCodeUsages> getEntityClass() {
        return CouponCodeUsages.class;
    }

    @Override
    protected Map<String, Object> getKey() {
        return key;
    }

}
