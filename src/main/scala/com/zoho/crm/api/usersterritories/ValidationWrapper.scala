package com.zoho.crm.api.usersterritories

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class ValidationWrapper extends Model with ValidationHandler	{
	private var validateBeforeTransfer:ArrayBuffer[ValidationGroup] = _
	private var keyModified:HashMap[String, Int] = HashMap()

	def getValidateBeforeTransfer() :ArrayBuffer[ValidationGroup]	={
		return  this.validateBeforeTransfer
	}

	def setValidateBeforeTransfer( validateBeforeTransfer: ArrayBuffer[ValidationGroup]) 	={
		 this.validateBeforeTransfer = validateBeforeTransfer
		 this.keyModified("validate_before_transfer") = 1
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