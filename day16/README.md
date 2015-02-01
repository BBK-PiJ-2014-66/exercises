# Exercises, day 16 I/O

## The exercise sheet [exercises_d16.pdf](exercises_d16.pdf) 

# 1 ls
* Task: *Write a program that shows on screen the names of the files in the current directory.*
  (Hint: look at methods from class File).
* The program [Ls](src/likeunix/Ls.java) produces example [output](outputs/Ls_example_output.md)

# 2 mkdir
* Task *Write a program that takes a name from the user at the command line and creates a directory with that name.*
* The program [Mkdir](src/likeunix/Mkdir.java) produces example [output](outputs/Mkdir_example_output.md)

#3 cat
* Task *(a) Write a program that takes a name from the user at the command line. If a file with that name exists, the program must show its contents on screen. If it does not, the program must say so.*
*  Task *(b) Modify the program so that it takes many file names at the command line, and then shows them all one after the other.*
* The program [Cat](src/likeunix/Cat.java) produces example [output](outputs/Cat_example_out.md). N.B.
program makes two passes through the files first silently to check that there are no errors. On the second pass
it makes actual output.


#4 (a) cp (two files)
* Task *Write a program that takes two names from the user at the command line. If a file with the first name exists, the program must copy it into a file with the second name. If the first file does not exist, the program must say so. If the second file does exists, the program must ask the user whether to overwrite it or not, and act accordingly.* So produce something that works like linux **cp -i*
* The program [CpMinusI](src/likeunix/CpMinusI.java) written using a read file line by line and write line by line.[Test output](outputs/cpA_example_out.md) shows it works well but does not handle binary files correctly.


#4 (b) cp (multiple files into directory) (*)
* Task *Modify the program so that it takes many file names at the command line. When this happens, the last name must be a directory (otherwise, your program should complain). If it is a directory, your program has to copy all files (i.e. the other arguments) into that directory.* So have to write something that behaves like cp.
* Program [CpMultiFile](src/likeunix/CpMultiFile.java) is adapted according to instructions. 


# 5 tr (*)
* skip this one.

# 6 Sort (*)
* Task *Write a program that takes a name from the user at the command line. If a file with that name exists, the program must show its contents on screen, but with the lines shown alphabetically. If the does not exist, the program must say so.*
* Stop repeating same code by writing a utility to read a file into a List of lines 
[ReadFile2List](src/likeunix/ReadFile2List.java)
* Use this method in [Sort](src/likeunix/Sort.java), [Test output](outputs/Sort_example_out.md).

# 7 uniq (*)
* skip this one.

# 8 Temperature averages
* Task: *Write a program that reads a file from disk in comma-separated format (CSV). Every line must contain a list of number separated by commas. The program must output the average for every line plus the average for the whole file. A file may look like the following...* [temperatures.csv](datafiles/temperatures.csv)
* Wrote program [TemperatureAverages](src/likeunix/TemperatureAverages.java), uses [ReadFile2List](src/likeunix/ReadFile2List.java) for data input. [Test how it works](outputs/TemperatureAverages_example_out.md)

# 9 Binary cp (**)
* Task *Write a program that takes two names from the user at the command line. If a file with the first name exists, the program must copy it into a file with the second name. If the first file does not exist, the program must say so. If the second file does exists, the program must ask the user whether to overwrite it or not, and act accordingly. This is the same exercise as above with an important difference: it must be able to copy binary files (use InputStream instead of Reader, etc).*
* Program [CpBinary](src/likeunix/CpBinary.java) written according to instructions. Produces  [Test output](outputs/CpBinary_example_out.md).
* Observation. In practice this would be a mad way to copy a file! Use `Files.copy()` as suggested in 
[Oracle Java Tutorial: Copying a File or Directory](http://docs.oracle.com/javase/tutorial/essential/io/copy.html)

