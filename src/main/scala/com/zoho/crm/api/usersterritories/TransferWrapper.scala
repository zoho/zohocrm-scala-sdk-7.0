package com.zoho.crm.api.usersterritories

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class TransferWrapper extends Model	{
	private var transferAndDelink:ArrayBuffer[TransferAndDelink] = _
	private var keyModified:HashMap[String, Int] = HashMap()

	def getTransferAndDelink() :ArrayBuffer[TransferAndDelink]	={
		return  this.transferAndDelink
	}

	def setTransferAndDelink( transferAndDelink: ArrayBuffer[TransferAndDelink]) 	={
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