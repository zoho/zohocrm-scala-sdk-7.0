package com.zoho.crm.api.recordlocking

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class BodyWrapper extends Model	{
	private var data:ArrayBuffer[LockRecord] = _
	private var keyModified:HashMap[String, Int] = HashMap()

	def getData() :ArrayBuffer[LockRecord]	={
		return  this.data
	}

	def setData( data: ArrayBuffer[LockRecord]) 	={
		 this.data = data
		 this.keyModified("data") = 1
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