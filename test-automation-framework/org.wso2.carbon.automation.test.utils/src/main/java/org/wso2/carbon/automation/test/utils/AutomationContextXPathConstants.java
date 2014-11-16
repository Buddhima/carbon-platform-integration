/*
*Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*WSO2 Inc. licenses this file to you under the Apache License,
*Version 2.0 (the "License"); you may not use this file except
*in compliance with the License.
*You may obtain a copy of the License at
*
*http://www.apache.org/licenses/LICENSE-2.0
*
*Unless required by applicable law or agreed to in writing,
*software distributed under the License is distributed on an
*"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*KIND, either express or implied.  See the License for the
*specific language governing permissions and limitations
*under the License.
*/
package org.wso2.carbon.automation.test.utils;

/**
 * This class contain xpath expression to retrieve configurations in automation.xml
 */
public class AutomationContextXPathConstants {

    public static final String WEB_CONTEXT_ENABLED = "webContextEnabled";
    public static final String WEB_CONTEXT_ROOT = "//test/root";
    public static final String DATA_SOURCE_URL = "//datasources/datasource/url";
    public static final String DATA_SOURCE_DRIVER_CLASS_NAME = "//datasources/datasource/driverClassName";
    public static final String DATA_SOURCE_DB_USER_NAME = "//datasources/datasource/username";
    public static final String DATA_SOURCE_DB_PASSWORD = "//datasources/datasource/password";
}