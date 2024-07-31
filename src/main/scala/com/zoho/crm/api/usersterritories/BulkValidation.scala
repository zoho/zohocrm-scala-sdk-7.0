package com.zoho.crm.api.usersterritories

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap

class BulkValidation extends Model with ValidationGroup	{
	private var alert:Option[Boolean] = None
	private var assignment:Option[Boolean] = None
	private var criteria:Option[Boolean] = None
	private var name:Option[String] = None
	private var id:Option[Long] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getAlert() :Option[Boolean]	={
		return  this.alert
	}

	def setAlert( alert: Option[Boolean]) 	={
		 this.alert = alert
		 this.keyModified("alert") = 1
	}

	def getAssignment() :Option[Boolean]	={
		return  this.assignment
	}

	def setAssignment( assignment: Option[Boolean]) 	={
		 this.assignment = assignment
		 this.keyModified("assignment") = 1
	}

	def getCriteria() :Option[Boolean]	={
		return  this.criteria
	}

	def setCriteria( criteria: Option[Boolean]) 	={
		 this.criteria = criteria
		 this.keyModified("criteria") = 1
	}

	def getName() :Option[String]	={
		return  this.name
	}

	def setName( name: Option[String]) 	={
		 this.name = name
		 this.keyModified("name") = 1
	}

	def getId() :Option[Long]	={
		return  this.id
	}

	def setId( id: Option[Long]) 	={
		 this.id = id
		 this.keyModified("id") = 1
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