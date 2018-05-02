/**
 * Copyright (c) 2018 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	rbeckmann - initial API and implementation
 * 
 */
package org.yakindu.sct.generator.c.extensions

import com.google.inject.Inject
import org.yakindu.sct.generator.c.CGeneratorConstants
import org.yakindu.sct.generator.core.templates.ExpressionsGenerator
import org.yakindu.sct.generator.core.types.ICodegenTypeSystemAccess
import org.yakindu.sct.model.sexec.ExecutionFlow
import org.yakindu.sct.model.stext.stext.EventDefinition
import org.yakindu.sct.model.stext.stext.EventRaisingExpression

/**
 * @author rbeckmann
 *
 */
class EventCode {
	@Inject protected extension Navigation
	@Inject protected extension Naming
	@Inject protected extension ICodegenTypeSystemAccess
	
	def interfaceIncomingEventRaiser(ExecutionFlow it, EventDefinition event) '''
		void «event.asRaiser»(«scHandleDecl»«event.valueParams»)
		{
			«IF event.hasValue»
			«event.valueAccess» = value;
			«ENDIF»
			«event.access» = bool_true;
		}
	'''
	
	def interfaceOutgoingEventGetter(ExecutionFlow it, EventDefinition event) '''
		sc_boolean «event.asRaised»(const «scHandleDecl»)
		{
			return «event.access»;
		}
	'''
	
	def interfaceOutgoingEventValueGetter(ExecutionFlow it, EventDefinition event) '''
		«event.typeSpecifier.targetLanguageName» «event.asGetter»(const «scHandleDecl»)
		{
			return «event.valueAccess»;
		}
	'''
	
	def eventRaisingCode(EventRaisingExpression it, ExpressionsGenerator exp) '''
		«IF value !== null»
			«event.definition.event.valueAccess» = «exp.code(value)»;
		«ENDIF»
		«event.definition.event.access» = «CGeneratorConstants.TRUE»'''
}