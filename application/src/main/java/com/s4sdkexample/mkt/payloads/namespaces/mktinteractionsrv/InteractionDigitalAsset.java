
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
 * <p>Original entity name from the Odata EDM: <b>InteractionDigitalAsset</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class InteractionDigitalAsset
    extends VdmEntity<InteractionDigitalAsset>
{

    /**
     * Selector for all available fields of InteractionDigitalAsset.
     * 
     */
    public final static InteractionDigitalAssetSelectable ALL_FIELDS = new InteractionDigitalAssetSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionDigitalAssetUUID</b></p>
     * 
     * @param interactionDigitalAssetUUID
     *     
     * @return
     *     UUID for API-Service
     */
    @SerializedName("InteractionDigitalAssetUUID")
    @JsonProperty("InteractionDigitalAssetUUID")
    @Nullable
    @ODataField(odataName = "InteractionDigitalAssetUUID")
    private UUID interactionDigitalAssetUUID;
    /**
     * Use with available fluent helpers to apply the <b>InteractionDigitalAssetUUID</b> field to query operations.
     * 
     */
    public final static InteractionDigitalAssetField<UUID> INTERACTION_DIGITAL_ASSET_UUID = new InteractionDigitalAssetField<UUID>("InteractionDigitalAssetUUID");
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
    public final static InteractionDigitalAssetField<UUID> INTERACTION_UUID = new InteractionDigitalAssetField<UUID>("InteractionUUID");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>SourceSystem</b></p>
     * 
     * @param sourceSystem
     *     
     * @return
     *     Interaction Source System ID
     */
    @SerializedName("SourceSystem")
    @JsonProperty("SourceSystem")
    @Nullable
    @ODataField(odataName = "SourceSystem")
    private String sourceSystem;
    /**
     * Use with available fluent helpers to apply the <b>SourceSystem</b> field to query operations.
     * 
     */
    public final static InteractionDigitalAssetField<String> SOURCE_SYSTEM = new InteractionDigitalAssetField<String>("SourceSystem");
    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>DigitalAsset</b></p>
     * 
     * @param digitalAsset
     *     
     * @return
     *     Digital Asset ID for API-Service
     */
    @SerializedName("DigitalAsset")
    @JsonProperty("DigitalAsset")
    @Nullable
    @ODataField(odataName = "DigitalAsset")
    private String digitalAsset;
    /**
     * Use with available fluent helpers to apply the <b>DigitalAsset</b> field to query operations.
     * 
     */
    public final static InteractionDigitalAssetField<String> DIGITAL_ASSET = new InteractionDigitalAssetField<String>("DigitalAsset");
    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>DigitalAssetName</b></p>
     * 
     * @param digitalAssetName
     *     
     * @return
     *     Digital Asset Name
     */
    @SerializedName("DigitalAssetName")
    @JsonProperty("DigitalAssetName")
    @Nullable
    @ODataField(odataName = "DigitalAssetName")
    private String digitalAssetName;
    /**
     * Use with available fluent helpers to apply the <b>DigitalAssetName</b> field to query operations.
     * 
     */
    public final static InteractionDigitalAssetField<String> DIGITAL_ASSET_NAME = new InteractionDigitalAssetField<String>("DigitalAssetName");
    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>DigitalAssetMimeType</b></p>
     * 
     * @param digitalAssetMimeType
     *     
     * @return
     *     Digital Asset Mime Type for API-Service
     */
    @SerializedName("DigitalAssetMimeType")
    @JsonProperty("DigitalAssetMimeType")
    @Nullable
    @ODataField(odataName = "DigitalAssetMimeType")
    private String digitalAssetMimeType;
    /**
     * Use with available fluent helpers to apply the <b>DigitalAssetMimeType</b> field to query operations.
     * 
     */
    public final static InteractionDigitalAssetField<String> DIGITAL_ASSET_MIME_TYPE = new InteractionDigitalAssetField<String>("DigitalAssetMimeType");
    /**
     * Constraints: Not nullable, Maximum length: 1333 <p>Original property name from the Odata EDM: <b>DigitalAssetURL</b></p>
     * 
     * @param digitalAssetURL
     *     
     * @return
     *     Digital Asset URL for API-Services
     */
    @SerializedName("DigitalAssetURL")
    @JsonProperty("DigitalAssetURL")
    @Nullable
    @ODataField(odataName = "DigitalAssetURL")
    private String digitalAssetURL;
    /**
     * Use with available fluent helpers to apply the <b>DigitalAssetURL</b> field to query operations.
     * 
     */
    public final static InteractionDigitalAssetField<String> DIGITAL_ASSET_URL = new InteractionDigitalAssetField<String>("DigitalAssetURL");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CampaignID</b></p>
     * 
     * @param campaignID
     *     
     * @return
     *     Campaign ID without Conversion Exit
     */
    @SerializedName("CampaignID")
    @JsonProperty("CampaignID")
    @Nullable
    @ODataField(odataName = "CampaignID")
    private String campaignID;
    /**
     * Use with available fluent helpers to apply the <b>CampaignID</b> field to query operations.
     * 
     */
    public final static InteractionDigitalAssetField<String> CAMPAIGN_ID = new InteractionDigitalAssetField<String>("CampaignID");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IntactnDgtlAssetWeightingFctr</b></p>
     * 
     * @param intactnDgtlAssetWeightingFctr
     *     
     * @return
     *     Weighting Factor
     */
    @SerializedName("IntactnDgtlAssetWeightingFctr")
    @JsonProperty("IntactnDgtlAssetWeightingFctr")
    @Nullable
    @ODataField(odataName = "IntactnDgtlAssetWeightingFctr")
    private Short intactnDgtlAssetWeightingFctr;
    /**
     * Use with available fluent helpers to apply the <b>IntactnDgtlAssetWeightingFctr</b> field to query operations.
     * 
     */
    public final static InteractionDigitalAssetField<Short> INTACTN_DGTL_ASSET_WEIGHTING_FCTR = new InteractionDigitalAssetField<Short>("IntactnDgtlAssetWeightingFctr");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IntactnDgtlAssetSentimentVal</b></p>
     * 
     * @param intactnDgtlAssetSentimentVal
     *     
     * @return
     *     Sentiment
     */
    @SerializedName("IntactnDgtlAssetSentimentVal")
    @JsonProperty("IntactnDgtlAssetSentimentVal")
    @Nullable
    @ODataField(odataName = "IntactnDgtlAssetSentimentVal")
    private Short intactnDgtlAssetSentimentVal;
    /**
     * Use with available fluent helpers to apply the <b>IntactnDgtlAssetSentimentVal</b> field to query operations.
     * 
     */
    public final static InteractionDigitalAssetField<Short> INTACTN_DGTL_ASSET_SENTIMENT_VAL = new InteractionDigitalAssetField<Short>("IntactnDgtlAssetSentimentVal");
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
    public Class<InteractionDigitalAsset> getType() {
        return InteractionDigitalAsset.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionDigitalAssetUUID</b></p>
     * 
     * @param interactionDigitalAssetUUID
     *     UUID for API-Service
     */
    public void setInteractionDigitalAssetUUID(
        @Nullable
        final UUID interactionDigitalAssetUUID) {
        rememberChangedField("InteractionDigitalAssetUUID", this.interactionDigitalAssetUUID);
        this.interactionDigitalAssetUUID = interactionDigitalAssetUUID;
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
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>SourceSystem</b></p>
     * 
     * @param sourceSystem
     *     Interaction Source System ID
     */
    public void setSourceSystem(
        @Nullable
        final String sourceSystem) {
        rememberChangedField("SourceSystem", this.sourceSystem);
        this.sourceSystem = sourceSystem;
    }

    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>DigitalAsset</b></p>
     * 
     * @param digitalAsset
     *     Digital Asset ID for API-Service
     */
    public void setDigitalAsset(
        @Nullable
        final String digitalAsset) {
        rememberChangedField("DigitalAsset", this.digitalAsset);
        this.digitalAsset = digitalAsset;
    }

    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>DigitalAssetName</b></p>
     * 
     * @param digitalAssetName
     *     Digital Asset Name
     */
    public void setDigitalAssetName(
        @Nullable
        final String digitalAssetName) {
        rememberChangedField("DigitalAssetName", this.digitalAssetName);
        this.digitalAssetName = digitalAssetName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>DigitalAssetMimeType</b></p>
     * 
     * @param digitalAssetMimeType
     *     Digital Asset Mime Type for API-Service
     */
    public void setDigitalAssetMimeType(
        @Nullable
        final String digitalAssetMimeType) {
        rememberChangedField("DigitalAssetMimeType", this.digitalAssetMimeType);
        this.digitalAssetMimeType = digitalAssetMimeType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1333 <p>Original property name from the Odata EDM: <b>DigitalAssetURL</b></p>
     * 
     * @param digitalAssetURL
     *     Digital Asset URL for API-Services
     */
    public void setDigitalAssetURL(
        @Nullable
        final String digitalAssetURL) {
        rememberChangedField("DigitalAssetURL", this.digitalAssetURL);
        this.digitalAssetURL = digitalAssetURL;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CampaignID</b></p>
     * 
     * @param campaignID
     *     Campaign ID without Conversion Exit
     */
    public void setCampaignID(
        @Nullable
        final String campaignID) {
        rememberChangedField("CampaignID", this.campaignID);
        this.campaignID = campaignID;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IntactnDgtlAssetWeightingFctr</b></p>
     * 
     * @param intactnDgtlAssetWeightingFctr
     *     Weighting Factor
     */
    public void setIntactnDgtlAssetWeightingFctr(
        @Nullable
        final Short intactnDgtlAssetWeightingFctr) {
        rememberChangedField("IntactnDgtlAssetWeightingFctr", this.intactnDgtlAssetWeightingFctr);
        this.intactnDgtlAssetWeightingFctr = intactnDgtlAssetWeightingFctr;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IntactnDgtlAssetSentimentVal</b></p>
     * 
     * @param intactnDgtlAssetSentimentVal
     *     Sentiment
     */
    public void setIntactnDgtlAssetSentimentVal(
        @Nullable
        final Short intactnDgtlAssetSentimentVal) {
        rememberChangedField("IntactnDgtlAssetSentimentVal", this.intactnDgtlAssetSentimentVal);
        this.intactnDgtlAssetSentimentVal = intactnDgtlAssetSentimentVal;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_MKT_INTERACTION_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "InteractionDigitalAssets";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("InteractionDigitalAssetUUID", getInteractionDigitalAssetUUID());
        return result;
    }

    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("InteractionDigitalAssetUUID", getInteractionDigitalAssetUUID());
        values.put("InteractionUUID", getInteractionUUID());
        values.put("SourceSystem", getSourceSystem());
        values.put("DigitalAsset", getDigitalAsset());
        values.put("DigitalAssetName", getDigitalAssetName());
        values.put("DigitalAssetMimeType", getDigitalAssetMimeType());
        values.put("DigitalAssetURL", getDigitalAssetURL());
        values.put("CampaignID", getCampaignID());
        values.put("IntactnDgtlAssetWeightingFctr", getIntactnDgtlAssetWeightingFctr());
        values.put("IntactnDgtlAssetSentimentVal", getIntactnDgtlAssetSentimentVal());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("InteractionDigitalAssetUUID")) {
                final Object value = values.remove("InteractionDigitalAssetUUID");
                if ((value == null)||(!value.equals(getInteractionDigitalAssetUUID()))) {
                    setInteractionDigitalAssetUUID(((UUID) value));
                }
            }
            if (values.containsKey("InteractionUUID")) {
                final Object value = values.remove("InteractionUUID");
                if ((value == null)||(!value.equals(getInteractionUUID()))) {
                    setInteractionUUID(((UUID) value));
                }
            }
            if (values.containsKey("SourceSystem")) {
                final Object value = values.remove("SourceSystem");
                if ((value == null)||(!value.equals(getSourceSystem()))) {
                    setSourceSystem(((String) value));
                }
            }
            if (values.containsKey("DigitalAsset")) {
                final Object value = values.remove("DigitalAsset");
                if ((value == null)||(!value.equals(getDigitalAsset()))) {
                    setDigitalAsset(((String) value));
                }
            }
            if (values.containsKey("DigitalAssetName")) {
                final Object value = values.remove("DigitalAssetName");
                if ((value == null)||(!value.equals(getDigitalAssetName()))) {
                    setDigitalAssetName(((String) value));
                }
            }
            if (values.containsKey("DigitalAssetMimeType")) {
                final Object value = values.remove("DigitalAssetMimeType");
                if ((value == null)||(!value.equals(getDigitalAssetMimeType()))) {
                    setDigitalAssetMimeType(((String) value));
                }
            }
            if (values.containsKey("DigitalAssetURL")) {
                final Object value = values.remove("DigitalAssetURL");
                if ((value == null)||(!value.equals(getDigitalAssetURL()))) {
                    setDigitalAssetURL(((String) value));
                }
            }
            if (values.containsKey("CampaignID")) {
                final Object value = values.remove("CampaignID");
                if ((value == null)||(!value.equals(getCampaignID()))) {
                    setCampaignID(((String) value));
                }
            }
            if (values.containsKey("IntactnDgtlAssetWeightingFctr")) {
                final Object value = values.remove("IntactnDgtlAssetWeightingFctr");
                if ((value == null)||(!value.equals(getIntactnDgtlAssetWeightingFctr()))) {
                    setIntactnDgtlAssetWeightingFctr(((Short) value));
                }
            }
            if (values.containsKey("IntactnDgtlAssetSentimentVal")) {
                final Object value = values.remove("IntactnDgtlAssetSentimentVal");
                if ((value == null)||(!value.equals(getIntactnDgtlAssetSentimentVal()))) {
                    setIntactnDgtlAssetSentimentVal(((Short) value));
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
    public static<T >InteractionDigitalAssetField<T> field(final String fieldName, final Class<T> fieldType) {
        return new InteractionDigitalAssetField<T>(fieldName);
    }

}
