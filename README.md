# angular

## Development

Antes de comenzar se deberá de instalar los siguiente:

1. [Node.js][]: 
2. [Yarn][]: 

Despues de instalar ejecutar el siguiente comando:

    yarn install

Se utiliza scripts para yarn y [Webpack][] para la construcción del sistema.

Ejecutar los siguientes cocmandos en terminales separadas para crear un blissfull development.

    ./mvnw
    yarn start

### Administración de dependencias

Por ejemplo para agregar la biblioteca de  [Leaflet][] como dependencia en tiempo de ejecución en la aplicación, se deberá de ejecutar el siguiente comando:

    yarn add --exact leaflet


### Utilizar angular-cli


Para utilizar angular cli ejecutar:

    ng generate component my-component

esto generará los siguientes archivos:

    create src/main/webapp/app/my-component/my-component.component.html
    create src/main/webapp/app/my-component/my-component.component.ts
    update src/main/webapp/app/app.module.ts


Para levantar el proyecto ejecutar los siguiente:

    mvn spring-boot:run

ver el contenido en [http://localhost:8080](http://localhost:8080).


[Node.js]: https://nodejs.org/
[Yarn]: https://yarnpkg.org/
[Webpack]: https://webpack.github.io/
[Angular CLI]: https://cli.angular.io/
[BrowserSync]: http://www.browsersync.io/
[Karma]: http://karma-runner.github.io/
[Jasmine]: http://jasmine.github.io/2.0/introduction.html
[Protractor]: https://angular.github.io/protractor/
[Leaflet]: http://leafletjs.com/
[DefinitelyTyped]: http://definitelytyped.org/
