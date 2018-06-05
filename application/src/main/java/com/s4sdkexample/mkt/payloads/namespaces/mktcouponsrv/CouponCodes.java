
package com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
 * Marketing: Coupon Code<p></p><p>Original entity name from the Odata EDM: <b>CouponCodesType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CouponCodes
    extends VdmEntity<CouponCodes>
{

    /**
     * Selector for all available fields of CouponCodes.
     * 
     */
    public final static CouponCodesSelectable ALL_FIELDS = new CouponCodesSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CouponCodeUUID</b></p>
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
    public final static CouponCodesField<UUID> COUPON_CODE_UUID = new CouponCodesField<UUID>("CouponCodeUUID");
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
    public final static CouponCodesField<UUID> COUPON_UUID = new CouponCodesField<UUID>("CouponUUID");
    /**
     * Constraints: Not nullable, Maximum length: 128 <p>Original property name from the Odata EDM: <b>CouponCode</b></p>
     * 
     * @param couponCode
     *     
     * @return
     *     Coupon Code
     */
    @SerializedName("CouponCode")
    @JsonProperty("CouponCode")
    @Nullable
    @ODataField(odataName = "CouponCode")
    private String couponCode;
    /**
     * Use with available fluent helpers to apply the <b>CouponCode</b> field to query operations.
     * 
     */
    public final static CouponCodesField<String> COUPON_CODE = new CouponCodesField<String>("CouponCode");
    /**
     * Constraints: Not nullable, Maximum length: 1333 <p>Original property name from the Odata EDM: <b>EANCodeImageURL</b></p>
     * 
     * @param eANCodeImageURL
     *     
     * @return
     *     Image URL for Barcode
     */
    @SerializedName("EANCodeImageURL")
    @JsonProperty("EANCodeImageURL")
    @Nullable
    @ODataField(odataName = "EANCodeImageURL")
    private String eANCodeImageURL;
    /**
     * Use with available fluent helpers to apply the <b>EANCodeImageURL</b> field to query operations.
     * 
     */
    public final static CouponCodesField<String> EAN_CODE_IMAGE_URL = new CouponCodesField<String>("EANCodeImageURL");
    /**
     * Constraints: Not nullable, Maximum length: 1333 <p>Original property name from the Odata EDM: <b>QRCodeImageURL</b></p>
     * 
     * @param qRCodeImageURL
     *     
     * @return
     *     Image URL for QR Code
     */
    @SerializedName("QRCodeImageURL")
    @JsonProperty("QRCodeImageURL")
    @Nullable
    @ODataField(odataName = "QRCodeImageURL")
    private String qRCodeImageURL;
    /**
     * Use with available fluent helpers to apply the <b>QRCodeImageURL</b> field to query operations.
     * 
     */
    public final static CouponCodesField<String> QR_CODE_IMAGE_URL = new CouponCodesField<String>("QRCodeImageURL");
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
     * Navigation property <b>to_CouponCodeUsage</b> for <b>CouponCodes</b> to multiple <b>CouponCodeUsages</b>.
     * 
     */
    @SerializedName("to_CouponCodeUsage")
    @JsonProperty("to_CouponCodeUsage")
    @ODataField(odataName = "to_CouponCodeUsage")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<CouponCodeUsages> toCouponCodeUsage;
    /**
     * Use with available fluent helpers to apply the <b>to_CouponCodeUsage</b> navigation property to query operations.
     * 
     */
    public final static CouponCodesLink<CouponCodeUsages> TO_COUPON_CODE_USAGE = new CouponCodesLink<CouponCodeUsages>("to_CouponCodeUsage");

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public Class<CouponCodes> getType() {
        return CouponCodes.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CouponCodeUUID</b></p>
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
     * Constraints: Not nullable, Maximum length: 128 <p>Original property name from the Odata EDM: <b>CouponCode</b></p>
     * 
     * @param couponCode
     *     Coupon Code
     */
    public void setCouponCode(
        @Nullable
        final String couponCode) {
        rememberChangedField("CouponCode", this.couponCode);
        this.couponCode = couponCode;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1333 <p>Original property name from the Odata EDM: <b>EANCodeImageURL</b></p>
     * 
     * @param eANCodeImageURL
     *     Image URL for Barcode
     */
    public void setEANCodeImageURL(
        @Nullable
        final String eANCodeImageURL) {
        rememberChangedField("EANCodeImageURL", this.eANCodeImageURL);
        this.eANCodeImageURL = eANCodeImageURL;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1333 <p>Original property name from the Odata EDM: <b>QRCodeImageURL</b></p>
     * 
     * @param qRCodeImageURL
     *     Image URL for QR Code
     */
    public void setQRCodeImageURL(
        @Nullable
        final String qRCodeImageURL) {
        rememberChangedField("QRCodeImageURL", this.qRCodeImageURL);
        this.qRCodeImageURL = qRCodeImageURL;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_MKT_COUPON_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "CouponCodes";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("CouponCodeUUID", getCouponCodeUUID());
        return result;
    }

    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("CouponCodeUUID", getCouponCodeUUID());
        values.put("CouponUUID", getCouponUUID());
        values.put("CouponCode", getCouponCode());
        values.put("EANCodeImageURL", getEANCodeImageURL());
        values.put("QRCodeImageURL", getQRCodeImageURL());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("CouponCodeUUID")) {
                final Object value = values.remove("CouponCodeUUID");
                if ((value == null)||(!value.equals(getCouponCodeUUID()))) {
                    setCouponCodeUUID(((UUID) value));
                }
            }
            if (values.containsKey("CouponUUID")) {
                final Object value = values.remove("CouponUUID");
                if ((value == null)||(!value.equals(getCouponUUID()))) {
                    setCouponUUID(((UUID) value));
                }
            }
            if (values.containsKey("CouponCode")) {
                final Object value = values.remove("CouponCode");
                if ((value == null)||(!value.equals(getCouponCode()))) {
                    setCouponCode(((String) value));
                }
            }
            if (values.containsKey("EANCodeImageURL")) {
                final Object value = values.remove("EANCodeImageURL");
                if ((value == null)||(!value.equals(getEANCodeImageURL()))) {
                    setEANCodeImageURL(((String) value));
                }
            }
            if (values.containsKey("QRCodeImageURL")) {
                final Object value = values.remove("QRCodeImageURL");
                if ((value == null)||(!value.equals(getQRCodeImageURL()))) {
                    setQRCodeImageURL(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("to_CouponCodeUsage")) {
                final Object value = (values).remove("to_CouponCodeUsage");
                if (value instanceof Iterable) {
                    if (toCouponCodeUsage == null) {
                        toCouponCodeUsage = Lists.newArrayList();
                    } else {
                        toCouponCodeUsage = Lists.newArrayList(toCouponCodeUsage);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        CouponCodeUsages entity;
                        if (toCouponCodeUsage.size()>i) {
                            entity = toCouponCodeUsage.get(i);
                        } else {
                            entity = new CouponCodeUsages();
                            toCouponCodeUsage.add(entity);
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
    public static<T >CouponCodesField<T> field(final String fieldName, final Class<T> fieldType) {
        return new CouponCodesField<T>(fieldName);
    }

    @Override
    protected Map<String, Object> toMapOfNavigationProperties() {
        final Map<String, Object> values = super.toMapOfNavigationProperties();
        if (toCouponCodeUsage!= null) {
            (values).put("to_CouponCodeUsage", toCouponCodeUsage);
        }
        return values;
    }

    /**
     * Fetches the <b>CouponCodeUsages</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_CouponCodeUsage</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>CouponCodeUsages</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<CouponCodeUsages> fetchCouponCodeUsage()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type CouponCodeUsages.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("CouponCodeUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(couponCodeUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_CouponCodeUsage");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<CouponCodeUsages> entityList = result.asList(CouponCodeUsages.class);
        for (CouponCodeUsages entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>CouponCodeUsages</b> entities (one to many). This corresponds to the OData navigation property <b>to_CouponCodeUsage</b>.
     * <p>
     * If the navigation property <b>to_CouponCodeUsage</b> of a queried <b>CouponCodes</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>CouponCodeUsages</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<CouponCodeUsages> getCouponCodeUsageOrFetch()
        throws ODataException
    {
        if (toCouponCodeUsage == null) {
            toCouponCodeUsage = fetchCouponCodeUsage();
        }
        return toCouponCodeUsage;
    }

    /**
     * Retrieval of associated <b>CouponCodeUsages</b> entities (one to many). This corresponds to the OData navigation property <b>to_CouponCodeUsage</b>.
     * <p>
     * If the navigation property for an entity <b>CouponCodes</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_CouponCodeUsage</b> is already loaded, the result will contain the <b>CouponCodeUsages</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    public Optional<List<CouponCodeUsages>> getCouponCodeUsageIfPresent() {
        return Optional.ofNullable(toCouponCodeUsage);
    }

    /**
     * Overwrites the list of associated <b>CouponCodeUsages</b> entities for the loaded navigation property <b>to_CouponCodeUsage</b>.
     * <p>
     * If the navigation property <b>to_CouponCodeUsage</b> of a queried <b>CouponCodes</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>CouponCodeUsages</b> entities.
     */
    public void setCouponCodeUsage(
        @NonNull
        final List<CouponCodeUsages> value) {
        if (toCouponCodeUsage == null) {
            toCouponCodeUsage = Lists.newArrayList();
        }
        toCouponCodeUsage.clear();
        toCouponCodeUsage.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>CouponCodeUsages</b> entities. This corresponds to the OData navigation property <b>to_CouponCodeUsage</b>.
     * <p>
     * If the navigation property <b>to_CouponCodeUsage</b> of a queried <b>CouponCodes</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>CouponCodeUsages</b> entities.
     */
    public void addCouponCodeUsage(CouponCodeUsages... entity) {
        if (toCouponCodeUsage == null) {
            toCouponCodeUsage = Lists.newArrayList();
        }
        toCouponCodeUsage.addAll(Lists.newArrayList(entity));
    }

    public final static class CouponCodesBuilder {

        private List<CouponCodeUsages> toCouponCodeUsage = Lists.newArrayList();

        private CouponCodes.CouponCodesBuilder toCouponCodeUsage(List<CouponCodeUsages> value) {
            toCouponCodeUsage.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_CouponCodeUsage</b> for <b>CouponCodes</b> to multiple <b>CouponCodeUsages</b>.
         * 
         */
        public CouponCodes.CouponCodesBuilder couponCodeUsage(CouponCodeUsages... value) {
            return toCouponCodeUsage(Lists.newArrayList(value));
        }

    }

}
