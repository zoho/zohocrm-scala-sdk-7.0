package com.zoho.crm.api.functions

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap

class BodyWrapper extends Model	{
	private var body:HashMap[String, Any] = _
	private var keyModified:HashMap[String, Int] = HashMap()

	def getBody() :HashMap[String, Any]	={
		return  this.body
	}

	def setBody( body: HashMap[String, Any]) 	={
		 this.body = body
		 this.keyModified("body") = 1
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