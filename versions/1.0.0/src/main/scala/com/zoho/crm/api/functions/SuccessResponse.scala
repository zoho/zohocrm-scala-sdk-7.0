package com.zoho.crm.api.functions

import com.zoho.crm.api.util.Choice
import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap

class SuccessResponse extends Model with ResponseWrapper	{
	private var code:Choice[String] = _
	private var message:Choice[String] = _
	private var details:HashMap[String, Any] = _
	private var keyModified:HashMap[String, Int] = HashMap()

	def getCode() :Choice[String]	={
		return  this.code
	}

	def setCode( code: Choice[String]) 	={
		 this.code = code
		 this.keyModified("code") = 1
	}

	def getMessage() :Choice[String]	={
		return  this.message
	}

	def setMessage( message: Choice[String]) 	={
		 this.message = message
		 this.keyModified("message") = 1
	}

	def getDetails() :HashMap[String, Any]	={
		return  this.details
	}

	def setDetails( details: HashMap[String, Any]) 	={
		 this.details = details
		 this.keyModified("details") = 1
	}

	def isKeyModified( key: String) :Any	={
		if((( this.keyModified.contains(key))))
		{
			return  this.keyModified(key)
		}
		return None
	}

	def setKeyModified( key: String,  modification: Int) 	={
		 this.keyModified(key) = modification
	}}