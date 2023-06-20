# spock-stack-sample

## Requirement
 
- Java 17
- IntelliJ IDEA (other IDEs are probably OK)

## How to reproduce
 
- Open this repository by IntelliJ IDEA.
- Run `AppTest.fast because test target will not be shown in test name`
  - You can confirm that the test will be completed successfully.
- Run `AppTest.stack because test target will be shown in test name`
  - You can find that the test will not be completed at all.

## Cause

Spock unroll testing shows objects in data table in each test cases.
When too large arrays are given as data source, Spock tries to show `Arrays#toString` value.
It seems to cause IO stacking.
