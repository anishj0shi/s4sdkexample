
package com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;


/**
 * Interface to enable OData entity selectors for {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons}. This interface is used by {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponsField CouponsField} and {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponsLink CouponsLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#COUPON_UUID COUPON_UUID}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#COUPON COUPON}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#COUPON_TYPE COUPON_TYPE}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#COUPON_CONTACT_RELATIONSHIP_TYPE COUPON_CONTACT_RELATIONSHIP_TYPE}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#COUPON_CONTACT_RELSHP_TYPE_NAME COUPON_CONTACT_RELSHP_TYPE_NAME}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#MARKETING_AREA MARKETING_AREA}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#MARKETING_AREA_NAME MARKETING_AREA_NAME}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#COUPON_NAME COUPON_NAME}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#COUPON_ORIGIN COUPON_ORIGIN}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#COUPON_CAN_EXCEED_OFFER_PERIOD COUPON_CAN_EXCEED_OFFER_PERIOD}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#COUPON_STATUS COUPON_STATUS}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#COUPON_STATUS_NAME COUPON_STATUS_NAME}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#TOTAL_NUMBER_OF_REDEMPTION TOTAL_NUMBER_OF_REDEMPTION}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#TOTAL_NUMBER_OF_RDMPTN_PER_CONTACT TOTAL_NUMBER_OF_RDMPTN_PER_CONTACT}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#COUPON_CODE_VALIDITY_DURATION COUPON_CODE_VALIDITY_DURATION}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#NUMBER_OF_REDEMPTION NUMBER_OF_REDEMPTION}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#NUMBER_OF_COUPON_CODES NUMBER_OF_COUPON_CODES}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#COUPON_CODE_VALIDITY_DURATION_UNIT COUPON_CODE_VALIDITY_DURATION_UNIT}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#CREATED_BY_USER CREATED_BY_USER}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#CREATION_DATE_TIME CREATION_DATE_TIME}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#LAST_CHANGED_BY_USER LAST_CHANGED_BY_USER}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#LAST_CHANGE_DATE_TIME LAST_CHANGE_DATE_TIME}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#CREATED_BY_USER_NAME CREATED_BY_USER_NAME}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#LAST_CHANGED_BY_USER_NAME LAST_CHANGED_BY_USER_NAME}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#MARKETING_OFFER MARKETING_OFFER}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#OFFER_STATUS OFFER_STATUS}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#OFFER_START_DATE_TIME OFFER_START_DATE_TIME}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#OFFER_END_DATE_TIME OFFER_END_DATE_TIME}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#TO_COUPON_CODE TO_COUPON_CODE}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons#TO_COUPON_TEXT TO_COUPON_TEXT}</li>
 * </ul>
 * 
 */
public interface CouponsSelectable
    extends EntitySelectable<Coupons>
{


}
