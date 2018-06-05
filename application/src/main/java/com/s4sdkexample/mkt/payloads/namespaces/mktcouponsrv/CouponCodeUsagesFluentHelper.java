
package com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperRead;


/**
 * Fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodeUsages CouponCodeUsages} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class CouponCodeUsagesFluentHelper
    extends FluentHelperRead<CouponCodeUsagesFluentHelper, CouponCodeUsages, CouponCodeUsagesSelectable>
{


    @Override
    protected Class<CouponCodeUsages> getEntityClass() {
        return CouponCodeUsages.class;
    }

}
