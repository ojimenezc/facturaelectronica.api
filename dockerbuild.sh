#!/bin/sh
echo 'BUILDING DOCKER IMAGE'
#VERSION=$(mvn -q \
#  -Dexec.executable="echo" \
#  -Dexec.args='${project.version}' \
#  --non-recursive \
#  org.codehaus.mojo:exec-maven-plugin:1.6.0:exec)
#echo 'VERSION =' $VERSION

 sudo mvn package dockerfile:build