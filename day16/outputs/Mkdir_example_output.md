# 2 Mkdir example output

* Run with no arguments, check that usage statement produced an exit status is not 0. *In linux the exit status
of the last command run is stored ion environment variable `$?`, a value `0` indicates success.*

```
$ java -classpath ~/msc/pij/day16/bin likeunix.Mkdir
You must specify the directory you want as a single argument,
for example:

	java -classpath .... Mkdir newdir

For a directory name with spaces in it use single quotes
for example:

	java -classpath .... Mkdir 'folder with spaces in the name'

$ echo $?
1
```
* Run in directory with write permission, check that exit status is zero, check directory is created

```
$ java -classpath ~/msc/pij/day16/bin likeunix.Mkdir newdir
$ echo $?
0
$ ls -lh | grep newdir
drwxrwxr-x 2 osmart osmart 4.0K Jan 31 13:10 newdir

```

* Try to mkdir a directory that already exists, error should be produced

```
$ ls  | grep newdir
newdir
$ java -classpath ~/msc/pij/day16/bin likeunix.Mkdir newdir
ERROR cannot mkdir newdir as a directory/file of that name already exists.
$ echo $?
1
```
* Try to mkdir a directory in root filesystem where normal user has no write permission
```
$ cd /
$ java -classpath ~/msc/pij/day16/bin likeunix.Mkdir newdir
ERROR failed to mkdir newdir
```
