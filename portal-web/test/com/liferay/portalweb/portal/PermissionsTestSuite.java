/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portalweb.portal;

import com.liferay.portalweb.portal.login.LoginTests;
import com.liferay.portalweb.portal.permissions.announcements.AnnouncementsTests;
import com.liferay.portalweb.portal.permissions.blogs.BlogsTests;
import com.liferay.portalweb.portal.permissions.controlpanel.ControlPanelTests;
import com.liferay.portalweb.portal.permissions.documentlibrary.DocumentLibraryTests;
import com.liferay.portalweb.portal.permissions.imagegallery.ImageGalleryTests;
import com.liferay.portalweb.portal.permissions.messageboards.MessageBoardsTests;
import com.liferay.portalweb.portal.permissions.webcontent.WebContentTests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class PermissionsTestSuite extends BaseTests {

	public static Test suite() {
		TestSuite testSuite = new TestSuite();

		testSuite.addTest(LoginTests.suite());
		testSuite.addTest(ControlPanelTests.suite());
		testSuite.addTest(AnnouncementsTests.suite());
		testSuite.addTest(BlogsTests.suite());
		testSuite.addTest(DocumentLibraryTests.suite());
		testSuite.addTest(ImageGalleryTests.suite());
		testSuite.addTest(MessageBoardsTests.suite());
		testSuite.addTest(WebContentTests.suite());

		testSuite.addTestSuite(StopSeleniumTest.class);

		return testSuite;
	}

}