
package com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv;

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
 * <p>Original entity name from the Odata EDM: <b>InteractionAdditionalObject</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class InteractionAdditionalObject
    extends VdmEntity<InteractionAdditionalObject>
{

    /**
     * Selector for all available fields of InteractionAdditionalObject.
     * 
     */
    public final static InteractionAdditionalObjectSelectable ALL_FIELDS = new InteractionAdditionalObjectSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionAdditionalObjUUID</b></p>
     * 
     * @param interactionAdditionalObjUUID
     *     
     * @return
     *     UUID for API-Service
     */
    @SerializedName("InteractionAdditionalObjUUID")
    @JsonProperty("InteractionAdditionalObjUUID")
    @Nullable
    @ODataField(odataName = "InteractionAdditionalObjUUID")
    private UUID interactionAdditionalObjUUID;
    /**
     * Use with available fluent helpers to apply the <b>InteractionAdditionalObjUUID</b> field to query operations.
     * 
     */
    public final static InteractionAdditionalObjectField<UUID> INTERACTION_ADDITIONAL_OBJ_UUID = new InteractionAdditionalObjectField<UUID>("InteractionAdditionalObjUUID");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionUUID</b></p>
     * 
     * @param interactionUUID
     *     
     * @return
     *     Interaction UUID for API-Service
     */
    @SerializedName("InteractionUUID")
    @JsonProperty("InteractionUUID")
    @Nullable
    @ODataField(odataName = "InteractionUUID")
    private UUID interactionUUID;
    /**
     * Use with available fluent helpers to apply the <b>InteractionUUID</b> field to query operations.
     * 
     */
    public final static InteractionAdditionalObjectField<UUID> INTERACTION_UUID = new InteractionAdditionalObjectField<UUID>("InteractionUUID");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>MarketingObjectType</b></p>
     * 
     * @param marketingObjectType
     *     
     * @return
     *     Marketing Object Type for API-Service
     */
    @SerializedName("MarketingObjectType")
    @JsonProperty("MarketingObjectType")
    @Nullable
    @ODataField(odataName = "MarketingObjectType")
    private String marketingObjectType;
    /**
     * Use with available fluent helpers to apply the <b>MarketingObjectType</b> field to query operations.
     * 
     */
    public final static InteractionAdditionalObjectField<String> MARKETING_OBJECT_TYPE = new InteractionAdditionalObjectField<String>("MarketingObjectType");
    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>MarketingObject</b></p>
     * 
     * @param marketingObject
     *     
     * @return
     *     Marketing Object ID for API-Service
     */
    @SerializedName("MarketingObject")
    @JsonProperty("MarketingObject")
    @Nullable
    @ODataField(odataName = "MarketingObject")
    private String marketingObject;
    /**
     * Use with available fluent helpers to apply the <b>MarketingObject</b> field to query operations.
     * 
     */
    public final static InteractionAdditionalObjectField<String> MARKETING_OBJECT = new InteractionAdditionalObjectField<String>("MarketingObject");
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
    public Class<InteractionAdditionalObject> getType() {
        return InteractionAdditionalObject.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionAdditionalObjUUID</b></p>
     * 
     * @param interactionAdditionalObjUUID
     *     UUID for API-Service
     */
    public void setInteractionAdditionalObjUUID(
        @Nullable
        final UUID interactionAdditionalObjUUID) {
        rememberChangedField("InteractionAdditionalObjUUID", this.interactionAdditionalObjUUID);
        this.interactionAdditionalObjUUID = interactionAdditionalObjUUID;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionUUID</b></p>
     * 
     * @param interactionUUID
     *     Interaction UUID for API-Service
     */
    public void setInteractionUUID(
        @Nullable
        final UUID interactionUUID) {
        rememberChangedField("InteractionUUID", this.interactionUUID);
        this.interactionUUID = interactionUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>MarketingObjectType</b></p>
     * 
     * @param marketingObjectType
     *     Marketing Object Type for API-Service
     */
    public void setMarketingObjectType(
        @Nullable
        final String marketingObjectType) {
        rememberChangedField("MarketingObjectType", this.marketingObjectType);
        this.marketingObjectType = marketingObjectType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>MarketingObject</b></p>
     * 
     * @param marketingObject
     *     Marketing Object ID for API-Service
     */
    public void setMarketingObject(
        @Nullable
        final String marketingObject) {
        rememberChangedField("MarketingObject", this.marketingObject);
        this.marketingObject = marketingObject;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_MKT_INTERACTION_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "InteractionAdditionalObjects";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("InteractionAdditionalObjUUID", getInteractionAdditionalObjUUID());
        return result;
    }

    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("InteractionAdditionalObjUUID", getInteractionAdditionalObjUUID());
        values.put("InteractionUUID", getInteractionUUID());
        values.put("MarketingObjectType", getMarketingObjectType());
        values.put("MarketingObject", getMarketingObject());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("InteractionAdditionalObjUUID")) {
                final Object value = values.remove("InteractionAdditionalObjUUID");
                if ((value == null)||(!value.equals(getInteractionAdditionalObjUUID()))) {
                    setInteractionAdditionalObjUUID(((UUID) value));
                }
            }
            if (values.containsKey("InteractionUUID")) {
                final Object value = values.remove("InteractionUUID");
                if ((value == null)||(!value.equals(getInteractionUUID()))) {
                    setInteractionUUID(((UUID) value));
                }
            }
            if (values.containsKey("MarketingObjectType")) {
                final Object value = values.remove("MarketingObjectType");
                if ((value == null)||(!value.equals(getMarketingObjectType()))) {
                    setMarketingObjectType(((String) value));
                }
            }
            if (values.containsKey("MarketingObject")) {
                final Object value = values.remove("MarketingObject");
                if ((value == null)||(!value.equals(getMarketingObject()))) {
                    setMarketingObject(((String) value));
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
    public static<T >InteractionAdditionalObjectField<T> field(final String fieldName, final Class<T> fieldType) {
        return new InteractionAdditionalObjectField<T>(fieldName);
    }

}
