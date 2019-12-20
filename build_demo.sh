build_demo() {
  args=""
  cd classes/demos
  for f in $1*.class;
  do
   args="$args -C classes/demos  $f"
  done
  cd -

  javac -d classes/demos  demos/$1.java -classpath classes/awtk 
  echo "jar cfm ./bin/$1.jar demos/$1.MF -C classes/awtk . $args"
  jar cfm ./bin/$1.jar demos/$1.MF -C classes/awtk . $args
}


if [ "$1" != "" ]
then
  build_demo "$1"
else
  build_demo DemoButton
fi
