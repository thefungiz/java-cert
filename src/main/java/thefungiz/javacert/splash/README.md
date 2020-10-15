#From this directory:
```
javac Test.java
jar -cmvf manifest.mf james.jar Test.class test.png
java -jar james.jar
```

#Additional:
See contents of war:
`jar -tf james.jar`

Extract contents of war:
`jar -xvf james.jar`