/*
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 */
package org.eclipse.jet.internal.core.parser.jasper;

/**
 * Base class for all exceptions generated by the JET engine. 
 * Makes it convienient to catch just this at the top-level.
 */
public class JETException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9117189748450969429L;

	public JETException(String reason) {
		super(reason);
	}

	/**
	 * Creates a JETException with the embedded exception and the reason for throwing a JETException.
	 */
	public JETException(String reason, Throwable exception) {
		super(reason, exception);
	}

	/**
	 * Creates a JETException with the embedded exception.
	 */
	public JETException(Throwable exception) {
		super(exception);
	}

}