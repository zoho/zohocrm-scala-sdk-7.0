package com.zoho.crm.api.usersterritories

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class ActionWrapper extends Model with ActionHandler	{
	private var transferAndDelink:ArrayBuffer[ActionResponse] = _
	private var keyModified:HashMap[String, Int] = HashMap()
	private var territories:ArrayBuffer[ActionResponse] = _

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
	}

	def getTerritories() :ArrayBuffer[ActionResponse]	={
		return  this.territories
	}

	def setTerritories( territories: ArrayBuffer[ActionResponse]) 	={
		 this.territories = territories
		 this.keyModified("territories") = 1
	}}