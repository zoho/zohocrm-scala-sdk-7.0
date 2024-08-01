package com.zoho.crm.api.org

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class ActionWrapper extends Model	{
	private var org:ArrayBuffer[Any] = _
	private var keyModified:HashMap[String, Int] = HashMap()

	def getOrg() :ArrayBuffer[Any]	={
		return  this.org
	}

	def setOrg( org: ArrayBuffer[Any]) 	={
		 this.org = org
		 this.keyModified("org") = 1
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