#!/bin/sh
rm -rf target
clear
mvn clean verify package spring-boot:run  -Dliquibase.should.run=false -P develop