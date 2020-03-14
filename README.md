# Automation Tests
1. Get the source code from Github
git clone https://github.com/knguyen-hcmcqa/qatests.git

2. Open IntelliJ IDEA then open the project

3. Set Chrome Driver path
- Find qatests/src/main/resources/application.properties
- chrome.path=<YOUR_LOCAL_PATH>\\qatests\\browsers\\chromedriver.exe

4. Run test
- Open Terminal window
- mvn test

5. View test report
- Find qatests/target/surefire-reports/index.html
