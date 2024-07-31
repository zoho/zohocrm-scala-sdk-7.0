package com.zoho.crm.api.usersterritories

import com.zoho.crm.api.exception.SDKException
import com.zoho.crm.api.util.APIResponse
import com.zoho.crm.api.util.CommonAPIHandler
import com.zoho.crm.api.util.Constants

class UsersTerritoriesOperations(var user: Long)	{

	def getTerritoriesOfUser() :Option[APIResponse[ResponseHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v7/users/")
		apiPath = apiPath.concat( this.user.toString())
		apiPath = apiPath.concat("/territories")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET)
		handlerInstance.setCategoryMethod("READ")
		return handlerInstance.apiCall(classOf[ResponseHandler], "application/json")
	}

	def associateTerritoriesToUser( request: BodyWrapper) :Option[APIResponse[ActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v7/users/")
		apiPath = apiPath.concat( this.user.toString())
		apiPath = apiPath.concat("/territories")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT)
		handlerInstance.setCategoryMethod("UPDATE")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		handlerInstance.setMandatoryChecker(true)
		return handlerInstance.apiCall(classOf[ActionHandler], "application/json")
	}

	def getTerritoryOfUser( territory: Long) :Option[APIResponse[ResponseHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v7/users/")
		apiPath = apiPath.concat( this.user.toString())
		apiPath = apiPath.concat("/territories/")
		apiPath = apiPath.concat(territory.toString())
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET)
		handlerInstance.setCategoryMethod("READ")
		return handlerInstance.apiCall(classOf[ResponseHandler], "application/json")
	}

	def validateBeforeTransferForAllTerritories() :Option[APIResponse[ValidationHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v7/users/")
		apiPath = apiPath.concat( this.user.toString())
		apiPath = apiPath.concat("/territories/actions/validate_before_transfer")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET)
		handlerInstance.setCategoryMethod("ACTION")
		return handlerInstance.apiCall(classOf[ValidationHandler], "application/json")
	}

	def validateBeforeTransfer( territory: Long) :Option[APIResponse[ValidationHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v7/users/")
		apiPath = apiPath.concat( this.user.toString())
		apiPath = apiPath.concat("/territories/")
		apiPath = apiPath.concat(territory.toString())
		apiPath = apiPath.concat("/actions/validate_before_transfer")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET)
		handlerInstance.setCategoryMethod("ACTION")
		return handlerInstance.apiCall(classOf[ValidationHandler], "application/json")
	}

	def delinkAndTransferFromAllTerritories( request: TransferWrapper) :Option[APIResponse[TransferActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v7/users/")
		apiPath = apiPath.concat( this.user.toString())
		apiPath = apiPath.concat("/territories/actions/transfer_and_delink")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT)
		handlerInstance.setCategoryMethod("ACTION")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		return handlerInstance.apiCall(classOf[TransferActionHandler], "application/json")
	}

	def delinkAndTransferFromSpecificTerritory( territory: Long,  request: TransferWrapper) :Option[APIResponse[TransferActionHandler]]	={
		var handlerInstance :CommonAPIHandler = new CommonAPIHandler()
		var apiPath :String = new String()
		apiPath = apiPath.concat("/crm/v7/users/")
		apiPath = apiPath.concat( this.user.toString())
		apiPath = apiPath.concat("/territories/")
		apiPath = apiPath.concat(territory.toString())
		apiPath = apiPath.concat("/actions/transfer_and_delink")
		handlerInstance.setAPIPath(apiPath)
		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT)
		handlerInstance.setCategoryMethod("ACTION")
		handlerInstance.setContentType("application/json")
		handlerInstance.setRequest(request)
		return handlerInstance.apiCall(classOf[TransferActionHandler], "application/json")
	}}