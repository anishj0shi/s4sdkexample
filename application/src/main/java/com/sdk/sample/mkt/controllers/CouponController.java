package com.sdk.sample.mkt.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponCodes;
import com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.Coupons;
import com.s4sdkexample.mkt.payloads.services.MktCouponSrvService;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;

@RestController
public class CouponController {

	@Autowired
	MktCouponSrvService couponService;

	@RequestMapping(path = "/createCoupon", method = RequestMethod.GET)
	public ResponseEntity<?> createCoupon() throws ODataException {
		CouponCodes code1 = CouponCodes.builder().couponCode("DIVS1234").qRCodeImageURL("www.gmail.com/mails")
				.eANCodeImageURL("www.sap.com/jobs").build();

		CouponCodes code2 = CouponCodes.builder().couponCode("DIVS1235").qRCodeImageURL("www.gmail.com/mails")
				.eANCodeImageURL("www.sap.com/jobs").build();

		List<CouponCodes> cCodes = new ArrayList<>();
		cCodes.add(code1);
		cCodes.add(code2);

		Coupons coupons = Coupons.builder().coupon("104534251").offerStatus("01").couponType("MULTI")
				.couponOrigin("HALLOWEEN").couponCode(cCodes.toArray(new CouponCodes[1])).build();

		couponService.createCoupons(coupons).execute();
		return ResponseEntity.ok("done");
	}

}
