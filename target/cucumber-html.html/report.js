$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/ReactjsHomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Reactjs MAIN CONCEPTS verification",
  "description": "",
  "id": "reactjs-main-concepts-verification",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Assignment_1_Get_All_Sub_Text_Link_From_MAIN_CONCEPTS",
  "description": "",
  "id": "reactjs-main-concepts-verification;assignment-1-get-all-sub-text-link-from-main-concepts",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "The user launch Chrome browser.",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The user click on doc tab from home.",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The user click on \"Main Concepts\" side header text link.",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The user get all the sub text link from \"Main Concepts\" side header.",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The user click on \"Advanced Guides\" side header text link.",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "The user get all the sub text link from \"Advanced Guides\" side header.",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "The user close the browser.",
  "keyword": "Then "
});
formatter.match({
  "location": "indexDef.launchApp()"
});
formatter.result({
  "duration": 5146688800,
  "status": "passed"
});
formatter.match({
  "location": "indexDef.clickOnDocTab()"
});
formatter.result({
  "duration": 149009200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Main Concepts",
      "offset": 19
    }
  ],
  "location": "indexDef.clickSideBarTextlink(String)"
});
formatter.result({
  "duration": 4259002300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Main Concepts",
      "offset": 41
    }
  ],
  "location": "indexDef.getAllSubTextLink(String)"
});
formatter.result({
  "duration": 268771800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Advanced Guides",
      "offset": 19
    }
  ],
  "location": "indexDef.clickSideBarTextlink(String)"
});
formatter.result({
  "duration": 5235896500,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element is not clickable at point (1010, 593)\n  (Session info: chrome\u003d105.0.5195.102)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MSI\u0027, ip: \u0027192.168.1.101\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_92\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 105.0.5195.102, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: C:\\Users\\badat\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60900}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: bd834fd49a139aa93e7bf527b3f10807\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.opencart.page.Home.clickOnSideHeader(Home.java:28)\r\n\tat stepDefination.indexDef.clickSideBarTextlink(indexDef.java:38)\r\n\tat ✽.Then The user click on \"Advanced Guides\" side header text link.(src/test/java/features/ReactjsHomePage.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Advanced Guides",
      "offset": 41
    }
  ],
  "location": "indexDef.getAllSubTextLink(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "indexDef.closeApp()"
});
formatter.result({
  "status": "skipped"
});
});