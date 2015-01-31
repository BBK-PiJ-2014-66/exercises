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

* Simple copy output file does not exist:


