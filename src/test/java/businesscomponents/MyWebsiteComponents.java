/*
 *  © [2020] Cognizant. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package businesscomponents;

import com.cognizant.core.DriverScript;
import com.cognizant.core.ReusableLibrary;
import com.cognizant.core.ScriptHelper;
import com.cognizant.framework.Status;

public class MyWebsiteComponents extends ReusableLibrary {
	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper The {@link ScriptHelper} object passed from the
	 *                     {@link DriverScript}
	 */
	public MyWebsiteComponents(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	public void myWebsiteUrl() throws InterruptedException {

		// Sample code to launch URL in the browser
		driver.get("https://www.sureshmanem.com");
		report.updateTestLog("Launch URL", "URL launched successfully", Status.PASS);	

		Thread.sleep(5000);

		driver.close();
		driver.quit();
	}

}
