package com.zoho.crm.api.record

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap

class MultiSelectLookup extends Model	{
	private var id:Option[Long] = None
	private var fieldname:HashMap[String, Any] = _
	private var hasMore:HashMap[String, Any] = _
	private var keyModified:HashMap[String, Int] = HashMap()

	def getId() :Option[Long]	={
		return  this.id
	}

	def setId( id: Option[Long]) 	={
		 this.id = id
		 this.keyModified("id") = 1
	}

	def getFieldname() :HashMap[String, Any]	={
		return  this.fieldname
	}

	def setFieldname( fieldname: HashMap[String, Any]) 	={
		 this.fieldname = fieldname
		 this.keyModified("fieldName") = 1
	}

	def gethasMore() :HashMap[String, Any]	={
		return  this.hasMore
	}

	def sethasMore( hasMore: HashMap[String, Any]) 	={
		 this.hasMore = hasMore
		 this.keyModified("$has_more") = 1
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