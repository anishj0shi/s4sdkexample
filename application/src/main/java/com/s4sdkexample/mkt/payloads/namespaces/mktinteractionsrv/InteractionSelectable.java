
package com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;


/**
 * Interface to enable OData entity selectors for {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction Interaction}. This interface is used by {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionField InteractionField} and {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionLink InteractionLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_UUID INTERACTION_UUID}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_CONTACT_ORIGIN INTERACTION_CONTACT_ORIGIN}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_CONTACT_ID INTERACTION_CONTACT_ID}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#COMMUNICATION_MEDIUM COMMUNICATION_MEDIUM}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_TYPE INTERACTION_TYPE}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_TIME_STAMP_UTC INTERACTION_TIME_STAMP_UTC}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_SOURCE_OBJECT_TYPE INTERACTION_SOURCE_OBJECT_TYPE}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_SOURCE_OBJECT INTERACTION_SOURCE_OBJECT}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#MARKETING_AREA MARKETING_AREA}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#CAMPAIGN_ID CAMPAIGN_ID}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#MARKETING_LOCATION_ORIGIN MARKETING_LOCATION_ORIGIN}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#MARKETING_LOCATION MARKETING_LOCATION}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#DIGITAL_ACCOUNT_TYPE DIGITAL_ACCOUNT_TYPE}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#DIGITAL_ACCOUNT DIGITAL_ACCOUNT}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#MKT_AGREEMENT_ORIGIN MKT_AGREEMENT_ORIGIN}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#MKT_AGREEMENT_EXTERNAL_ID MKT_AGREEMENT_EXTERNAL_ID}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#CAMPAIGN_CONTENT CAMPAIGN_CONTENT}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_WEIGHTING_FACTOR INTERACTION_WEIGHTING_FACTOR}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_SENTIMENT_VALUE INTERACTION_SENTIMENT_VALUE}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_STATUS INTERACTION_STATUS}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_REASON INTERACTION_REASON}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_LANGUAGE INTERACTION_LANGUAGE}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_IS_ANONYMOUS INTERACTION_IS_ANONYMOUS}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_AMOUNT INTERACTION_AMOUNT}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_CURRENCY INTERACTION_CURRENCY}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_LATITUDE INTERACTION_LATITUDE}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_LONGITUDE INTERACTION_LONGITUDE}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#SPATIAL_REFERENCE_SYSTEM SPATIAL_REFERENCE_SYSTEM}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#DEVICE_TYPE DEVICE_TYPE}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_DEVICE_NAME INTERACTION_DEVICE_NAME}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#PRECEDING_INTERACTION_UUID PRECEDING_INTERACTION_UUID}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#SOURCE_SYSTEM_TYPE SOURCE_SYSTEM_TYPE}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#SOURCE_SYSTEM SOURCE_SYSTEM}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_SOURCE_OBJECT_ADDL_ID INTERACTION_SOURCE_OBJECT_ADDL_ID}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_SOURCE_OBJECT_STATUS INTERACTION_SOURCE_OBJECT_STATUS}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_SOURCE_DATA_URL INTERACTION_SOURCE_DATA_URL}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_SOURCE_TIME_STAMP_UTC INTERACTION_SOURCE_TIME_STAMP_UTC}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#CAMPAIGN_CONTENT_LINK_URL CAMPAIGN_CONTENT_LINK_URL}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#CAMPAIGN_CONTENT_LINK_NAME CAMPAIGN_CONTENT_LINK_NAME}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_CONTACT_UUID INTERACTION_CONTACT_UUID}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_LAST_CHANGED_DATE_TIME INTERACTION_LAST_CHANGED_DATE_TIME}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_LAST_CHANGED_BY_USER INTERACTION_LAST_CHANGED_BY_USER}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_CONTENT_SUBJECT INTERACTION_CONTENT_SUBJECT}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#INTERACTION_CONTENT INTERACTION_CONTENT}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#TO_INTERACTION_INTERESTS TO_INTERACTION_INTERESTS}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#TO_INTERACTION_PRODUCT_CATEGORIES TO_INTERACTION_PRODUCT_CATEGORIES}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#TO_INTERACTION_DIGITAL_ASSETS TO_INTERACTION_DIGITAL_ASSETS}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#TO_INTERACTION_OFFERS TO_INTERACTION_OFFERS}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#TO_INTERACTION_ADDITIONAL_OBJECTS TO_INTERACTION_ADDITIONAL_OBJECTS}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#TO_INTERACTION_PRODUCTS TO_INTERACTION_PRODUCTS}</li>
 * <li>{@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction#TO_INTERACTION_TAGS TO_INTERACTION_TAGS}</li>
 * </ul>
 * 
 */
public interface InteractionSelectable
    extends EntitySelectable<Interaction>
{


}
