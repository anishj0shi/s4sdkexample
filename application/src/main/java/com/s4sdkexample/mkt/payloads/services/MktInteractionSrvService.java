
package com.s4sdkexample.mkt.payloads.services;

import java.util.UUID;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionAdditionalObject;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionAdditionalObjectByKeyFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionAdditionalObjectCreateFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionAdditionalObjectFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionByKeyFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionCreateFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAsset;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAssetByKeyFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAssetCreateFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAssetFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterest;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterestByKeyFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterestCreateFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterestFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionOffer;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionOfferByKeyFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionOfferCreateFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionOfferFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProduct;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductByKeyFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategory;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategoryByKeyFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategoryCreateFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategoryFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCreateFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTag;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTagByKeyFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTagCreateFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTagFluentHelper;
import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionUpdateFluentHelper;


/**
 * <p>Reference: <a href='https://api.sap.com/shell/discover/contentpackage/SAPS4HANACloud/api/API_MKT_INTERACTION_SRV?section=OVERVIEW'>SAP API Business Hub</a></p><h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>API_MKT_INTERACTION_SRV</td></tr></table>
 * 
 */
public interface MktInteractionSrvService {


    /**
     * Fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterest InteractionInterest} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterest InteractionInterest} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterestFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionInterestFluentHelper getAllInteractionInterest();

    /**
     * Fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterest InteractionInterest} entity using key fields.
     * 
     * @param interactionInterestUUID
     *     UUID for API-Service<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterest InteractionInterest} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterestByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionInterestByKeyFluentHelper getInteractionInterestByKey(UUID interactionInterestUUID);

    /**
     * Create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterest InteractionInterest} entity and save it to the S/4HANA system.
     * 
     * @param interactionInterest
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterest InteractionInterest} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterest InteractionInterest} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionInterestCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionInterestCreateFluentHelper createInteractionInterest(final InteractionInterest interactionInterest);

    /**
     * Fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategory InteractionProductCategory} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategory InteractionProductCategory} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategoryFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionProductCategoryFluentHelper getAllInteractionProductCategory();

    /**
     * Fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategory InteractionProductCategory} entity using key fields.
     * 
     * @param interactionProductCategoryUUID
     *     UUID for API-Service<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategory InteractionProductCategory} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategoryByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionProductCategoryByKeyFluentHelper getInteractionProductCategoryByKey(UUID interactionProductCategoryUUID);

    /**
     * Create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategory InteractionProductCategory} entity and save it to the S/4HANA system.
     * 
     * @param interactionProductCategory
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategory InteractionProductCategory} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategory InteractionProductCategory} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCategoryCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionProductCategoryCreateFluentHelper createInteractionProductCategory(final InteractionProductCategory interactionProductCategory);

    /**
     * Fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAsset InteractionDigitalAsset} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAsset InteractionDigitalAsset} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAssetFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionDigitalAssetFluentHelper getAllInteractionDigitalAsset();

    /**
     * Fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAsset InteractionDigitalAsset} entity using key fields.
     * 
     * @param interactionDigitalAssetUUID
     *     UUID for API-Service<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAsset InteractionDigitalAsset} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAssetByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionDigitalAssetByKeyFluentHelper getInteractionDigitalAssetByKey(UUID interactionDigitalAssetUUID);

    /**
     * Create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAsset InteractionDigitalAsset} entity and save it to the S/4HANA system.
     * 
     * @param interactionDigitalAsset
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAsset InteractionDigitalAsset} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAsset InteractionDigitalAsset} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionDigitalAssetCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionDigitalAssetCreateFluentHelper createInteractionDigitalAsset(final InteractionDigitalAsset interactionDigitalAsset);

    /**
     * Fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionOffer InteractionOffer} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionOffer InteractionOffer} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionOfferFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionOfferFluentHelper getAllInteractionOffer();

    /**
     * Fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionOffer InteractionOffer} entity using key fields.
     * 
     * @param interactionOfferUUID
     *     UUID for API-Service<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionOffer InteractionOffer} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionOfferByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionOfferByKeyFluentHelper getInteractionOfferByKey(UUID interactionOfferUUID);

    /**
     * Create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionOffer InteractionOffer} entity and save it to the S/4HANA system.
     * 
     * @param interactionOffer
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionOffer InteractionOffer} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionOffer InteractionOffer} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionOfferCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionOfferCreateFluentHelper createInteractionOffer(final InteractionOffer interactionOffer);

    /**
     * Fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionAdditionalObject InteractionAdditionalObject} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionAdditionalObject InteractionAdditionalObject} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionAdditionalObjectFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionAdditionalObjectFluentHelper getAllInteractionAdditionalObject();

    /**
     * Fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionAdditionalObject InteractionAdditionalObject} entity using key fields.
     * 
     * @param interactionAdditionalObjUUID
     *     UUID for API-Service<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionAdditionalObject InteractionAdditionalObject} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionAdditionalObjectByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionAdditionalObjectByKeyFluentHelper getInteractionAdditionalObjectByKey(UUID interactionAdditionalObjUUID);

    /**
     * Create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionAdditionalObject InteractionAdditionalObject} entity and save it to the S/4HANA system.
     * 
     * @param interactionAdditionalObject
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionAdditionalObject InteractionAdditionalObject} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionAdditionalObject InteractionAdditionalObject} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionAdditionalObjectCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionAdditionalObjectCreateFluentHelper createInteractionAdditionalObject(final InteractionAdditionalObject interactionAdditionalObject);

    /**
     * Fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction Interaction} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction Interaction} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionFluentHelper getAllInteraction();

    /**
     * Fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction Interaction} entity using key fields.
     * 
     * @param interactionUUID
     *     UUID for API-Service<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction Interaction} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionByKeyFluentHelper getInteractionByKey(UUID interactionUUID);

    /**
     * Create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction Interaction} entity and save it to the S/4HANA system.
     * 
     * @param interaction
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction Interaction} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction Interaction} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionCreateFluentHelper createInteraction(final Interaction interaction);

    /**
     * Update an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction Interaction} entity and save it to the S/4HANA system.
     * 
     * @param interaction
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction Interaction} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction Interaction} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionUpdateFluentHelper updateInteraction(final Interaction interaction);

    /**
     * Fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProduct InteractionProduct} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProduct InteractionProduct} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionProductFluentHelper getAllInteractionProduct();

    /**
     * Fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProduct InteractionProduct} entity using key fields.
     * 
     * @param interactionProductUUID
     *     UUID for API-Service<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProduct InteractionProduct} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionProductByKeyFluentHelper getInteractionProductByKey(UUID interactionProductUUID);

    /**
     * Create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProduct InteractionProduct} entity and save it to the S/4HANA system.
     * 
     * @param interactionProduct
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProduct InteractionProduct} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProduct InteractionProduct} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionProductCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionProductCreateFluentHelper createInteractionProduct(final InteractionProduct interactionProduct);

    /**
     * Fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTag InteractionTag} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTag InteractionTag} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTagFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionTagFluentHelper getAllInteractionTag();

    /**
     * Fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTag InteractionTag} entity using key fields.
     * 
     * @param interactionTagUUID
     *     UUID for API-Service<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTag InteractionTag} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTagByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionTagByKeyFluentHelper getInteractionTagByKey(UUID interactionTagUUID);

    /**
     * Create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTag InteractionTag} entity and save it to the S/4HANA system.
     * 
     * @param interactionTag
     *     {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTag InteractionTag} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTag InteractionTag} entity. To perform execution, call the {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTagCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public InteractionTagCreateFluentHelper createInteractionTag(final InteractionTag interactionTag);

}
