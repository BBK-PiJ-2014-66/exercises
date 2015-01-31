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



