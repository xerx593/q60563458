# q60563458
Answer code for https://stackoverflow.com/questions/60563458/spring-external-library-beans-initialization-order

## Modules
  * parent project
  * foo:
  Containing:
    * `A` component.
    * `A` standalone config.
  * bar:
  Containig:
    * `B` bean (and variants), depending on `A`.
    * `B` standalone config.
    * SpringBootApplication
    * Tests
  * baz:
    * `Application` wiring up `A` and `B`.
    * Tests.
    
## Compile, Test & Install

`mvn clean install` on parent project.
