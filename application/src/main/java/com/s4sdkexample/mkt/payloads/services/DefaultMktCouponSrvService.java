
package com.s4sdkexample.mkt.payloads.services;

import java.util.UUID;
import javax.inject.Named;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodeUsagesByKeyFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodeUsagesFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodesByKeyFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodesCreateFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodesDeleteFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodesFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodesUpdateFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTextsByKeyFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTextsCreateFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTextsDeleteFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTextsFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTextsUpdateFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponsByKeyFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponsCreateFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponsDeleteFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponsFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponsUpdateFluentHelper;


/**
 * <p>Reference: <a href='https://api.sap.com/shell/discover/contentpackage/SAPS4HANACloud/api/API_MKT_COUPON_SRV?section=OVERVIEW'>SAP API Business Hub</a></p><h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>API_MKT_COUPON_SRV</td></tr></table>
 * 
 */
@Named("com.s4sdkexample.mkt.payloads.services.DefaultMktCouponSrvService")
public class DefaultMktCouponSrvService
    implements MktCouponSrvService
{


    @Override
    public CouponCodesFluentHelper getAllCouponCodes() {
        return new CouponCodesFluentHelper();
    }

    @Override
    public CouponCodesByKeyFluentHelper getCouponCodesByKey(UUID couponCodeUUID) {
        return new CouponCodesByKeyFluentHelper(couponCodeUUID);
    }

    @Override
    public CouponCodesCreateFluentHelper createCouponCodes(final CouponCodes couponCodes) {
        return new CouponCodesCreateFluentHelper(couponCodes);
    }

    @Override
    public CouponCodesUpdateFluentHelper updateCouponCodes(final CouponCodes couponCodes) {
        return new CouponCodesUpdateFluentHelper(couponCodes);
    }

    @Override
    public CouponCodesDeleteFluentHelper deleteCouponCodes(final CouponCodes couponCodes) {
        return new CouponCodesDeleteFluentHelper(couponCodes);
    }

    @Override
    public CouponCodeUsagesFluentHelper getAllCouponCodeUsages() {
        return new CouponCodeUsagesFluentHelper();
    }

    @Override
    public CouponCodeUsagesByKeyFluentHelper getCouponCodeUsagesByKey(UUID couponCodeUsageUUID) {
        return new CouponCodeUsagesByKeyFluentHelper(couponCodeUsageUUID);
    }

    @Override
    public CouponTextsFluentHelper getAllCouponTexts() {
        return new CouponTextsFluentHelper();
    }

    @Override
    public CouponTextsByKeyFluentHelper getCouponTextsByKey(UUID couponUUID, String language) {
        return new CouponTextsByKeyFluentHelper(couponUUID, language);
    }

    @Override
    public CouponTextsCreateFluentHelper createCouponTexts(final CouponTexts couponTexts) {
        return new CouponTextsCreateFluentHelper(couponTexts);
    }

    @Override
    public CouponTextsUpdateFluentHelper updateCouponTexts(final CouponTexts couponTexts) {
        return new CouponTextsUpdateFluentHelper(couponTexts);
    }

    @Override
    public CouponTextsDeleteFluentHelper deleteCouponTexts(final CouponTexts couponTexts) {
        return new CouponTextsDeleteFluentHelper(couponTexts);
    }

    @Override
    public CouponsFluentHelper getAllCoupons() {
        return new CouponsFluentHelper();
    }

    @Override
    public CouponsByKeyFluentHelper getCouponsByKey(UUID couponUUID) {
        return new CouponsByKeyFluentHelper(couponUUID);
    }

    @Override
    public CouponsCreateFluentHelper createCoupons(final Coupons coupons) {
        return new CouponsCreateFluentHelper(coupons);
    }

    @Override
    public CouponsUpdateFluentHelper updateCoupons(final Coupons coupons) {
        return new CouponsUpdateFluentHelper(coupons);
    }

    @Override
    public CouponsDeleteFluentHelper deleteCoupons(final Coupons coupons) {
        return new CouponsDeleteFluentHelper(coupons);
    }

}
