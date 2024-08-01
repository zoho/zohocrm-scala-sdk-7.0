package com.zoho.crm.api.usersterritories

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap

class TransferAndDelink extends Model	{
	private var id:Option[Long] = None
	private var transferToUser:Option[TransferToUser] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getId() :Option[Long]	={
		return  this.id
	}

	def setId( id: Option[Long]) 	={
		 this.id = id
		 this.keyModified("id") = 1
	}

	def getTransferToUser() :Option[TransferToUser]	={
		return  this.transferToUser
	}

	def setTransferToUser( transferToUser: Option[TransferToUser]) 	={
		 this.transferToUser = transferToUser
		 this.keyModified("transfer_to_user") = 1
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