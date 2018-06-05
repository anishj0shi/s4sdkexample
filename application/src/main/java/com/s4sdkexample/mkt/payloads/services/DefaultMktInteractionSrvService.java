
package com.s4sdkexample.mkt.payloads.services;

import java.util.UUID;
import javax.inject.Named;
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
@Named("com.s4sdkexample.mkt.payloads.services.DefaultMktInteractionSrvService")
public class DefaultMktInteractionSrvService
    implements MktInteractionSrvService
{


    @Override
    public InteractionInterestFluentHelper getAllInteractionInterest() {
        return new InteractionInterestFluentHelper();
    }

    @Override
    public InteractionInterestByKeyFluentHelper getInteractionInterestByKey(UUID interactionInterestUUID) {
        return new InteractionInterestByKeyFluentHelper(interactionInterestUUID);
    }

    @Override
    public InteractionInterestCreateFluentHelper createInteractionInterest(final InteractionInterest interactionInterest) {
        return new InteractionInterestCreateFluentHelper(interactionInterest);
    }

    @Override
    public InteractionProductCategoryFluentHelper getAllInteractionProductCategory() {
        return new InteractionProductCategoryFluentHelper();
    }

    @Override
    public InteractionProductCategoryByKeyFluentHelper getInteractionProductCategoryByKey(UUID interactionProductCategoryUUID) {
        return new InteractionProductCategoryByKeyFluentHelper(interactionProductCategoryUUID);
    }

    @Override
    public InteractionProductCategoryCreateFluentHelper createInteractionProductCategory(final InteractionProductCategory interactionProductCategory) {
        return new InteractionProductCategoryCreateFluentHelper(interactionProductCategory);
    }

    @Override
    public InteractionDigitalAssetFluentHelper getAllInteractionDigitalAsset() {
        return new InteractionDigitalAssetFluentHelper();
    }

    @Override
    public InteractionDigitalAssetByKeyFluentHelper getInteractionDigitalAssetByKey(UUID interactionDigitalAssetUUID) {
        return new InteractionDigitalAssetByKeyFluentHelper(interactionDigitalAssetUUID);
    }

    @Override
    public InteractionDigitalAssetCreateFluentHelper createInteractionDigitalAsset(final InteractionDigitalAsset interactionDigitalAsset) {
        return new InteractionDigitalAssetCreateFluentHelper(interactionDigitalAsset);
    }

    @Override
    public InteractionOfferFluentHelper getAllInteractionOffer() {
        return new InteractionOfferFluentHelper();
    }

    @Override
    public InteractionOfferByKeyFluentHelper getInteractionOfferByKey(UUID interactionOfferUUID) {
        return new InteractionOfferByKeyFluentHelper(interactionOfferUUID);
    }

    @Override
    public InteractionOfferCreateFluentHelper createInteractionOffer(final InteractionOffer interactionOffer) {
        return new InteractionOfferCreateFluentHelper(interactionOffer);
    }

    @Override
    public InteractionAdditionalObjectFluentHelper getAllInteractionAdditionalObject() {
        return new InteractionAdditionalObjectFluentHelper();
    }

    @Override
    public InteractionAdditionalObjectByKeyFluentHelper getInteractionAdditionalObjectByKey(UUID interactionAdditionalObjUUID) {
        return new InteractionAdditionalObjectByKeyFluentHelper(interactionAdditionalObjUUID);
    }

    @Override
    public InteractionAdditionalObjectCreateFluentHelper createInteractionAdditionalObject(final InteractionAdditionalObject interactionAdditionalObject) {
        return new InteractionAdditionalObjectCreateFluentHelper(interactionAdditionalObject);
    }

    @Override
    public InteractionFluentHelper getAllInteraction() {
        return new InteractionFluentHelper();
    }

    @Override
    public InteractionByKeyFluentHelper getInteractionByKey(UUID interactionUUID) {
        return new InteractionByKeyFluentHelper(interactionUUID);
    }

    @Override
    public InteractionCreateFluentHelper createInteraction(final Interaction interaction) {
        return new InteractionCreateFluentHelper(interaction);
    }

    @Override
    public InteractionUpdateFluentHelper updateInteraction(final Interaction interaction) {
        return new InteractionUpdateFluentHelper(interaction);
    }

    @Override
    public InteractionProductFluentHelper getAllInteractionProduct() {
        return new InteractionProductFluentHelper();
    }

    @Override
    public InteractionProductByKeyFluentHelper getInteractionProductByKey(UUID interactionProductUUID) {
        return new InteractionProductByKeyFluentHelper(interactionProductUUID);
    }

    @Override
    public InteractionProductCreateFluentHelper createInteractionProduct(final InteractionProduct interactionProduct) {
        return new InteractionProductCreateFluentHelper(interactionProduct);
    }

    @Override
    public InteractionTagFluentHelper getAllInteractionTag() {
        return new InteractionTagFluentHelper();
    }

    @Override
    public InteractionTagByKeyFluentHelper getInteractionTagByKey(UUID interactionTagUUID) {
        return new InteractionTagByKeyFluentHelper(interactionTagUUID);
    }

    @Override
    public InteractionTagCreateFluentHelper createInteractionTag(final InteractionTag interactionTag) {
        return new InteractionTagCreateFluentHelper(interactionTag);
    }

}
