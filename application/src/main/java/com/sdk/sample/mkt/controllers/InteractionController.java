package com.sdk.sample.mkt.controllers;

import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.Interaction;
import com.s4sdkexample.mkt.payloads.services.MktInteractionSrvService;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;

@RestController
public class InteractionController {

	@Autowired
	MktInteractionSrvService interactionService;

	@RequestMapping(path = "/create", method = RequestMethod.GET)
	public ResponseEntity<?> createInteraction() throws ODataException {

		Interaction interaction = Interaction.builder().interactionType("OFFER_REDEMPTION")
				.communicationMedium("ONLINE_SHOP").interactionReason("OFFER_AVAILED")
				.interactionTimeStampUTC(ZonedDateTime.now()).build();

		interactionService.createInteraction(interaction).execute();

		return ResponseEntity.ok("Done");

	}

}
