/******************************************************************************
 * Copyright (c) 2015 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *****************************************************************************/
 package com.ibm.research.proppaths;

public class CTEDefinition implements SQLCommand {

	private String name;
	private String sqlDef;
	
	public CTEDefinition(String name, String sqlDef) {
		super();
		this.name = name;
		this.sqlDef = sqlDef;
	}

	public CTEDefinition(String name, String optionalCTESignature,  String sqlDef) {
		this(name+(optionalCTESignature!=null?"("+optionalCTESignature+")":""), sqlDef);
	}
	
	@Override
	public String toSQL() {
		return name +" AS ("+sqlDef+")";
	}

}
