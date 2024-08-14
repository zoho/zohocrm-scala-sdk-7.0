package record

import com.zoho.api.authenticator.{OAuthToken, Token}
import com.zoho.crm.api.Initializer
import com.zoho.crm.api.dc.{INDataCenter, USDataCenter}
import com.zoho.crm.api.dc.DataCenter.Environment
import com.zoho.crm.api.record.*
import com.zoho.crm.api.util.APIResponse
import com.zoho.crm.api.util.Model


object CloneRecord {

  @throws[Exception]
  def cloneRecord(moduleAPIName: String, recordId: Long): Unit = {
    val recordOperations = new RecordOperations(moduleAPIName)
    val response: Option[APIResponse[ActionHandler]] = recordOperations.cloneRecord(recordId)

    if (response != null) {
      response match {
        case Some(apiResponse) =>
          println(s"Status Code: ${apiResponse.getStatusCode}")

          if (apiResponse.isExpected) {
            apiResponse.getObject match {
              case actionWrapper: ActionWrapper =>
                val actionResponses = actionWrapper.getData
                actionResponses.foreach {
                  case successResponse: SuccessResponse =>
                    println(s"Status: ${successResponse.getStatus.getValue}")
                    println(s"Code: ${successResponse.getCode.getValue}")
                    println("Details: ")
                    if (successResponse.getDetails != null) {
                      successResponse.getDetails.foreach(entry => {
                        println(entry._1 + ": " + entry._2)
                      })
                    }
                    println(s"Message: ${successResponse.getMessage.getValue}")

                  case exception: APIException =>
                    println(s"Status: ${exception.getStatus.getValue}")
                    println(s"Code: ${exception.getCode.getValue}")
                    println("Details: ")
                    if (exception.getDetails != null) {
                      exception.getDetails.foreach(entry => {
                        println(entry._1 + ": " + entry._2)
                      })
                    }
                    println(s"Message: ${exception.getMessage.getValue}")
                }

              case exception: APIException =>
                println(s"Status: ${exception.getStatus.getValue}")
                println(s"Code: ${exception.getCode.getValue}")
                println("Details: ")
                if (exception.getDetails != null) {
                  exception.getDetails.foreach(entry => {
                    println(entry._1 + ": " + entry._2)
                  })
                }
                println(s"Message: ${exception.getMessage.getValue}")

              case responseObject: Model =>
                val fields = responseObject.getClass.getDeclaredFields
                fields.foreach { field =>
                  field.setAccessible(true)
                  println(s"${field.getName}: ${field.get(responseObject)}")
                }
            }
          } else {
            val responseObject: Any = apiResponse.getModel
            val fields = responseObject.getClass.getDeclaredFields
            fields.foreach { field =>
              field.setAccessible(true)
              println(s"${field.getName}: ${field.get(responseObject)}")
            }
          }
      }
    }
  }

  @throws[Exception]
  def main(args: Array[String]): Unit = {
    try {
      val environment: Environment = USDataCenter.PRODUCTION
      val token: Token = new OAuthToken.Builder()
        .clientID("client_id")
        .clientSecret("client_secret")
        .grantToken("grant_token")
        .build()
      new Initializer.Builder()
        .environment(environment)
        .token(token)
        .initialize()

      val moduleAPIName = "Leads"
      val recordId = 7534770326934L
      cloneRecord(moduleAPIName, recordId)
    } catch {
      case e: Exception => e.printStackTrace()
    }
  }
}
