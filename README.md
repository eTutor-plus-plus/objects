# objects
The objects (DTOs, etc) common to different services of the etutor-plus-plus system.
You have to build this project before you can start some of the other services.

**Building**

```
mvn clean install
```

**Integrating**

If you are building a new service and want to include this project,
include it into your pom.xml like this:

```xml
 <dependency>
     <groupId>at.jku.dke.etutor</groupId>
     <artifactId>etutor-objects</artifactId>
     <version>1.0</version>
 </dependency>
```
