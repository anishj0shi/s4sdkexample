
package com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv;

import java.math.BigDecimal;
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
 * <p>Original entity name from the Odata EDM: <b>InteractionProduct</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class InteractionProduct
    extends VdmEntity<InteractionProduct>
{

    /**
     * Selector for all available fields of InteractionProduct.
     * 
     */
    public final static InteractionProductSelectable ALL_FIELDS = new InteractionProductSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionProductUUID</b></p>
     * 
     * @param interactionProductUUID
     *     
     * @return
     *     UUID for API-Service
     */
    @SerializedName("InteractionProductUUID")
    @JsonProperty("InteractionProductUUID")
    @Nullable
    @ODataField(odataName = "InteractionProductUUID")
    private UUID interactionProductUUID;
    /**
     * Use with available fluent helpers to apply the <b>InteractionProductUUID</b> field to query operations.
     * 
     */
    public final static InteractionProductField<UUID> INTERACTION_PRODUCT_UUID = new InteractionProductField<UUID>("InteractionProductUUID");
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
    public final static InteractionProductField<UUID> INTERACTION_UUID = new InteractionProductField<UUID>("InteractionUUID");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>ProductUUID</b></p>
     * 
     * @param productUUID
     *     
     * @return
     *     Product
     */
    @SerializedName("ProductUUID")
    @JsonProperty("ProductUUID")
    @Nullable
    @ODataField(odataName = "ProductUUID")
    private UUID productUUID;
    /**
     * Use with available fluent helpers to apply the <b>ProductUUID</b> field to query operations.
     * 
     */
    public final static InteractionProductField<UUID> PRODUCT_UUID = new InteractionProductField<UUID>("ProductUUID");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>ProductOrigin</b></p>
     * 
     * @param productOrigin
     *     
     * @return
     *     Origin of Product Data
     */
    @SerializedName("ProductOrigin")
    @JsonProperty("ProductOrigin")
    @Nullable
    @ODataField(odataName = "ProductOrigin")
    private String productOrigin;
    /**
     * Use with available fluent helpers to apply the <b>ProductOrigin</b> field to query operations.
     * 
     */
    public final static InteractionProductField<String> PRODUCT_ORIGIN = new InteractionProductField<String>("ProductOrigin");
    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>Product</b></p>
     * 
     * @param product
     *     
     * @return
     *     Product ID
     */
    @SerializedName("Product")
    @JsonProperty("Product")
    @Nullable
    @ODataField(odataName = "Product")
    private String product;
    /**
     * Use with available fluent helpers to apply the <b>Product</b> field to query operations.
     * 
     */
    public final static InteractionProductField<String> PRODUCT = new InteractionProductField<String>("Product");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionProdWeightingFactor</b></p>
     * 
     * @param interactionProdWeightingFactor
     *     
     * @return
     *     Weighting Factor
     */
    @SerializedName("InteractionProdWeightingFactor")
    @JsonProperty("InteractionProdWeightingFactor")
    @Nullable
    @ODataField(odataName = "InteractionProdWeightingFactor")
    private Short interactionProdWeightingFactor;
    /**
     * Use with available fluent helpers to apply the <b>InteractionProdWeightingFactor</b> field to query operations.
     * 
     */
    public final static InteractionProductField<Short> INTERACTION_PROD_WEIGHTING_FACTOR = new InteractionProductField<Short>("InteractionProdWeightingFactor");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionProductSentimentVal</b></p>
     * 
     * @param interactionProductSentimentVal
     *     
     * @return
     *     Sentiment
     */
    @SerializedName("InteractionProductSentimentVal")
    @JsonProperty("InteractionProductSentimentVal")
    @Nullable
    @ODataField(odataName = "InteractionProductSentimentVal")
    private Short interactionProductSentimentVal;
    /**
     * Use with available fluent helpers to apply the <b>InteractionProductSentimentVal</b> field to query operations.
     * 
     */
    public final static InteractionProductField<Short> INTERACTION_PRODUCT_SENTIMENT_VAL = new InteractionProductField<Short>("InteractionProductSentimentVal");
    /**
     * Constraints: Not nullable, Precision: 31, Scale: 2 <p>Original property name from the Odata EDM: <b>InteractionProductAmount</b></p>
     * 
     * @param interactionProductAmount
     *     
     * @return
     *     Amount
     */
    @SerializedName("InteractionProductAmount")
    @JsonProperty("InteractionProductAmount")
    @Nullable
    @ODataField(odataName = "InteractionProductAmount")
    private BigDecimal interactionProductAmount;
    /**
     * Use with available fluent helpers to apply the <b>InteractionProductAmount</b> field to query operations.
     * 
     */
    public final static InteractionProductField<BigDecimal> INTERACTION_PRODUCT_AMOUNT = new InteractionProductField<BigDecimal>("InteractionProductAmount");
    /**
     * Constraints: Not nullable, Precision: 23, Scale: 5 <p>Original property name from the Odata EDM: <b>InteractionProductQuantity</b></p>
     * 
     * @param interactionProductQuantity
     *     
     * @return
     *     Quantity
     */
    @SerializedName("InteractionProductQuantity")
    @JsonProperty("InteractionProductQuantity")
    @Nullable
    @ODataField(odataName = "InteractionProductQuantity")
    private BigDecimal interactionProductQuantity;
    /**
     * Use with available fluent helpers to apply the <b>InteractionProductQuantity</b> field to query operations.
     * 
     */
    public final static InteractionProductField<BigDecimal> INTERACTION_PRODUCT_QUANTITY = new InteractionProductField<BigDecimal>("InteractionProductQuantity");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>InteractionProductUnit</b></p>
     * 
     * @param interactionProductUnit
     *     
     * @return
     *     Unit of Measure
     */
    @SerializedName("InteractionProductUnit")
    @JsonProperty("InteractionProductUnit")
    @Nullable
    @ODataField(odataName = "InteractionProductUnit")
    private String interactionProductUnit;
    /**
     * Use with available fluent helpers to apply the <b>InteractionProductUnit</b> field to query operations.
     * 
     */
    public final static InteractionProductField<String> INTERACTION_PRODUCT_UNIT = new InteractionProductField<String>("InteractionProductUnit");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>ProductRecommendationModelType</b></p><p>Identifies the model from the recommender system that gerenated the recommendation.</p>
     * 
     * @param productRecommendationModelType
     *     
     * @return
     *     The model ID of the recommender system that recommends the item, for example, CROSSSELL.
     */
    @SerializedName("ProductRecommendationModelType")
    @JsonProperty("ProductRecommendationModelType")
    @Nullable
    @ODataField(odataName = "ProductRecommendationModelType")
    private String productRecommendationModelType;
    /**
     * Use with available fluent helpers to apply the <b>ProductRecommendationModelType</b> field to query operations.
     * 
     */
    public final static InteractionProductField<String> PRODUCT_RECOMMENDATION_MODEL_TYPE = new InteractionProductField<String>("ProductRecommendationModelType");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>InteractionProductStatus</b></p>
     * 
     * @param interactionProductStatus
     *     
     * @return
     *     Status for API-Services
     */
    @SerializedName("InteractionProductStatus")
    @JsonProperty("InteractionProductStatus")
    @Nullable
    @ODataField(odataName = "InteractionProductStatus")
    private String interactionProductStatus;
    /**
     * Use with available fluent helpers to apply the <b>InteractionProductStatus</b> field to query operations.
     * 
     */
    public final static InteractionProductField<String> INTERACTION_PRODUCT_STATUS = new InteractionProductField<String>("InteractionProductStatus");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>InteractionProductReason</b></p>
     * 
     * @param interactionProductReason
     *     
     * @return
     *     Reason for API-Services
     */
    @SerializedName("InteractionProductReason")
    @JsonProperty("InteractionProductReason")
    @Nullable
    @ODataField(odataName = "InteractionProductReason")
    private String interactionProductReason;
    /**
     * Use with available fluent helpers to apply the <b>InteractionProductReason</b> field to query operations.
     * 
     */
    public final static InteractionProductField<String> INTERACTION_PRODUCT_REASON = new InteractionProductField<String>("InteractionProductReason");
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
    public Class<InteractionProduct> getType() {
        return InteractionProduct.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionProductUUID</b></p>
     * 
     * @param interactionProductUUID
     *     UUID for API-Service
     */
    public void setInteractionProductUUID(
        @Nullable
        final UUID interactionProductUUID) {
        rememberChangedField("InteractionProductUUID", this.interactionProductUUID);
        this.interactionProductUUID = interactionProductUUID;
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
     * Constraints: none<p>Original property name from the Odata EDM: <b>ProductUUID</b></p>
     * 
     * @param productUUID
     *     Product
     */
    public void setProductUUID(
        @Nullable
        final UUID productUUID) {
        rememberChangedField("ProductUUID", this.productUUID);
        this.productUUID = productUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>ProductOrigin</b></p>
     * 
     * @param productOrigin
     *     Origin of Product Data
     */
    public void setProductOrigin(
        @Nullable
        final String productOrigin) {
        rememberChangedField("ProductOrigin", this.productOrigin);
        this.productOrigin = productOrigin;
    }

    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>Product</b></p>
     * 
     * @param product
     *     Product ID
     */
    public void setProduct(
        @Nullable
        final String product) {
        rememberChangedField("Product", this.product);
        this.product = product;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionProdWeightingFactor</b></p>
     * 
     * @param interactionProdWeightingFactor
     *     Weighting Factor
     */
    public void setInteractionProdWeightingFactor(
        @Nullable
        final Short interactionProdWeightingFactor) {
        rememberChangedField("InteractionProdWeightingFactor", this.interactionProdWeightingFactor);
        this.interactionProdWeightingFactor = interactionProdWeightingFactor;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionProductSentimentVal</b></p>
     * 
     * @param interactionProductSentimentVal
     *     Sentiment
     */
    public void setInteractionProductSentimentVal(
        @Nullable
        final Short interactionProductSentimentVal) {
        rememberChangedField("InteractionProductSentimentVal", this.interactionProductSentimentVal);
        this.interactionProductSentimentVal = interactionProductSentimentVal;
    }

    /**
     * Constraints: Not nullable, Precision: 31, Scale: 2 <p>Original property name from the Odata EDM: <b>InteractionProductAmount</b></p>
     * 
     * @param interactionProductAmount
     *     Amount
     */
    public void setInteractionProductAmount(
        @Nullable
        final BigDecimal interactionProductAmount) {
        rememberChangedField("InteractionProductAmount", this.interactionProductAmount);
        this.interactionProductAmount = interactionProductAmount;
    }

    /**
     * Constraints: Not nullable, Precision: 23, Scale: 5 <p>Original property name from the Odata EDM: <b>InteractionProductQuantity</b></p>
     * 
     * @param interactionProductQuantity
     *     Quantity
     */
    public void setInteractionProductQuantity(
        @Nullable
        final BigDecimal interactionProductQuantity) {
        rememberChangedField("InteractionProductQuantity", this.interactionProductQuantity);
        this.interactionProductQuantity = interactionProductQuantity;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>InteractionProductUnit</b></p>
     * 
     * @param interactionProductUnit
     *     Unit of Measure
     */
    public void setInteractionProductUnit(
        @Nullable
        final String interactionProductUnit) {
        rememberChangedField("InteractionProductUnit", this.interactionProductUnit);
        this.interactionProductUnit = interactionProductUnit;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>ProductRecommendationModelType</b></p><p>Identifies the model from the recommender system that gerenated the recommendation.</p>
     * 
     * @param productRecommendationModelType
     *     The model ID of the recommender system that recommends the item, for example, CROSSSELL.
     */
    public void setProductRecommendationModelType(
        @Nullable
        final String productRecommendationModelType) {
        rememberChangedField("ProductRecommendationModelType", this.productRecommendationModelType);
        this.productRecommendationModelType = productRecommendationModelType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>InteractionProductStatus</b></p>
     * 
     * @param interactionProductStatus
     *     Status for API-Services
     */
    public void setInteractionProductStatus(
        @Nullable
        final String interactionProductStatus) {
        rememberChangedField("InteractionProductStatus", this.interactionProductStatus);
        this.interactionProductStatus = interactionProductStatus;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>InteractionProductReason</b></p>
     * 
     * @param interactionProductReason
     *     Reason for API-Services
     */
    public void setInteractionProductReason(
        @Nullable
        final String interactionProductReason) {
        rememberChangedField("InteractionProductReason", this.interactionProductReason);
        this.interactionProductReason = interactionProductReason;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_MKT_INTERACTION_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "InteractionProducts";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("InteractionProductUUID", getInteractionProductUUID());
        return result;
    }

    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("InteractionProductUUID", getInteractionProductUUID());
        values.put("InteractionUUID", getInteractionUUID());
        values.put("ProductUUID", getProductUUID());
        values.put("ProductOrigin", getProductOrigin());
        values.put("Product", getProduct());
        values.put("InteractionProdWeightingFactor", getInteractionProdWeightingFactor());
        values.put("InteractionProductSentimentVal", getInteractionProductSentimentVal());
        values.put("InteractionProductAmount", getInteractionProductAmount());
        values.put("InteractionProductQuantity", getInteractionProductQuantity());
        values.put("InteractionProductUnit", getInteractionProductUnit());
        values.put("ProductRecommendationModelType", getProductRecommendationModelType());
        values.put("InteractionProductStatus", getInteractionProductStatus());
        values.put("InteractionProductReason", getInteractionProductReason());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("InteractionProductUUID")) {
                final Object value = values.remove("InteractionProductUUID");
                if ((value == null)||(!value.equals(getInteractionProductUUID()))) {
                    setInteractionProductUUID(((UUID) value));
                }
            }
            if (values.containsKey("InteractionUUID")) {
                final Object value = values.remove("InteractionUUID");
                if ((value == null)||(!value.equals(getInteractionUUID()))) {
                    setInteractionUUID(((UUID) value));
                }
            }
            if (values.containsKey("ProductUUID")) {
                final Object value = values.remove("ProductUUID");
                if ((value == null)||(!value.equals(getProductUUID()))) {
                    setProductUUID(((UUID) value));
                }
            }
            if (values.containsKey("ProductOrigin")) {
                final Object value = values.remove("ProductOrigin");
                if ((value == null)||(!value.equals(getProductOrigin()))) {
                    setProductOrigin(((String) value));
                }
            }
            if (values.containsKey("Product")) {
                final Object value = values.remove("Product");
                if ((value == null)||(!value.equals(getProduct()))) {
                    setProduct(((String) value));
                }
            }
            if (values.containsKey("InteractionProdWeightingFactor")) {
                final Object value = values.remove("InteractionProdWeightingFactor");
                if ((value == null)||(!value.equals(getInteractionProdWeightingFactor()))) {
                    setInteractionProdWeightingFactor(((Short) value));
                }
            }
            if (values.containsKey("InteractionProductSentimentVal")) {
                final Object value = values.remove("InteractionProductSentimentVal");
                if ((value == null)||(!value.equals(getInteractionProductSentimentVal()))) {
                    setInteractionProductSentimentVal(((Short) value));
                }
            }
            if (values.containsKey("InteractionProductAmount")) {
                final Object value = values.remove("InteractionProductAmount");
                if ((value == null)||(!value.equals(getInteractionProductAmount()))) {
                    setInteractionProductAmount(((BigDecimal) value));
                }
            }
            if (values.containsKey("InteractionProductQuantity")) {
                final Object value = values.remove("InteractionProductQuantity");
                if ((value == null)||(!value.equals(getInteractionProductQuantity()))) {
                    setInteractionProductQuantity(((BigDecimal) value));
                }
            }
            if (values.containsKey("InteractionProductUnit")) {
                final Object value = values.remove("InteractionProductUnit");
                if ((value == null)||(!value.equals(getInteractionProductUnit()))) {
                    setInteractionProductUnit(((String) value));
                }
            }
            if (values.containsKey("ProductRecommendationModelType")) {
                final Object value = values.remove("ProductRecommendationModelType");
                if ((value == null)||(!value.equals(getProductRecommendationModelType()))) {
                    setProductRecommendationModelType(((String) value));
                }
            }
            if (values.containsKey("InteractionProductStatus")) {
                final Object value = values.remove("InteractionProductStatus");
                if ((value == null)||(!value.equals(getInteractionProductStatus()))) {
                    setInteractionProductStatus(((String) value));
                }
            }
            if (values.containsKey("InteractionProductReason")) {
                final Object value = values.remove("InteractionProductReason");
                if ((value == null)||(!value.equals(getInteractionProductReason()))) {
                    setInteractionProductReason(((String) value));
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
    public static<T >InteractionProductField<T> field(final String fieldName, final Class<T> fieldType) {
        return new InteractionProductField<T>(fieldName);
    }

}
