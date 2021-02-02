# Laboratorio 01

## Objetivos

La tarea principal de este laboratorio es diseñar un AST, mediante UML, del lenguaje descrito en el fichero [`docs/specification.md`](../specification.md).

Se puede ver un ejemplo del programa en el fichero [`examples/basic.xana`].

## Herramientas

Para modelar el AST, este proyecto cuenta con una integración con [PlantUML](https://plantuml.com/) y el diagrama base [`docs/diagrams/ast.plantuml`](../diagrams/ast.plantuml).

Una vez modificado el fichero `ast.plantuml`, el diagrama se regenaría usando ejecutando el siguiente comando en la raíz:

```
mvn clean com.github.jeluard:plantuml-maven-plugin:generate
```

También se puede generar el diagrama por otro lado, por ejemplo, con [esta extensión VS Code](https://github.com/qjebbs/vscode-plantuml).

> Alternativamente, también se puede utilizar cualquier herramienta que se desee, como por ejemplo [Draw.io](https://draw.io), y guardar el diagrama final en la carpeta `docs/diagrams`.
