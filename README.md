# Factura Electrónica Costa Rica

[![Build Status](https://travis-ci.com/ojimenezc/facturaelectronica.api.svg?token=U2azSba15qQC21LdDsDu&branch=master)](https://travis-ci.com/ojimenezc/facturaelectronica.api)

El API de factura electrónica contiene todas las funciones necesarias para la facturación electrónica en Costa Rica.

# Características
Para conocer las opciones que provee el API puede revisar la documentación oficial en postman
https://documenter.getpostman.com/view/9434271/SzRw1r1p?version=latest

### Información técnica

Especificaciones técnicas:

* Spring boot 2.1.9.RELEASE
* Java 1.8
* Esquema de base de datos controlado con liquibase (Podrá configurar su propio motor de base de datos)
* Spring security (Podrá configurar su propio IDP)

### Instalación
El API ha de compilarse con los siguientes comandos

#### Para producción 

```sh
$ mvn clean
$ mvn verify
$ mvn package -P release
```

#### Para desarrollo 
En caso de necesitar saltarse la corrida de liquibase
```sh
$ mvn clean verify -Dmaven.test.skip=true -Dliquibase.should.run=false
$ mvn package -P dev
```
En caso de querer correr liquibase
```sh
$ mvn clean verify -Dmaven.test.skip=true -Dliquibase.should.run=true
$ mvn package -P dev
```
Con esto el .war resultante podrá ser ejecutado en el servidor web de su preferencia

#### Docker
El API contiene un archivo de docker para facilitar el despliegue, para usarlo ejecute el siguiente comando
```sh
    sudo docker build -t api/facturaelectronica:latest .
```

### Configuración
Toda la configuración necesaria se encuentra en el de resources en básicamente 2 archivos.
* El archivo application-dev.properties donde se configura el ambiente de desarrollo
* El archivo application-release.properties donde se configura el ambiente de producción

### Desarrollo

Deseas contribuir? Genial!
Actualmente trabajo en mi tiempo libre para mejorar el API de manera que todos podemos sacar provecho, por lo cual hay dos maneras de contribuir:

1) Con su donación podré dedicar más recursos al producto ya sea con horas de mi tiempo o bien contratando personas que nos ayuden con las mejoras o cambios que haya que realizar. 

[![](https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=ZUNAF9UXAUXHE&source=url)

2) Realizando sus propias contribuciones y enviando los pull requests

En verdad apreciamos la ayuda!

### Soporte
En caso de querer usar el API pero  necesitas soporte puede contactarme a travéz de mi perfil de  [![Linkedin](https://i.stack.imgur.com/gVE0j.png) LinkedIn](https://www.linkedin.com/in/oscarjc19/) . Todo soporte tendrá un costo de acuerdo al requerimiento, consulteme sin ningún compromiso.

