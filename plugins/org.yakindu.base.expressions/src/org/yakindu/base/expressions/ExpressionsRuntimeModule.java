/** 
 * Copyright (c) 2015 committers of YAKINDU and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * Contributors:
 * committers of YAKINDU - initial API and implementation
 *
*/
package org.yakindu.base.expressions;

import org.yakindu.base.expressions.inferrer.ExpressionsTypeInferrer;
import org.yakindu.base.types.inferrer.ITypeSystemInferrer;

public class ExpressionsRuntimeModule extends org.yakindu.base.expressions.AbstractExpressionsRuntimeModule {

	public Class<? extends ITypeSystemInferrer> bindITypeSystemInferrer() {
		return ExpressionsTypeInferrer.class;
	}

}
