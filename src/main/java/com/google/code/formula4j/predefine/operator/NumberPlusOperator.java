/*
 *
 * Copyright (c) 2005 The Exceoon Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:
 *       "This product includes software developed by the
 *        Exceoon Software Foundation (http://www.exceoon.com/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. Products derived from this software may not be called " Exceoon ",
 *    nor may " Exceoon " appear in their name, without prior written
 *    permission of the Exceoon Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * Exceoon Software Corporation and was originally based on software
 * Exceoon copyright (c) 2005, International
 * Business Machines, Inc., http://www.Exceoon.com.  For more
 * information on the Exceoon Software Foundation, please see
 * <http://www.Exceoon.com/>.
 */

package com.google.code.formula4j.predefine.operator;

import com.google.code.formula4j.core.CalculateException;
import com.google.code.formula4j.impl.Utils;
import com.google.code.formula4j.predefine.value.NumericValue;
import com.google.code.formula4j.type.MathematicalValue;
import com.google.code.formula4j.type.Operator;

/**
 * Author	David.Liu 
 * Mail		david.liu@exceoon.com
 * copyright	Exceoon corporation
 */

public class NumberPlusOperator implements Operator
{

	/* (non-Javadoc)
	 * @see com.google.code.formula4j.type.Operator#calculate(com.google.code.formula4j.type.MathematicalValue, com.google.code.formula4j.type.MathematicalValue)
	 */
	@Override
	public MathematicalValue calculate(MathematicalValue leftElement,
	        MathematicalValue rightElement) throws CalculateException
	{
		if (leftElement.getType() != 1 || rightElement.getType() != 1) {
			throw Utils.createIncosistentTypeCalculateException();
		}
		
		return new NumericValue(leftElement.getNumericValue() + rightElement.getNumericValue());
	}

	/* (non-Javadoc)
	 * @see com.google.code.formula4j.type.Operator#getLeftOperandeType()
	 */
	@Override
	public int getLeftOperandeType()
	{
		// TODO Auto-generated method stub
		return 1;
	}

	/* (non-Javadoc)
	 * @see com.google.code.formula4j.type.Operator#getName()
	 */
	@Override
	public String getName()
	{
		return "plus";
	}

	/* (non-Javadoc)
	 * @see com.google.code.formula4j.type.Operator#getRightOperandeType()
	 */
	@Override
	public int getRightOperandeType()
	{
		return 1;
	}

	/* (non-Javadoc)
	 * @see com.google.code.formula4j.type.Operator#getSymbol()
	 */
	@Override
	public String getSymbol()
	{
		return "+";
	}

}
