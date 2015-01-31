# 3 cp example output

* First check the help output if one does not put two files

```
$ java -classpath ~/msc/pij/day16/bin likeunix.CpMinusI
You must specify the source and destination files
for example to copy 'source.txt' to 'dest.txt'
	java -classpath .... CpMinusI source.txt dest.txt

```
   * looks good

* Source file does not exist:

```
$ java -classpath ~/msc/pij/day16/bin likeunix.CpMinusI does_not_exist foobar
ERROR source file does_not_exist does not exist
$ echo $?
1
```
  * looks good

* Destination file is a directory (not dealt with currently)

```
$ java -classpath ~/msc/pij/day16/bin likeunix.CpMinusI 1line.txt src
ERROR destination file src is a directoryScript cannot copy with this!
```
  * looks good

* Simple copy output file does not yet exist:

```
$ java -classpath ~/msc/pij/day16/bin likeunix.CpMinusI 1line.txt new.txt 
$ diff  1line.txt new.txt
```
  * looks good

* Simple copy output file exists, and we do not overwrite by an enter on prompt

```
$ rm -f new.txt 
$ touch new.txt
$ java -classpath ~/msc/pij/day16/bin likeunix.CpMinusI 1line.txt new.txt 
cp: overwrite `new.txt'? 
$ diff -q  1line.txt new.txt 
Files 1line.txt and new.txt differ
```
  * looks good

* As before but respond `y` to overwrite file

```
$ rm -f new.txt 
$ touch new.txt
$ java -classpath ~/msc/pij/day16/bin likeunix.CpMinusI 1line.txt new.txt 
cp: overwrite `new.txt'? y
$ diff -q  1line.txt new.txt 
$
```
  * looks good

* Try to copy a file that we do not have read permission
```
$ chmod a-rw 1line.txt 
$ rm -f new.txt 
$ java -classpath ~/msc/pij/day16/bin likeunix.CpMinusI 1line.txt new.txt 
ERROR opening source file 1line.txt (Permission denied)
```
  * looks good

* Try to copy file to a directory we have write permission
```
$ java -classpath ~/msc/pij/day16/bin likeunix.CpMinusI 3line.txt src/temp.txt
$ diff -q 3line.txt src/temp.txt
```

* try to copy file to a directory we do not have write permission (the root fs)
```
$ java -classpath ~/msc/pij/day16/bin likeunix.CpMinusI 3line.txt /temp.txt
ERROR opening destination file /temp.txt (Permission denied)
```
  * looks good

* try copying a binary file
```
$ java -classpath ~/msc/pij/day16/bin likeunix.CpMinusI /bin/ls ls
$ diff /bin/ls ls
Binary files /bin/ls and ls differ
```
  * not good cannot handle binary file


