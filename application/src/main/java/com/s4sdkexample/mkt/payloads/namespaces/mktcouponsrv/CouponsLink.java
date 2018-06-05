
package com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject;


/**
 * Template class to represent entity navigation links of {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons Coupons} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class CouponsLink<ObjectT extends VdmObject<?> >
    extends EntityLink<CouponsLink<ObjectT> , Coupons, ObjectT>
    implements CouponsSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public CouponsLink(final String fieldName) {
        super(fieldName);
    }

    private CouponsLink(final EntityLink<CouponsLink<ObjectT> , Coupons, ObjectT> toClone) {
        super(toClone);
    }

    @Override
    protected CouponsLink<ObjectT> translateLinkType(final EntityLink<CouponsLink<ObjectT> , Coupons, ObjectT> link) {
        return new CouponsLink<ObjectT>(link);
    }

}
