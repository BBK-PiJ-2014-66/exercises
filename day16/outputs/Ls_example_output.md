# Ls example output

* Run on current day16  directory

```
$ java -classpath ~/msc/pij/day16/bin likeunix.Ls
.project d16.pdf README.md~ src README.md .classpath Ls_example_output.md bin exercises_d16.pdf 
```

* Compare to output of `ls` and and `ls -a` ($ is linux prompt)

```
$ ls
bin  d16.pdf  exercises_d16.pdf  Ls_example_output.md  README.md  README.md~  src
$ ls -a
.  ..  bin  .classpath  d16.pdf  exercises_d16.pdf  Ls_example_output.md  .project  README.md  README.md~  src
```

* Conclude java .list() lists hidden files (those starting with `.`) but does not list `..` (the directory above).

* Try out on an empty directory.

```
mkdir empty
$ cd empty/
$ java -classpath ~/msc/pij/day16/bin likeunix.Ls
Current directory is empty
```

* Try starting from an invalid directory
```
mkdir empty
$ cd empty/
$ rmdir ../empty/
$ ls
$ java -classpath ~/msc/pij/day16/bin likeunix.Ls
Error occurred during initialization of VM
java.lang.Error: Properties init: Could not determine current working directory.
	at java.lang.System.initProperties(Native Method)
	at java.lang.System.initializeSystemClass(System.java:1073)
```
* do not think this error can be caught - vm cannot start.

