# jpostest
Unpack ISO 8583 Base 1 messages using jPOS

## Build
It is a simple java application using maven, you only need execute mvn for build jar package

```console
mvn clean package
```

## Run
For unpack ISO message you need run java with jar generated passing two args, first ISO header and secord ISO message, both as string encoded as hexa

```console
java -jar <jarBuild>-with-dependencies.jar <header> <message>
```
