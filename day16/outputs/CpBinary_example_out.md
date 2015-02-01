# 4 cp Binary output

* First check the help output

```
$ java -classpath ~/msc/pij/day16/bin likeunix.CpBinary 
java.lang.RuntimeException: You must specify the source and destination files
for example to copy 'source.txt' to 'dest.txt'

		java -classpath .... CpBinary source.txt dest.txt

alternatively you can specify one or more files to be copied to a directory:

	java -classpath .... CpBinary file1 file2 destinationDirectory
```
  * looks good

* Binary file copy checking contents are identical with `diff` and by finding md5sum for the two files

```
$ time java -classpath ~/msc/pij/day16/bin likeunix.CpBinary /bin/ls ls.copy

real	0m0.568s
user	0m0.104s
sys	0m0.460s
$ diff  /bin/ls ls.copy
$ md5sum /bin/ls ls.copy 
fa97c59cc414e42d4e0e853ddf5b4745  /bin/ls
fa97c59cc414e42d4e0e853ddf5b4745  ls.copy
$ time cp /bin/ls ls.copy

real	0m0.008s
user	0m0.000s
sys	0m0.008s
$ rm ls.copy 
```
   * conclusion works fine but it is slow! 0.5 seconds wallclock to copy a 104k file. 
