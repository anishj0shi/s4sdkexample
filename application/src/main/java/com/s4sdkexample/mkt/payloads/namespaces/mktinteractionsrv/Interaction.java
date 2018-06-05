
package com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
 * <p>Original entity name from the Odata EDM: <b>Interaction</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class Interaction
    extends VdmEntity<Interaction>
{

    /**
     * Selector for all available fields of Interaction.
     * 
     */
    public final static InteractionSelectable ALL_FIELDS = new InteractionSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionUUID</b></p>
     * 
     * @param interactionUUID
     *     
     * @return
     *     UUID for API-Service
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
    public final static InteractionField<UUID> INTERACTION_UUID = new InteractionField<UUID>("InteractionUUID");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>InteractionContactOrigin</b></p><p>The origin indicates the source of an ID. By defining the origin you determine that a contact with an ID associated to a source is eligible to be analyzed in SAP hybris Marketing RecommendationYou can maintain the origins to choose from in the Define Origins of Contact ID Customizing activity.For example, in a Web shop scenario, a consumer chooses a recommended product returned by SAP hybris Marketing Recommendation to examine the product details. This interaction can be considered for future recommendations.</p>
     * 
     * @param interactionContactOrigin
     *     
     * @return
     *     This is the origin of the contact ID that is required to capture and query interactions.
     */
    @SerializedName("InteractionContactOrigin")
    @JsonProperty("InteractionContactOrigin")
    @Nullable
    @ODataField(odataName = "InteractionContactOrigin")
    private String interactionContactOrigin;
    /**
     * Use with available fluent helpers to apply the <b>InteractionContactOrigin</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_CONTACT_ORIGIN = new InteractionField<String>("InteractionContactOrigin");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>InteractionContactId</b></p>
     * 
     * @param interactionContactId
     *     
     * @return
     *     External ID of Interaction Contact Data
     */
    @SerializedName("InteractionContactId")
    @JsonProperty("InteractionContactId")
    @Nullable
    @ODataField(odataName = "InteractionContactId")
    private String interactionContactId;
    /**
     * Use with available fluent helpers to apply the <b>InteractionContactId</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_CONTACT_ID = new InteractionField<String>("InteractionContactId");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>CommunicationMedium</b></p>
     * 
     * @param communicationMedium
     *     
     * @return
     *     Communication Medium
     */
    @SerializedName("CommunicationMedium")
    @JsonProperty("CommunicationMedium")
    @Nullable
    @ODataField(odataName = "CommunicationMedium")
    private String communicationMedium;
    /**
     * Use with available fluent helpers to apply the <b>CommunicationMedium</b> field to query operations.
     * 
     */
    public final static InteractionField<String> COMMUNICATION_MEDIUM = new InteractionField<String>("CommunicationMedium");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>InteractionType</b></p>
     * 
     * @param interactionType
     *     
     * @return
     *     Interaction Type
     */
    @SerializedName("InteractionType")
    @JsonProperty("InteractionType")
    @Nullable
    @ODataField(odataName = "InteractionType")
    private String interactionType;
    /**
     * Use with available fluent helpers to apply the <b>InteractionType</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_TYPE = new InteractionField<String>("InteractionType");
    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>InteractionTimeStampUTC</b></p>
     * 
     * @param interactionTimeStampUTC
     *     
     * @return
     *     UTC Timestamp for API-Services
     */
    @SerializedName("InteractionTimeStampUTC")
    @JsonProperty("InteractionTimeStampUTC")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "InteractionTimeStampUTC", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime interactionTimeStampUTC;
    /**
     * Use with available fluent helpers to apply the <b>InteractionTimeStampUTC</b> field to query operations.
     * 
     */
    public final static InteractionField<ZonedDateTime> INTERACTION_TIME_STAMP_UTC = new InteractionField<ZonedDateTime>("InteractionTimeStampUTC");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>InteractionSourceObjectType</b></p>
     * 
     * @param interactionSourceObjectType
     *     
     * @return
     *     Source Object Type for API-Service
     */
    @SerializedName("InteractionSourceObjectType")
    @JsonProperty("InteractionSourceObjectType")
    @Nullable
    @ODataField(odataName = "InteractionSourceObjectType")
    private String interactionSourceObjectType;
    /**
     * Use with available fluent helpers to apply the <b>InteractionSourceObjectType</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_SOURCE_OBJECT_TYPE = new InteractionField<String>("InteractionSourceObjectType");
    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>InteractionSourceObject</b></p>
     * 
     * @param interactionSourceObject
     *     
     * @return
     *     Source Object ID for API-Service
     */
    @SerializedName("InteractionSourceObject")
    @JsonProperty("InteractionSourceObject")
    @Nullable
    @ODataField(odataName = "InteractionSourceObject")
    private String interactionSourceObject;
    /**
     * Use with available fluent helpers to apply the <b>InteractionSourceObject</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_SOURCE_OBJECT = new InteractionField<String>("InteractionSourceObject");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>MarketingArea</b></p><p>You use a marketing area to restrict the access to instances of an object, such as campaign, campaign content, content template, or target group.</p>
     * 
     * @param marketingArea
     *     
     * @return
     *     Identifies an area of responsibility, or an organizational unit.
     */
    @SerializedName("MarketingArea")
    @JsonProperty("MarketingArea")
    @Nullable
    @ODataField(odataName = "MarketingArea")
    private String marketingArea;
    /**
     * Use with available fluent helpers to apply the <b>MarketingArea</b> field to query operations.
     * 
     */
    public final static InteractionField<String> MARKETING_AREA = new InteractionField<String>("MarketingArea");
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
    public final static InteractionField<String> CAMPAIGN_ID = new InteractionField<String>("CampaignID");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>MarketingLocationOrigin</b></p>
     * 
     * @param marketingLocationOrigin
     *     
     * @return
     *     Origin of Marketing Location
     */
    @SerializedName("MarketingLocationOrigin")
    @JsonProperty("MarketingLocationOrigin")
    @Nullable
    @ODataField(odataName = "MarketingLocationOrigin")
    private String marketingLocationOrigin;
    /**
     * Use with available fluent helpers to apply the <b>MarketingLocationOrigin</b> field to query operations.
     * 
     */
    public final static InteractionField<String> MARKETING_LOCATION_ORIGIN = new InteractionField<String>("MarketingLocationOrigin");
    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>MarketingLocation</b></p>
     * 
     * @param marketingLocation
     *     
     * @return
     *     Marketing Location ID
     */
    @SerializedName("MarketingLocation")
    @JsonProperty("MarketingLocation")
    @Nullable
    @ODataField(odataName = "MarketingLocation")
    private String marketingLocation;
    /**
     * Use with available fluent helpers to apply the <b>MarketingLocation</b> field to query operations.
     * 
     */
    public final static InteractionField<String> MARKETING_LOCATION = new InteractionField<String>("MarketingLocation");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>DigitalAccountType</b></p>
     * 
     * @param digitalAccountType
     *     
     * @return
     *     Digital Account Type
     */
    @SerializedName("DigitalAccountType")
    @JsonProperty("DigitalAccountType")
    @Nullable
    @ODataField(odataName = "DigitalAccountType")
    private String digitalAccountType;
    /**
     * Use with available fluent helpers to apply the <b>DigitalAccountType</b> field to query operations.
     * 
     */
    public final static InteractionField<String> DIGITAL_ACCOUNT_TYPE = new InteractionField<String>("DigitalAccountType");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>DigitalAccount</b></p>
     * 
     * @param digitalAccount
     *     
     * @return
     *     Indicates the WeChat ID of a WeChat official account.
     */
    @SerializedName("DigitalAccount")
    @JsonProperty("DigitalAccount")
    @Nullable
    @ODataField(odataName = "DigitalAccount")
    private String digitalAccount;
    /**
     * Use with available fluent helpers to apply the <b>DigitalAccount</b> field to query operations.
     * 
     */
    public final static InteractionField<String> DIGITAL_ACCOUNT = new InteractionField<String>("DigitalAccount");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>MKT_AgreementOrigin</b></p><p>The agreement origin and the agreement external ID are semantic keys of an agreement and are used for external access.</p>
     * 
     * @param mKT_AgreementOrigin
     *     
     * @return
     *     Shows the ID of the system, where the agreement was originally maintained.
     */
    @SerializedName("MKT_AgreementOrigin")
    @JsonProperty("MKT_AgreementOrigin")
    @Nullable
    @ODataField(odataName = "MKT_AgreementOrigin")
    private String mKT_AgreementOrigin;
    /**
     * Use with available fluent helpers to apply the <b>MKT_AgreementOrigin</b> field to query operations.
     * 
     */
    public final static InteractionField<String> MKT_AGREEMENT_ORIGIN = new InteractionField<String>("MKT_AgreementOrigin");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>MKT_AgreementExternalID</b></p><p>The agreement origin and the agreement external ID are semantical keys for the agreement and are used for external access.</p>
     * 
     * @param mKT_AgreementExternalID
     *     
     * @return
     *     Shows the ID of an agreement from the system, where it was originally maintained.
     */
    @SerializedName("MKT_AgreementExternalID")
    @JsonProperty("MKT_AgreementExternalID")
    @Nullable
    @ODataField(odataName = "MKT_AgreementExternalID")
    private String mKT_AgreementExternalID;
    /**
     * Use with available fluent helpers to apply the <b>MKT_AgreementExternalID</b> field to query operations.
     * 
     */
    public final static InteractionField<String> MKT_AGREEMENT_EXTERNAL_ID = new InteractionField<String>("MKT_AgreementExternalID");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CampaignContent</b></p>
     * 
     * @param campaignContent
     *     
     * @return
     *     Campaign Content ID for API-Service
     */
    @SerializedName("CampaignContent")
    @JsonProperty("CampaignContent")
    @Nullable
    @ODataField(odataName = "CampaignContent")
    private Integer campaignContent;
    /**
     * Use with available fluent helpers to apply the <b>CampaignContent</b> field to query operations.
     * 
     */
    public final static InteractionField<Integer> CAMPAIGN_CONTENT = new InteractionField<Integer>("CampaignContent");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionWeightingFactor</b></p>
     * 
     * @param interactionWeightingFactor
     *     
     * @return
     *     Weighting Factor
     */
    @SerializedName("InteractionWeightingFactor")
    @JsonProperty("InteractionWeightingFactor")
    @Nullable
    @ODataField(odataName = "InteractionWeightingFactor")
    private Short interactionWeightingFactor;
    /**
     * Use with available fluent helpers to apply the <b>InteractionWeightingFactor</b> field to query operations.
     * 
     */
    public final static InteractionField<Short> INTERACTION_WEIGHTING_FACTOR = new InteractionField<Short>("InteractionWeightingFactor");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionSentimentValue</b></p>
     * 
     * @param interactionSentimentValue
     *     
     * @return
     *     Sentiment
     */
    @SerializedName("InteractionSentimentValue")
    @JsonProperty("InteractionSentimentValue")
    @Nullable
    @ODataField(odataName = "InteractionSentimentValue")
    private Short interactionSentimentValue;
    /**
     * Use with available fluent helpers to apply the <b>InteractionSentimentValue</b> field to query operations.
     * 
     */
    public final static InteractionField<Short> INTERACTION_SENTIMENT_VALUE = new InteractionField<Short>("InteractionSentimentValue");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>InteractionStatus</b></p>
     * 
     * @param interactionStatus
     *     
     * @return
     *     Status for API-Services
     */
    @SerializedName("InteractionStatus")
    @JsonProperty("InteractionStatus")
    @Nullable
    @ODataField(odataName = "InteractionStatus")
    private String interactionStatus;
    /**
     * Use with available fluent helpers to apply the <b>InteractionStatus</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_STATUS = new InteractionField<String>("InteractionStatus");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>InteractionReason</b></p>
     * 
     * @param interactionReason
     *     
     * @return
     *     Reason for API-Services
     */
    @SerializedName("InteractionReason")
    @JsonProperty("InteractionReason")
    @Nullable
    @ODataField(odataName = "InteractionReason")
    private String interactionReason;
    /**
     * Use with available fluent helpers to apply the <b>InteractionReason</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_REASON = new InteractionField<String>("InteractionReason");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>InteractionLanguage</b></p><p>- the language in which texts are displayed,- the language in which you enter texts,- the language in which the system prints texts.</p>
     * 
     * @param interactionLanguage
     *     
     * @return
     *     The language key indicates
     */
    @SerializedName("InteractionLanguage")
    @JsonProperty("InteractionLanguage")
    @Nullable
    @ODataField(odataName = "InteractionLanguage")
    private String interactionLanguage;
    /**
     * Use with available fluent helpers to apply the <b>InteractionLanguage</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_LANGUAGE = new InteractionField<String>("InteractionLanguage");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionIsAnonymous</b></p>
     * 
     * @param interactionIsAnonymous
     *     
     * @return
     *     Is Anonymous Indicator for API-Service
     */
    @SerializedName("InteractionIsAnonymous")
    @JsonProperty("InteractionIsAnonymous")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "InteractionIsAnonymous")
    private Boolean interactionIsAnonymous;
    /**
     * Use with available fluent helpers to apply the <b>InteractionIsAnonymous</b> field to query operations.
     * 
     */
    public final static InteractionField<Boolean> INTERACTION_IS_ANONYMOUS = new InteractionField<Boolean>("InteractionIsAnonymous");
    /**
     * Constraints: Not nullable, Precision: 31, Scale: 14 <p>Original property name from the Odata EDM: <b>InteractionAmount</b></p>
     * 
     * @param interactionAmount
     *     
     * @return
     *     Amount
     */
    @SerializedName("InteractionAmount")
    @JsonProperty("InteractionAmount")
    @Nullable
    @ODataField(odataName = "InteractionAmount")
    private BigDecimal interactionAmount;
    /**
     * Use with available fluent helpers to apply the <b>InteractionAmount</b> field to query operations.
     * 
     */
    public final static InteractionField<BigDecimal> INTERACTION_AMOUNT = new InteractionField<BigDecimal>("InteractionAmount");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>InteractionCurrency</b></p>
     * 
     * @param interactionCurrency
     *     
     * @return
     *     Currency Code
     */
    @SerializedName("InteractionCurrency")
    @JsonProperty("InteractionCurrency")
    @Nullable
    @ODataField(odataName = "InteractionCurrency")
    private String interactionCurrency;
    /**
     * Use with available fluent helpers to apply the <b>InteractionCurrency</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_CURRENCY = new InteractionField<String>("InteractionCurrency");
    /**
     * Constraints: Not nullable, Precision: 21, Scale: 10 <p>Original property name from the Odata EDM: <b>InteractionLatitude</b></p>
     * 
     * @param interactionLatitude
     *     
     * @return
     *     Latitude
     */
    @SerializedName("InteractionLatitude")
    @JsonProperty("InteractionLatitude")
    @Nullable
    @ODataField(odataName = "InteractionLatitude")
    private BigDecimal interactionLatitude;
    /**
     * Use with available fluent helpers to apply the <b>InteractionLatitude</b> field to query operations.
     * 
     */
    public final static InteractionField<BigDecimal> INTERACTION_LATITUDE = new InteractionField<BigDecimal>("InteractionLatitude");
    /**
     * Constraints: Not nullable, Precision: 21, Scale: 10 <p>Original property name from the Odata EDM: <b>InteractionLongitude</b></p>
     * 
     * @param interactionLongitude
     *     
     * @return
     *     Longitude
     */
    @SerializedName("InteractionLongitude")
    @JsonProperty("InteractionLongitude")
    @Nullable
    @ODataField(odataName = "InteractionLongitude")
    private BigDecimal interactionLongitude;
    /**
     * Use with available fluent helpers to apply the <b>InteractionLongitude</b> field to query operations.
     * 
     */
    public final static InteractionField<BigDecimal> INTERACTION_LONGITUDE = new InteractionField<BigDecimal>("InteractionLongitude");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>SpatialReferenceSystem</b></p>
     * 
     * @param spatialReferenceSystem
     *     
     * @return
     *     Spatial Reference Identifier
     */
    @SerializedName("SpatialReferenceSystem")
    @JsonProperty("SpatialReferenceSystem")
    @Nullable
    @ODataField(odataName = "SpatialReferenceSystem")
    private String spatialReferenceSystem;
    /**
     * Use with available fluent helpers to apply the <b>SpatialReferenceSystem</b> field to query operations.
     * 
     */
    public final static InteractionField<String> SPATIAL_REFERENCE_SYSTEM = new InteractionField<String>("SpatialReferenceSystem");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>DeviceType</b></p>
     * 
     * @param deviceType
     *     
     * @return
     *     Device Type
     */
    @SerializedName("DeviceType")
    @JsonProperty("DeviceType")
    @Nullable
    @ODataField(odataName = "DeviceType")
    private String deviceType;
    /**
     * Use with available fluent helpers to apply the <b>DeviceType</b> field to query operations.
     * 
     */
    public final static InteractionField<String> DEVICE_TYPE = new InteractionField<String>("DeviceType");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>InteractionDeviceName</b></p>
     * 
     * @param interactionDeviceName
     *     
     * @return
     *     Device
     */
    @SerializedName("InteractionDeviceName")
    @JsonProperty("InteractionDeviceName")
    @Nullable
    @ODataField(odataName = "InteractionDeviceName")
    private String interactionDeviceName;
    /**
     * Use with available fluent helpers to apply the <b>InteractionDeviceName</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_DEVICE_NAME = new InteractionField<String>("InteractionDeviceName");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PrecedingInteractionUUID</b></p>
     * 
     * @param precedingInteractionUUID
     *     
     * @return
     *     Preceding Interaction UUID for API-Service
     */
    @SerializedName("PrecedingInteractionUUID")
    @JsonProperty("PrecedingInteractionUUID")
    @Nullable
    @ODataField(odataName = "PrecedingInteractionUUID")
    private UUID precedingInteractionUUID;
    /**
     * Use with available fluent helpers to apply the <b>PrecedingInteractionUUID</b> field to query operations.
     * 
     */
    public final static InteractionField<UUID> PRECEDING_INTERACTION_UUID = new InteractionField<UUID>("PrecedingInteractionUUID");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>SourceSystemType</b></p><p>Identifies the type of system the interaction occured in.</p>
     * 
     * @param sourceSystemType
     *     
     * @return
     *     A source system type, for example, a Web shop or a register.
     */
    @SerializedName("SourceSystemType")
    @JsonProperty("SourceSystemType")
    @Nullable
    @ODataField(odataName = "SourceSystemType")
    private String sourceSystemType;
    /**
     * Use with available fluent helpers to apply the <b>SourceSystemType</b> field to query operations.
     * 
     */
    public final static InteractionField<String> SOURCE_SYSTEM_TYPE = new InteractionField<String>("SourceSystemType");
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
    public final static InteractionField<String> SOURCE_SYSTEM = new InteractionField<String>("SourceSystem");
    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>InteractionSourceObjectAddlID</b></p>
     * 
     * @param interactionSourceObjectAddlID
     *     
     * @return
     *     Additional Source Object ID for API-Service
     */
    @SerializedName("InteractionSourceObjectAddlID")
    @JsonProperty("InteractionSourceObjectAddlID")
    @Nullable
    @ODataField(odataName = "InteractionSourceObjectAddlID")
    private String interactionSourceObjectAddlID;
    /**
     * Use with available fluent helpers to apply the <b>InteractionSourceObjectAddlID</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_SOURCE_OBJECT_ADDL_ID = new InteractionField<String>("InteractionSourceObjectAddlID");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>InteractionSourceObjectStatus</b></p>
     * 
     * @param interactionSourceObjectStatus
     *     
     * @return
     *     Business Document Status Code
     */
    @SerializedName("InteractionSourceObjectStatus")
    @JsonProperty("InteractionSourceObjectStatus")
    @Nullable
    @ODataField(odataName = "InteractionSourceObjectStatus")
    private String interactionSourceObjectStatus;
    /**
     * Use with available fluent helpers to apply the <b>InteractionSourceObjectStatus</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_SOURCE_OBJECT_STATUS = new InteractionField<String>("InteractionSourceObjectStatus");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionSourceDataURL</b></p>
     * 
     * @param interactionSourceDataURL
     *     
     * @return
     *     Source Data URL for API-Services
     */
    @SerializedName("InteractionSourceDataURL")
    @JsonProperty("InteractionSourceDataURL")
    @Nullable
    @ODataField(odataName = "InteractionSourceDataURL")
    private String interactionSourceDataURL;
    /**
     * Use with available fluent helpers to apply the <b>InteractionSourceDataURL</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_SOURCE_DATA_URL = new InteractionField<String>("InteractionSourceDataURL");
    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>InteractionSourceTimeStampUTC</b></p>
     * 
     * @param interactionSourceTimeStampUTC
     *     
     * @return
     *     Source UTC Timestamp in Long Form
     */
    @SerializedName("InteractionSourceTimeStampUTC")
    @JsonProperty("InteractionSourceTimeStampUTC")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "InteractionSourceTimeStampUTC", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime interactionSourceTimeStampUTC;
    /**
     * Use with available fluent helpers to apply the <b>InteractionSourceTimeStampUTC</b> field to query operations.
     * 
     */
    public final static InteractionField<ZonedDateTime> INTERACTION_SOURCE_TIME_STAMP_UTC = new InteractionField<ZonedDateTime>("InteractionSourceTimeStampUTC");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CampaignContentLinkURL</b></p>
     * 
     * @param campaignContentLinkURL
     *     
     * @return
     *     Campaign Content Link URL for API-Services
     */
    @SerializedName("CampaignContentLinkURL")
    @JsonProperty("CampaignContentLinkURL")
    @Nullable
    @ODataField(odataName = "CampaignContentLinkURL")
    private String campaignContentLinkURL;
    /**
     * Use with available fluent helpers to apply the <b>CampaignContentLinkURL</b> field to query operations.
     * 
     */
    public final static InteractionField<String> CAMPAIGN_CONTENT_LINK_URL = new InteractionField<String>("CampaignContentLinkURL");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>CampaignContentLinkName</b></p>
     * 
     * @param campaignContentLinkName
     *     
     * @return
     *     Campaign Content Link Text for API-Service
     */
    @SerializedName("CampaignContentLinkName")
    @JsonProperty("CampaignContentLinkName")
    @Nullable
    @ODataField(odataName = "CampaignContentLinkName")
    private String campaignContentLinkName;
    /**
     * Use with available fluent helpers to apply the <b>CampaignContentLinkName</b> field to query operations.
     * 
     */
    public final static InteractionField<String> CAMPAIGN_CONTENT_LINK_NAME = new InteractionField<String>("CampaignContentLinkName");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionContactUUID</b></p>
     * 
     * @param interactionContactUUID
     *     
     * @return
     *     Interaction Contact UUID for API-Service
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
    public final static InteractionField<UUID> INTERACTION_CONTACT_UUID = new InteractionField<UUID>("InteractionContactUUID");
    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>InteractionLastChangedDateTime</b></p>
     * 
     * @param interactionLastChangedDateTime
     *     
     * @return
     *     Last Change Date Time for API-Service
     */
    @SerializedName("InteractionLastChangedDateTime")
    @JsonProperty("InteractionLastChangedDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "InteractionLastChangedDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime interactionLastChangedDateTime;
    /**
     * Use with available fluent helpers to apply the <b>InteractionLastChangedDateTime</b> field to query operations.
     * 
     */
    public final static InteractionField<ZonedDateTime> INTERACTION_LAST_CHANGED_DATE_TIME = new InteractionField<ZonedDateTime>("InteractionLastChangedDateTime");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>InteractionLastChangedByUser</b></p>
     * 
     * @param interactionLastChangedByUser
     *     
     * @return
     *     Last Changed By User for API-Service
     */
    @SerializedName("InteractionLastChangedByUser")
    @JsonProperty("InteractionLastChangedByUser")
    @Nullable
    @ODataField(odataName = "InteractionLastChangedByUser")
    private String interactionLastChangedByUser;
    /**
     * Use with available fluent helpers to apply the <b>InteractionLastChangedByUser</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_LAST_CHANGED_BY_USER = new InteractionField<String>("InteractionLastChangedByUser");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>InteractionContentSubject</b></p>
     * 
     * @param interactionContentSubject
     *     
     * @return
     *     Interaction Content Subject
     */
    @SerializedName("InteractionContentSubject")
    @JsonProperty("InteractionContentSubject")
    @Nullable
    @ODataField(odataName = "InteractionContentSubject")
    private String interactionContentSubject;
    /**
     * Use with available fluent helpers to apply the <b>InteractionContentSubject</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_CONTENT_SUBJECT = new InteractionField<String>("InteractionContentSubject");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionContent</b></p>
     * 
     * @param interactionContent
     *     
     * @return
     *     Interaction Content
     */
    @SerializedName("InteractionContent")
    @JsonProperty("InteractionContent")
    @Nullable
    @ODataField(odataName = "InteractionContent")
    private String interactionContent;
    /**
     * Use with available fluent helpers to apply the <b>InteractionContent</b> field to query operations.
     * 
     */
    public final static InteractionField<String> INTERACTION_CONTENT = new InteractionField<String>("InteractionContent");
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
     * Navigation property <b>InteractionInterests</b> for <b>Interaction</b> to multiple <b>InteractionInterest</b>.
     * 
     */
    @SerializedName("InteractionInterests")
    @JsonProperty("InteractionInterests")
    @ODataField(odataName = "InteractionInterests")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<InteractionInterest> toInteractionInterests;
    /**
     * Navigation property <b>InteractionProductCategories</b> for <b>Interaction</b> to multiple <b>InteractionProductCategory</b>.
     * 
     */
    @SerializedName("InteractionProductCategories")
    @JsonProperty("InteractionProductCategories")
    @ODataField(odataName = "InteractionProductCategories")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<InteractionProductCategory> toInteractionProductCategories;
    /**
     * Navigation property <b>InteractionDigitalAssets</b> for <b>Interaction</b> to multiple <b>InteractionDigitalAsset</b>.
     * 
     */
    @SerializedName("InteractionDigitalAssets")
    @JsonProperty("InteractionDigitalAssets")
    @ODataField(odataName = "InteractionDigitalAssets")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<InteractionDigitalAsset> toInteractionDigitalAssets;
    /**
     * Navigation property <b>InteractionOffers</b> for <b>Interaction</b> to multiple <b>InteractionOffer</b>.
     * 
     */
    @SerializedName("InteractionOffers")
    @JsonProperty("InteractionOffers")
    @ODataField(odataName = "InteractionOffers")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<InteractionOffer> toInteractionOffers;
    /**
     * Navigation property <b>InteractionAdditionalObjects</b> for <b>Interaction</b> to multiple <b>InteractionAdditionalObject</b>.
     * 
     */
    @SerializedName("InteractionAdditionalObjects")
    @JsonProperty("InteractionAdditionalObjects")
    @ODataField(odataName = "InteractionAdditionalObjects")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<InteractionAdditionalObject> toInteractionAdditionalObjects;
    /**
     * Navigation property <b>InteractionProducts</b> for <b>Interaction</b> to multiple <b>InteractionProduct</b>.
     * 
     */
    @SerializedName("InteractionProducts")
    @JsonProperty("InteractionProducts")
    @ODataField(odataName = "InteractionProducts")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<InteractionProduct> toInteractionProducts;
    /**
     * Navigation property <b>InteractionTags</b> for <b>Interaction</b> to multiple <b>InteractionTag</b>.
     * 
     */
    @SerializedName("InteractionTags")
    @JsonProperty("InteractionTags")
    @ODataField(odataName = "InteractionTags")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<InteractionTag> toInteractionTags;
    /**
     * Use with available fluent helpers to apply the <b>InteractionInterests</b> navigation property to query operations.
     * 
     */
    public final static InteractionLink<InteractionInterest> TO_INTERACTION_INTERESTS = new InteractionLink<InteractionInterest>("InteractionInterests");
    /**
     * Use with available fluent helpers to apply the <b>InteractionProductCategories</b> navigation property to query operations.
     * 
     */
    public final static InteractionLink<InteractionProductCategory> TO_INTERACTION_PRODUCT_CATEGORIES = new InteractionLink<InteractionProductCategory>("InteractionProductCategories");
    /**
     * Use with available fluent helpers to apply the <b>InteractionDigitalAssets</b> navigation property to query operations.
     * 
     */
    public final static InteractionLink<InteractionDigitalAsset> TO_INTERACTION_DIGITAL_ASSETS = new InteractionLink<InteractionDigitalAsset>("InteractionDigitalAssets");
    /**
     * Use with available fluent helpers to apply the <b>InteractionOffers</b> navigation property to query operations.
     * 
     */
    public final static InteractionLink<InteractionOffer> TO_INTERACTION_OFFERS = new InteractionLink<InteractionOffer>("InteractionOffers");
    /**
     * Use with available fluent helpers to apply the <b>InteractionAdditionalObjects</b> navigation property to query operations.
     * 
     */
    public final static InteractionLink<InteractionAdditionalObject> TO_INTERACTION_ADDITIONAL_OBJECTS = new InteractionLink<InteractionAdditionalObject>("InteractionAdditionalObjects");
    /**
     * Use with available fluent helpers to apply the <b>InteractionProducts</b> navigation property to query operations.
     * 
     */
    public final static InteractionLink<InteractionProduct> TO_INTERACTION_PRODUCTS = new InteractionLink<InteractionProduct>("InteractionProducts");
    /**
     * Use with available fluent helpers to apply the <b>InteractionTags</b> navigation property to query operations.
     * 
     */
    public final static InteractionLink<InteractionTag> TO_INTERACTION_TAGS = new InteractionLink<InteractionTag>("InteractionTags");

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public Class<Interaction> getType() {
        return Interaction.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionUUID</b></p>
     * 
     * @param interactionUUID
     *     UUID for API-Service
     */
    public void setInteractionUUID(
        @Nullable
        final UUID interactionUUID) {
        rememberChangedField("InteractionUUID", this.interactionUUID);
        this.interactionUUID = interactionUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>InteractionContactOrigin</b></p><p>The origin indicates the source of an ID. By defining the origin you determine that a contact with an ID associated to a source is eligible to be analyzed in SAP hybris Marketing RecommendationYou can maintain the origins to choose from in the Define Origins of Contact ID Customizing activity.For example, in a Web shop scenario, a consumer chooses a recommended product returned by SAP hybris Marketing Recommendation to examine the product details. This interaction can be considered for future recommendations.</p>
     * 
     * @param interactionContactOrigin
     *     This is the origin of the contact ID that is required to capture and query interactions.
     */
    public void setInteractionContactOrigin(
        @Nullable
        final String interactionContactOrigin) {
        rememberChangedField("InteractionContactOrigin", this.interactionContactOrigin);
        this.interactionContactOrigin = interactionContactOrigin;
    }

    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>InteractionContactId</b></p>
     * 
     * @param interactionContactId
     *     External ID of Interaction Contact Data
     */
    public void setInteractionContactId(
        @Nullable
        final String interactionContactId) {
        rememberChangedField("InteractionContactId", this.interactionContactId);
        this.interactionContactId = interactionContactId;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>CommunicationMedium</b></p>
     * 
     * @param communicationMedium
     *     Communication Medium
     */
    public void setCommunicationMedium(
        @Nullable
        final String communicationMedium) {
        rememberChangedField("CommunicationMedium", this.communicationMedium);
        this.communicationMedium = communicationMedium;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>InteractionType</b></p>
     * 
     * @param interactionType
     *     Interaction Type
     */
    public void setInteractionType(
        @Nullable
        final String interactionType) {
        rememberChangedField("InteractionType", this.interactionType);
        this.interactionType = interactionType;
    }

    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>InteractionTimeStampUTC</b></p>
     * 
     * @param interactionTimeStampUTC
     *     UTC Timestamp for API-Services
     */
    public void setInteractionTimeStampUTC(
        @Nullable
        final ZonedDateTime interactionTimeStampUTC) {
        rememberChangedField("InteractionTimeStampUTC", this.interactionTimeStampUTC);
        this.interactionTimeStampUTC = interactionTimeStampUTC;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>InteractionSourceObjectType</b></p>
     * 
     * @param interactionSourceObjectType
     *     Source Object Type for API-Service
     */
    public void setInteractionSourceObjectType(
        @Nullable
        final String interactionSourceObjectType) {
        rememberChangedField("InteractionSourceObjectType", this.interactionSourceObjectType);
        this.interactionSourceObjectType = interactionSourceObjectType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>InteractionSourceObject</b></p>
     * 
     * @param interactionSourceObject
     *     Source Object ID for API-Service
     */
    public void setInteractionSourceObject(
        @Nullable
        final String interactionSourceObject) {
        rememberChangedField("InteractionSourceObject", this.interactionSourceObject);
        this.interactionSourceObject = interactionSourceObject;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>MarketingArea</b></p><p>You use a marketing area to restrict the access to instances of an object, such as campaign, campaign content, content template, or target group.</p>
     * 
     * @param marketingArea
     *     Identifies an area of responsibility, or an organizational unit.
     */
    public void setMarketingArea(
        @Nullable
        final String marketingArea) {
        rememberChangedField("MarketingArea", this.marketingArea);
        this.marketingArea = marketingArea;
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
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>MarketingLocationOrigin</b></p>
     * 
     * @param marketingLocationOrigin
     *     Origin of Marketing Location
     */
    public void setMarketingLocationOrigin(
        @Nullable
        final String marketingLocationOrigin) {
        rememberChangedField("MarketingLocationOrigin", this.marketingLocationOrigin);
        this.marketingLocationOrigin = marketingLocationOrigin;
    }

    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>MarketingLocation</b></p>
     * 
     * @param marketingLocation
     *     Marketing Location ID
     */
    public void setMarketingLocation(
        @Nullable
        final String marketingLocation) {
        rememberChangedField("MarketingLocation", this.marketingLocation);
        this.marketingLocation = marketingLocation;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>DigitalAccountType</b></p>
     * 
     * @param digitalAccountType
     *     Digital Account Type
     */
    public void setDigitalAccountType(
        @Nullable
        final String digitalAccountType) {
        rememberChangedField("DigitalAccountType", this.digitalAccountType);
        this.digitalAccountType = digitalAccountType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>DigitalAccount</b></p>
     * 
     * @param digitalAccount
     *     Indicates the WeChat ID of a WeChat official account.
     */
    public void setDigitalAccount(
        @Nullable
        final String digitalAccount) {
        rememberChangedField("DigitalAccount", this.digitalAccount);
        this.digitalAccount = digitalAccount;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>MKT_AgreementOrigin</b></p><p>The agreement origin and the agreement external ID are semantic keys of an agreement and are used for external access.</p>
     * 
     * @param mKT_AgreementOrigin
     *     Shows the ID of the system, where the agreement was originally maintained.
     */
    public void setMKT_AgreementOrigin(
        @Nullable
        final String mKT_AgreementOrigin) {
        rememberChangedField("MKT_AgreementOrigin", this.mKT_AgreementOrigin);
        this.mKT_AgreementOrigin = mKT_AgreementOrigin;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>MKT_AgreementExternalID</b></p><p>The agreement origin and the agreement external ID are semantical keys for the agreement and are used for external access.</p>
     * 
     * @param mKT_AgreementExternalID
     *     Shows the ID of an agreement from the system, where it was originally maintained.
     */
    public void setMKT_AgreementExternalID(
        @Nullable
        final String mKT_AgreementExternalID) {
        rememberChangedField("MKT_AgreementExternalID", this.mKT_AgreementExternalID);
        this.mKT_AgreementExternalID = mKT_AgreementExternalID;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CampaignContent</b></p>
     * 
     * @param campaignContent
     *     Campaign Content ID for API-Service
     */
    public void setCampaignContent(
        @Nullable
        final Integer campaignContent) {
        rememberChangedField("CampaignContent", this.campaignContent);
        this.campaignContent = campaignContent;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionWeightingFactor</b></p>
     * 
     * @param interactionWeightingFactor
     *     Weighting Factor
     */
    public void setInteractionWeightingFactor(
        @Nullable
        final Short interactionWeightingFactor) {
        rememberChangedField("InteractionWeightingFactor", this.interactionWeightingFactor);
        this.interactionWeightingFactor = interactionWeightingFactor;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionSentimentValue</b></p>
     * 
     * @param interactionSentimentValue
     *     Sentiment
     */
    public void setInteractionSentimentValue(
        @Nullable
        final Short interactionSentimentValue) {
        rememberChangedField("InteractionSentimentValue", this.interactionSentimentValue);
        this.interactionSentimentValue = interactionSentimentValue;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>InteractionStatus</b></p>
     * 
     * @param interactionStatus
     *     Status for API-Services
     */
    public void setInteractionStatus(
        @Nullable
        final String interactionStatus) {
        rememberChangedField("InteractionStatus", this.interactionStatus);
        this.interactionStatus = interactionStatus;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>InteractionReason</b></p>
     * 
     * @param interactionReason
     *     Reason for API-Services
     */
    public void setInteractionReason(
        @Nullable
        final String interactionReason) {
        rememberChangedField("InteractionReason", this.interactionReason);
        this.interactionReason = interactionReason;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>InteractionLanguage</b></p><p>- the language in which texts are displayed,- the language in which you enter texts,- the language in which the system prints texts.</p>
     * 
     * @param interactionLanguage
     *     The language key indicates
     */
    public void setInteractionLanguage(
        @Nullable
        final String interactionLanguage) {
        rememberChangedField("InteractionLanguage", this.interactionLanguage);
        this.interactionLanguage = interactionLanguage;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionIsAnonymous</b></p>
     * 
     * @param interactionIsAnonymous
     *     Is Anonymous Indicator for API-Service
     */
    public void setInteractionIsAnonymous(
        @Nullable
        final Boolean interactionIsAnonymous) {
        rememberChangedField("InteractionIsAnonymous", this.interactionIsAnonymous);
        this.interactionIsAnonymous = interactionIsAnonymous;
    }

    /**
     * Constraints: Not nullable, Precision: 31, Scale: 14 <p>Original property name from the Odata EDM: <b>InteractionAmount</b></p>
     * 
     * @param interactionAmount
     *     Amount
     */
    public void setInteractionAmount(
        @Nullable
        final BigDecimal interactionAmount) {
        rememberChangedField("InteractionAmount", this.interactionAmount);
        this.interactionAmount = interactionAmount;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>InteractionCurrency</b></p>
     * 
     * @param interactionCurrency
     *     Currency Code
     */
    public void setInteractionCurrency(
        @Nullable
        final String interactionCurrency) {
        rememberChangedField("InteractionCurrency", this.interactionCurrency);
        this.interactionCurrency = interactionCurrency;
    }

    /**
     * Constraints: Not nullable, Precision: 21, Scale: 10 <p>Original property name from the Odata EDM: <b>InteractionLatitude</b></p>
     * 
     * @param interactionLatitude
     *     Latitude
     */
    public void setInteractionLatitude(
        @Nullable
        final BigDecimal interactionLatitude) {
        rememberChangedField("InteractionLatitude", this.interactionLatitude);
        this.interactionLatitude = interactionLatitude;
    }

    /**
     * Constraints: Not nullable, Precision: 21, Scale: 10 <p>Original property name from the Odata EDM: <b>InteractionLongitude</b></p>
     * 
     * @param interactionLongitude
     *     Longitude
     */
    public void setInteractionLongitude(
        @Nullable
        final BigDecimal interactionLongitude) {
        rememberChangedField("InteractionLongitude", this.interactionLongitude);
        this.interactionLongitude = interactionLongitude;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>SpatialReferenceSystem</b></p>
     * 
     * @param spatialReferenceSystem
     *     Spatial Reference Identifier
     */
    public void setSpatialReferenceSystem(
        @Nullable
        final String spatialReferenceSystem) {
        rememberChangedField("SpatialReferenceSystem", this.spatialReferenceSystem);
        this.spatialReferenceSystem = spatialReferenceSystem;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>DeviceType</b></p>
     * 
     * @param deviceType
     *     Device Type
     */
    public void setDeviceType(
        @Nullable
        final String deviceType) {
        rememberChangedField("DeviceType", this.deviceType);
        this.deviceType = deviceType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>InteractionDeviceName</b></p>
     * 
     * @param interactionDeviceName
     *     Device
     */
    public void setInteractionDeviceName(
        @Nullable
        final String interactionDeviceName) {
        rememberChangedField("InteractionDeviceName", this.interactionDeviceName);
        this.interactionDeviceName = interactionDeviceName;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PrecedingInteractionUUID</b></p>
     * 
     * @param precedingInteractionUUID
     *     Preceding Interaction UUID for API-Service
     */
    public void setPrecedingInteractionUUID(
        @Nullable
        final UUID precedingInteractionUUID) {
        rememberChangedField("PrecedingInteractionUUID", this.precedingInteractionUUID);
        this.precedingInteractionUUID = precedingInteractionUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>SourceSystemType</b></p><p>Identifies the type of system the interaction occured in.</p>
     * 
     * @param sourceSystemType
     *     A source system type, for example, a Web shop or a register.
     */
    public void setSourceSystemType(
        @Nullable
        final String sourceSystemType) {
        rememberChangedField("SourceSystemType", this.sourceSystemType);
        this.sourceSystemType = sourceSystemType;
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
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>InteractionSourceObjectAddlID</b></p>
     * 
     * @param interactionSourceObjectAddlID
     *     Additional Source Object ID for API-Service
     */
    public void setInteractionSourceObjectAddlID(
        @Nullable
        final String interactionSourceObjectAddlID) {
        rememberChangedField("InteractionSourceObjectAddlID", this.interactionSourceObjectAddlID);
        this.interactionSourceObjectAddlID = interactionSourceObjectAddlID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>InteractionSourceObjectStatus</b></p>
     * 
     * @param interactionSourceObjectStatus
     *     Business Document Status Code
     */
    public void setInteractionSourceObjectStatus(
        @Nullable
        final String interactionSourceObjectStatus) {
        rememberChangedField("InteractionSourceObjectStatus", this.interactionSourceObjectStatus);
        this.interactionSourceObjectStatus = interactionSourceObjectStatus;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionSourceDataURL</b></p>
     * 
     * @param interactionSourceDataURL
     *     Source Data URL for API-Services
     */
    public void setInteractionSourceDataURL(
        @Nullable
        final String interactionSourceDataURL) {
        rememberChangedField("InteractionSourceDataURL", this.interactionSourceDataURL);
        this.interactionSourceDataURL = interactionSourceDataURL;
    }

    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>InteractionSourceTimeStampUTC</b></p>
     * 
     * @param interactionSourceTimeStampUTC
     *     Source UTC Timestamp in Long Form
     */
    public void setInteractionSourceTimeStampUTC(
        @Nullable
        final ZonedDateTime interactionSourceTimeStampUTC) {
        rememberChangedField("InteractionSourceTimeStampUTC", this.interactionSourceTimeStampUTC);
        this.interactionSourceTimeStampUTC = interactionSourceTimeStampUTC;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CampaignContentLinkURL</b></p>
     * 
     * @param campaignContentLinkURL
     *     Campaign Content Link URL for API-Services
     */
    public void setCampaignContentLinkURL(
        @Nullable
        final String campaignContentLinkURL) {
        rememberChangedField("CampaignContentLinkURL", this.campaignContentLinkURL);
        this.campaignContentLinkURL = campaignContentLinkURL;
    }

    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>CampaignContentLinkName</b></p>
     * 
     * @param campaignContentLinkName
     *     Campaign Content Link Text for API-Service
     */
    public void setCampaignContentLinkName(
        @Nullable
        final String campaignContentLinkName) {
        rememberChangedField("CampaignContentLinkName", this.campaignContentLinkName);
        this.campaignContentLinkName = campaignContentLinkName;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionContactUUID</b></p>
     * 
     * @param interactionContactUUID
     *     Interaction Contact UUID for API-Service
     */
    public void setInteractionContactUUID(
        @Nullable
        final UUID interactionContactUUID) {
        rememberChangedField("InteractionContactUUID", this.interactionContactUUID);
        this.interactionContactUUID = interactionContactUUID;
    }

    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>InteractionLastChangedDateTime</b></p>
     * 
     * @param interactionLastChangedDateTime
     *     Last Change Date Time for API-Service
     */
    public void setInteractionLastChangedDateTime(
        @Nullable
        final ZonedDateTime interactionLastChangedDateTime) {
        rememberChangedField("InteractionLastChangedDateTime", this.interactionLastChangedDateTime);
        this.interactionLastChangedDateTime = interactionLastChangedDateTime;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>InteractionLastChangedByUser</b></p>
     * 
     * @param interactionLastChangedByUser
     *     Last Changed By User for API-Service
     */
    public void setInteractionLastChangedByUser(
        @Nullable
        final String interactionLastChangedByUser) {
        rememberChangedField("InteractionLastChangedByUser", this.interactionLastChangedByUser);
        this.interactionLastChangedByUser = interactionLastChangedByUser;
    }

    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>InteractionContentSubject</b></p>
     * 
     * @param interactionContentSubject
     *     Interaction Content Subject
     */
    public void setInteractionContentSubject(
        @Nullable
        final String interactionContentSubject) {
        rememberChangedField("InteractionContentSubject", this.interactionContentSubject);
        this.interactionContentSubject = interactionContentSubject;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InteractionContent</b></p>
     * 
     * @param interactionContent
     *     Interaction Content
     */
    public void setInteractionContent(
        @Nullable
        final String interactionContent) {
        rememberChangedField("InteractionContent", this.interactionContent);
        this.interactionContent = interactionContent;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_MKT_INTERACTION_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "Interactions";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("InteractionUUID", getInteractionUUID());
        return result;
    }

    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("InteractionUUID", getInteractionUUID());
        values.put("InteractionContactOrigin", getInteractionContactOrigin());
        values.put("InteractionContactId", getInteractionContactId());
        values.put("CommunicationMedium", getCommunicationMedium());
        values.put("InteractionType", getInteractionType());
        values.put("InteractionTimeStampUTC", getInteractionTimeStampUTC());
        values.put("InteractionSourceObjectType", getInteractionSourceObjectType());
        values.put("InteractionSourceObject", getInteractionSourceObject());
        values.put("MarketingArea", getMarketingArea());
        values.put("CampaignID", getCampaignID());
        values.put("MarketingLocationOrigin", getMarketingLocationOrigin());
        values.put("MarketingLocation", getMarketingLocation());
        values.put("DigitalAccountType", getDigitalAccountType());
        values.put("DigitalAccount", getDigitalAccount());
        values.put("MKT_AgreementOrigin", getMKT_AgreementOrigin());
        values.put("MKT_AgreementExternalID", getMKT_AgreementExternalID());
        values.put("CampaignContent", getCampaignContent());
        values.put("InteractionWeightingFactor", getInteractionWeightingFactor());
        values.put("InteractionSentimentValue", getInteractionSentimentValue());
        values.put("InteractionStatus", getInteractionStatus());
        values.put("InteractionReason", getInteractionReason());
        values.put("InteractionLanguage", getInteractionLanguage());
        values.put("InteractionIsAnonymous", getInteractionIsAnonymous());
        values.put("InteractionAmount", getInteractionAmount());
        values.put("InteractionCurrency", getInteractionCurrency());
        values.put("InteractionLatitude", getInteractionLatitude());
        values.put("InteractionLongitude", getInteractionLongitude());
        values.put("SpatialReferenceSystem", getSpatialReferenceSystem());
        values.put("DeviceType", getDeviceType());
        values.put("InteractionDeviceName", getInteractionDeviceName());
        values.put("PrecedingInteractionUUID", getPrecedingInteractionUUID());
        values.put("SourceSystemType", getSourceSystemType());
        values.put("SourceSystem", getSourceSystem());
        values.put("InteractionSourceObjectAddlID", getInteractionSourceObjectAddlID());
        values.put("InteractionSourceObjectStatus", getInteractionSourceObjectStatus());
        values.put("InteractionSourceDataURL", getInteractionSourceDataURL());
        values.put("InteractionSourceTimeStampUTC", getInteractionSourceTimeStampUTC());
        values.put("CampaignContentLinkURL", getCampaignContentLinkURL());
        values.put("CampaignContentLinkName", getCampaignContentLinkName());
        values.put("InteractionContactUUID", getInteractionContactUUID());
        values.put("InteractionLastChangedDateTime", getInteractionLastChangedDateTime());
        values.put("InteractionLastChangedByUser", getInteractionLastChangedByUser());
        values.put("InteractionContentSubject", getInteractionContentSubject());
        values.put("InteractionContent", getInteractionContent());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("InteractionUUID")) {
                final Object value = values.remove("InteractionUUID");
                if ((value == null)||(!value.equals(getInteractionUUID()))) {
                    setInteractionUUID(((UUID) value));
                }
            }
            if (values.containsKey("InteractionContactOrigin")) {
                final Object value = values.remove("InteractionContactOrigin");
                if ((value == null)||(!value.equals(getInteractionContactOrigin()))) {
                    setInteractionContactOrigin(((String) value));
                }
            }
            if (values.containsKey("InteractionContactId")) {
                final Object value = values.remove("InteractionContactId");
                if ((value == null)||(!value.equals(getInteractionContactId()))) {
                    setInteractionContactId(((String) value));
                }
            }
            if (values.containsKey("CommunicationMedium")) {
                final Object value = values.remove("CommunicationMedium");
                if ((value == null)||(!value.equals(getCommunicationMedium()))) {
                    setCommunicationMedium(((String) value));
                }
            }
            if (values.containsKey("InteractionType")) {
                final Object value = values.remove("InteractionType");
                if ((value == null)||(!value.equals(getInteractionType()))) {
                    setInteractionType(((String) value));
                }
            }
            if (values.containsKey("InteractionTimeStampUTC")) {
                final Object value = values.remove("InteractionTimeStampUTC");
                if ((value == null)||(!value.equals(getInteractionTimeStampUTC()))) {
                    setInteractionTimeStampUTC(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("InteractionSourceObjectType")) {
                final Object value = values.remove("InteractionSourceObjectType");
                if ((value == null)||(!value.equals(getInteractionSourceObjectType()))) {
                    setInteractionSourceObjectType(((String) value));
                }
            }
            if (values.containsKey("InteractionSourceObject")) {
                final Object value = values.remove("InteractionSourceObject");
                if ((value == null)||(!value.equals(getInteractionSourceObject()))) {
                    setInteractionSourceObject(((String) value));
                }
            }
            if (values.containsKey("MarketingArea")) {
                final Object value = values.remove("MarketingArea");
                if ((value == null)||(!value.equals(getMarketingArea()))) {
                    setMarketingArea(((String) value));
                }
            }
            if (values.containsKey("CampaignID")) {
                final Object value = values.remove("CampaignID");
                if ((value == null)||(!value.equals(getCampaignID()))) {
                    setCampaignID(((String) value));
                }
            }
            if (values.containsKey("MarketingLocationOrigin")) {
                final Object value = values.remove("MarketingLocationOrigin");
                if ((value == null)||(!value.equals(getMarketingLocationOrigin()))) {
                    setMarketingLocationOrigin(((String) value));
                }
            }
            if (values.containsKey("MarketingLocation")) {
                final Object value = values.remove("MarketingLocation");
                if ((value == null)||(!value.equals(getMarketingLocation()))) {
                    setMarketingLocation(((String) value));
                }
            }
            if (values.containsKey("DigitalAccountType")) {
                final Object value = values.remove("DigitalAccountType");
                if ((value == null)||(!value.equals(getDigitalAccountType()))) {
                    setDigitalAccountType(((String) value));
                }
            }
            if (values.containsKey("DigitalAccount")) {
                final Object value = values.remove("DigitalAccount");
                if ((value == null)||(!value.equals(getDigitalAccount()))) {
                    setDigitalAccount(((String) value));
                }
            }
            if (values.containsKey("MKT_AgreementOrigin")) {
                final Object value = values.remove("MKT_AgreementOrigin");
                if ((value == null)||(!value.equals(getMKT_AgreementOrigin()))) {
                    setMKT_AgreementOrigin(((String) value));
                }
            }
            if (values.containsKey("MKT_AgreementExternalID")) {
                final Object value = values.remove("MKT_AgreementExternalID");
                if ((value == null)||(!value.equals(getMKT_AgreementExternalID()))) {
                    setMKT_AgreementExternalID(((String) value));
                }
            }
            if (values.containsKey("CampaignContent")) {
                final Object value = values.remove("CampaignContent");
                if ((value == null)||(!value.equals(getCampaignContent()))) {
                    setCampaignContent(((Integer) value));
                }
            }
            if (values.containsKey("InteractionWeightingFactor")) {
                final Object value = values.remove("InteractionWeightingFactor");
                if ((value == null)||(!value.equals(getInteractionWeightingFactor()))) {
                    setInteractionWeightingFactor(((Short) value));
                }
            }
            if (values.containsKey("InteractionSentimentValue")) {
                final Object value = values.remove("InteractionSentimentValue");
                if ((value == null)||(!value.equals(getInteractionSentimentValue()))) {
                    setInteractionSentimentValue(((Short) value));
                }
            }
            if (values.containsKey("InteractionStatus")) {
                final Object value = values.remove("InteractionStatus");
                if ((value == null)||(!value.equals(getInteractionStatus()))) {
                    setInteractionStatus(((String) value));
                }
            }
            if (values.containsKey("InteractionReason")) {
                final Object value = values.remove("InteractionReason");
                if ((value == null)||(!value.equals(getInteractionReason()))) {
                    setInteractionReason(((String) value));
                }
            }
            if (values.containsKey("InteractionLanguage")) {
                final Object value = values.remove("InteractionLanguage");
                if ((value == null)||(!value.equals(getInteractionLanguage()))) {
                    setInteractionLanguage(((String) value));
                }
            }
            if (values.containsKey("InteractionIsAnonymous")) {
                final Object value = values.remove("InteractionIsAnonymous");
                if ((value == null)||(!value.equals(getInteractionIsAnonymous()))) {
                    setInteractionIsAnonymous(((Boolean) value));
                }
            }
            if (values.containsKey("InteractionAmount")) {
                final Object value = values.remove("InteractionAmount");
                if ((value == null)||(!value.equals(getInteractionAmount()))) {
                    setInteractionAmount(((BigDecimal) value));
                }
            }
            if (values.containsKey("InteractionCurrency")) {
                final Object value = values.remove("InteractionCurrency");
                if ((value == null)||(!value.equals(getInteractionCurrency()))) {
                    setInteractionCurrency(((String) value));
                }
            }
            if (values.containsKey("InteractionLatitude")) {
                final Object value = values.remove("InteractionLatitude");
                if ((value == null)||(!value.equals(getInteractionLatitude()))) {
                    setInteractionLatitude(((BigDecimal) value));
                }
            }
            if (values.containsKey("InteractionLongitude")) {
                final Object value = values.remove("InteractionLongitude");
                if ((value == null)||(!value.equals(getInteractionLongitude()))) {
                    setInteractionLongitude(((BigDecimal) value));
                }
            }
            if (values.containsKey("SpatialReferenceSystem")) {
                final Object value = values.remove("SpatialReferenceSystem");
                if ((value == null)||(!value.equals(getSpatialReferenceSystem()))) {
                    setSpatialReferenceSystem(((String) value));
                }
            }
            if (values.containsKey("DeviceType")) {
                final Object value = values.remove("DeviceType");
                if ((value == null)||(!value.equals(getDeviceType()))) {
                    setDeviceType(((String) value));
                }
            }
            if (values.containsKey("InteractionDeviceName")) {
                final Object value = values.remove("InteractionDeviceName");
                if ((value == null)||(!value.equals(getInteractionDeviceName()))) {
                    setInteractionDeviceName(((String) value));
                }
            }
            if (values.containsKey("PrecedingInteractionUUID")) {
                final Object value = values.remove("PrecedingInteractionUUID");
                if ((value == null)||(!value.equals(getPrecedingInteractionUUID()))) {
                    setPrecedingInteractionUUID(((UUID) value));
                }
            }
            if (values.containsKey("SourceSystemType")) {
                final Object value = values.remove("SourceSystemType");
                if ((value == null)||(!value.equals(getSourceSystemType()))) {
                    setSourceSystemType(((String) value));
                }
            }
            if (values.containsKey("SourceSystem")) {
                final Object value = values.remove("SourceSystem");
                if ((value == null)||(!value.equals(getSourceSystem()))) {
                    setSourceSystem(((String) value));
                }
            }
            if (values.containsKey("InteractionSourceObjectAddlID")) {
                final Object value = values.remove("InteractionSourceObjectAddlID");
                if ((value == null)||(!value.equals(getInteractionSourceObjectAddlID()))) {
                    setInteractionSourceObjectAddlID(((String) value));
                }
            }
            if (values.containsKey("InteractionSourceObjectStatus")) {
                final Object value = values.remove("InteractionSourceObjectStatus");
                if ((value == null)||(!value.equals(getInteractionSourceObjectStatus()))) {
                    setInteractionSourceObjectStatus(((String) value));
                }
            }
            if (values.containsKey("InteractionSourceDataURL")) {
                final Object value = values.remove("InteractionSourceDataURL");
                if ((value == null)||(!value.equals(getInteractionSourceDataURL()))) {
                    setInteractionSourceDataURL(((String) value));
                }
            }
            if (values.containsKey("InteractionSourceTimeStampUTC")) {
                final Object value = values.remove("InteractionSourceTimeStampUTC");
                if ((value == null)||(!value.equals(getInteractionSourceTimeStampUTC()))) {
                    setInteractionSourceTimeStampUTC(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("CampaignContentLinkURL")) {
                final Object value = values.remove("CampaignContentLinkURL");
                if ((value == null)||(!value.equals(getCampaignContentLinkURL()))) {
                    setCampaignContentLinkURL(((String) value));
                }
            }
            if (values.containsKey("CampaignContentLinkName")) {
                final Object value = values.remove("CampaignContentLinkName");
                if ((value == null)||(!value.equals(getCampaignContentLinkName()))) {
                    setCampaignContentLinkName(((String) value));
                }
            }
            if (values.containsKey("InteractionContactUUID")) {
                final Object value = values.remove("InteractionContactUUID");
                if ((value == null)||(!value.equals(getInteractionContactUUID()))) {
                    setInteractionContactUUID(((UUID) value));
                }
            }
            if (values.containsKey("InteractionLastChangedDateTime")) {
                final Object value = values.remove("InteractionLastChangedDateTime");
                if ((value == null)||(!value.equals(getInteractionLastChangedDateTime()))) {
                    setInteractionLastChangedDateTime(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("InteractionLastChangedByUser")) {
                final Object value = values.remove("InteractionLastChangedByUser");
                if ((value == null)||(!value.equals(getInteractionLastChangedByUser()))) {
                    setInteractionLastChangedByUser(((String) value));
                }
            }
            if (values.containsKey("InteractionContentSubject")) {
                final Object value = values.remove("InteractionContentSubject");
                if ((value == null)||(!value.equals(getInteractionContentSubject()))) {
                    setInteractionContentSubject(((String) value));
                }
            }
            if (values.containsKey("InteractionContent")) {
                final Object value = values.remove("InteractionContent");
                if ((value == null)||(!value.equals(getInteractionContent()))) {
                    setInteractionContent(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("InteractionInterests")) {
                final Object value = (values).remove("InteractionInterests");
                if (value instanceof Iterable) {
                    if (toInteractionInterests == null) {
                        toInteractionInterests = Lists.newArrayList();
                    } else {
                        toInteractionInterests = Lists.newArrayList(toInteractionInterests);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        InteractionInterest entity;
                        if (toInteractionInterests.size()>i) {
                            entity = toInteractionInterests.get(i);
                        } else {
                            entity = new InteractionInterest();
                            toInteractionInterests.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("InteractionProductCategories")) {
                final Object value = (values).remove("InteractionProductCategories");
                if (value instanceof Iterable) {
                    if (toInteractionProductCategories == null) {
                        toInteractionProductCategories = Lists.newArrayList();
                    } else {
                        toInteractionProductCategories = Lists.newArrayList(toInteractionProductCategories);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        InteractionProductCategory entity;
                        if (toInteractionProductCategories.size()>i) {
                            entity = toInteractionProductCategories.get(i);
                        } else {
                            entity = new InteractionProductCategory();
                            toInteractionProductCategories.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("InteractionDigitalAssets")) {
                final Object value = (values).remove("InteractionDigitalAssets");
                if (value instanceof Iterable) {
                    if (toInteractionDigitalAssets == null) {
                        toInteractionDigitalAssets = Lists.newArrayList();
                    } else {
                        toInteractionDigitalAssets = Lists.newArrayList(toInteractionDigitalAssets);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        InteractionDigitalAsset entity;
                        if (toInteractionDigitalAssets.size()>i) {
                            entity = toInteractionDigitalAssets.get(i);
                        } else {
                            entity = new InteractionDigitalAsset();
                            toInteractionDigitalAssets.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("InteractionOffers")) {
                final Object value = (values).remove("InteractionOffers");
                if (value instanceof Iterable) {
                    if (toInteractionOffers == null) {
                        toInteractionOffers = Lists.newArrayList();
                    } else {
                        toInteractionOffers = Lists.newArrayList(toInteractionOffers);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        InteractionOffer entity;
                        if (toInteractionOffers.size()>i) {
                            entity = toInteractionOffers.get(i);
                        } else {
                            entity = new InteractionOffer();
                            toInteractionOffers.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("InteractionAdditionalObjects")) {
                final Object value = (values).remove("InteractionAdditionalObjects");
                if (value instanceof Iterable) {
                    if (toInteractionAdditionalObjects == null) {
                        toInteractionAdditionalObjects = Lists.newArrayList();
                    } else {
                        toInteractionAdditionalObjects = Lists.newArrayList(toInteractionAdditionalObjects);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        InteractionAdditionalObject entity;
                        if (toInteractionAdditionalObjects.size()>i) {
                            entity = toInteractionAdditionalObjects.get(i);
                        } else {
                            entity = new InteractionAdditionalObject();
                            toInteractionAdditionalObjects.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("InteractionProducts")) {
                final Object value = (values).remove("InteractionProducts");
                if (value instanceof Iterable) {
                    if (toInteractionProducts == null) {
                        toInteractionProducts = Lists.newArrayList();
                    } else {
                        toInteractionProducts = Lists.newArrayList(toInteractionProducts);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        InteractionProduct entity;
                        if (toInteractionProducts.size()>i) {
                            entity = toInteractionProducts.get(i);
                        } else {
                            entity = new InteractionProduct();
                            toInteractionProducts.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("InteractionTags")) {
                final Object value = (values).remove("InteractionTags");
                if (value instanceof Iterable) {
                    if (toInteractionTags == null) {
                        toInteractionTags = Lists.newArrayList();
                    } else {
                        toInteractionTags = Lists.newArrayList(toInteractionTags);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        InteractionTag entity;
                        if (toInteractionTags.size()>i) {
                            entity = toInteractionTags.get(i);
                        } else {
                            entity = new InteractionTag();
                            toInteractionTags.add(entity);
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
    public static<T >InteractionField<T> field(final String fieldName, final Class<T> fieldType) {
        return new InteractionField<T>(fieldName);
    }

    @Override
    protected Map<String, Object> toMapOfNavigationProperties() {
        final Map<String, Object> values = super.toMapOfNavigationProperties();
        if (toInteractionInterests!= null) {
            (values).put("InteractionInterests", toInteractionInterests);
        }
        if (toInteractionProductCategories!= null) {
            (values).put("InteractionProductCategories", toInteractionProductCategories);
        }
        if (toInteractionDigitalAssets!= null) {
            (values).put("InteractionDigitalAssets", toInteractionDigitalAssets);
        }
        if (toInteractionOffers!= null) {
            (values).put("InteractionOffers", toInteractionOffers);
        }
        if (toInteractionAdditionalObjects!= null) {
            (values).put("InteractionAdditionalObjects", toInteractionAdditionalObjects);
        }
        if (toInteractionProducts!= null) {
            (values).put("InteractionProducts", toInteractionProducts);
        }
        if (toInteractionTags!= null) {
            (values).put("InteractionTags", toInteractionTags);
        }
        return values;
    }

    /**
     * Fetches the <b>InteractionInterest</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>InteractionInterests</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>InteractionInterest</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<InteractionInterest> fetchInteractionInterests()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type InteractionInterest.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("InteractionUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(interactionUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("InteractionInterests");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<InteractionInterest> entityList = result.asList(InteractionInterest.class);
        for (InteractionInterest entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>InteractionInterest</b> entities (one to many). This corresponds to the OData navigation property <b>InteractionInterests</b>.
     * <p>
     * If the navigation property <b>InteractionInterests</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>InteractionInterest</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<InteractionInterest> getInteractionInterestsOrFetch()
        throws ODataException
    {
        if (toInteractionInterests == null) {
            toInteractionInterests = fetchInteractionInterests();
        }
        return toInteractionInterests;
    }

    /**
     * Retrieval of associated <b>InteractionInterest</b> entities (one to many). This corresponds to the OData navigation property <b>InteractionInterests</b>.
     * <p>
     * If the navigation property for an entity <b>Interaction</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>InteractionInterests</b> is already loaded, the result will contain the <b>InteractionInterest</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    public Optional<List<InteractionInterest>> getInteractionInterestsIfPresent() {
        return Optional.ofNullable(toInteractionInterests);
    }

    /**
     * Overwrites the list of associated <b>InteractionInterest</b> entities for the loaded navigation property <b>InteractionInterests</b>.
     * <p>
     * If the navigation property <b>InteractionInterests</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>InteractionInterest</b> entities.
     */
    public void setInteractionInterests(
        @NonNull
        final List<InteractionInterest> value) {
        if (toInteractionInterests == null) {
            toInteractionInterests = Lists.newArrayList();
        }
        toInteractionInterests.clear();
        toInteractionInterests.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>InteractionInterest</b> entities. This corresponds to the OData navigation property <b>InteractionInterests</b>.
     * <p>
     * If the navigation property <b>InteractionInterests</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>InteractionInterest</b> entities.
     */
    public void addInteractionInterests(InteractionInterest... entity) {
        if (toInteractionInterests == null) {
            toInteractionInterests = Lists.newArrayList();
        }
        toInteractionInterests.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>InteractionProductCategory</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>InteractionProductCategories</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>InteractionProductCategory</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<InteractionProductCategory> fetchInteractionProductCategories()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type InteractionProductCategory.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("InteractionUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(interactionUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("InteractionProductCategories");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<InteractionProductCategory> entityList = result.asList(InteractionProductCategory.class);
        for (InteractionProductCategory entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>InteractionProductCategory</b> entities (one to many). This corresponds to the OData navigation property <b>InteractionProductCategories</b>.
     * <p>
     * If the navigation property <b>InteractionProductCategories</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>InteractionProductCategory</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<InteractionProductCategory> getInteractionProductCategoriesOrFetch()
        throws ODataException
    {
        if (toInteractionProductCategories == null) {
            toInteractionProductCategories = fetchInteractionProductCategories();
        }
        return toInteractionProductCategories;
    }

    /**
     * Retrieval of associated <b>InteractionProductCategory</b> entities (one to many). This corresponds to the OData navigation property <b>InteractionProductCategories</b>.
     * <p>
     * If the navigation property for an entity <b>Interaction</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>InteractionProductCategories</b> is already loaded, the result will contain the <b>InteractionProductCategory</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    public Optional<List<InteractionProductCategory>> getInteractionProductCategoriesIfPresent() {
        return Optional.ofNullable(toInteractionProductCategories);
    }

    /**
     * Overwrites the list of associated <b>InteractionProductCategory</b> entities for the loaded navigation property <b>InteractionProductCategories</b>.
     * <p>
     * If the navigation property <b>InteractionProductCategories</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>InteractionProductCategory</b> entities.
     */
    public void setInteractionProductCategories(
        @NonNull
        final List<InteractionProductCategory> value) {
        if (toInteractionProductCategories == null) {
            toInteractionProductCategories = Lists.newArrayList();
        }
        toInteractionProductCategories.clear();
        toInteractionProductCategories.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>InteractionProductCategory</b> entities. This corresponds to the OData navigation property <b>InteractionProductCategories</b>.
     * <p>
     * If the navigation property <b>InteractionProductCategories</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>InteractionProductCategory</b> entities.
     */
    public void addInteractionProductCategories(InteractionProductCategory... entity) {
        if (toInteractionProductCategories == null) {
            toInteractionProductCategories = Lists.newArrayList();
        }
        toInteractionProductCategories.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>InteractionDigitalAsset</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>InteractionDigitalAssets</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>InteractionDigitalAsset</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<InteractionDigitalAsset> fetchInteractionDigitalAssets()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type InteractionDigitalAsset.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("InteractionUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(interactionUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("InteractionDigitalAssets");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<InteractionDigitalAsset> entityList = result.asList(InteractionDigitalAsset.class);
        for (InteractionDigitalAsset entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>InteractionDigitalAsset</b> entities (one to many). This corresponds to the OData navigation property <b>InteractionDigitalAssets</b>.
     * <p>
     * If the navigation property <b>InteractionDigitalAssets</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>InteractionDigitalAsset</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<InteractionDigitalAsset> getInteractionDigitalAssetsOrFetch()
        throws ODataException
    {
        if (toInteractionDigitalAssets == null) {
            toInteractionDigitalAssets = fetchInteractionDigitalAssets();
        }
        return toInteractionDigitalAssets;
    }

    /**
     * Retrieval of associated <b>InteractionDigitalAsset</b> entities (one to many). This corresponds to the OData navigation property <b>InteractionDigitalAssets</b>.
     * <p>
     * If the navigation property for an entity <b>Interaction</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>InteractionDigitalAssets</b> is already loaded, the result will contain the <b>InteractionDigitalAsset</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    public Optional<List<InteractionDigitalAsset>> getInteractionDigitalAssetsIfPresent() {
        return Optional.ofNullable(toInteractionDigitalAssets);
    }

    /**
     * Overwrites the list of associated <b>InteractionDigitalAsset</b> entities for the loaded navigation property <b>InteractionDigitalAssets</b>.
     * <p>
     * If the navigation property <b>InteractionDigitalAssets</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>InteractionDigitalAsset</b> entities.
     */
    public void setInteractionDigitalAssets(
        @NonNull
        final List<InteractionDigitalAsset> value) {
        if (toInteractionDigitalAssets == null) {
            toInteractionDigitalAssets = Lists.newArrayList();
        }
        toInteractionDigitalAssets.clear();
        toInteractionDigitalAssets.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>InteractionDigitalAsset</b> entities. This corresponds to the OData navigation property <b>InteractionDigitalAssets</b>.
     * <p>
     * If the navigation property <b>InteractionDigitalAssets</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>InteractionDigitalAsset</b> entities.
     */
    public void addInteractionDigitalAssets(InteractionDigitalAsset... entity) {
        if (toInteractionDigitalAssets == null) {
            toInteractionDigitalAssets = Lists.newArrayList();
        }
        toInteractionDigitalAssets.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>InteractionOffer</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>InteractionOffers</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>InteractionOffer</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<InteractionOffer> fetchInteractionOffers()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type InteractionOffer.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("InteractionUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(interactionUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("InteractionOffers");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<InteractionOffer> entityList = result.asList(InteractionOffer.class);
        for (InteractionOffer entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>InteractionOffer</b> entities (one to many). This corresponds to the OData navigation property <b>InteractionOffers</b>.
     * <p>
     * If the navigation property <b>InteractionOffers</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>InteractionOffer</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<InteractionOffer> getInteractionOffersOrFetch()
        throws ODataException
    {
        if (toInteractionOffers == null) {
            toInteractionOffers = fetchInteractionOffers();
        }
        return toInteractionOffers;
    }

    /**
     * Retrieval of associated <b>InteractionOffer</b> entities (one to many). This corresponds to the OData navigation property <b>InteractionOffers</b>.
     * <p>
     * If the navigation property for an entity <b>Interaction</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>InteractionOffers</b> is already loaded, the result will contain the <b>InteractionOffer</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    public Optional<List<InteractionOffer>> getInteractionOffersIfPresent() {
        return Optional.ofNullable(toInteractionOffers);
    }

    /**
     * Overwrites the list of associated <b>InteractionOffer</b> entities for the loaded navigation property <b>InteractionOffers</b>.
     * <p>
     * If the navigation property <b>InteractionOffers</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>InteractionOffer</b> entities.
     */
    public void setInteractionOffers(
        @NonNull
        final List<InteractionOffer> value) {
        if (toInteractionOffers == null) {
            toInteractionOffers = Lists.newArrayList();
        }
        toInteractionOffers.clear();
        toInteractionOffers.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>InteractionOffer</b> entities. This corresponds to the OData navigation property <b>InteractionOffers</b>.
     * <p>
     * If the navigation property <b>InteractionOffers</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>InteractionOffer</b> entities.
     */
    public void addInteractionOffers(InteractionOffer... entity) {
        if (toInteractionOffers == null) {
            toInteractionOffers = Lists.newArrayList();
        }
        toInteractionOffers.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>InteractionAdditionalObject</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>InteractionAdditionalObjects</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>InteractionAdditionalObject</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<InteractionAdditionalObject> fetchInteractionAdditionalObjects()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type InteractionAdditionalObject.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("InteractionUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(interactionUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("InteractionAdditionalObjects");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<InteractionAdditionalObject> entityList = result.asList(InteractionAdditionalObject.class);
        for (InteractionAdditionalObject entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>InteractionAdditionalObject</b> entities (one to many). This corresponds to the OData navigation property <b>InteractionAdditionalObjects</b>.
     * <p>
     * If the navigation property <b>InteractionAdditionalObjects</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>InteractionAdditionalObject</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<InteractionAdditionalObject> getInteractionAdditionalObjectsOrFetch()
        throws ODataException
    {
        if (toInteractionAdditionalObjects == null) {
            toInteractionAdditionalObjects = fetchInteractionAdditionalObjects();
        }
        return toInteractionAdditionalObjects;
    }

    /**
     * Retrieval of associated <b>InteractionAdditionalObject</b> entities (one to many). This corresponds to the OData navigation property <b>InteractionAdditionalObjects</b>.
     * <p>
     * If the navigation property for an entity <b>Interaction</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>InteractionAdditionalObjects</b> is already loaded, the result will contain the <b>InteractionAdditionalObject</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    public Optional<List<InteractionAdditionalObject>> getInteractionAdditionalObjectsIfPresent() {
        return Optional.ofNullable(toInteractionAdditionalObjects);
    }

    /**
     * Overwrites the list of associated <b>InteractionAdditionalObject</b> entities for the loaded navigation property <b>InteractionAdditionalObjects</b>.
     * <p>
     * If the navigation property <b>InteractionAdditionalObjects</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>InteractionAdditionalObject</b> entities.
     */
    public void setInteractionAdditionalObjects(
        @NonNull
        final List<InteractionAdditionalObject> value) {
        if (toInteractionAdditionalObjects == null) {
            toInteractionAdditionalObjects = Lists.newArrayList();
        }
        toInteractionAdditionalObjects.clear();
        toInteractionAdditionalObjects.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>InteractionAdditionalObject</b> entities. This corresponds to the OData navigation property <b>InteractionAdditionalObjects</b>.
     * <p>
     * If the navigation property <b>InteractionAdditionalObjects</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>InteractionAdditionalObject</b> entities.
     */
    public void addInteractionAdditionalObjects(InteractionAdditionalObject... entity) {
        if (toInteractionAdditionalObjects == null) {
            toInteractionAdditionalObjects = Lists.newArrayList();
        }
        toInteractionAdditionalObjects.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>InteractionProduct</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>InteractionProducts</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>InteractionProduct</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<InteractionProduct> fetchInteractionProducts()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type InteractionProduct.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("InteractionUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(interactionUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("InteractionProducts");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<InteractionProduct> entityList = result.asList(InteractionProduct.class);
        for (InteractionProduct entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>InteractionProduct</b> entities (one to many). This corresponds to the OData navigation property <b>InteractionProducts</b>.
     * <p>
     * If the navigation property <b>InteractionProducts</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>InteractionProduct</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<InteractionProduct> getInteractionProductsOrFetch()
        throws ODataException
    {
        if (toInteractionProducts == null) {
            toInteractionProducts = fetchInteractionProducts();
        }
        return toInteractionProducts;
    }

    /**
     * Retrieval of associated <b>InteractionProduct</b> entities (one to many). This corresponds to the OData navigation property <b>InteractionProducts</b>.
     * <p>
     * If the navigation property for an entity <b>Interaction</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>InteractionProducts</b> is already loaded, the result will contain the <b>InteractionProduct</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    public Optional<List<InteractionProduct>> getInteractionProductsIfPresent() {
        return Optional.ofNullable(toInteractionProducts);
    }

    /**
     * Overwrites the list of associated <b>InteractionProduct</b> entities for the loaded navigation property <b>InteractionProducts</b>.
     * <p>
     * If the navigation property <b>InteractionProducts</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>InteractionProduct</b> entities.
     */
    public void setInteractionProducts(
        @NonNull
        final List<InteractionProduct> value) {
        if (toInteractionProducts == null) {
            toInteractionProducts = Lists.newArrayList();
        }
        toInteractionProducts.clear();
        toInteractionProducts.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>InteractionProduct</b> entities. This corresponds to the OData navigation property <b>InteractionProducts</b>.
     * <p>
     * If the navigation property <b>InteractionProducts</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>InteractionProduct</b> entities.
     */
    public void addInteractionProducts(InteractionProduct... entity) {
        if (toInteractionProducts == null) {
            toInteractionProducts = Lists.newArrayList();
        }
        toInteractionProducts.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>InteractionTag</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>InteractionTags</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>InteractionTag</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<InteractionTag> fetchInteractionTags()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type InteractionTag.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("InteractionUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(interactionUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("InteractionTags");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<InteractionTag> entityList = result.asList(InteractionTag.class);
        for (InteractionTag entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>InteractionTag</b> entities (one to many). This corresponds to the OData navigation property <b>InteractionTags</b>.
     * <p>
     * If the navigation property <b>InteractionTags</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>InteractionTag</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<InteractionTag> getInteractionTagsOrFetch()
        throws ODataException
    {
        if (toInteractionTags == null) {
            toInteractionTags = fetchInteractionTags();
        }
        return toInteractionTags;
    }

    /**
     * Retrieval of associated <b>InteractionTag</b> entities (one to many). This corresponds to the OData navigation property <b>InteractionTags</b>.
     * <p>
     * If the navigation property for an entity <b>Interaction</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>InteractionTags</b> is already loaded, the result will contain the <b>InteractionTag</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    public Optional<List<InteractionTag>> getInteractionTagsIfPresent() {
        return Optional.ofNullable(toInteractionTags);
    }

    /**
     * Overwrites the list of associated <b>InteractionTag</b> entities for the loaded navigation property <b>InteractionTags</b>.
     * <p>
     * If the navigation property <b>InteractionTags</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>InteractionTag</b> entities.
     */
    public void setInteractionTags(
        @NonNull
        final List<InteractionTag> value) {
        if (toInteractionTags == null) {
            toInteractionTags = Lists.newArrayList();
        }
        toInteractionTags.clear();
        toInteractionTags.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>InteractionTag</b> entities. This corresponds to the OData navigation property <b>InteractionTags</b>.
     * <p>
     * If the navigation property <b>InteractionTags</b> of a queried <b>Interaction</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>InteractionTag</b> entities.
     */
    public void addInteractionTags(InteractionTag... entity) {
        if (toInteractionTags == null) {
            toInteractionTags = Lists.newArrayList();
        }
        toInteractionTags.addAll(Lists.newArrayList(entity));
    }

    public final static class InteractionBuilder {

        private List<InteractionInterest> toInteractionInterests = Lists.newArrayList();
        private List<InteractionProductCategory> toInteractionProductCategories = Lists.newArrayList();
        private List<InteractionDigitalAsset> toInteractionDigitalAssets = Lists.newArrayList();
        private List<InteractionOffer> toInteractionOffers = Lists.newArrayList();
        private List<InteractionAdditionalObject> toInteractionAdditionalObjects = Lists.newArrayList();
        private List<InteractionProduct> toInteractionProducts = Lists.newArrayList();
        private List<InteractionTag> toInteractionTags = Lists.newArrayList();

        private Interaction.InteractionBuilder toInteractionInterests(List<InteractionInterest> value) {
            toInteractionInterests.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>InteractionInterests</b> for <b>Interaction</b> to multiple <b>InteractionInterest</b>.
         * 
         */
        public Interaction.InteractionBuilder interactionInterests(InteractionInterest... value) {
            return toInteractionInterests(Lists.newArrayList(value));
        }

        private Interaction.InteractionBuilder toInteractionProductCategories(List<InteractionProductCategory> value) {
            toInteractionProductCategories.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>InteractionProductCategories</b> for <b>Interaction</b> to multiple <b>InteractionProductCategory</b>.
         * 
         */
        public Interaction.InteractionBuilder interactionProductCategories(InteractionProductCategory... value) {
            return toInteractionProductCategories(Lists.newArrayList(value));
        }

        private Interaction.InteractionBuilder toInteractionDigitalAssets(List<InteractionDigitalAsset> value) {
            toInteractionDigitalAssets.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>InteractionDigitalAssets</b> for <b>Interaction</b> to multiple <b>InteractionDigitalAsset</b>.
         * 
         */
        public Interaction.InteractionBuilder interactionDigitalAssets(InteractionDigitalAsset... value) {
            return toInteractionDigitalAssets(Lists.newArrayList(value));
        }

        private Interaction.InteractionBuilder toInteractionOffers(List<InteractionOffer> value) {
            toInteractionOffers.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>InteractionOffers</b> for <b>Interaction</b> to multiple <b>InteractionOffer</b>.
         * 
         */
        public Interaction.InteractionBuilder interactionOffers(InteractionOffer... value) {
            return toInteractionOffers(Lists.newArrayList(value));
        }

        private Interaction.InteractionBuilder toInteractionAdditionalObjects(List<InteractionAdditionalObject> value) {
            toInteractionAdditionalObjects.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>InteractionAdditionalObjects</b> for <b>Interaction</b> to multiple <b>InteractionAdditionalObject</b>.
         * 
         */
        public Interaction.InteractionBuilder interactionAdditionalObjects(InteractionAdditionalObject... value) {
            return toInteractionAdditionalObjects(Lists.newArrayList(value));
        }

        private Interaction.InteractionBuilder toInteractionProducts(List<InteractionProduct> value) {
            toInteractionProducts.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>InteractionProducts</b> for <b>Interaction</b> to multiple <b>InteractionProduct</b>.
         * 
         */
        public Interaction.InteractionBuilder interactionProducts(InteractionProduct... value) {
            return toInteractionProducts(Lists.newArrayList(value));
        }

        private Interaction.InteractionBuilder toInteractionTags(List<InteractionTag> value) {
            toInteractionTags.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>InteractionTags</b> for <b>Interaction</b> to multiple <b>InteractionTag</b>.
         * 
         */
        public Interaction.InteractionBuilder interactionTags(InteractionTag... value) {
            return toInteractionTags(Lists.newArrayList(value));
        }

    }

}
