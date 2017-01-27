/*******************************************************************************
* Copyright (c) 2016 ARM Ltd. and others
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* ARM Ltd and ARM Germany GmbH - Initial API and implementation
*******************************************************************************/

package com.arm.cmsis.pack;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.xml.sax.SAXException;

/**
 * The interface of providing repository service
 */
public interface ICpRepoServiceProvider {

	/**
	 * Read the index file and put the pdsc file's info to the pdsc list
	 * @param indexUrl URL of the pack index file
	 * @param pdscList a list of pdsc file
	 * @return size of the pdsc file list
	 * @throws Exception
	 */
	int readIndexFile(String indexUrl, List<String[]> pdscList) throws ParserConfigurationException, SAXException, IOException;

	/**
	 * Download the pdsc file
	 * @param pdscUrl URL of the pdsc file
	 * @param pdscName Name of the pdsc file
	 * @param destFileName destination file's name
	 * @param monitor progress monitor
	 * @return the downloaded .pdsc file
	 * @throws Exception
	 */
	File getPdscFile(String pdscUrl, String pdscName, String destFileName, IProgressMonitor monitor) throws IOException;

	/**
	 * Download the pack file
	 * @param packUrl URL of the pack file
	 * @param destFileName destination file's name
	 * @param monitor progress monitor
	 * @return the downloaded .pack file
	 * @throws Exception
	 */
	File getPackFile(String packUrl, String destFileName, IProgressMonitor monitor) throws IOException;
}