
package com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
 * Marketing: Coupon TEXT<p></p><p>Original entity name from the Odata EDM: <b>CouponTextsType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CouponTexts
    extends VdmEntity<CouponTexts>
{

    /**
     * Selector for all available fields of CouponTexts.
     * 
     */
    public final static CouponTextsSelectable ALL_FIELDS = new CouponTextsSelectable() {


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
    public final static CouponTextsField<UUID> COUPON_UUID = new CouponTextsField<UUID>("CouponUUID");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>Language</b></p><p>- the language in which texts are displayed,- the language in which you enter texts,- the language in which the system prints texts.</p>
     * 
     * @param language
     *     
     * @return
     *     The language key indicates
     */
    @SerializedName("Language")
    @JsonProperty("Language")
    @Nullable
    @ODataField(odataName = "Language")
    private String language;
    /**
     * Use with available fluent helpers to apply the <b>Language</b> field to query operations.
     * 
     */
    public final static CouponTextsField<String> LANGUAGE = new CouponTextsField<String>("Language");
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
    public final static CouponTextsField<String> COUPON_NAME = new CouponTextsField<String>("CouponName");
    /**
     * Constraints: Not nullable, Maximum length: 512 <p>Original property name from the Odata EDM: <b>CouponDescription</b></p>
     * 
     * @param couponDescription
     *     
     * @return
     *     Coupon Description
     */
    @SerializedName("CouponDescription")
    @JsonProperty("CouponDescription")
    @Nullable
    @ODataField(odataName = "CouponDescription")
    private String couponDescription;
    /**
     * Use with available fluent helpers to apply the <b>CouponDescription</b> field to query operations.
     * 
     */
    public final static CouponTextsField<String> COUPON_DESCRIPTION = new CouponTextsField<String>("CouponDescription");
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
    public Class<CouponTexts> getType() {
        return CouponTexts.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>Language</b></p><p>- the language in which texts are displayed,- the language in which you enter texts,- the language in which the system prints texts.</p>
     * 
     * @param language
     *     The language key indicates
     */
    public void setLanguage(
        @Nullable
        final String language) {
        rememberChangedField("Language", this.language);
        this.language = language;
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
     * Constraints: Not nullable, Maximum length: 512 <p>Original property name from the Odata EDM: <b>CouponDescription</b></p>
     * 
     * @param couponDescription
     *     Coupon Description
     */
    public void setCouponDescription(
        @Nullable
        final String couponDescription) {
        rememberChangedField("CouponDescription", this.couponDescription);
        this.couponDescription = couponDescription;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_MKT_COUPON_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "CouponTexts";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("CouponUUID", getCouponUUID());
        result.put("Language", getLanguage());
        return result;
    }

    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("CouponUUID", getCouponUUID());
        values.put("Language", getLanguage());
        values.put("CouponName", getCouponName());
        values.put("CouponDescription", getCouponDescription());
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
            if (values.containsKey("Language")) {
                final Object value = values.remove("Language");
                if ((value == null)||(!value.equals(getLanguage()))) {
                    setLanguage(((String) value));
                }
            }
            if (values.containsKey("CouponName")) {
                final Object value = values.remove("CouponName");
                if ((value == null)||(!value.equals(getCouponName()))) {
                    setCouponName(((String) value));
                }
            }
            if (values.containsKey("CouponDescription")) {
                final Object value = values.remove("CouponDescription");
                if ((value == null)||(!value.equals(getCouponDescription()))) {
                    setCouponDescription(((String) value));
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
    public static<T >CouponTextsField<T> field(final String fieldName, final Class<T> fieldType) {
        return new CouponTextsField<T>(fieldName);
    }

}
