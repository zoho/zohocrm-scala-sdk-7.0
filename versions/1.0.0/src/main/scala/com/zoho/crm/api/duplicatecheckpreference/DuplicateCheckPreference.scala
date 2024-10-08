package com.zoho.crm.api.duplicatecheckpreference

import com.zoho.crm.api.util.Choice
import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class DuplicateCheckPreference extends Model	{
	private var type1:Choice[String] = _
	private var typeConfigurations:ArrayBuffer[TypeConfiguration] = _
	private var keyModified:HashMap[String, Int] = HashMap()

	def getType() :Choice[String]	={
		return  this.type1
	}

	def setType( type1: Choice[String]) 	={
		 this.type1 = type1
		 this.keyModified("type") = 1
	}

	def getTypeConfigurations() :ArrayBuffer[TypeConfiguration]	={
		return  this.typeConfigurations
	}

	def setTypeConfigurations( typeConfigurations: ArrayBuffer[TypeConfiguration]) 	={
		 this.typeConfigurations = typeConfigurations
		 this.keyModified("type_configurations") = 1
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