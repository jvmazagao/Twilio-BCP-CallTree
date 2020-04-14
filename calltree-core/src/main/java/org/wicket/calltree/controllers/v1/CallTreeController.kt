package org.wicket.calltree.controllers.v1

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import org.wicket.calltree.model.BcpStartRequest
import org.wicket.calltree.services.CallTreeService
import javax.validation.Valid

/**
 * @author Alessandro Arosio - 11/04/2020 13:14
 */
@RestController
@RequestMapping("/api/v1/calltree")
class CallTreeController(private val service: CallTreeService) {

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  fun initiateCalls(@RequestBody @Valid bcpStartRequest: BcpStartRequest) {
    service.initiateCalls(bcpStartRequest)
  }

  @GetMapping
  fun getStats() {
    // placeholder
  }

  @PostMapping("/twilio", produces = [MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE])
  fun replyToIncomingSms(@RequestBody body: String): String {
    return service.replyToSms(body)
  }
}