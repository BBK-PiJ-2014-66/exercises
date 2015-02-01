# 6 Sort example output

* Check usage message: *result: work fine*

```
 java -classpath ~/msc/pij/day16/bin likeunix.Sort 
You must specify a single input file to be sorted.
For example to sort 'file.txt`:

		java -classpath .... Sort file.txt
```

 

* Check specifying file that does not exist: *result: works fine*

```
$ java -classpath ~/msc/pij/day16/bin likeunix.Sort nonExistingFile
ERROR file nonExistingFile does not exist
```

* Check accessing a file without read permission *result: works fine*
```
$ touch foo.txt ; chmod a-r foo.txt
$ java -classpath ~/msc/pij/day16/bin likeunix.Sort foo.txt
ERROR opening foo.txt (Permission denied)```
```

* Check that it sorts and unsorted file *result: works fine*
```
$ cat unsorted.txt 
Hippo
22
hippo
3
21
dog
3
cat
2
bison

$ java -classpath ~/msc/pij/day16/bin likeunix.Sort unsorted.txt 

2
21
22
3
3
Hippo
bison
cat
dog
hippo
```

* Compare this default java sort with linux sort. *Conclusion: java orders capital letters before lowercase, whereas linux does the opposite*
```
$ java -classpath ~/msc/pij/day16/bin likeunix.Sort unsorted.txt > mysort.txt 
$ sort unsorted.txt > linuxsort.txt
$ diff -y mysort.txt linuxsort.txt

2								2
21								21
22								22
3								3
3								3
Hippo							      <
bison								bison
cat								cat
dog								dog
hippo								hippo
							      >	Hippo
```
