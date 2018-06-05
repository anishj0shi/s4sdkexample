
package com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Marketing: Coupon Code Usage<p></p><p>Original entity name from the Odata EDM: <b>CouponCodeUsagesType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CouponCodeUsages
    extends VdmEntity<CouponCodeUsages>
{

    /**
     * Selector for all available fields of CouponCodeUsages.
     * 
     */
    public final static CouponCodeUsagesSelectable ALL_FIELDS = new CouponCodeUsagesSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CouponCodeUsageUUID</b></p>
     * 
     * @param couponCodeUsageUUID
     *     
     * @return
     *     Coupon Code Usage UUID
     */
    @SerializedName("CouponCodeUsageUUID")
    @JsonProperty("CouponCodeUsageUUID")
    @Nullable
    @ODataField(odataName = "CouponCodeUsageUUID")
    private UUID couponCodeUsageUUID;
    /**
     * Use with available fluent helpers to apply the <b>CouponCodeUsageUUID</b> field to query operations.
     * 
     */
    public final static CouponCodeUsagesField<UUID> COUPON_CODE_USAGE_UUID = new CouponCodeUsagesField<UUID>("CouponCodeUsageUUID");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CouponUUID</b></p>
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
    public final static CouponCodeUsagesField<UUID> COUPON_UUID = new CouponCodeUsagesField<UUID>("CouponUUID");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CouponCodeUUID</b></p>
     * 
     * @param couponCodeUUID
     *     
     * @return
     *     Coupon Code UUID
     */
    @SerializedName("CouponCodeUUID")
    @JsonProperty("CouponCodeUUID")
    @Nullable
    @ODataField(odataName = "CouponCodeUUID")
    private UUID couponCodeUUID;
    /**
     * Use with available fluent helpers to apply the <b>CouponCodeUUID</b> field to query operations.
     * 
     */
    public final static CouponCodeUsagesField<UUID> COUPON_CODE_UUID = new CouponCodeUsagesField<UUID>("CouponCodeUUID");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CouponCodeUsageType</b></p>
     * 
     * @param couponCodeUsageType
     *     
     * @return
     *     Coupon Code Usage Type
     */
    @SerializedName("CouponCodeUsageType")
    @JsonProperty("CouponCodeUsageType")
    @Nullable
    @ODataField(odataName = "CouponCodeUsageType")
    private String couponCodeUsageType;
    /**
     * Use with available fluent helpers to apply the <b>CouponCodeUsageType</b> field to query operations.
     * 
     */
    public final static CouponCodeUsagesField<String> COUPON_CODE_USAGE_TYPE = new CouponCodeUsagesField<String>("CouponCodeUsageType");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionContactUUID</b></p>
     * 
     * @param interactionContactUUID
     *     
     * @return
     *     Marketing API: Interaction Contact UUID
     */
    @SerializedName("InteractionContactUUID")
    @JsonProperty("InteractionContactUUID")
    @Nullable
    @ODataField(odataName = "InteractionContactUUID")
    private UUID interactionContactUUID;
    /**
     * Use with available fluent helpers to apply the <b>InteractionContactUUID</b> field to query operations.
     * 
     */
    public final static CouponCodeUsagesField<UUID> INTERACTION_CONTACT_UUID = new CouponCodeUsagesField<UUID>("InteractionContactUUID");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>NumberOfRedemptionPerContact</b></p>
     * 
     * @param numberOfRedemptionPerContact
     *     
     * @return
     *     Number of Redemptions for each Contact
     */
    @SerializedName("NumberOfRedemptionPerContact")
    @JsonProperty("NumberOfRedemptionPerContact")
    @Nullable
    @ODataField(odataName = "NumberOfRedemptionPerContact")
    private Integer numberOfRedemptionPerContact;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfRedemptionPerContact</b> field to query operations.
     * 
     */
    public final static CouponCodeUsagesField<Integer> NUMBER_OF_REDEMPTION_PER_CONTACT = new CouponCodeUsagesField<Integer>("NumberOfRedemptionPerContact");
    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>ValidityStartDateTime</b></p>
     * 
     * @param validityStartDateTime
     *     
     * @return
     *     Validity Start
     */
    @SerializedName("ValidityStartDateTime")
    @JsonProperty("ValidityStartDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "ValidityStartDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime validityStartDateTime;
    /**
     * Use with available fluent helpers to apply the <b>ValidityStartDateTime</b> field to query operations.
     * 
     */
    public final static CouponCodeUsagesField<ZonedDateTime> VALIDITY_START_DATE_TIME = new CouponCodeUsagesField<ZonedDateTime>("ValidityStartDateTime");
    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>ValidityEndDateTime</b></p>
     * 
     * @param validityEndDateTime
     *     
     * @return
     *     Validity End
     */
    @SerializedName("ValidityEndDateTime")
    @JsonProperty("ValidityEndDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "ValidityEndDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime validityEndDateTime;
    /**
     * Use with available fluent helpers to apply the <b>ValidityEndDateTime</b> field to query operations.
     * 
     */
    public final static CouponCodeUsagesField<ZonedDateTime> VALIDITY_END_DATE_TIME = new CouponCodeUsagesField<ZonedDateTime>("ValidityEndDateTime");
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
     * {@inheritDoc}
     * 
     */
    @Override
    public Class<CouponCodeUsages> getType() {
        return CouponCodeUsages.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CouponCodeUsageUUID</b></p>
     * 
     * @param couponCodeUsageUUID
     *     Coupon Code Usage UUID
     */
    public void setCouponCodeUsageUUID(
        @Nullable
        final UUID couponCodeUsageUUID) {
        rememberChangedField("CouponCodeUsageUUID", this.couponCodeUsageUUID);
        this.couponCodeUsageUUID = couponCodeUsageUUID;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CouponUUID</b></p>
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
     * Constraints: none<p>Original property name from the Odata EDM: <b>CouponCodeUUID</b></p>
     * 
     * @param couponCodeUUID
     *     Coupon Code UUID
     */
    public void setCouponCodeUUID(
        @Nullable
        final UUID couponCodeUUID) {
        rememberChangedField("CouponCodeUUID", this.couponCodeUUID);
        this.couponCodeUUID = couponCodeUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CouponCodeUsageType</b></p>
     * 
     * @param couponCodeUsageType
     *     Coupon Code Usage Type
     */
    public void setCouponCodeUsageType(
        @Nullable
        final String couponCodeUsageType) {
        rememberChangedField("CouponCodeUsageType", this.couponCodeUsageType);
        this.couponCodeUsageType = couponCodeUsageType;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionContactUUID</b></p>
     * 
     * @param interactionContactUUID
     *     Marketing API: Interaction Contact UUID
     */
    public void setInteractionContactUUID(
        @Nullable
        final UUID interactionContactUUID) {
        rememberChangedField("InteractionContactUUID", this.interactionContactUUID);
        this.interactionContactUUID = interactionContactUUID;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>NumberOfRedemptionPerContact</b></p>
     * 
     * @param numberOfRedemptionPerContact
     *     Number of Redemptions for each Contact
     */
    public void setNumberOfRedemptionPerContact(
        @Nullable
        final Integer numberOfRedemptionPerContact) {
        rememberChangedField("NumberOfRedemptionPerContact", this.numberOfRedemptionPerContact);
        this.numberOfRedemptionPerContact = numberOfRedemptionPerContact;
    }

    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>ValidityStartDateTime</b></p>
     * 
     * @param validityStartDateTime
     *     Validity Start
     */
    public void setValidityStartDateTime(
        @Nullable
        final ZonedDateTime validityStartDateTime) {
        rememberChangedField("ValidityStartDateTime", this.validityStartDateTime);
        this.validityStartDateTime = validityStartDateTime;
    }

    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>ValidityEndDateTime</b></p>
     * 
     * @param validityEndDateTime
     *     Validity End
     */
    public void setValidityEndDateTime(
        @Nullable
        final ZonedDateTime validityEndDateTime) {
        rememberChangedField("ValidityEndDateTime", this.validityEndDateTime);
        this.validityEndDateTime = validityEndDateTime;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_MKT_COUPON_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "CouponCodeUsages";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("CouponCodeUsageUUID", getCouponCodeUsageUUID());
        return result;
    }

    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("CouponCodeUsageUUID", getCouponCodeUsageUUID());
        values.put("CouponUUID", getCouponUUID());
        values.put("CouponCodeUUID", getCouponCodeUUID());
        values.put("CouponCodeUsageType", getCouponCodeUsageType());
        values.put("InteractionContactUUID", getInteractionContactUUID());
        values.put("NumberOfRedemptionPerContact", getNumberOfRedemptionPerContact());
        values.put("ValidityStartDateTime", getValidityStartDateTime());
        values.put("ValidityEndDateTime", getValidityEndDateTime());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("CouponCodeUsageUUID")) {
                final Object value = values.remove("CouponCodeUsageUUID");
                if ((value == null)||(!value.equals(getCouponCodeUsageUUID()))) {
                    setCouponCodeUsageUUID(((UUID) value));
                }
            }
            if (values.containsKey("CouponUUID")) {
                final Object value = values.remove("CouponUUID");
                if ((value == null)||(!value.equals(getCouponUUID()))) {
                    setCouponUUID(((UUID) value));
                }
            }
            if (values.containsKey("CouponCodeUUID")) {
                final Object value = values.remove("CouponCodeUUID");
                if ((value == null)||(!value.equals(getCouponCodeUUID()))) {
                    setCouponCodeUUID(((UUID) value));
                }
            }
            if (values.containsKey("CouponCodeUsageType")) {
                final Object value = values.remove("CouponCodeUsageType");
                if ((value == null)||(!value.equals(getCouponCodeUsageType()))) {
                    setCouponCodeUsageType(((String) value));
                }
            }
            if (values.containsKey("InteractionContactUUID")) {
                final Object value = values.remove("InteractionContactUUID");
                if ((value == null)||(!value.equals(getInteractionContactUUID()))) {
                    setInteractionContactUUID(((UUID) value));
                }
            }
            if (values.containsKey("NumberOfRedemptionPerContact")) {
                final Object value = values.remove("NumberOfRedemptionPerContact");
                if ((value == null)||(!value.equals(getNumberOfRedemptionPerContact()))) {
                    setNumberOfRedemptionPerContact(((Integer) value));
                }
            }
            if (values.containsKey("ValidityStartDateTime")) {
                final Object value = values.remove("ValidityStartDateTime");
                if ((value == null)||(!value.equals(getValidityStartDateTime()))) {
                    setValidityStartDateTime(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("ValidityEndDateTime")) {
                final Object value = values.remove("ValidityEndDateTime");
                if ((value == null)||(!value.equals(getValidityEndDateTime()))) {
                    setValidityEndDateTime(((ZonedDateTime) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
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
    public static<T >CouponCodeUsagesField<T> field(final String fieldName, final Class<T> fieldType) {
        return new CouponCodeUsagesField<T>(fieldName);
    }

}
