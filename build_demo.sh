build_demo() {
  javac -d classes/demos  demos/$1.java -classpath classes/awtk 
  jar cfm ./bin/$1.jar demos/$1.MF -C classes/awtk . -C classes/demos $1.class
}


if [ "$1" != "" ]
then
  build_demo "$1"
else
  build_demo DemoButton
fi
