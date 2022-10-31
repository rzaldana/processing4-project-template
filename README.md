# java-project-template

## Useful resources on compiling Java
- Directory structure: https://cs.lmu.edu/~ray/notes/largejavaapps/
- Compiling multiple java source files using the CLI: https://www.baeldung.com/java-compile-multiple-files

## Useful resources on using Processing as a Java Library
- https://happycoding.io/tutorials/java/processing-in-java
- https://andrewmagid.com/Processing4-Java-IDE-Setup/

## Directory includes:
- The processing4 library at `src/main/libs/core.jar`
	- core.jar extracted from Processing.app/Contents/Java/core/library of [4.0.1 release](https://github.com/processing/processing4/releases/tag/processing-1286-4.0.1)
- Two packages:
	- pkg1 includes:
		- a Main class that calls a Secondary class from the same package, the Main class from pkg2, and the Sketch class to run the sketch
		- a Sketch class where the processing Sketch is defined
	- pkg2 includes:
		- a Main class that calls a Secondary class from the same package
- A Makefile with two jobs:
	- build: compiles the source code, setting the classpath appropriately and publishing everything to `target/`
	- run: runs the compiled bytecode from `target/`
