# SerenityBDD Test Automation Gradle POC
Example test automation framework using [Gradle](https://gradle.org/),[SerenityBDD](http://www.thucydides.info/#/) and [JAVA](https://www.oracle.com/uk/java/index.html)

### Purpose (Why):
* To automate against web based applications
* To validate functionality across web based applications

## Getting Started

### Prerequisites
1. JAVA should be [installed](http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html) on host platform and JAVA_HOME environment variable must be set host platform.
2. Chrome or Chromium browser must be [installed](https://support.google.com/chrome/answer/95346?co=GENIE.Platform%3DDesktop&hl=en-GB) and available on host machine.

### Quick Start
1. Create directory for project if running on local instance
2. ```git clone https://github.com/mtboypbtwoyf/serenitybdd.webapplication.tesco.example.git```
3. Open command line or terminal and navigate to the directory project is cloned to
4. Run: ```./gradlew clean clearReports test aggregate``` 
or 
```gradle clean clearReports test aggregate``` if you already have a gradle [installation](https://gradle.org/install/) on host platform.
5. Test reports are located at ```<project-root-folder>/target/site/serenity/index.html```. Test reports can be viewed with any browser of choice.

### Notes / Caveats
* If gradle is already installed and configured on host platform/server, invoke the ```gradle``` command instead of ```./gradlew```. 
* ```./gradlew``` indicates you are using a gradle wrapper. The Gradle Wrapper is generally part of a project and it facilitates installation and setup of gradle. If you were using gradle without the wrapper you would have to manually install it - for example, on a mac brew install gradle and then invoke gradle using the ```gradle``` command. In both cases you are using gradle, but the former is more convenient and ensures version consistency across different platforms.
* Chrome WebDriver binaries is configured to download automatically using the latest binary version from google chrome api at runtime. This will be consequently cached by the gradle daemon at first build execution to enable faster build execution setup time against future project builds. Please refer to the ```CustomChromeDriver.java``` class containing the line below for binary setup.
```
WebDriverManager.chromedriver().version("2.37").setup();
```
    

### Executing Tests Using IDEs or Command Line Arguments
1. Tests can be executed using an IDE by right clicking the corresponding feature file and selecting the run feature option. To add and run multiple tests or the complete test suite within an IDE right click and run the  ```RunTests``` class located at the root of the corresponding project package.
2. Tests can also be executed by running the corresponding command as mentioned in the Quick Start section above.
3. To execute tests with using command line arguments, please refer to further documentation provided [Gradle Command Line](https://docs.gradle.org/current/userguide/command_line_interface.html) or [Serenity Command Line](http://thucydides.info/docs/thucydides/_running_thucydides_tests_from_the_command_line.html).
Some examples are provided below:

```
./gradlew clean clearReports test aggregate -Dcucumber.options="--tags <cucumber-tag>"
```

```
./gradlew clean clearReports test aggregate -Dcucumber.options="--tags @smoke"
```

```
./gradlew clean clearReports test aggregate -Dcucumber.options="--tags @login" -Dwebdriver.remote.driver=chrome -Dwebdriver.remote.os=WINDOWS

```

### Proxy Related Issues
* Running behind a proxy server? Please refer to the ```gradle.properties``` file for notes and example config options.
Or pass the command line argument at runtime ```./gradlew -Dhttps.proxyHost=<proxy-server> -Dhttps.proxyPort=<port-number> clean clearReports test aggregate```

&copy; 2018 mtboypbtwoyf