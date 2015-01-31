# 3 Cat example output

* First cat a file that exists, compare with linux cat

```
$ java -classpath ~/msc/pij/day16/bin likeunix.Cat 3line.txt 
line one
line two
and finally 3rd line
osmart@fuji01vm:~/msc/pij/day16$ cat 3line.txt 
line one
line two
and finally 3rd line
```

* Then do two files

```
java -classpath ~/msc/pij/day16/bin likeunix.Cat 1line.txt 3line.txt 
I am file 1line.txt
line one
line two
and finally 3rd line
```

* Now for some errors *file that does not exist* after one that does

```
$ java -classpath ~/msc/pij/day16/bin likeunix.Cat 1line.txt does_not_exist
ERROR file does_not_exist does not exist

$ echo $?
1

$ cat  1line.txt does_not_exist
I am file 1line.txt
cat: does_not_exist: No such file or directory

```
 N.B. do not get any output for the existing file unlike linux cat!

* cat a directory

```
$ java -classpath ~/msc/pij/day16/bin likeunix.Cat 1line.txt src
ERROR opening src (Is a directory)
```


