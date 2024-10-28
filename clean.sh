scons -c
rm -rf native
cd src/java && mvn clean && cd -
cd demos && mvn clean && cd -

