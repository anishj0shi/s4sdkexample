
package com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.odatav2.connectivity.ODataExceptionType;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQuery;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryBuilder;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryResult;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.ODataTypeValueSerializer;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import org.apache.olingo.odata2.api.edm.EdmSimpleTypeKind;


/**
 * Marketing: Coupon<p></p><p>Original entity name from the Odata EDM: <b>CouponsType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class Coupons
    extends VdmEntity<Coupons>
{

    /**
     * Selector for all available fields of Coupons.
     * 
     */
    public final static CouponsSelectable ALL_FIELDS = new CouponsSelectable() {


        @Override
        public String getFieldName() {
            return "*";
        }

        @Override
        public List<String> getSelections() {
            return Collections.singletonList("*");
        }

    }
    ;
    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CouponUUID</b></p>
     * 
     * @param couponUUID
     *     
     * @return
     *     Coupon UUID
     */
    @SerializedName("CouponUUID")
    @JsonProperty("CouponUUID")
    @Nullable
    @ODataField(odataName = "CouponUUID")
    private UUID couponUUID;
    /**
     * Use with available fluent helpers to apply the <b>CouponUUID</b> field to query operations.
     * 
     */
    public final static CouponsField<UUID> COUPON_UUID = new CouponsField<UUID>("CouponUUID");
    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>Coupon</b></p>
     * 
     * @param coupon
     *     
     * @return
     *     Coupon
     */
    @SerializedName("Coupon")
    @JsonProperty("Coupon")
    @Nullable
    @ODataField(odataName = "Coupon")
    private String coupon;
    /**
     * Use with available fluent helpers to apply the <b>Coupon</b> field to query operations.
     * 
     */
    public final static CouponsField<String> COUPON = new CouponsField<String>("Coupon");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CouponType</b></p>
     * 
     * @param couponType
     *     
     * @return
     *     Coupon Type
     */
    @SerializedName("CouponType")
    @JsonProperty("CouponType")
    @Nullable
    @ODataField(odataName = "CouponType")
    private String couponType;
    /**
     * Use with available fluent helpers to apply the <b>CouponType</b> field to query operations.
     * 
     */
    public final static CouponsField<String> COUPON_TYPE = new CouponsField<String>("CouponType");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CouponContactRelationshipType</b></p>
     * 
     * @param couponContactRelationshipType
     *     
     * @return
     *     Coupon Contact Relationship Type
     */
    @SerializedName("CouponContactRelationshipType")
    @JsonProperty("CouponContactRelationshipType")
    @Nullable
    @ODataField(odataName = "CouponContactRelationshipType")
    private String couponContactRelationshipType;
    /**
     * Use with available fluent helpers to apply the <b>CouponContactRelationshipType</b> field to query operations.
     * 
     */
    public final static CouponsField<String> COUPON_CONTACT_RELATIONSHIP_TYPE = new CouponsField<String>("CouponContactRelationshipType");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>CouponContactRelshpTypeName</b></p>
     * 
     * @param couponContactRelshpTypeName
     *     
     * @return
     *     Coupon Contact Relationship Type Name
     */
    @SerializedName("CouponContactRelshpTypeName")
    @JsonProperty("CouponContactRelshpTypeName")
    @Nullable
    @ODataField(odataName = "CouponContactRelshpTypeName")
    private String couponContactRelshpTypeName;
    /**
     * Use with available fluent helpers to apply the <b>CouponContactRelshpTypeName</b> field to query operations.
     * 
     */
    public final static CouponsField<String> COUPON_CONTACT_RELSHP_TYPE_NAME = new CouponsField<String>("CouponContactRelshpTypeName");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>MarketingArea</b></p><p>You use a marketing area to restrict the access to instances of an object, such as campaign, campaign content, content template, or target group.</p>
     * 
     * @param marketingArea
     *     
     * @return
     *     Identifies an area of responsibility, or an organizational unit.
     */
    @SerializedName("MarketingArea")
    @JsonProperty("MarketingArea")
    @Nullable
    @ODataField(odataName = "MarketingArea")
    private String marketingArea;
    /**
     * Use with available fluent helpers to apply the <b>MarketingArea</b> field to query operations.
     * 
     */
    public final static CouponsField<String> MARKETING_AREA = new CouponsField<String>("MarketingArea");
    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>MarketingAreaName</b></p>
     * 
     * @param marketingAreaName
     *     
     * @return
     *     Description for Marketing Area
     */
    @SerializedName("MarketingAreaName")
    @JsonProperty("MarketingAreaName")
    @Nullable
    @ODataField(odataName = "MarketingAreaName")
    private String marketingAreaName;
    /**
     * Use with available fluent helpers to apply the <b>MarketingAreaName</b> field to query operations.
     * 
     */
    public final static CouponsField<String> MARKETING_AREA_NAME = new CouponsField<String>("MarketingAreaName");
    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>CouponName</b></p>
     * 
     * @param couponName
     *     
     * @return
     *     Coupon Name
     */
    @SerializedName("CouponName")
    @JsonProperty("CouponName")
    @Nullable
    @ODataField(odataName = "CouponName")
    private String couponName;
    /**
     * Use with available fluent helpers to apply the <b>CouponName</b> field to query operations.
     * 
     */
    public final static CouponsField<String> COUPON_NAME = new CouponsField<String>("CouponName");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>CouponOrigin</b></p>
     * 
     * @param couponOrigin
     *     
     * @return
     *     Coupon Origin
     */
    @SerializedName("CouponOrigin")
    @JsonProperty("CouponOrigin")
    @Nullable
    @ODataField(odataName = "CouponOrigin")
    private String couponOrigin;
    /**
     * Use with available fluent helpers to apply the <b>CouponOrigin</b> field to query operations.
     * 
     */
    public final static CouponsField<String> COUPON_ORIGIN = new CouponsField<String>("CouponOrigin");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CouponCanExceedOfferPeriod</b></p>
     * 
     * @param couponCanExceedOfferPeriod
     *     
     * @return
     *     Coupon can Exceed Offer Period
     */
    @SerializedName("CouponCanExceedOfferPeriod")
    @JsonProperty("CouponCanExceedOfferPeriod")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "CouponCanExceedOfferPeriod")
    private Boolean couponCanExceedOfferPeriod;
    /**
     * Use with available fluent helpers to apply the <b>CouponCanExceedOfferPeriod</b> field to query operations.
     * 
     */
    public final static CouponsField<Boolean> COUPON_CAN_EXCEED_OFFER_PERIOD = new CouponsField<Boolean>("CouponCanExceedOfferPeriod");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CouponStatus</b></p>
     * 
     * @param couponStatus
     *     
     * @return
     *     Coupon Status
     */
    @SerializedName("CouponStatus")
    @JsonProperty("CouponStatus")
    @Nullable
    @ODataField(odataName = "CouponStatus")
    private String couponStatus;
    /**
     * Use with available fluent helpers to apply the <b>CouponStatus</b> field to query operations.
     * 
     */
    public final static CouponsField<String> COUPON_STATUS = new CouponsField<String>("CouponStatus");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>CouponStatusName</b></p>
     * 
     * @param couponStatusName
     *     
     * @return
     *     Coupon Status Name
     */
    @SerializedName("CouponStatusName")
    @JsonProperty("CouponStatusName")
    @Nullable
    @ODataField(odataName = "CouponStatusName")
    private String couponStatusName;
    /**
     * Use with available fluent helpers to apply the <b>CouponStatusName</b> field to query operations.
     * 
     */
    public final static CouponsField<String> COUPON_STATUS_NAME = new CouponsField<String>("CouponStatusName");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>TotalNumberOfRedemption</b></p>
     * 
     * @param totalNumberOfRedemption
     *     
     * @return
     *     Total Number of Redemptions
     */
    @SerializedName("TotalNumberOfRedemption")
    @JsonProperty("TotalNumberOfRedemption")
    @Nullable
    @ODataField(odataName = "TotalNumberOfRedemption")
    private Integer totalNumberOfRedemption;
    /**
     * Use with available fluent helpers to apply the <b>TotalNumberOfRedemption</b> field to query operations.
     * 
     */
    public final static CouponsField<Integer> TOTAL_NUMBER_OF_REDEMPTION = new CouponsField<Integer>("TotalNumberOfRedemption");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>TotalNumberOfRdmptnPerContact</b></p>
     * 
     * @param totalNumberOfRdmptnPerContact
     *     
     * @return
     *     Total Number of Redemptions for Each Contact
     */
    @SerializedName("TotalNumberOfRdmptnPerContact")
    @JsonProperty("TotalNumberOfRdmptnPerContact")
    @Nullable
    @ODataField(odataName = "TotalNumberOfRdmptnPerContact")
    private Integer totalNumberOfRdmptnPerContact;
    /**
     * Use with available fluent helpers to apply the <b>TotalNumberOfRdmptnPerContact</b> field to query operations.
     * 
     */
    public final static CouponsField<Integer> TOTAL_NUMBER_OF_RDMPTN_PER_CONTACT = new CouponsField<Integer>("TotalNumberOfRdmptnPerContact");
    /**
     * Constraints: Not nullable, Precision: 15, Scale: 0 <p>Original property name from the Odata EDM: <b>CouponCodeValidityDuration</b></p>
     * 
     * @param couponCodeValidityDuration
     *     
     * @return
     *     Coupon Code Validity in Days
     */
    @SerializedName("CouponCodeValidityDuration")
    @JsonProperty("CouponCodeValidityDuration")
    @Nullable
    @ODataField(odataName = "CouponCodeValidityDuration")
    private BigDecimal couponCodeValidityDuration;
    /**
     * Use with available fluent helpers to apply the <b>CouponCodeValidityDuration</b> field to query operations.
     * 
     */
    public final static CouponsField<BigDecimal> COUPON_CODE_VALIDITY_DURATION = new CouponsField<BigDecimal>("CouponCodeValidityDuration");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>NumberOfRedemption</b></p>
     * 
     * @param numberOfRedemption
     *     
     * @return
     *     Number of Redemptions
     */
    @SerializedName("NumberOfRedemption")
    @JsonProperty("NumberOfRedemption")
    @Nullable
    @ODataField(odataName = "NumberOfRedemption")
    private Integer numberOfRedemption;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfRedemption</b> field to query operations.
     * 
     */
    public final static CouponsField<Integer> NUMBER_OF_REDEMPTION = new CouponsField<Integer>("NumberOfRedemption");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>NumberOfCouponCodes</b></p>
     * 
     * @param numberOfCouponCodes
     *     
     */
    @SerializedName("NumberOfCouponCodes")
    @JsonProperty("NumberOfCouponCodes")
    @Nullable
    @ODataField(odataName = "NumberOfCouponCodes")
    private Integer numberOfCouponCodes;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfCouponCodes</b> field to query operations.
     * 
     */
    public final static CouponsField<Integer> NUMBER_OF_COUPON_CODES = new CouponsField<Integer>("NumberOfCouponCodes");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>CouponCodeValidityDurationUnit</b></p>
     * 
     * @param couponCodeValidityDurationUnit
     *     
     * @return
     *     Unit for Coupon Code Validity
     */
    @SerializedName("CouponCodeValidityDurationUnit")
    @JsonProperty("CouponCodeValidityDurationUnit")
    @Nullable
    @ODataField(odataName = "CouponCodeValidityDurationUnit")
    private String couponCodeValidityDurationUnit;
    /**
     * Use with available fluent helpers to apply the <b>CouponCodeValidityDurationUnit</b> field to query operations.
     * 
     */
    public final static CouponsField<String> COUPON_CODE_VALIDITY_DURATION_UNIT = new CouponsField<String>("CouponCodeValidityDurationUnit");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CreatedByUser</b></p>
     * 
     * @param createdByUser
     *     
     * @return
     *     Created By User for API-Service
     */
    @SerializedName("CreatedByUser")
    @JsonProperty("CreatedByUser")
    @Nullable
    @ODataField(odataName = "CreatedByUser")
    private String createdByUser;
    /**
     * Use with available fluent helpers to apply the <b>CreatedByUser</b> field to query operations.
     * 
     */
    public final static CouponsField<String> CREATED_BY_USER = new CouponsField<String>("CreatedByUser");
    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>CreationDateTime</b></p>
     * 
     * @param creationDateTime
     *     
     * @return
     *     Creation Date Time for API-Service
     */
    @SerializedName("CreationDateTime")
    @JsonProperty("CreationDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "CreationDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime creationDateTime;
    /**
     * Use with available fluent helpers to apply the <b>CreationDateTime</b> field to query operations.
     * 
     */
    public final static CouponsField<ZonedDateTime> CREATION_DATE_TIME = new CouponsField<ZonedDateTime>("CreationDateTime");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>LastChangedByUser</b></p>
     * 
     * @param lastChangedByUser
     *     
     * @return
     *     Last Changed By User for API-Service
     */
    @SerializedName("LastChangedByUser")
    @JsonProperty("LastChangedByUser")
    @Nullable
    @ODataField(odataName = "LastChangedByUser")
    private String lastChangedByUser;
    /**
     * Use with available fluent helpers to apply the <b>LastChangedByUser</b> field to query operations.
     * 
     */
    public final static CouponsField<String> LAST_CHANGED_BY_USER = new CouponsField<String>("LastChangedByUser");
    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>LastChangeDateTime</b></p>
     * 
     * @param lastChangeDateTime
     *     
     * @return
     *     Last Change Date Time for API-Service
     */
    @SerializedName("LastChangeDateTime")
    @JsonProperty("LastChangeDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "LastChangeDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime lastChangeDateTime;
    /**
     * Use with available fluent helpers to apply the <b>LastChangeDateTime</b> field to query operations.
     * 
     */
    public final static CouponsField<ZonedDateTime> LAST_CHANGE_DATE_TIME = new CouponsField<ZonedDateTime>("LastChangeDateTime");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>CreatedByUserName</b></p>
     * 
     * @param createdByUserName
     *     
     * @return
     *     Created By User Name for API-Service
     */
    @SerializedName("CreatedByUserName")
    @JsonProperty("CreatedByUserName")
    @Nullable
    @ODataField(odataName = "CreatedByUserName")
    private String createdByUserName;
    /**
     * Use with available fluent helpers to apply the <b>CreatedByUserName</b> field to query operations.
     * 
     */
    public final static CouponsField<String> CREATED_BY_USER_NAME = new CouponsField<String>("CreatedByUserName");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>LastChangedByUserName</b></p>
     * 
     * @param lastChangedByUserName
     *     
     * @return
     *     Last Changed By User Name for API-Service
     */
    @SerializedName("LastChangedByUserName")
    @JsonProperty("LastChangedByUserName")
    @Nullable
    @ODataField(odataName = "LastChangedByUserName")
    private String lastChangedByUserName;
    /**
     * Use with available fluent helpers to apply the <b>LastChangedByUserName</b> field to query operations.
     * 
     */
    public final static CouponsField<String> LAST_CHANGED_BY_USER_NAME = new CouponsField<String>("LastChangedByUserName");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>MarketingOffer</b></p>
     * 
     * @param marketingOffer
     *     
     * @return
     *     Marketing Offer ID
     */
    @SerializedName("MarketingOffer")
    @JsonProperty("MarketingOffer")
    @Nullable
    @ODataField(odataName = "MarketingOffer")
    private String marketingOffer;
    /**
     * Use with available fluent helpers to apply the <b>MarketingOffer</b> field to query operations.
     * 
     */
    public final static CouponsField<String> MARKETING_OFFER = new CouponsField<String>("MarketingOffer");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>OfferStatus</b></p>
     * 
     * @param offerStatus
     *     
     * @return
     *     Offer Status
     */
    @SerializedName("OfferStatus")
    @JsonProperty("OfferStatus")
    @Nullable
    @ODataField(odataName = "OfferStatus")
    private String offerStatus;
    /**
     * Use with available fluent helpers to apply the <b>OfferStatus</b> field to query operations.
     * 
     */
    public final static CouponsField<String> OFFER_STATUS = new CouponsField<String>("OfferStatus");
    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>OfferStartDateTime</b></p>
     * 
     * @param offerStartDateTime
     *     
     * @return
     *     API: Start Date Time
     */
    @SerializedName("OfferStartDateTime")
    @JsonProperty("OfferStartDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "OfferStartDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime offerStartDateTime;
    /**
     * Use with available fluent helpers to apply the <b>OfferStartDateTime</b> field to query operations.
     * 
     */
    public final static CouponsField<ZonedDateTime> OFFER_START_DATE_TIME = new CouponsField<ZonedDateTime>("OfferStartDateTime");
    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>OfferEndDateTime</b></p>
     * 
     * @param offerEndDateTime
     *     
     * @return
     *     API: End Date Time
     */
    @SerializedName("OfferEndDateTime")
    @JsonProperty("OfferEndDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "OfferEndDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime offerEndDateTime;
    /**
     * Use with available fluent helpers to apply the <b>OfferEndDateTime</b> field to query operations.
     * 
     */
    public final static CouponsField<ZonedDateTime> OFFER_END_DATE_TIME = new CouponsField<ZonedDateTime>("OfferEndDateTime");
    /**
     * Convienence field for reusing the same ERP system context with multiple queries (e.g. fetching associated entities).
     * 
     * @param erpConfigContext
     *     
     * @return
     *     The stored ERP system context for executing queries, or null if no such context has been set.
     */
    @JsonIgnore
    @Nullable
    private transient ErpConfigContext erpConfigContext;
    /**
     * Navigation property <b>to_CouponCode</b> for <b>Coupons</b> to multiple <b>CouponCodes</b>.
     * 
     */
    @SerializedName("to_CouponCode")
    @JsonProperty("to_CouponCode")
    @ODataField(odataName = "to_CouponCode")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<CouponCodes> toCouponCode;
    /**
     * Navigation property <b>to_CouponText</b> for <b>Coupons</b> to multiple <b>CouponTexts</b>.
     * 
     */
    @SerializedName("to_CouponText")
    @JsonProperty("to_CouponText")
    @ODataField(odataName = "to_CouponText")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<CouponTexts> toCouponText;
    /**
     * Use with available fluent helpers to apply the <b>to_CouponCode</b> navigation property to query operations.
     * 
     */
    public final static CouponsLink<CouponCodes> TO_COUPON_CODE = new CouponsLink<CouponCodes>("to_CouponCode");
    /**
     * Use with available fluent helpers to apply the <b>to_CouponText</b> navigation property to query operations.
     * 
     */
    public final static CouponsLink<CouponTexts> TO_COUPON_TEXT = new CouponsLink<CouponTexts>("to_CouponText");

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public Class<Coupons> getType() {
        return Coupons.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CouponUUID</b></p>
     * 
     * @param couponUUID
     *     Coupon UUID
     */
    public void setCouponUUID(
        @Nullable
        final UUID couponUUID) {
        rememberChangedField("CouponUUID", this.couponUUID);
        this.couponUUID = couponUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>Coupon</b></p>
     * 
     * @param coupon
     *     Coupon
     */
    public void setCoupon(
        @Nullable
        final String coupon) {
        rememberChangedField("Coupon", this.coupon);
        this.coupon = coupon;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CouponType</b></p>
     * 
     * @param couponType
     *     Coupon Type
     */
    public void setCouponType(
        @Nullable
        final String couponType) {
        rememberChangedField("CouponType", this.couponType);
        this.couponType = couponType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CouponContactRelationshipType</b></p>
     * 
     * @param couponContactRelationshipType
     *     Coupon Contact Relationship Type
     */
    public void setCouponContactRelationshipType(
        @Nullable
        final String couponContactRelationshipType) {
        rememberChangedField("CouponContactRelationshipType", this.couponContactRelationshipType);
        this.couponContactRelationshipType = couponContactRelationshipType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>CouponContactRelshpTypeName</b></p>
     * 
     * @param couponContactRelshpTypeName
     *     Coupon Contact Relationship Type Name
     */
    public void setCouponContactRelshpTypeName(
        @Nullable
        final String couponContactRelshpTypeName) {
        rememberChangedField("CouponContactRelshpTypeName", this.couponContactRelshpTypeName);
        this.couponContactRelshpTypeName = couponContactRelshpTypeName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>MarketingArea</b></p><p>You use a marketing area to restrict the access to instances of an object, such as campaign, campaign content, content template, or target group.</p>
     * 
     * @param marketingArea
     *     Identifies an area of responsibility, or an organizational unit.
     */
    public void setMarketingArea(
        @Nullable
        final String marketingArea) {
        rememberChangedField("MarketingArea", this.marketingArea);
        this.marketingArea = marketingArea;
    }

    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>MarketingAreaName</b></p>
     * 
     * @param marketingAreaName
     *     Description for Marketing Area
     */
    public void setMarketingAreaName(
        @Nullable
        final String marketingAreaName) {
        rememberChangedField("MarketingAreaName", this.marketingAreaName);
        this.marketingAreaName = marketingAreaName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>CouponName</b></p>
     * 
     * @param couponName
     *     Coupon Name
     */
    public void setCouponName(
        @Nullable
        final String couponName) {
        rememberChangedField("CouponName", this.couponName);
        this.couponName = couponName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>CouponOrigin</b></p>
     * 
     * @param couponOrigin
     *     Coupon Origin
     */
    public void setCouponOrigin(
        @Nullable
        final String couponOrigin) {
        rememberChangedField("CouponOrigin", this.couponOrigin);
        this.couponOrigin = couponOrigin;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CouponCanExceedOfferPeriod</b></p>
     * 
     * @param couponCanExceedOfferPeriod
     *     Coupon can Exceed Offer Period
     */
    public void setCouponCanExceedOfferPeriod(
        @Nullable
        final Boolean couponCanExceedOfferPeriod) {
        rememberChangedField("CouponCanExceedOfferPeriod", this.couponCanExceedOfferPeriod);
        this.couponCanExceedOfferPeriod = couponCanExceedOfferPeriod;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CouponStatus</b></p>
     * 
     * @param couponStatus
     *     Coupon Status
     */
    public void setCouponStatus(
        @Nullable
        final String couponStatus) {
        rememberChangedField("CouponStatus", this.couponStatus);
        this.couponStatus = couponStatus;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>CouponStatusName</b></p>
     * 
     * @param couponStatusName
     *     Coupon Status Name
     */
    public void setCouponStatusName(
        @Nullable
        final String couponStatusName) {
        rememberChangedField("CouponStatusName", this.couponStatusName);
        this.couponStatusName = couponStatusName;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>TotalNumberOfRedemption</b></p>
     * 
     * @param totalNumberOfRedemption
     *     Total Number of Redemptions
     */
    public void setTotalNumberOfRedemption(
        @Nullable
        final Integer totalNumberOfRedemption) {
        rememberChangedField("TotalNumberOfRedemption", this.totalNumberOfRedemption);
        this.totalNumberOfRedemption = totalNumberOfRedemption;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>TotalNumberOfRdmptnPerContact</b></p>
     * 
     * @param totalNumberOfRdmptnPerContact
     *     Total Number of Redemptions for Each Contact
     */
    public void setTotalNumberOfRdmptnPerContact(
        @Nullable
        final Integer totalNumberOfRdmptnPerContact) {
        rememberChangedField("TotalNumberOfRdmptnPerContact", this.totalNumberOfRdmptnPerContact);
        this.totalNumberOfRdmptnPerContact = totalNumberOfRdmptnPerContact;
    }

    /**
     * Constraints: Not nullable, Precision: 15, Scale: 0 <p>Original property name from the Odata EDM: <b>CouponCodeValidityDuration</b></p>
     * 
     * @param couponCodeValidityDuration
     *     Coupon Code Validity in Days
     */
    public void setCouponCodeValidityDuration(
        @Nullable
        final BigDecimal couponCodeValidityDuration) {
        rememberChangedField("CouponCodeValidityDuration", this.couponCodeValidityDuration);
        this.couponCodeValidityDuration = couponCodeValidityDuration;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>NumberOfRedemption</b></p>
     * 
     * @param numberOfRedemption
     *     Number of Redemptions
     */
    public void setNumberOfRedemption(
        @Nullable
        final Integer numberOfRedemption) {
        rememberChangedField("NumberOfRedemption", this.numberOfRedemption);
        this.numberOfRedemption = numberOfRedemption;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>NumberOfCouponCodes</b></p>
     * 
     * @param numberOfCouponCodes
     *     
     */
    public void setNumberOfCouponCodes(
        @Nullable
        final Integer numberOfCouponCodes) {
        rememberChangedField("NumberOfCouponCodes", this.numberOfCouponCodes);
        this.numberOfCouponCodes = numberOfCouponCodes;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>CouponCodeValidityDurationUnit</b></p>
     * 
     * @param couponCodeValidityDurationUnit
     *     Unit for Coupon Code Validity
     */
    public void setCouponCodeValidityDurationUnit(
        @Nullable
        final String couponCodeValidityDurationUnit) {
        rememberChangedField("CouponCodeValidityDurationUnit", this.couponCodeValidityDurationUnit);
        this.couponCodeValidityDurationUnit = couponCodeValidityDurationUnit;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CreatedByUser</b></p>
     * 
     * @param createdByUser
     *     Created By User for API-Service
     */
    public void setCreatedByUser(
        @Nullable
        final String createdByUser) {
        rememberChangedField("CreatedByUser", this.createdByUser);
        this.createdByUser = createdByUser;
    }

    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>CreationDateTime</b></p>
     * 
     * @param creationDateTime
     *     Creation Date Time for API-Service
     */
    public void setCreationDateTime(
        @Nullable
        final ZonedDateTime creationDateTime) {
        rememberChangedField("CreationDateTime", this.creationDateTime);
        this.creationDateTime = creationDateTime;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>LastChangedByUser</b></p>
     * 
     * @param lastChangedByUser
     *     Last Changed By User for API-Service
     */
    public void setLastChangedByUser(
        @Nullable
        final String lastChangedByUser) {
        rememberChangedField("LastChangedByUser", this.lastChangedByUser);
        this.lastChangedByUser = lastChangedByUser;
    }

    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>LastChangeDateTime</b></p>
     * 
     * @param lastChangeDateTime
     *     Last Change Date Time for API-Service
     */
    public void setLastChangeDateTime(
        @Nullable
        final ZonedDateTime lastChangeDateTime) {
        rememberChangedField("LastChangeDateTime", this.lastChangeDateTime);
        this.lastChangeDateTime = lastChangeDateTime;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>CreatedByUserName</b></p>
     * 
     * @param createdByUserName
     *     Created By User Name for API-Service
     */
    public void setCreatedByUserName(
        @Nullable
        final String createdByUserName) {
        rememberChangedField("CreatedByUserName", this.createdByUserName);
        this.createdByUserName = createdByUserName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>LastChangedByUserName</b></p>
     * 
     * @param lastChangedByUserName
     *     Last Changed By User Name for API-Service
     */
    public void setLastChangedByUserName(
        @Nullable
        final String lastChangedByUserName) {
        rememberChangedField("LastChangedByUserName", this.lastChangedByUserName);
        this.lastChangedByUserName = lastChangedByUserName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>MarketingOffer</b></p>
     * 
     * @param marketingOffer
     *     Marketing Offer ID
     */
    public void setMarketingOffer(
        @Nullable
        final String marketingOffer) {
        rememberChangedField("MarketingOffer", this.marketingOffer);
        this.marketingOffer = marketingOffer;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>OfferStatus</b></p>
     * 
     * @param offerStatus
     *     Offer Status
     */
    public void setOfferStatus(
        @Nullable
        final String offerStatus) {
        rememberChangedField("OfferStatus", this.offerStatus);
        this.offerStatus = offerStatus;
    }

    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>OfferStartDateTime</b></p>
     * 
     * @param offerStartDateTime
     *     API: Start Date Time
     */
    public void setOfferStartDateTime(
        @Nullable
        final ZonedDateTime offerStartDateTime) {
        rememberChangedField("OfferStartDateTime", this.offerStartDateTime);
        this.offerStartDateTime = offerStartDateTime;
    }

    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>OfferEndDateTime</b></p>
     * 
     * @param offerEndDateTime
     *     API: End Date Time
     */
    public void setOfferEndDateTime(
        @Nullable
        final ZonedDateTime offerEndDateTime) {
        rememberChangedField("OfferEndDateTime", this.offerEndDateTime);
        this.offerEndDateTime = offerEndDateTime;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_MKT_COUPON_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "Coupons";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("CouponUUID", getCouponUUID());
        return result;
    }

    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("CouponUUID", getCouponUUID());
        values.put("Coupon", getCoupon());
        values.put("CouponType", getCouponType());
        values.put("CouponContactRelationshipType", getCouponContactRelationshipType());
        values.put("CouponContactRelshpTypeName", getCouponContactRelshpTypeName());
        values.put("MarketingArea", getMarketingArea());
        values.put("MarketingAreaName", getMarketingAreaName());
        values.put("CouponName", getCouponName());
        values.put("CouponOrigin", getCouponOrigin());
        values.put("CouponCanExceedOfferPeriod", getCouponCanExceedOfferPeriod());
        values.put("CouponStatus", getCouponStatus());
        values.put("CouponStatusName", getCouponStatusName());
        values.put("TotalNumberOfRedemption", getTotalNumberOfRedemption());
        values.put("TotalNumberOfRdmptnPerContact", getTotalNumberOfRdmptnPerContact());
        values.put("CouponCodeValidityDuration", getCouponCodeValidityDuration());
        values.put("NumberOfRedemption", getNumberOfRedemption());
        values.put("NumberOfCouponCodes", getNumberOfCouponCodes());
        values.put("CouponCodeValidityDurationUnit", getCouponCodeValidityDurationUnit());
        values.put("CreatedByUser", getCreatedByUser());
        values.put("CreationDateTime", getCreationDateTime());
        values.put("LastChangedByUser", getLastChangedByUser());
        values.put("LastChangeDateTime", getLastChangeDateTime());
        values.put("CreatedByUserName", getCreatedByUserName());
        values.put("LastChangedByUserName", getLastChangedByUserName());
        values.put("MarketingOffer", getMarketingOffer());
        values.put("OfferStatus", getOfferStatus());
        values.put("OfferStartDateTime", getOfferStartDateTime());
        values.put("OfferEndDateTime", getOfferEndDateTime());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("CouponUUID")) {
                final Object value = values.remove("CouponUUID");
                if ((value == null)||(!value.equals(getCouponUUID()))) {
                    setCouponUUID(((UUID) value));
                }
            }
            if (values.containsKey("Coupon")) {
                final Object value = values.remove("Coupon");
                if ((value == null)||(!value.equals(getCoupon()))) {
                    setCoupon(((String) value));
                }
            }
            if (values.containsKey("CouponType")) {
                final Object value = values.remove("CouponType");
                if ((value == null)||(!value.equals(getCouponType()))) {
                    setCouponType(((String) value));
                }
            }
            if (values.containsKey("CouponContactRelationshipType")) {
                final Object value = values.remove("CouponContactRelationshipType");
                if ((value == null)||(!value.equals(getCouponContactRelationshipType()))) {
                    setCouponContactRelationshipType(((String) value));
                }
            }
            if (values.containsKey("CouponContactRelshpTypeName")) {
                final Object value = values.remove("CouponContactRelshpTypeName");
                if ((value == null)||(!value.equals(getCouponContactRelshpTypeName()))) {
                    setCouponContactRelshpTypeName(((String) value));
                }
            }
            if (values.containsKey("MarketingArea")) {
                final Object value = values.remove("MarketingArea");
                if ((value == null)||(!value.equals(getMarketingArea()))) {
                    setMarketingArea(((String) value));
                }
            }
            if (values.containsKey("MarketingAreaName")) {
                final Object value = values.remove("MarketingAreaName");
                if ((value == null)||(!value.equals(getMarketingAreaName()))) {
                    setMarketingAreaName(((String) value));
                }
            }
            if (values.containsKey("CouponName")) {
                final Object value = values.remove("CouponName");
                if ((value == null)||(!value.equals(getCouponName()))) {
                    setCouponName(((String) value));
                }
            }
            if (values.containsKey("CouponOrigin")) {
                final Object value = values.remove("CouponOrigin");
                if ((value == null)||(!value.equals(getCouponOrigin()))) {
                    setCouponOrigin(((String) value));
                }
            }
            if (values.containsKey("CouponCanExceedOfferPeriod")) {
                final Object value = values.remove("CouponCanExceedOfferPeriod");
                if ((value == null)||(!value.equals(getCouponCanExceedOfferPeriod()))) {
                    setCouponCanExceedOfferPeriod(((Boolean) value));
                }
            }
            if (values.containsKey("CouponStatus")) {
                final Object value = values.remove("CouponStatus");
                if ((value == null)||(!value.equals(getCouponStatus()))) {
                    setCouponStatus(((String) value));
                }
            }
            if (values.containsKey("CouponStatusName")) {
                final Object value = values.remove("CouponStatusName");
                if ((value == null)||(!value.equals(getCouponStatusName()))) {
                    setCouponStatusName(((String) value));
                }
            }
            if (values.containsKey("TotalNumberOfRedemption")) {
                final Object value = values.remove("TotalNumberOfRedemption");
                if ((value == null)||(!value.equals(getTotalNumberOfRedemption()))) {
                    setTotalNumberOfRedemption(((Integer) value));
                }
            }
            if (values.containsKey("TotalNumberOfRdmptnPerContact")) {
                final Object value = values.remove("TotalNumberOfRdmptnPerContact");
                if ((value == null)||(!value.equals(getTotalNumberOfRdmptnPerContact()))) {
                    setTotalNumberOfRdmptnPerContact(((Integer) value));
                }
            }
            if (values.containsKey("CouponCodeValidityDuration")) {
                final Object value = values.remove("CouponCodeValidityDuration");
                if ((value == null)||(!value.equals(getCouponCodeValidityDuration()))) {
                    setCouponCodeValidityDuration(((BigDecimal) value));
                }
            }
            if (values.containsKey("NumberOfRedemption")) {
                final Object value = values.remove("NumberOfRedemption");
                if ((value == null)||(!value.equals(getNumberOfRedemption()))) {
                    setNumberOfRedemption(((Integer) value));
                }
            }
            if (values.containsKey("NumberOfCouponCodes")) {
                final Object value = values.remove("NumberOfCouponCodes");
                if ((value == null)||(!value.equals(getNumberOfCouponCodes()))) {
                    setNumberOfCouponCodes(((Integer) value));
                }
            }
            if (values.containsKey("CouponCodeValidityDurationUnit")) {
                final Object value = values.remove("CouponCodeValidityDurationUnit");
                if ((value == null)||(!value.equals(getCouponCodeValidityDurationUnit()))) {
                    setCouponCodeValidityDurationUnit(((String) value));
                }
            }
            if (values.containsKey("CreatedByUser")) {
                final Object value = values.remove("CreatedByUser");
                if ((value == null)||(!value.equals(getCreatedByUser()))) {
                    setCreatedByUser(((String) value));
                }
            }
            if (values.containsKey("CreationDateTime")) {
                final Object value = values.remove("CreationDateTime");
                if ((value == null)||(!value.equals(getCreationDateTime()))) {
                    setCreationDateTime(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("LastChangedByUser")) {
                final Object value = values.remove("LastChangedByUser");
                if ((value == null)||(!value.equals(getLastChangedByUser()))) {
                    setLastChangedByUser(((String) value));
                }
            }
            if (values.containsKey("LastChangeDateTime")) {
                final Object value = values.remove("LastChangeDateTime");
                if ((value == null)||(!value.equals(getLastChangeDateTime()))) {
                    setLastChangeDateTime(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("CreatedByUserName")) {
                final Object value = values.remove("CreatedByUserName");
                if ((value == null)||(!value.equals(getCreatedByUserName()))) {
                    setCreatedByUserName(((String) value));
                }
            }
            if (values.containsKey("LastChangedByUserName")) {
                final Object value = values.remove("LastChangedByUserName");
                if ((value == null)||(!value.equals(getLastChangedByUserName()))) {
                    setLastChangedByUserName(((String) value));
                }
            }
            if (values.containsKey("MarketingOffer")) {
                final Object value = values.remove("MarketingOffer");
                if ((value == null)||(!value.equals(getMarketingOffer()))) {
                    setMarketingOffer(((String) value));
                }
            }
            if (values.containsKey("OfferStatus")) {
                final Object value = values.remove("OfferStatus");
                if ((value == null)||(!value.equals(getOfferStatus()))) {
                    setOfferStatus(((String) value));
                }
            }
            if (values.containsKey("OfferStartDateTime")) {
                final Object value = values.remove("OfferStartDateTime");
                if ((value == null)||(!value.equals(getOfferStartDateTime()))) {
                    setOfferStartDateTime(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("OfferEndDateTime")) {
                final Object value = values.remove("OfferEndDateTime");
                if ((value == null)||(!value.equals(getOfferEndDateTime()))) {
                    setOfferEndDateTime(((ZonedDateTime) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("to_CouponCode")) {
                final Object value = (values).remove("to_CouponCode");
                if (value instanceof Iterable) {
                    if (toCouponCode == null) {
                        toCouponCode = Lists.newArrayList();
                    } else {
                        toCouponCode = Lists.newArrayList(toCouponCode);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        CouponCodes entity;
                        if (toCouponCode.size()>i) {
                            entity = toCouponCode.get(i);
                        } else {
                            entity = new CouponCodes();
                            toCouponCode.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_CouponText")) {
                final Object value = (values).remove("to_CouponText");
                if (value instanceof Iterable) {
                    if (toCouponText == null) {
                        toCouponText = Lists.newArrayList();
                    } else {
                        toCouponText = Lists.newArrayList(toCouponText);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        CouponTexts entity;
                        if (toCouponText.size()>i) {
                            entity = toCouponText.get(i);
                        } else {
                            entity = new CouponTexts();
                            toCouponText.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
        }
        super.fromMap(values);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    public static<T >CouponsField<T> field(final String fieldName, final Class<T> fieldType) {
        return new CouponsField<T>(fieldName);
    }

    @Override
    protected Map<String, Object> toMapOfNavigationProperties() {
        final Map<String, Object> values = super.toMapOfNavigationProperties();
        if (toCouponCode!= null) {
            (values).put("to_CouponCode", toCouponCode);
        }
        if (toCouponText!= null) {
            (values).put("to_CouponText", toCouponText);
        }
        return values;
    }

    /**
     * Fetches the <b>CouponCodes</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_CouponCode</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>CouponCodes</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<CouponCodes> fetchCouponCode()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type CouponCodes.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("CouponUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(couponUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_CouponCode");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<CouponCodes> entityList = result.asList(CouponCodes.class);
        for (CouponCodes entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>CouponCodes</b> entities (one to many). This corresponds to the OData navigation property <b>to_CouponCode</b>.
     * <p>
     * If the navigation property <b>to_CouponCode</b> of a queried <b>Coupons</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>CouponCodes</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<CouponCodes> getCouponCodeOrFetch()
        throws ODataException
    {
        if (toCouponCode == null) {
            toCouponCode = fetchCouponCode();
        }
        return toCouponCode;
    }

    /**
     * Retrieval of associated <b>CouponCodes</b> entities (one to many). This corresponds to the OData navigation property <b>to_CouponCode</b>.
     * <p>
     * If the navigation property for an entity <b>Coupons</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_CouponCode</b> is already loaded, the result will contain the <b>CouponCodes</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    public Optional<List<CouponCodes>> getCouponCodeIfPresent() {
        return Optional.ofNullable(toCouponCode);
    }

    /**
     * Overwrites the list of associated <b>CouponCodes</b> entities for the loaded navigation property <b>to_CouponCode</b>.
     * <p>
     * If the navigation property <b>to_CouponCode</b> of a queried <b>Coupons</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>CouponCodes</b> entities.
     */
    public void setCouponCode(
        @NonNull
        final List<CouponCodes> value) {
        if (toCouponCode == null) {
            toCouponCode = Lists.newArrayList();
        }
        toCouponCode.clear();
        toCouponCode.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>CouponCodes</b> entities. This corresponds to the OData navigation property <b>to_CouponCode</b>.
     * <p>
     * If the navigation property <b>to_CouponCode</b> of a queried <b>Coupons</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>CouponCodes</b> entities.
     */
    public void addCouponCode(CouponCodes... entity) {
        if (toCouponCode == null) {
            toCouponCode = Lists.newArrayList();
        }
        toCouponCode.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>CouponTexts</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_CouponText</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>CouponTexts</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<CouponTexts> fetchCouponText()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type CouponTexts.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("CouponUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(couponUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_CouponText");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<CouponTexts> entityList = result.asList(CouponTexts.class);
        for (CouponTexts entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>CouponTexts</b> entities (one to many). This corresponds to the OData navigation property <b>to_CouponText</b>.
     * <p>
     * If the navigation property <b>to_CouponText</b> of a queried <b>Coupons</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>CouponTexts</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<CouponTexts> getCouponTextOrFetch()
        throws ODataException
    {
        if (toCouponText == null) {
            toCouponText = fetchCouponText();
        }
        return toCouponText;
    }

    /**
     * Retrieval of associated <b>CouponTexts</b> entities (one to many). This corresponds to the OData navigation property <b>to_CouponText</b>.
     * <p>
     * If the navigation property for an entity <b>Coupons</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_CouponText</b> is already loaded, the result will contain the <b>CouponTexts</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    public Optional<List<CouponTexts>> getCouponTextIfPresent() {
        return Optional.ofNullable(toCouponText);
    }

    /**
     * Overwrites the list of associated <b>CouponTexts</b> entities for the loaded navigation property <b>to_CouponText</b>.
     * <p>
     * If the navigation property <b>to_CouponText</b> of a queried <b>Coupons</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>CouponTexts</b> entities.
     */
    public void setCouponText(
        @NonNull
        final List<CouponTexts> value) {
        if (toCouponText == null) {
            toCouponText = Lists.newArrayList();
        }
        toCouponText.clear();
        toCouponText.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>CouponTexts</b> entities. This corresponds to the OData navigation property <b>to_CouponText</b>.
     * <p>
     * If the navigation property <b>to_CouponText</b> of a queried <b>Coupons</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>CouponTexts</b> entities.
     */
    public void addCouponText(CouponTexts... entity) {
        if (toCouponText == null) {
            toCouponText = Lists.newArrayList();
        }
        toCouponText.addAll(Lists.newArrayList(entity));
    }

    public final static class CouponsBuilder {

        private List<CouponCodes> toCouponCode = Lists.newArrayList();
        private List<CouponTexts> toCouponText = Lists.newArrayList();

        private Coupons.CouponsBuilder toCouponCode(List<CouponCodes> value) {
            toCouponCode.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_CouponCode</b> for <b>Coupons</b> to multiple <b>CouponCodes</b>.
         * 
         */
        public Coupons.CouponsBuilder couponCode(CouponCodes... value) {
            return toCouponCode(Lists.newArrayList(value));
        }

        private Coupons.CouponsBuilder toCouponText(List<CouponTexts> value) {
            toCouponText.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_CouponText</b> for <b>Coupons</b> to multiple <b>CouponTexts</b>.
         * 
         */
        public Coupons.CouponsBuilder couponText(CouponTexts... value) {
            return toCouponText(Lists.newArrayList(value));
        }

    }

}
