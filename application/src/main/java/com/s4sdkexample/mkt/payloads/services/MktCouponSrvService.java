
package com.s4sdkexample.mkt.payloads.services;

import java.util.UUID;
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
public interface MktCouponSrvService {


    /**
     * Fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodesFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponCodesFluentHelper getAllCouponCodes();

    /**
     * Fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entity using key fields.
     * 
     * @param couponCodeUUID
     *     Coupon Code UUID<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodesByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponCodesByKeyFluentHelper getCouponCodesByKey(UUID couponCodeUUID);

    /**
     * Create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entity and save it to the S/4HANA system.
     * 
     * @param couponCodes
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodesCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponCodesCreateFluentHelper createCouponCodes(final CouponCodes couponCodes);

    /**
     * Update an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entity and save it to the S/4HANA system.
     * 
     * @param couponCodes
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodesUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponCodesUpdateFluentHelper updateCouponCodes(final CouponCodes couponCodes);

    /**
     * Deletes an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entity in the S/4HANA system.
     * 
     * @param couponCodes
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes CouponCodes} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodesDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponCodesDeleteFluentHelper deleteCouponCodes(final CouponCodes couponCodes);

    /**
     * Fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodeUsages CouponCodeUsages} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodeUsages CouponCodeUsages} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodeUsagesFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponCodeUsagesFluentHelper getAllCouponCodeUsages();

    /**
     * Fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodeUsages CouponCodeUsages} entity using key fields.
     * 
     * @param couponCodeUsageUUID
     *     Coupon Code Usage UUID<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodeUsages CouponCodeUsages} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodeUsagesByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponCodeUsagesByKeyFluentHelper getCouponCodeUsagesByKey(UUID couponCodeUsageUUID);

    /**
     * Fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTextsFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponTextsFluentHelper getAllCouponTexts();

    /**
     * Fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity using key fields.
     * 
     * @param couponUUID
     *     Coupon UUID<p>Constraints: Not nullable</p>
     * @param language
     *     The language key indicates<p>Constraints: Not nullable, Maximum length: 2</p>
     * @return
     *     A fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTextsByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponTextsByKeyFluentHelper getCouponTextsByKey(UUID couponUUID, String language);

    /**
     * Create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity and save it to the S/4HANA system.
     * 
     * @param couponTexts
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTextsCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponTextsCreateFluentHelper createCouponTexts(final CouponTexts couponTexts);

    /**
     * Update an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity and save it to the S/4HANA system.
     * 
     * @param couponTexts
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTextsUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponTextsUpdateFluentHelper updateCouponTexts(final CouponTexts couponTexts);

    /**
     * Deletes an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity in the S/4HANA system.
     * 
     * @param couponTexts
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTextsDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponTextsDeleteFluentHelper deleteCouponTexts(final CouponTexts couponTexts);

    /**
     * Fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponsFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponsFluentHelper getAllCoupons();

    /**
     * Fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons} entity using key fields.
     * 
     * @param couponUUID
     *     Coupon UUID<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponsByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponsByKeyFluentHelper getCouponsByKey(UUID couponUUID);

    /**
     * Create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons} entity and save it to the S/4HANA system.
     * 
     * @param coupons
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponsCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponsCreateFluentHelper createCoupons(final Coupons coupons);

    /**
     * Update an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons} entity and save it to the S/4HANA system.
     * 
     * @param coupons
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponsUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponsUpdateFluentHelper updateCoupons(final Coupons coupons);

    /**
     * Deletes an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons} entity in the S/4HANA system.
     * 
     * @param coupons
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponsDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    public CouponsDeleteFluentHelper deleteCoupons(final Coupons coupons);

}
