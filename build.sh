rm -rf classes/*
mkdir -p classes/awtk
mkdir -p classes/demos

javac -d classes/awtk src/java/awtk/*.java
javac -d classes/demos  demos/*.java -classpath classes/awtk

javah -d native -classpath classes/awtk/ awtk.Widget

