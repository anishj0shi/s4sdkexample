
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
 * <p>Original entity name from the Odata EDM: <b>InteractionInterest</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class InteractionInterest
    extends VdmEntity<InteractionInterest>
{

    /**
     * Selector for all available fields of InteractionInterest.
     * 
     */
    public final static InteractionInterestSelectable ALL_FIELDS = new InteractionInterestSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionInterestUUID</b></p>
     * 
     * @param interactionInterestUUID
     *     
     * @return
     *     UUID for API-Service
     */
    @SerializedName("InteractionInterestUUID")
    @JsonProperty("InteractionInterestUUID")
    @Nullable
    @ODataField(odataName = "InteractionInterestUUID")
    private UUID interactionInterestUUID;
    /**
     * Use with available fluent helpers to apply the <b>InteractionInterestUUID</b> field to query operations.
     * 
     */
    public final static InteractionInterestField<UUID> INTERACTION_INTEREST_UUID = new InteractionInterestField<UUID>("InteractionInterestUUID");
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
    public final static InteractionInterestField<UUID> INTERACTION_UUID = new InteractionInterestField<UUID>("InteractionUUID");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>ItemOfInterest</b></p>
     * 
     * @param itemOfInterest
     *     
     * @return
     *     Item of Interest
     */
    @SerializedName("ItemOfInterest")
    @JsonProperty("ItemOfInterest")
    @Nullable
    @ODataField(odataName = "ItemOfInterest")
    private String itemOfInterest;
    /**
     * Use with available fluent helpers to apply the <b>ItemOfInterest</b> field to query operations.
     * 
     */
    public final static InteractionInterestField<String> ITEM_OF_INTEREST = new InteractionInterestField<String>("ItemOfInterest");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionIntrstWeightingFctr</b></p>
     * 
     * @param interactionIntrstWeightingFctr
     *     
     * @return
     *     Weighting Factor
     */
    @SerializedName("InteractionIntrstWeightingFctr")
    @JsonProperty("InteractionIntrstWeightingFctr")
    @Nullable
    @ODataField(odataName = "InteractionIntrstWeightingFctr")
    private Short interactionIntrstWeightingFctr;
    /**
     * Use with available fluent helpers to apply the <b>InteractionIntrstWeightingFctr</b> field to query operations.
     * 
     */
    public final static InteractionInterestField<Short> INTERACTION_INTRST_WEIGHTING_FCTR = new InteractionInterestField<Short>("InteractionIntrstWeightingFctr");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionIntrstSentimentVal</b></p>
     * 
     * @param interactionIntrstSentimentVal
     *     
     * @return
     *     Sentiment
     */
    @SerializedName("InteractionIntrstSentimentVal")
    @JsonProperty("InteractionIntrstSentimentVal")
    @Nullable
    @ODataField(odataName = "InteractionIntrstSentimentVal")
    private Short interactionIntrstSentimentVal;
    /**
     * Use with available fluent helpers to apply the <b>InteractionIntrstSentimentVal</b> field to query operations.
     * 
     */
    public final static InteractionInterestField<Short> INTERACTION_INTRST_SENTIMENT_VAL = new InteractionInterestField<Short>("InteractionIntrstSentimentVal");
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
    public Class<InteractionInterest> getType() {
        return InteractionInterest.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionInterestUUID</b></p>
     * 
     * @param interactionInterestUUID
     *     UUID for API-Service
     */
    public void setInteractionInterestUUID(
        @Nullable
        final UUID interactionInterestUUID) {
        rememberChangedField("InteractionInterestUUID", this.interactionInterestUUID);
        this.interactionInterestUUID = interactionInterestUUID;
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
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>ItemOfInterest</b></p>
     * 
     * @param itemOfInterest
     *     Item of Interest
     */
    public void setItemOfInterest(
        @Nullable
        final String itemOfInterest) {
        rememberChangedField("ItemOfInterest", this.itemOfInterest);
        this.itemOfInterest = itemOfInterest;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionIntrstWeightingFctr</b></p>
     * 
     * @param interactionIntrstWeightingFctr
     *     Weighting Factor
     */
    public void setInteractionIntrstWeightingFctr(
        @Nullable
        final Short interactionIntrstWeightingFctr) {
        rememberChangedField("InteractionIntrstWeightingFctr", this.interactionIntrstWeightingFctr);
        this.interactionIntrstWeightingFctr = interactionIntrstWeightingFctr;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionIntrstSentimentVal</b></p>
     * 
     * @param interactionIntrstSentimentVal
     *     Sentiment
     */
    public void setInteractionIntrstSentimentVal(
        @Nullable
        final Short interactionIntrstSentimentVal) {
        rememberChangedField("InteractionIntrstSentimentVal", this.interactionIntrstSentimentVal);
        this.interactionIntrstSentimentVal = interactionIntrstSentimentVal;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_MKT_INTERACTION_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "InteractionInterests";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("InteractionInterestUUID", getInteractionInterestUUID());
        return result;
    }

    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("InteractionInterestUUID", getInteractionInterestUUID());
        values.put("InteractionUUID", getInteractionUUID());
        values.put("ItemOfInterest", getItemOfInterest());
        values.put("InteractionIntrstWeightingFctr", getInteractionIntrstWeightingFctr());
        values.put("InteractionIntrstSentimentVal", getInteractionIntrstSentimentVal());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("InteractionInterestUUID")) {
                final Object value = values.remove("InteractionInterestUUID");
                if ((value == null)||(!value.equals(getInteractionInterestUUID()))) {
                    setInteractionInterestUUID(((UUID) value));
                }
            }
            if (values.containsKey("InteractionUUID")) {
                final Object value = values.remove("InteractionUUID");
                if ((value == null)||(!value.equals(getInteractionUUID()))) {
                    setInteractionUUID(((UUID) value));
                }
            }
            if (values.containsKey("ItemOfInterest")) {
                final Object value = values.remove("ItemOfInterest");
                if ((value == null)||(!value.equals(getItemOfInterest()))) {
                    setItemOfInterest(((String) value));
                }
            }
            if (values.containsKey("InteractionIntrstWeightingFctr")) {
                final Object value = values.remove("InteractionIntrstWeightingFctr");
                if ((value == null)||(!value.equals(getInteractionIntrstWeightingFctr()))) {
                    setInteractionIntrstWeightingFctr(((Short) value));
                }
            }
            if (values.containsKey("InteractionIntrstSentimentVal")) {
                final Object value = values.remove("InteractionIntrstSentimentVal");
                if ((value == null)||(!value.equals(getInteractionIntrstSentimentVal()))) {
                    setInteractionIntrstSentimentVal(((Short) value));
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
    public static<T >InteractionInterestField<T> field(final String fieldName, final Class<T> fieldType) {
        return new InteractionInterestField<T>(fieldName);
    }

}
