if [ "$1" != "" ]
then
  java -Djava.library.path=lib/  -classpath . -jar $1
else
  echo java -Djava.library.path=lib/  -classpath . -jar bin/DemoButton.jar
  java -Djava.library.path=lib/  -classpath . -jar bin/DemoButton.jar
fi
