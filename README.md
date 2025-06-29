# collaborative-prose

Ein einfaches Java-Projekt zum Zusammensetzen von Prosa mithilfe externer Komponenten über Maven.

## Peer-Komponenten

**prose_library (Jana)**  
Repository: https://github.com/joha1na/my-prose-app  
Maven-Koordinaten:

```xml
<dependency>
  <groupId>de.htw_berlin.fb4.examples</groupId>
  <artifactId>prose_library</artifactId>
  <version>1.0.0</version>
</dependency>
```
**my-prose-app (Elise)**

Repository:https://github.com/eliseHtw/my-prose-app

Maven-Koordinaten:

```xml
<dependency>
  <groupId>de.htw_berlin.fb4.elise</groupId>
  <artifactId>my-prose-app</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Maven-Konfiguration

Die beiden Komponenten wurden in der `pom.xml` über `<dependencies>` eingebunden. Zusätzlich wurden folgende Repositories in der `<repositories>`-Sektion eingetragen:

```xml
<repositories>
  <repository>
    <id>github-elise</id>
    <url>https://maven.pkg.github.com/eliseHtw/my-prose-app</url>
  </repository>
  <repository>
    <id>github-jana</id>
    <url>https://maven.pkg.github.com/joha1na/my-prose-app</url>
  </repository>
</repositories>
```

## Beispielausgabe

Nach dem Ausführen von:

```bash
mvn clean install
mvn exec:java -Dexec.mainClass="org.quynyhoang.CollaborativeProse"
```

wurde folgende Ausgabe erzeugt:

```
Dies ist mein eigener Satz.
Ich esse heute Abend Salat
Open Source Test von Jana.
```

```
```
