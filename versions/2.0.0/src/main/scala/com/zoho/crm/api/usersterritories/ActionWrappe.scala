package com.zoho.crm.api.usersterritories

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class ActionWrappe extends Model with ActionHandler	{
	private var transferAndDelink:ArrayBuffer[ActionResponse] = _
	private var keyModified:HashMap[String, Int] = HashMap()

	def getTransferAndDelink() :ArrayBuffer[ActionResponse]	={
		return  this.transferAndDelink
	}

	def setTransferAndDelink( transferAndDelink: ArrayBuffer[ActionResponse]) 	={
		 this.transferAndDelink = transferAndDelink
		 this.keyModified("transfer_and_delink") = 1
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