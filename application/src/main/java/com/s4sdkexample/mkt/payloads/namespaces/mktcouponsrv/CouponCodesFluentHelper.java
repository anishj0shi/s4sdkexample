
package com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperRead;


/**
 * Fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class CouponCodesFluentHelper
    extends FluentHelperRead<CouponCodesFluentHelper, CouponCodes, CouponCodesSelectable>
{


    @Override
    protected Class<CouponCodes> getEntityClass() {
        return CouponCodes.class;
    }

}
