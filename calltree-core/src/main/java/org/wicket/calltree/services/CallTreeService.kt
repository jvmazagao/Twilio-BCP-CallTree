package org.wicket.calltree.services

import org.wicket.calltree.dto.BcpEventDto
import org.wicket.calltree.dto.Response
import org.wicket.calltree.dto.TwilioNumberDto
import org.wicket.calltree.model.BcpContactStats
import org.wicket.calltree.model.BcpStartRequest
import org.wicket.calltree.model.BcpStats

/**
 * @author Alessandro Arosio - 11/04/2020 13:16
 */
interface CallTreeService {
  fun initiateCalls(bcpStartRequest: BcpStartRequest) : List<Response>

  fun replyToSms(body: String) : String

  fun fetchTwilioNumbers(): List<String>

  fun endEvent(bcpEventDto: BcpEventDto)

  fun checkEvent(): List<BcpEventDto>
}