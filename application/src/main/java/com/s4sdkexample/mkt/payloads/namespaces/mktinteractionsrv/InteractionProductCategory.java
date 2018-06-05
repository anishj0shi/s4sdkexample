
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
 * <p>Original entity name from the Odata EDM: <b>InteractionProductCategory</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class InteractionProductCategory
    extends VdmEntity<InteractionProductCategory>
{

    /**
     * Selector for all available fields of InteractionProductCategory.
     * 
     */
    public final static InteractionProductCategorySelectable ALL_FIELDS = new InteractionProductCategorySelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionProductCategoryUUID</b></p>
     * 
     * @param interactionProductCategoryUUID
     *     
     * @return
     *     UUID for API-Service
     */
    @SerializedName("InteractionProductCategoryUUID")
    @JsonProperty("InteractionProductCategoryUUID")
    @Nullable
    @ODataField(odataName = "InteractionProductCategoryUUID")
    private UUID interactionProductCategoryUUID;
    /**
     * Use with available fluent helpers to apply the <b>InteractionProductCategoryUUID</b> field to query operations.
     * 
     */
    public final static InteractionProductCategoryField<UUID> INTERACTION_PRODUCT_CATEGORY_UUID = new InteractionProductCategoryField<UUID>("InteractionProductCategoryUUID");
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
    public final static InteractionProductCategoryField<UUID> INTERACTION_UUID = new InteractionProductCategoryField<UUID>("InteractionUUID");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>ProductCategoryUUID</b></p>
     * 
     * @param productCategoryUUID
     *     
     * @return
     *     Product Category UUID
     */
    @SerializedName("ProductCategoryUUID")
    @JsonProperty("ProductCategoryUUID")
    @Nullable
    @ODataField(odataName = "ProductCategoryUUID")
    private UUID productCategoryUUID;
    /**
     * Use with available fluent helpers to apply the <b>ProductCategoryUUID</b> field to query operations.
     * 
     */
    public final static InteractionProductCategoryField<UUID> PRODUCT_CATEGORY_UUID = new InteractionProductCategoryField<UUID>("ProductCategoryUUID");
    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>ProductCategoryHierarchy</b></p>
     * 
     * @param productCategoryHierarchy
     *     
     * @return
     *     Product Category Hierarchy ID for API-Service
     */
    @SerializedName("ProductCategoryHierarchy")
    @JsonProperty("ProductCategoryHierarchy")
    @Nullable
    @ODataField(odataName = "ProductCategoryHierarchy")
    private String productCategoryHierarchy;
    /**
     * Use with available fluent helpers to apply the <b>ProductCategoryHierarchy</b> field to query operations.
     * 
     */
    public final static InteractionProductCategoryField<String> PRODUCT_CATEGORY_HIERARCHY = new InteractionProductCategoryField<String>("ProductCategoryHierarchy");
    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>ProductCategory</b></p>
     * 
     * @param productCategory
     *     
     * @return
     *     Product Category ID for API-Service
     */
    @SerializedName("ProductCategory")
    @JsonProperty("ProductCategory")
    @Nullable
    @ODataField(odataName = "ProductCategory")
    private String productCategory;
    /**
     * Use with available fluent helpers to apply the <b>ProductCategory</b> field to query operations.
     * 
     */
    public final static InteractionProductCategoryField<String> PRODUCT_CATEGORY = new InteractionProductCategoryField<String>("ProductCategory");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IntactnProdCatWeightingFctr</b></p>
     * 
     * @param intactnProdCatWeightingFctr
     *     
     * @return
     *     Weighting Factor
     */
    @SerializedName("IntactnProdCatWeightingFctr")
    @JsonProperty("IntactnProdCatWeightingFctr")
    @Nullable
    @ODataField(odataName = "IntactnProdCatWeightingFctr")
    private Short intactnProdCatWeightingFctr;
    /**
     * Use with available fluent helpers to apply the <b>IntactnProdCatWeightingFctr</b> field to query operations.
     * 
     */
    public final static InteractionProductCategoryField<Short> INTACTN_PROD_CAT_WEIGHTING_FCTR = new InteractionProductCategoryField<Short>("IntactnProdCatWeightingFctr");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionProdCatSentimentVal</b></p>
     * 
     * @param interactionProdCatSentimentVal
     *     
     * @return
     *     Sentiment
     */
    @SerializedName("InteractionProdCatSentimentVal")
    @JsonProperty("InteractionProdCatSentimentVal")
    @Nullable
    @ODataField(odataName = "InteractionProdCatSentimentVal")
    private Short interactionProdCatSentimentVal;
    /**
     * Use with available fluent helpers to apply the <b>InteractionProdCatSentimentVal</b> field to query operations.
     * 
     */
    public final static InteractionProductCategoryField<Short> INTERACTION_PROD_CAT_SENTIMENT_VAL = new InteractionProductCategoryField<Short>("InteractionProdCatSentimentVal");
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
    public Class<InteractionProductCategory> getType() {
        return InteractionProductCategory.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionProductCategoryUUID</b></p>
     * 
     * @param interactionProductCategoryUUID
     *     UUID for API-Service
     */
    public void setInteractionProductCategoryUUID(
        @Nullable
        final UUID interactionProductCategoryUUID) {
        rememberChangedField("InteractionProductCategoryUUID", this.interactionProductCategoryUUID);
        this.interactionProductCategoryUUID = interactionProductCategoryUUID;
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
     * Constraints: none<p>Original property name from the Odata EDM: <b>ProductCategoryUUID</b></p>
     * 
     * @param productCategoryUUID
     *     Product Category UUID
     */
    public void setProductCategoryUUID(
        @Nullable
        final UUID productCategoryUUID) {
        rememberChangedField("ProductCategoryUUID", this.productCategoryUUID);
        this.productCategoryUUID = productCategoryUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>ProductCategoryHierarchy</b></p>
     * 
     * @param productCategoryHierarchy
     *     Product Category Hierarchy ID for API-Service
     */
    public void setProductCategoryHierarchy(
        @Nullable
        final String productCategoryHierarchy) {
        rememberChangedField("ProductCategoryHierarchy", this.productCategoryHierarchy);
        this.productCategoryHierarchy = productCategoryHierarchy;
    }

    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>ProductCategory</b></p>
     * 
     * @param productCategory
     *     Product Category ID for API-Service
     */
    public void setProductCategory(
        @Nullable
        final String productCategory) {
        rememberChangedField("ProductCategory", this.productCategory);
        this.productCategory = productCategory;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IntactnProdCatWeightingFctr</b></p>
     * 
     * @param intactnProdCatWeightingFctr
     *     Weighting Factor
     */
    public void setIntactnProdCatWeightingFctr(
        @Nullable
        final Short intactnProdCatWeightingFctr) {
        rememberChangedField("IntactnProdCatWeightingFctr", this.intactnProdCatWeightingFctr);
        this.intactnProdCatWeightingFctr = intactnProdCatWeightingFctr;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionProdCatSentimentVal</b></p>
     * 
     * @param interactionProdCatSentimentVal
     *     Sentiment
     */
    public void setInteractionProdCatSentimentVal(
        @Nullable
        final Short interactionProdCatSentimentVal) {
        rememberChangedField("InteractionProdCatSentimentVal", this.interactionProdCatSentimentVal);
        this.interactionProdCatSentimentVal = interactionProdCatSentimentVal;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_MKT_INTERACTION_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "InteractionProductCategories";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("InteractionProductCategoryUUID", getInteractionProductCategoryUUID());
        return result;
    }

    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("InteractionProductCategoryUUID", getInteractionProductCategoryUUID());
        values.put("InteractionUUID", getInteractionUUID());
        values.put("ProductCategoryUUID", getProductCategoryUUID());
        values.put("ProductCategoryHierarchy", getProductCategoryHierarchy());
        values.put("ProductCategory", getProductCategory());
        values.put("IntactnProdCatWeightingFctr", getIntactnProdCatWeightingFctr());
        values.put("InteractionProdCatSentimentVal", getInteractionProdCatSentimentVal());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("InteractionProductCategoryUUID")) {
                final Object value = values.remove("InteractionProductCategoryUUID");
                if ((value == null)||(!value.equals(getInteractionProductCategoryUUID()))) {
                    setInteractionProductCategoryUUID(((UUID) value));
                }
            }
            if (values.containsKey("InteractionUUID")) {
                final Object value = values.remove("InteractionUUID");
                if ((value == null)||(!value.equals(getInteractionUUID()))) {
                    setInteractionUUID(((UUID) value));
                }
            }
            if (values.containsKey("ProductCategoryUUID")) {
                final Object value = values.remove("ProductCategoryUUID");
                if ((value == null)||(!value.equals(getProductCategoryUUID()))) {
                    setProductCategoryUUID(((UUID) value));
                }
            }
            if (values.containsKey("ProductCategoryHierarchy")) {
                final Object value = values.remove("ProductCategoryHierarchy");
                if ((value == null)||(!value.equals(getProductCategoryHierarchy()))) {
                    setProductCategoryHierarchy(((String) value));
                }
            }
            if (values.containsKey("ProductCategory")) {
                final Object value = values.remove("ProductCategory");
                if ((value == null)||(!value.equals(getProductCategory()))) {
                    setProductCategory(((String) value));
                }
            }
            if (values.containsKey("IntactnProdCatWeightingFctr")) {
                final Object value = values.remove("IntactnProdCatWeightingFctr");
                if ((value == null)||(!value.equals(getIntactnProdCatWeightingFctr()))) {
                    setIntactnProdCatWeightingFctr(((Short) value));
                }
            }
            if (values.containsKey("InteractionProdCatSentimentVal")) {
                final Object value = values.remove("InteractionProdCatSentimentVal");
                if ((value == null)||(!value.equals(getInteractionProdCatSentimentVal()))) {
                    setInteractionProdCatSentimentVal(((Short) value));
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
    public static<T >InteractionProductCategoryField<T> field(final String fieldName, final Class<T> fieldType) {
        return new InteractionProductCategoryField<T>(fieldName);
    }

}
