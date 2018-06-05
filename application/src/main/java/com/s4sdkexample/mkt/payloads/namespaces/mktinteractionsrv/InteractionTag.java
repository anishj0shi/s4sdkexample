
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
 * <p>Original entity name from the Odata EDM: <b>InteractionTag</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class InteractionTag
    extends VdmEntity<InteractionTag>
{

    /**
     * Selector for all available fields of InteractionTag.
     * 
     */
    public final static InteractionTagSelectable ALL_FIELDS = new InteractionTagSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionTagUUID</b></p>
     * 
     * @param interactionTagUUID
     *     
     * @return
     *     UUID for API-Service
     */
    @SerializedName("InteractionTagUUID")
    @JsonProperty("InteractionTagUUID")
    @Nullable
    @ODataField(odataName = "InteractionTagUUID")
    private UUID interactionTagUUID;
    /**
     * Use with available fluent helpers to apply the <b>InteractionTagUUID</b> field to query operations.
     * 
     */
    public final static InteractionTagField<UUID> INTERACTION_TAG_UUID = new InteractionTagField<UUID>("InteractionTagUUID");
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
    public final static InteractionTagField<UUID> INTERACTION_UUID = new InteractionTagField<UUID>("InteractionUUID");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>TagOrigin</b></p>
     * 
     * @param tagOrigin
     *     
     * @return
     *     Origin of Tag
     */
    @SerializedName("TagOrigin")
    @JsonProperty("TagOrigin")
    @Nullable
    @ODataField(odataName = "TagOrigin")
    private String tagOrigin;
    /**
     * Use with available fluent helpers to apply the <b>TagOrigin</b> field to query operations.
     * 
     */
    public final static InteractionTagField<String> TAG_ORIGIN = new InteractionTagField<String>("TagOrigin");
    /**
     * Constraints: Not nullable, Maximum length: 75 <p>Original property name from the Odata EDM: <b>TagType</b></p>
     * 
     * @param tagType
     *     
     * @return
     *     Tag Type
     */
    @SerializedName("TagType")
    @JsonProperty("TagType")
    @Nullable
    @ODataField(odataName = "TagType")
    private String tagType;
    /**
     * Use with available fluent helpers to apply the <b>TagType</b> field to query operations.
     * 
     */
    public final static InteractionTagField<String> TAG_TYPE = new InteractionTagField<String>("TagType");
    /**
     * Constraints: Not nullable, Maximum length: 200 <p>Original property name from the Odata EDM: <b>TagName</b></p>
     * 
     * @param tagName
     *     
     * @return
     *     Tag Name
     */
    @SerializedName("TagName")
    @JsonProperty("TagName")
    @Nullable
    @ODataField(odataName = "TagName")
    private String tagName;
    /**
     * Use with available fluent helpers to apply the <b>TagName</b> field to query operations.
     * 
     */
    public final static InteractionTagField<String> TAG_NAME = new InteractionTagField<String>("TagName");
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
    public Class<InteractionTag> getType() {
        return InteractionTag.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionTagUUID</b></p>
     * 
     * @param interactionTagUUID
     *     UUID for API-Service
     */
    public void setInteractionTagUUID(
        @Nullable
        final UUID interactionTagUUID) {
        rememberChangedField("InteractionTagUUID", this.interactionTagUUID);
        this.interactionTagUUID = interactionTagUUID;
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
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>TagOrigin</b></p>
     * 
     * @param tagOrigin
     *     Origin of Tag
     */
    public void setTagOrigin(
        @Nullable
        final String tagOrigin) {
        rememberChangedField("TagOrigin", this.tagOrigin);
        this.tagOrigin = tagOrigin;
    }

    /**
     * Constraints: Not nullable, Maximum length: 75 <p>Original property name from the Odata EDM: <b>TagType</b></p>
     * 
     * @param tagType
     *     Tag Type
     */
    public void setTagType(
        @Nullable
        final String tagType) {
        rememberChangedField("TagType", this.tagType);
        this.tagType = tagType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 200 <p>Original property name from the Odata EDM: <b>TagName</b></p>
     * 
     * @param tagName
     *     Tag Name
     */
    public void setTagName(
        @Nullable
        final String tagName) {
        rememberChangedField("TagName", this.tagName);
        this.tagName = tagName;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_MKT_INTERACTION_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "InteractionTags";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("InteractionTagUUID", getInteractionTagUUID());
        return result;
    }

    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("InteractionTagUUID", getInteractionTagUUID());
        values.put("InteractionUUID", getInteractionUUID());
        values.put("TagOrigin", getTagOrigin());
        values.put("TagType", getTagType());
        values.put("TagName", getTagName());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("InteractionTagUUID")) {
                final Object value = values.remove("InteractionTagUUID");
                if ((value == null)||(!value.equals(getInteractionTagUUID()))) {
                    setInteractionTagUUID(((UUID) value));
                }
            }
            if (values.containsKey("InteractionUUID")) {
                final Object value = values.remove("InteractionUUID");
                if ((value == null)||(!value.equals(getInteractionUUID()))) {
                    setInteractionUUID(((UUID) value));
                }
            }
            if (values.containsKey("TagOrigin")) {
                final Object value = values.remove("TagOrigin");
                if ((value == null)||(!value.equals(getTagOrigin()))) {
                    setTagOrigin(((String) value));
                }
            }
            if (values.containsKey("TagType")) {
                final Object value = values.remove("TagType");
                if ((value == null)||(!value.equals(getTagType()))) {
                    setTagType(((String) value));
                }
            }
            if (values.containsKey("TagName")) {
                final Object value = values.remove("TagName");
                if ((value == null)||(!value.equals(getTagName()))) {
                    setTagName(((String) value));
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
    public static<T >InteractionTagField<T> field(final String fieldName, final Class<T> fieldType) {
        return new InteractionTagField<T>(fieldName);
    }

}
