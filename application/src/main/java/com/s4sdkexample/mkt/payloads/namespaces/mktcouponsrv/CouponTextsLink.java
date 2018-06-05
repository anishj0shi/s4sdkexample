
package com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject;


/**
 * Template class to represent entity navigation links of {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class CouponTextsLink<ObjectT extends VdmObject<?> >
    extends EntityLink<CouponTextsLink<ObjectT> , CouponTexts, ObjectT>
    implements CouponTextsSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public CouponTextsLink(final String fieldName) {
        super(fieldName);
    }

    private CouponTextsLink(final EntityLink<CouponTextsLink<ObjectT> , CouponTexts, ObjectT> toClone) {
        super(toClone);
    }

    @Override
    protected CouponTextsLink<ObjectT> translateLinkType(final EntityLink<CouponTextsLink<ObjectT> , CouponTexts, ObjectT> link) {
        return new CouponTextsLink<ObjectT>(link);
    }

}
