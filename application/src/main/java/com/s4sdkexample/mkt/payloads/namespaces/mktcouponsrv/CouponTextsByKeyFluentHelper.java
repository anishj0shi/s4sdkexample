
package com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv;

import java.util.Map;
import java.util.UUID;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;


/**
 * Fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class CouponTextsByKeyFluentHelper
    extends FluentHelperByKey<CouponTextsByKeyFluentHelper, CouponTexts, CouponTextsSelectable>
{

    final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param couponUUID
     *     Coupon UUID<p>Constraints: Not nullable</p>
     * @param language
     *     The language key indicates<p>Constraints: Not nullable, Maximum length: 2</p>
     */
    public CouponTextsByKeyFluentHelper(UUID couponUUID, String language) {
        key.put("CouponUUID", couponUUID);
        key.put("Language", language);
    }

    @Override
    protected Class<CouponTexts> getEntityClass() {
        return CouponTexts.class;
    }

    @Override
    protected Map<String, Object> getKey() {
        return key;
    }

}
