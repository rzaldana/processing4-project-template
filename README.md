# java-project-template

## Useful resources on compiling Java
- Directory structure: https://cs.lmu.edu/~ray/notes/largejavaapps/
- Compiling multiple java source files using the CLI: https://www.baeldung.com/java-compile-multiple-files

## Directory includes:
- Two packages:
	- pkg1 includes:
		- a Main class that calls a Secondary class from the same package AND the Main class from pkg2
	- pkg2 includes:
		- a Main class that calls a Secondary class from the same package
- A Makefile with two jobs:
	- build: compiles the source code, setting the classpath appropriately and publishing everything to `target/`
	- run: runs the compiled bytecode from `target/`
