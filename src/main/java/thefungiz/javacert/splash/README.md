#From this directory:
```
javac Test.java
jar -cmvf manifest.mf james.jar Test.class test.png
java -jar james.jar
```

#Additional:
See contents of jar/war:
`jar -tf james.jar`

Extract contents of jar/war:
`jar -xvf james.jar`

Extract a single file from a jar/war:
`jar xvf james.jar test.png`