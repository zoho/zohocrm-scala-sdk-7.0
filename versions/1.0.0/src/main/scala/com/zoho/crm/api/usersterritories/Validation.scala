package com.zoho.crm.api.usersterritories

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap

class Validation extends Model with ValidationGroup	{
	private var id:Option[Long] = None
	private var name:Option[String] = None
	private var records:Option[Boolean] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getId() :Option[Long]	={
		return  this.id
	}

	def setId( id: Option[Long]) 	={
		 this.id = id
		 this.keyModified("id") = 1
	}

	def getName() :Option[String]	={
		return  this.name
	}

	def setName( name: Option[String]) 	={
		 this.name = name
		 this.keyModified("Name") = 1
	}

	def getRecords() :Option[Boolean]	={
		return  this.records
	}

	def setRecords( records: Option[Boolean]) 	={
		 this.records = records
		 this.keyModified("records") = 1
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