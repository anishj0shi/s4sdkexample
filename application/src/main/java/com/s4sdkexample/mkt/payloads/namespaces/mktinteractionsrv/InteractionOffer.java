
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
 * <p>Original entity name from the Odata EDM: <b>InteractionOffer</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class InteractionOffer
    extends VdmEntity<InteractionOffer>
{

    /**
     * Selector for all available fields of InteractionOffer.
     * 
     */
    public final static InteractionOfferSelectable ALL_FIELDS = new InteractionOfferSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionOfferUUID</b></p>
     * 
     * @param interactionOfferUUID
     *     
     * @return
     *     UUID for API-Service
     */
    @SerializedName("InteractionOfferUUID")
    @JsonProperty("InteractionOfferUUID")
    @Nullable
    @ODataField(odataName = "InteractionOfferUUID")
    private UUID interactionOfferUUID;
    /**
     * Use with available fluent helpers to apply the <b>InteractionOfferUUID</b> field to query operations.
     * 
     */
    public final static InteractionOfferField<UUID> INTERACTION_OFFER_UUID = new InteractionOfferField<UUID>("InteractionOfferUUID");
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
    public final static InteractionOfferField<UUID> INTERACTION_UUID = new InteractionOfferField<UUID>("InteractionUUID");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>ExternalOfferOrigin</b></p>
     * 
     * @param externalOfferOrigin
     *     
     * @return
     *     Origin of Offer
     */
    @SerializedName("ExternalOfferOrigin")
    @JsonProperty("ExternalOfferOrigin")
    @Nullable
    @ODataField(odataName = "ExternalOfferOrigin")
    private String externalOfferOrigin;
    /**
     * Use with available fluent helpers to apply the <b>ExternalOfferOrigin</b> field to query operations.
     * 
     */
    public final static InteractionOfferField<String> EXTERNAL_OFFER_ORIGIN = new InteractionOfferField<String>("ExternalOfferOrigin");
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
    public final static InteractionOfferField<String> MARKETING_OFFER = new InteractionOfferField<String>("MarketingOffer");
    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>MarketingOfferContent</b></p>
     * 
     * @param marketingOfferContent
     *     
     * @return
     *     Marketing Offer Content
     */
    @SerializedName("MarketingOfferContent")
    @JsonProperty("MarketingOfferContent")
    @Nullable
    @ODataField(odataName = "MarketingOfferContent")
    private String marketingOfferContent;
    /**
     * Use with available fluent helpers to apply the <b>MarketingOfferContent</b> field to query operations.
     * 
     */
    public final static InteractionOfferField<String> MARKETING_OFFER_CONTENT = new InteractionOfferField<String>("MarketingOfferContent");
    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>OfferRecommendationScenario</b></p><p>Note: The value you supply as the Recommendation Scenario ID must not contain any spaces or special characters.</p>
     * 
     * @param offerRecommendationScenario
     *     
     * @return
     *     A freely defined identifier for the predictive scenario.
     */
    @SerializedName("OfferRecommendationScenario")
    @JsonProperty("OfferRecommendationScenario")
    @Nullable
    @ODataField(odataName = "OfferRecommendationScenario")
    private String offerRecommendationScenario;
    /**
     * Use with available fluent helpers to apply the <b>OfferRecommendationScenario</b> field to query operations.
     * 
     */
    public final static InteractionOfferField<String> OFFER_RECOMMENDATION_SCENARIO = new InteractionOfferField<String>("OfferRecommendationScenario");
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
    public Class<InteractionOffer> getType() {
        return InteractionOffer.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionOfferUUID</b></p>
     * 
     * @param interactionOfferUUID
     *     UUID for API-Service
     */
    public void setInteractionOfferUUID(
        @Nullable
        final UUID interactionOfferUUID) {
        rememberChangedField("InteractionOfferUUID", this.interactionOfferUUID);
        this.interactionOfferUUID = interactionOfferUUID;
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
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>ExternalOfferOrigin</b></p>
     * 
     * @param externalOfferOrigin
     *     Origin of Offer
     */
    public void setExternalOfferOrigin(
        @Nullable
        final String externalOfferOrigin) {
        rememberChangedField("ExternalOfferOrigin", this.externalOfferOrigin);
        this.externalOfferOrigin = externalOfferOrigin;
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
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>MarketingOfferContent</b></p>
     * 
     * @param marketingOfferContent
     *     Marketing Offer Content
     */
    public void setMarketingOfferContent(
        @Nullable
        final String marketingOfferContent) {
        rememberChangedField("MarketingOfferContent", this.marketingOfferContent);
        this.marketingOfferContent = marketingOfferContent;
    }

    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>OfferRecommendationScenario</b></p><p>Note: The value you supply as the Recommendation Scenario ID must not contain any spaces or special characters.</p>
     * 
     * @param offerRecommendationScenario
     *     A freely defined identifier for the predictive scenario.
     */
    public void setOfferRecommendationScenario(
        @Nullable
        final String offerRecommendationScenario) {
        rememberChangedField("OfferRecommendationScenario", this.offerRecommendationScenario);
        this.offerRecommendationScenario = offerRecommendationScenario;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_MKT_INTERACTION_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "InteractionOffers";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("InteractionOfferUUID", getInteractionOfferUUID());
        return result;
    }

    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("InteractionOfferUUID", getInteractionOfferUUID());
        values.put("InteractionUUID", getInteractionUUID());
        values.put("ExternalOfferOrigin", getExternalOfferOrigin());
        values.put("MarketingOffer", getMarketingOffer());
        values.put("MarketingOfferContent", getMarketingOfferContent());
        values.put("OfferRecommendationScenario", getOfferRecommendationScenario());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("InteractionOfferUUID")) {
                final Object value = values.remove("InteractionOfferUUID");
                if ((value == null)||(!value.equals(getInteractionOfferUUID()))) {
                    setInteractionOfferUUID(((UUID) value));
                }
            }
            if (values.containsKey("InteractionUUID")) {
                final Object value = values.remove("InteractionUUID");
                if ((value == null)||(!value.equals(getInteractionUUID()))) {
                    setInteractionUUID(((UUID) value));
                }
            }
            if (values.containsKey("ExternalOfferOrigin")) {
                final Object value = values.remove("ExternalOfferOrigin");
                if ((value == null)||(!value.equals(getExternalOfferOrigin()))) {
                    setExternalOfferOrigin(((String) value));
                }
            }
            if (values.containsKey("MarketingOffer")) {
                final Object value = values.remove("MarketingOffer");
                if ((value == null)||(!value.equals(getMarketingOffer()))) {
                    setMarketingOffer(((String) value));
                }
            }
            if (values.containsKey("MarketingOfferContent")) {
                final Object value = values.remove("MarketingOfferContent");
                if ((value == null)||(!value.equals(getMarketingOfferContent()))) {
                    setMarketingOfferContent(((String) value));
                }
            }
            if (values.containsKey("OfferRecommendationScenario")) {
                final Object value = values.remove("OfferRecommendationScenario");
                if ((value == null)||(!value.equals(getOfferRecommendationScenario()))) {
                    setOfferRecommendationScenario(((String) value));
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
    public static<T >InteractionOfferField<T> field(final String fieldName, final Class<T> fieldType) {
        return new InteractionOfferField<T>(fieldName);
    }

}
