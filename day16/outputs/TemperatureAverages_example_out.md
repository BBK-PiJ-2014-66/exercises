# 8 Temperature averages example output

* Check usage message: *result: works fine*

```
$ java -classpath ~/msc/pij/day16/bin likeunix.TemperatureAverages 
You must specify a single input csv file.
For example to use 'temperatures.csv`:

		java -classpath .... TemperatureAverages temperatures.csv 
```

* Check specifying file that does not exist: *result: works fine*

```
$ java -classpath ~/msc/pij/day16/bin likeunix.TemperatureAverages nonExistingFile
ERROR file nonExistingFile does not exist
```

* Check accessing a file without read permission *result: works fine*
```
$ touch foo.txt ; chmod a-r foo.txt
$ java -classpath ~/msc/pij/day16/bin likeunix.TemperatureAverages foo.txt 
ERROR opening foo.txt (Permission denied)
```

* Check how it handles data file with an error a blank field on line number 3:  *result: works fine*
```
$ java -classpath ~/msc/pij/day16/bin likeunix.TemperatureAverages datafiles/ERROR.csv 
ERROR 'empty String' found passing numerical value from word ''
ERROR found passing line number 3 '21,25,,25,24,20,18,15,13,14,17,19,21'
```

* Check how it handles the example given in the notes: 
```
$ java -classpath ~/msc/pij/day16/bin likeunix.TemperatureAverages datafiles/temperatures.csv 
# average value for each line added as last column
25,24,20,18,15,13,14,13,15,17,19,21,17.833333333333332
25,25,24,20,18,15,13,14,13,15,17,19,18.166666666666668
21,25,25,24,20,18,15,13,14,17,19,21,19.333333333333332
25,25,24,20,18,15,13,14,13,15,17,19,18.166666666666668
21,25,25,24,20,18,15,13,14,13,15,17,18.333333333333332
21,25,25,24,20,18,15,13,14,13,15,17,18.333333333333332
19,21,25,25,24,20,18,15,13,14,13,15,18.5
17,19,21,25,25,24,20,18,15,13,14,13,18.666666666666668
# average value for all data in file 18.416666666666668
```
* *I am happy with this all. Job Done*
